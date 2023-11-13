package com.azimuton.foreign.fragments.english

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.azimuton.data.roomstorage.room.AppRoomDatabase
import com.azimuton.domain.models.Word
import com.azimuton.domain.usecase.WordCopyUseCase
import com.azimuton.domain.usecase.WordDeleteAllUseCase
import com.azimuton.domain.usecase.WordDeleteUseCase
import com.azimuton.domain.usecase.WordGetAllUseCase
import com.azimuton.domain.usecase.WordGetWordByIdUseCase
import com.azimuton.domain.usecase.WordInsertUseCase
import com.azimuton.foreign.viewmodels.LearnViewModel
import com.azimuton.foreign.MainActivity
import com.azimuton.foreign.R
import com.azimuton.foreign.adapters.NewWordsAdapter
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

        binding.ivClearNewWord.setOnClickListener { binding.etNewWord.text.clear() }
        binding.ivClearTranslate.setOnClickListener { binding.etTranslate.text.clear() }

        binding.tvTransfer.setOnClickListener {
            val addDialog = AlertDialog.Builder(requireActivity())
            addDialog
                .setMessage("Вы действительно хотите перенести записи?")
                .setPositiveButton("Ok") { dialog, _ ->
                    getData()
                    viewModel.copy()
                    deleteAll.execute()
                    adapter.notifyDataSetChanged()
                    activity?.overridePendingTransition(0, 0)
                    val intent = Intent(requireActivity(), MainActivity :: class.java)
                    startActivity(intent)
                    activity?.overridePendingTransition(0, R.anim.open_activity)
                    activity?.finish()
                    Toast.makeText(requireActivity(), "Записи пересены!", Toast.LENGTH_SHORT).show()
                    dialog.dismiss()
                }
                .setNegativeButton("Отмена") { dialog, _ ->
                    dialog.dismiss()
                }
                .create()
                .show()
        }

        binding.tvSaveNewWord.setOnClickListener {
            if (binding.etNewWord.text.isNotEmpty() && binding.etTranslate.text.isNotEmpty()) {
                val englishWord: String = binding.etNewWord.text.toString()
                val translateWord: String = binding.etTranslate.text.toString()
                val word = Word(englishWord = englishWord, translateWord = translateWord, id = 0)
                Toast.makeText(requireActivity(), "Поля заполнены!", Toast.LENGTH_SHORT).show()
                insertInject.execute(word)
                //viewModel.insert(word)
                adapter.notifyDataSetChanged()
                val ims = activity?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                ims.hideSoftInputFromWindow(binding.etNewWord.windowToken, 0)
                ims.hideSoftInputFromWindow(binding.etTranslate.windowToken, 0)
                val intent = Intent(requireActivity(), MainActivity :: class.java)
                startActivity(intent)
                activity?.overridePendingTransition(0, R.anim.open_activity)
                activity?.finish()
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

    @SuppressLint("NotifyDataSetChanged")
    override fun deleteWords(index: Int) {
        val addDialog = AlertDialog.Builder(requireActivity())
        addDialog
            .setMessage("Вы действительно хотите удалить запись?")
            .setPositiveButton("Ok") { dialog, _ ->
                val words = wordList[index]
                deleteInject.execute(words)
                //viewModel.delete(words)
                getData()
                adapter.notifyDataSetChanged()
                val  w : Window? = activity?.window
                w?.decorView?.systemUiVisibility = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                        or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
                Toast.makeText(requireActivity(), "Запись удалена!", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }
            .setNegativeButton("Отмена") { dialog, _ ->
                dialog.dismiss()
            }
            .create()
            .show()
    }
    override fun onResume() {
        super.onResume()
        val w: Window? = activity?.window
        w?.decorView?.systemUiVisibility = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
    }

}