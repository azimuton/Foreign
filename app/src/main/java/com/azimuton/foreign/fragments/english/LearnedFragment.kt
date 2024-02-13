package com.azimuton.foreign.fragments.english

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.ImageView
import android.widget.SearchView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.azimuton.data.roomstorage.room.AppRoomDatabase
import com.azimuton.domain.models.english.LearnedWord
import com.azimuton.domain.usecase.english.LearnedWordGetAllUseCase
import com.azimuton.foreign.R
import com.azimuton.foreign.databinding.FragmentLearnedBinding
import com.azimuton.foreign.fragments.english.adapters.LearnedWordsAdapter
import com.azimuton.foreign.viewmodels.english.LearnedViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.properties.Delegates


@AndroidEntryPoint
class LearnedFragment : Fragment(), LearnedWordsAdapter.ViewHolder.ItemCallback {
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private lateinit var binding: FragmentLearnedBinding
    private lateinit var adapter: LearnedWordsAdapter
    lateinit var learnedWordDatabase : AppRoomDatabase
    private lateinit var learnedWordsList: ArrayList<LearnedWord>
    @Inject
    lateinit var getAll : LearnedWordGetAllUseCase
    private val viewModel : LearnedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLearnedBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("DiscouragedApi", "ResourceAsColor", "ResourceType")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val searchView = activity?.findViewById(com.azimuton.foreign.R.id.searchView) as SearchView
        val id = searchView.context.resources.getIdentifier("android:id/search_src_text", null, null)
        val textView = searchView.findViewById<View>(id) as TextView
        textView.setTextColor(ContextCompat.getColor(requireActivity(), R.color.black))

        learnedWordsList = ArrayList<LearnedWord>()
        learnedWordDatabase = AppRoomDatabase.getDatabase(requireActivity())
        getData()
        adapter = LearnedWordsAdapter(requireActivity(), this)
        binding.rvLearnedWords.layoutManager = LinearLayoutManager(requireActivity())
        binding.rvLearnedWords.adapter = adapter
        adapter.submitList(learnedWordsList)

        coroutineScope.launch(Dispatchers.Main) {
            binding.tvQuantityOfLearnedWords.text = learnedWordDatabase.learnedWordDao().count().toString()
        }

        binding.tvChooseWord.setOnClickListener {randomLearned()}
        binding.ivChangeWords.setOnClickListener { changeLanguage() }

        binding.ivCloseCheckingWord.setOnClickListener {
            binding.tvCheckingWord.text = ""
            binding.tvCheckingTranslate.text = ""
            binding.tvCheckingTranslate.visibility = View.GONE
            binding.ivEyeClosed.visibility = View.GONE
            binding.ivEyeOpen.visibility = View.VISIBLE
        }

        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(p0: String?): Boolean {
                p0?.let { search(p0) }
                return true
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                p0?.let { search(p0) }
                return true
            }

        })

        binding.ivEyeOpen.setOnClickListener {
                binding.tvCheckingTranslate.visibility = View.VISIBLE
            binding.ivEyeOpen.visibility = View.GONE
            binding.ivEyeClosed.visibility = View.VISIBLE
        }
        binding.ivEyeClosed.setOnClickListener {
                binding.tvCheckingTranslate.visibility = View.GONE
            binding.ivEyeClosed.visibility = View.GONE
            binding.ivEyeOpen.visibility = View.VISIBLE
        }
        val  w : Window? = activity?.window
        w?.decorView?.systemUiVisibility = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
    }
    private fun search(query: String) {
        val filteredList = learnedWordsList.filter { it.englishLearnedWord.contains(query, ignoreCase = true) }
        adapter.submitList(filteredList)
    }
    private fun getData() {
        coroutineScope.launch {
            val wordFromDb: List<LearnedWord> = getAll.execute()
            learnedWordsList.clear()
            learnedWordsList.addAll(wordFromDb)
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun deleteLearnedWords(index: Int) {
        binding.cvDialog.visibility = View.VISIBLE
        binding.btDialogOk.setOnClickListener {
            val learnedWords = learnedWordsList[index]
            viewModel.delete(learnedWords)
            coroutineScope.launch(Dispatchers.Main) {
                val count = learnedWordDatabase.learnedWordDao().count().toString()
                activity?.runOnUiThread {
                    binding.tvQuantityOfLearnedWords.text = count
                }
            }
            getData()
            adapter.notifyDataSetChanged()
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.flMain, LearnedFragment())
                ?.commit()
            Toast.makeText(requireActivity(), "The entry is deleted!", Toast.LENGTH_SHORT).show()
            binding.cvDialog.visibility = View.GONE
        }
        binding.btDialogCancel.setOnClickListener {
            binding.cvDialog.visibility = View.GONE
        }
    }
    private fun randomLearned() {
        coroutineScope.launch {
        val resultRandom = learnedWordDatabase.learnedWordDao().randoms()
        if (learnedWordDatabase.learnedWordDao().count() != 0) {
            activity?.runOnUiThread {
                binding.tvCheckingWord.text = resultRandom.learnedEnglishWord
                binding.tvCheckingTranslate.text = resultRandom.learnedTranslateWord
            }
        } else {
            activity?.runOnUiThread {
                Toast.makeText(requireActivity(), "No words!", Toast.LENGTH_SHORT).show()
            }
        }
    }
    }

    private fun changeLanguage() {
        coroutineScope.launch {
            val resultRandom = learnedWordDatabase.learnedWordDao().randoms()
            if (learnedWordDatabase.learnedWordDao().count() != 0) {
                activity?.runOnUiThread {
                    binding.tvCheckingWord.text = resultRandom.learnedTranslateWord
                    binding.tvCheckingTranslate.text = resultRandom.learnedEnglishWord
                }
            } else {
                activity?.runOnUiThread {
                    Toast.makeText(requireActivity(), "No words!", Toast.LENGTH_SHORT).show()
                }
            }
       }
    }
}