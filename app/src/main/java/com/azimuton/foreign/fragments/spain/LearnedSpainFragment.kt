package com.azimuton.foreign.fragments.spain

import android.annotation.SuppressLint
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
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.azimuton.data.roomstorage.room.AppRoomDatabase
import com.azimuton.domain.models.spain.LearnedSpainWord
import com.azimuton.domain.usecase.spain.SpainLearnedWordGetAllUseCase
import com.azimuton.foreign.R
import com.azimuton.foreign.databinding.FragmentLearnedSpainBinding
import com.azimuton.foreign.fragments.english.LearnedFragment
import com.azimuton.foreign.fragments.spain.adapters.LearnedSpainWordsAdapter
import com.azimuton.foreign.viewmodels.spain.LearnedSpainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import javax.inject.Inject

@AndroidEntryPoint
class LearnedSpainFragment : Fragment(), LearnedSpainWordsAdapter.ViewHolder.ItemCallback{
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private lateinit var binding : FragmentLearnedSpainBinding
    private lateinit var adapter: LearnedSpainWordsAdapter
    lateinit var learnedWordDatabase : AppRoomDatabase
    private lateinit var learnedWordsList: ArrayList<LearnedSpainWord>
    @Inject
    lateinit var getAll : SpainLearnedWordGetAllUseCase
    private val viewModel : LearnedSpainViewModel by activityViewModels()
    private var cor : Job? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       binding = FragmentLearnedSpainBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("DiscouragedApi", "ResourceAsColor", "ResourceType")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val searchView = activity?.findViewById(com.azimuton.foreign.R.id.searchViewSpain) as SearchView
        val id = searchView.context.resources.getIdentifier("android:id/search_src_text", null, null)
        val textView = searchView.findViewById<View>(id) as TextView
        textView.setTextColor(ContextCompat.getColor(requireActivity(), R.color.black))

        learnedWordsList = ArrayList<LearnedSpainWord>()
        learnedWordDatabase = AppRoomDatabase.getDatabase(requireActivity())
        getData()
        adapter = LearnedSpainWordsAdapter(requireActivity(), this)
        binding.rvLearnedWordsSpain.layoutManager = LinearLayoutManager(requireActivity())
        binding.rvLearnedWordsSpain.adapter = adapter
        adapter.submitList(learnedWordsList)

        coroutineScope.launch(Dispatchers.Main) {
            binding.tvQuantityOfLearnedWordsSpain.text = learnedWordDatabase.learnedSpainWordDao().count().toString()
        }

        binding.tvChooseWordSpain.setOnClickListener {randomLearned()}
        binding.ivChangeWordsSpain.setOnClickListener { changeLanguage() }

        binding.ivCloseCheckingWordSpain.setOnClickListener {
            binding.tvCheckingWordSpain.text = ""
            binding.tvCheckingTranslateSpain.text = ""
            binding.tvCheckingTranslateSpain.visibility = View.GONE
            binding.ivEyeClosedSpain.visibility = View.GONE
            binding.ivEyeOpenSpain.visibility = View.VISIBLE
        }

        binding.ivEyeOpenSpain.setOnClickListener {
            binding.tvCheckingTranslateSpain.visibility = View.VISIBLE
            binding.ivEyeOpenSpain.visibility = View.GONE
            binding.ivEyeClosedSpain.visibility = View.VISIBLE
        }
        binding.ivEyeClosedSpain.setOnClickListener {
            binding.tvCheckingTranslateSpain.visibility = View.GONE
            binding.ivEyeClosedSpain.visibility = View.GONE
            binding.ivEyeOpenSpain.visibility = View.VISIBLE
        }
        hideSystemUI()

        binding.searchViewSpain.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(p0: String?): Boolean {
                p0?.let { search(p0) }
                return true
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                p0?.let { search(p0) }
                return true
            }

        })
    }

    private fun search(query: String) {
        val filteredList = learnedWordsList.filter { it.spainLearnedWord.contains(query, ignoreCase = true) }
        adapter.submitList(filteredList)
    }

    private fun getData() {
        coroutineScope.launch {
            val wordFromDb: List<LearnedSpainWord> = getAll.execute()
            learnedWordsList.clear()
            learnedWordsList.addAll(wordFromDb)
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun deleteLearnedSpainWords(index: Int) {
        var count = ""
        binding.cvDialogSpain.visibility = View.VISIBLE
        binding.btDialogOkSpain.setOnClickListener {
            val learnedSpainWords = learnedWordsList[index]
            viewModel.delete(learnedSpainWords)
            coroutineScope.launch(Dispatchers.Main) {
                withContext(Dispatchers.IO) {
                    count = learnedWordDatabase.learnedSpainWordDao().count().toString()
                }
                binding.tvQuantityOfLearnedWordsSpain.text = count
                getData()
                adapter.notifyDataSetChanged()
                viewModel.delete(learnedSpainWords)
                val toast = Toast.makeText(requireActivity(), "The entry is deleted!", Toast.LENGTH_SHORT)
                toast.show()
                cor = CoroutineScope(Dispatchers.Main).launch {
                    delay(500)
                    toast.cancel()
                    cor?.cancel()
                }
                binding.cvDialogSpain.visibility = View.GONE
            }
        }
        binding.btDialogCancelSpain.setOnClickListener {
            binding.cvDialogSpain.visibility = View.GONE
        }
    }
    private fun randomLearned(){
        coroutineScope.launch {
            val resultRandom = learnedWordDatabase.learnedSpainWordDao().randoms()
            if (learnedWordDatabase.learnedSpainWordDao().count() != 0) {
                activity?.runOnUiThread {
                    binding.tvCheckingWordSpain.text = resultRandom.learnedSpainWord
                    binding.tvCheckingTranslateSpain.text = resultRandom.learnedTranslateSpainWord
                }
            } else {
                Toast.makeText(requireActivity(), "No words!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun changeLanguage() {
        coroutineScope.launch {
            val resultRandom = learnedWordDatabase.learnedSpainWordDao().randoms()
            if (learnedWordDatabase.learnedSpainWordDao().count() != 0) {
                binding.tvCheckingWordSpain.text = resultRandom.learnedTranslateSpainWord
                binding.tvCheckingTranslateSpain.text = resultRandom.learnedSpainWord
            } else {
                Toast.makeText(requireActivity(), "No words!", Toast.LENGTH_SHORT).show()
            }
        }
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