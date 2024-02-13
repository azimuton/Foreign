package com.azimuton.foreign.fragments.spain

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
import com.azimuton.domain.models.spain.WordSpain
import com.azimuton.domain.usecase.spain.SpainWordCopyUseCase
import com.azimuton.domain.usecase.spain.SpainWordDeleteAllUseCase
import com.azimuton.domain.usecase.spain.SpainWordDeleteUseCase
import com.azimuton.domain.usecase.spain.SpainWordGetAllUseCase
import com.azimuton.domain.usecase.spain.SpainWordGetWordByIdUseCase
import com.azimuton.domain.usecase.spain.SpainWordInsertUseCase
import com.azimuton.foreign.R
import com.azimuton.foreign.databinding.FragmentLearnSpainBinding
import com.azimuton.foreign.fragments.english.LearnFragment
import com.azimuton.foreign.fragments.english.LearnedFragment
import com.azimuton.foreign.fragments.spain.adapters.LearnSpainAdapter
import com.azimuton.foreign.viewmodels.spain.LearnSpainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class LearnSpainFragment : Fragment(), LearnSpainAdapter.ViewHolder.ItemCallback {
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private lateinit var binding: FragmentLearnSpainBinding
    private lateinit var adapter: LearnSpainAdapter
    lateinit var wordDatabase : AppRoomDatabase
    private lateinit var wordList: ArrayList<WordSpain>
    @Inject
    lateinit var spainCopyUseCase: SpainWordCopyUseCase
    private val viewModel : LearnSpainViewModel by activityViewModels()
    @Inject
    lateinit var spainInsertInject : SpainWordInsertUseCase
    @Inject
    lateinit var spainDeleteInject : SpainWordDeleteUseCase
    @Inject
    lateinit var spainGetAll : SpainWordGetAllUseCase
    @Inject
    lateinit var spainDeleteAll : SpainWordDeleteAllUseCase
    @Inject
    lateinit var spainGetWordById : SpainWordGetWordByIdUseCase
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLearnSpainBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        wordList = ArrayList<WordSpain>()
        wordDatabase = AppRoomDatabase.getDatabase(requireActivity())
        getData()
        adapter = LearnSpainAdapter(requireActivity(), this)
        binding.rvNewWordsSpain.layoutManager = LinearLayoutManager(requireActivity())
        binding.rvNewWordsSpain.adapter = adapter
        adapter.submitList(wordList)

        binding.ivClearNewWordSpain.setOnClickListener {
            binding.etNewWordSpain.text.clear()
            hideSystemUI()
        }
        binding.ivClearTranslateSpain.setOnClickListener {
            binding.etTranslateSpain.text.clear()
            hideSystemUI()
        }
        binding.tvTransferSpain.setOnClickListener {
            if(binding.rvNewWordsSpain.isNotEmpty()){
                binding.cvDialogListSpain.visibility = View.VISIBLE
                binding.rvNewWordsSpain.visibility = View.GONE
            } else {
                Toast.makeText(requireActivity(), "The list is empty!", Toast.LENGTH_SHORT).show()
            }
        }
        binding.btDialogOkListSpain.setOnClickListener {
            getData()
            viewModel.copy()
            //spainDeleteAll.execute()
            viewModel.deleteAll()
            adapter.notifyDataSetChanged()
            hideSystemUI()
            Toast.makeText(requireActivity(), "The list is transfered!", Toast.LENGTH_SHORT).show()
            binding.cvDialogListSpain.visibility = View.GONE
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.flMain, LearnedSpainFragment())
                ?.commit()
            binding.rvNewWordsSpain.visibility = View.VISIBLE
        }
        binding.btDialogCancelListSpain.setOnClickListener {
            binding.cvDialogListSpain.visibility = View.GONE
            binding.rvNewWordsSpain.visibility = View.VISIBLE
        }
        binding.tvSaveNewWordSpain.setOnClickListener {
            if (binding.etNewWordSpain.text.isNotEmpty() && binding.etTranslateSpain.text.isNotEmpty()) {
                val spainWord: String = binding.etNewWordSpain.text.toString()
                val translateSpainWord: String = binding.etTranslateSpain.text.toString()
                val wordSpain = WordSpain(spainWord = spainWord, translateSpainWord = translateSpainWord, id = 0)
                Toast.makeText(requireActivity(), "Saved!", Toast.LENGTH_SHORT).show()
                //spainInsertInject.execute(wordSpain)
                viewModel.insert(wordSpain)
                adapter.notifyDataSetChanged()
                val ims = activity?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                ims.hideSoftInputFromWindow(binding.etNewWordSpain.windowToken, 0)
                ims.hideSoftInputFromWindow(binding.etTranslateSpain.windowToken, 0)
                activity?.supportFragmentManager
                    ?.beginTransaction()
                    ?.replace(R.id.flMain, LearnSpainFragment())
                    ?.commit()
            } else {
                Toast.makeText(
                    requireActivity(), "Please, full empty fields!",
                    Toast.LENGTH_LONG
                ).show()
            }
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

    private fun getData() {
        coroutineScope.launch {
            val wordFromDb: List<WordSpain> = spainGetAll.execute()
            wordList.clear()
            wordList.addAll(wordFromDb)
        }
    }

    override fun copyId(index: Int) {
        val words = wordList[index]
        //wordDatabase.spainWordDao().copyId(index)
        viewModel.copyId(index)
        coroutineScope.launch {
            spainDeleteInject.execute(words)
        }
        getData()
        adapter.submitList(wordList)
        activity?.supportFragmentManager
            ?.beginTransaction()
           // ?.setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
            ?.replace(R.id.flMain, LearnSpainFragment())
            ?.commit()
        Toast.makeText(requireActivity(), "Word copied!", Toast.LENGTH_LONG).show()
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun deleteWords(index: Int) {
        binding.cvDialog.visibility = View.VISIBLE
        binding.rvNewWordsSpain.visibility = View.GONE
        binding.btDialogOk.setOnClickListener {
            val words = wordList[index]
            coroutineScope.launch {
                spainDeleteInject.execute(words)
            }
            getData()
            adapter.notifyDataSetChanged()
            hideSystemUI()
            Toast.makeText(requireActivity(), "The entry is deleted!", Toast.LENGTH_SHORT).show()
            binding.cvDialog.visibility = View.GONE
            binding.rvNewWordsSpain.visibility = View.VISIBLE
        }
        binding.btDialogCancel.setOnClickListener {
            binding.cvDialog.visibility = View.GONE
            binding.rvNewWordsSpain.visibility = View.VISIBLE
        }
    }

}