package com.azimuton.foreign.fragments.english

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.core.view.isNotEmpty
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.azimuton.data.roomstorage.room.AppRoomDatabase
import com.azimuton.domain.models.english.Word
import com.azimuton.domain.usecase.english.WordCopyUseCase
import com.azimuton.domain.usecase.english.WordDeleteAllUseCase
import com.azimuton.domain.usecase.english.WordDeleteUseCase
import com.azimuton.domain.usecase.english.WordGetAllUseCase
import com.azimuton.domain.usecase.english.WordGetWordByIdUseCase
import com.azimuton.domain.usecase.english.WordInsertUseCase
import com.azimuton.foreign.viewmodels.english.LearnViewModel
import com.azimuton.foreign.R
import com.azimuton.foreign.fragments.english.adapters.NewWordsAdapter
import com.azimuton.foreign.databinding.FragmentLearnBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LearnFragment : Fragment(), NewWordsAdapter.ViewHolder.ItemCallback {
    private lateinit var binding: FragmentLearnBinding
    private lateinit var adapter: NewWordsAdapter
    lateinit var wordDatabase : AppRoomDatabase
    private lateinit var wordList: ArrayList<Word>
    @Inject
    lateinit var copyUseCase: WordCopyUseCase
    private val viewModel : LearnViewModel by activityViewModels()
    @Inject
    lateinit var insertInject : WordInsertUseCase
    @Inject
    lateinit var deleteInject : WordDeleteUseCase
    @Inject
    lateinit var getAll : WordGetAllUseCase
    @Inject
    lateinit var deleteAll : WordDeleteAllUseCase
    @Inject
    lateinit var getWordById : WordGetWordByIdUseCase

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLearnBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        wordList = ArrayList<Word>()
        wordDatabase = AppRoomDatabase.getDatabase(requireActivity())
        getData()
        adapter = NewWordsAdapter(requireActivity(), this)
        binding.rvNewWords.layoutManager = LinearLayoutManager(requireActivity())
        binding.rvNewWords.adapter = adapter
        adapter.submitList(wordList)

        binding.ivClearNewWord.setOnClickListener {
            binding.etNewWord.text.clear()
            hideSystemUI()
        }
        binding.ivClearTranslate.setOnClickListener {
            binding.etTranslate.text.clear()
            hideSystemUI()
        }

        binding.tvTransfer.setOnClickListener {
            if(binding.rvNewWords.isNotEmpty()){
                binding.cvDialogList.visibility = View.VISIBLE
                binding.rvNewWords.visibility = View.GONE
            } else {
                Toast.makeText(requireActivity(), "The list is empty!", Toast.LENGTH_SHORT).show()
            }
        }
        binding.btDialogOkList.setOnClickListener {
            getData()
            viewModel.copy()
            deleteAll.execute()
            adapter.notifyDataSetChanged()
            hideSystemUI()
            Toast.makeText(requireActivity(), "The list is transfered!", Toast.LENGTH_SHORT).show()
            binding.cvDialogList.visibility = View.GONE
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.flMain, LearnedFragment())
                ?.commit()
            binding.rvNewWords.visibility = View.VISIBLE
        }
        binding.btDialogCancelList.setOnClickListener {
            binding.cvDialogList.visibility = View.GONE
            binding.rvNewWords.visibility = View.VISIBLE
        }

        binding.tvSaveNewWord.setOnClickListener {
            if (binding.etNewWord.text.isNotEmpty() && binding.etTranslate.text.isNotEmpty()) {
                val englishWord: String = binding.etNewWord.text.toString()
                val translateWord: String = binding.etTranslate.text.toString()
                val word = Word(englishWord = englishWord, translateWord = translateWord, id = 0)
                Toast.makeText(requireActivity(), "Saved!", Toast.LENGTH_SHORT).show()
                //insertInject.execute(word)
                viewModel.insert(word)
                adapter.notifyDataSetChanged()
                val ims = activity?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                ims.hideSoftInputFromWindow(binding.etNewWord.windowToken, 0)
                ims.hideSoftInputFromWindow(binding.etTranslate.windowToken, 0)
//                val intent = Intent(requireActivity(), MainActivity :: class.java)
//                startActivity(intent)
//                activity?.overridePendingTransition(0, R.anim.open_activity)
                activity?.supportFragmentManager
                    ?.beginTransaction()
                    ?.replace(R.id.flMain, LearnFragment())
                    ?.commit()
                //activity?.finish()
            } else {
                Toast.makeText(
                    requireActivity(), "Заполните пустые поля!",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
    private fun getData() {
        val wordFromDb: List<Word> = getAll.execute()
        wordList.clear()
        wordList.addAll(wordFromDb)
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun copyId(index: Int) {
//        wordDatabase.wordDao().copyId(index)
//        wordDatabase.wordDao().deleteId(index)
//        getData()
//        adapter.submitList(wordList)
    }

    @SuppressLint("NotifyDataSetChanged", "InflateParams", "SetTextI18n")
    override fun deleteWords(index: Int) {
        binding.cvDialog.visibility = View.VISIBLE
        binding.rvNewWords.visibility = View.GONE
        binding.btDialogOk.setOnClickListener {
            val words = wordList[index]
            deleteInject.execute(words)
            getData()
            adapter.notifyDataSetChanged()
            hideSystemUI()
            Toast.makeText(requireActivity(), "The entry is deleted!", Toast.LENGTH_SHORT).show()
            binding.cvDialog.visibility = View.GONE
              binding.rvNewWords.visibility = View.VISIBLE
        }
        binding.btDialogCancel.setOnClickListener {
            binding.cvDialog.visibility = View.GONE
              binding.rvNewWords.visibility = View.VISIBLE
        }
    }
    override fun onResume() {
        super.onResume()
        hideSystemUI()
    }
    private fun hideSystemUI () {
        val window : Window? = activity?.window
        if (window != null) {
            WindowCompat.setDecorFitsSystemWindows(window, false)
        }
        if (window != null) {
                WindowInsetsControllerCompat (window, window.decorView).let { controller ->
                    controller.hide (WindowInsetsCompat.Type.systemBars ())
                    controller.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
                }
        }
    }
}