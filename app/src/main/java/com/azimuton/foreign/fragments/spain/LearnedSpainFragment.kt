package com.azimuton.foreign.fragments.spain

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Toast
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.azimuton.data.roomstorage.room.AppRoomDatabase
import com.azimuton.domain.models.spain.LearnedSpainWord
import com.azimuton.domain.usecase.spain.SpainLearnedWordGetAllUseCase
import com.azimuton.foreign.databinding.FragmentLearnedSpainBinding
import com.azimuton.foreign.fragments.spain.adapters.LearnedSpainWordsAdapter
import com.azimuton.foreign.viewmodels.spain.LearnedSpainViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LearnedSpainFragment : Fragment(), LearnedSpainWordsAdapter.ViewHolder.ItemCallback{
    private lateinit var binding : FragmentLearnedSpainBinding
    private lateinit var adapter: LearnedSpainWordsAdapter
    lateinit var learnedWordDatabase : AppRoomDatabase
    private lateinit var learnedWordsList: ArrayList<LearnedSpainWord>
    @Inject
    lateinit var getAll : SpainLearnedWordGetAllUseCase
    private val viewModel : LearnedSpainViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       binding = FragmentLearnedSpainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        learnedWordsList = ArrayList<LearnedSpainWord>()
        learnedWordDatabase = AppRoomDatabase.getDatabase(requireActivity())
        getData()
        adapter = LearnedSpainWordsAdapter(requireActivity(), this)
        binding.rvLearnedWordsSpain.layoutManager = LinearLayoutManager(requireActivity())
        binding.rvLearnedWordsSpain.adapter = adapter
        adapter.submitList(learnedWordsList)

        binding.tvQuantityOfLearnedWordsSpain.text = learnedWordDatabase.learnedSpainWordDao().count().toString()

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
    }
    private fun getData() {
        val wordFromDb: List<LearnedSpainWord> = getAll.execute()
        learnedWordsList.clear()
        learnedWordsList.addAll(wordFromDb)
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun deleteLearnedSpainWords(index: Int) {
        binding.cvDialogSpain.visibility = View.VISIBLE
        binding.btDialogOkSpain.setOnClickListener {
            val learnedSpainWords = learnedWordsList[index]
            viewModel.delete(learnedSpainWords)
            binding.tvQuantityOfLearnedWordsSpain.text = learnedWordDatabase.learnedSpainWordDao().count().toString()
            getData()
            adapter.notifyDataSetChanged()
            Toast.makeText(requireActivity(), "The entry is deleted!", Toast.LENGTH_SHORT).show()
            binding.cvDialogSpain.visibility = View.GONE
        }
        binding.btDialogCancelSpain.setOnClickListener {
            binding.cvDialogSpain.visibility = View.GONE
        }
    }
    private fun randomLearned(){
        val resultRandom = learnedWordDatabase.learnedSpainWordDao().randoms()
        if(learnedWordDatabase.learnedSpainWordDao().count() != 0){
            binding.tvCheckingWordSpain.text = resultRandom.learnedSpainWord
            binding.tvCheckingTranslateSpain.text = resultRandom.learnedTranslateSpainWord
        } else{
            Toast.makeText(requireActivity(), "No words!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun changeLanguage() {
        val resultRandom = learnedWordDatabase.learnedSpainWordDao().randoms()
        if(learnedWordDatabase.learnedSpainWordDao().count() != 0){
            binding.tvCheckingWordSpain.text = resultRandom.learnedTranslateSpainWord
            binding.tvCheckingTranslateSpain.text = resultRandom.learnedSpainWord
        } else{
            Toast.makeText(requireActivity(), "No words!", Toast.LENGTH_SHORT).show()
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