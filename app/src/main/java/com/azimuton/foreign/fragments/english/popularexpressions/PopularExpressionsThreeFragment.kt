package com.azimuton.foreign.fragments.english.popularexpressions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.azimuton.domain.models.english.Word
import com.azimuton.foreign.databinding.FragmentPopularExpressionsThreeBinding
import com.azimuton.foreign.viewmodels.english.PopExpThreeViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class PopularExpressionsThreeFragment : Fragment() {
    private lateinit var binding: FragmentPopularExpressionsThreeBinding
    private val viewModel: PopExpThreeViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPopularExpressionsThreeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.ivF57.setOnClickListener {
            val english : String = binding.tvE57.text.toString()
            val translate : String = binding.tvT57.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF58.setOnClickListener {
            val english : String = binding.tvE58.text.toString()
            val translate : String = binding.tvT58.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF59.setOnClickListener {
            val english : String = binding.tvE59.text.toString()
            val translate : String = binding.tvT59.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF60.setOnClickListener {
            val english : String = binding.tvE60.text.toString()
            val translate : String = binding.tvT60.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF61.setOnClickListener {
            val english : String = binding.tvE61.text.toString()
            val translate : String = binding.tvT61.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF62.setOnClickListener {
            val english : String = binding.tvE62.text.toString()
            val translate : String = binding.tvT62.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF63.setOnClickListener {
            val english : String = binding.tvE63.text.toString()
            val translate : String = binding.tvT63.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF64.setOnClickListener {
            val english : String = binding.tvE64.text.toString()
            val translate : String = binding.tvT64.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF65.setOnClickListener {
            val english : String = binding.tvE65.text.toString()
            val translate : String = binding.tvT65.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF66.setOnClickListener {
            val english : String = binding.tvE66.text.toString()
            val translate : String = binding.tvT66.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF67.setOnClickListener {
            val english : String = binding.tvE67.text.toString()
            val translate : String = binding.tvT67.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF68.setOnClickListener {
            val english : String = binding.tvE68.text.toString()
            val translate : String = binding.tvT68.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF69.setOnClickListener {
            val english : String = binding.tvE69.text.toString()
            val translate : String = binding.tvT69.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF70.setOnClickListener {
            val english : String = binding.tvE70.text.toString()
            val translate : String = binding.tvT70.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF71.setOnClickListener {
            val english : String = binding.tvE71.text.toString()
            val translate : String = binding.tvT71.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF72.setOnClickListener {
            val english : String = binding.tvE72.text.toString()
            val translate : String = binding.tvT72.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF73.setOnClickListener {
            val english : String = binding.tvE73.text.toString()
            val translate : String = binding.tvT73.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF74.setOnClickListener {
            val english : String = binding.tvE74.text.toString()
            val translate : String = binding.tvT74.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF75.setOnClickListener {
            val english : String = binding.tvE75.text.toString()
            val translate : String = binding.tvT75.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF76.setOnClickListener {
            val english : String = binding.tvE76.text.toString()
            val translate : String = binding.tvT76.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF77.setOnClickListener {
            val english : String = binding.tvE77.text.toString()
            val translate : String = binding.tvT77.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF78.setOnClickListener {
            val english : String = binding.tvE78.text.toString()
            val translate : String = binding.tvT78.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF79.setOnClickListener {
            val english : String = binding.tvE79.text.toString()
            val translate : String = binding.tvT79.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF80.setOnClickListener {
            val english : String = binding.tvE80.text.toString()
            val translate : String = binding.tvT80.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF81.setOnClickListener {
            val english : String = binding.tvE81.text.toString()
            val translate : String = binding.tvT81.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF82.setOnClickListener {
            val english : String = binding.tvE82.text.toString()
            val translate : String = binding.tvT82.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF83.setOnClickListener {
            val english : String = binding.tvE83.text.toString()
            val translate : String = binding.tvT83.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF84.setOnClickListener {
            val english : String = binding.tvE84.text.toString()
            val translate : String = binding.tvT84.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
    }
    private fun toast(){
        val toast = Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT)
        toast.show()
        cor = coroutineScope.launch(Dispatchers.IO) {
            delay(350)
            toast.cancel()
            cor?.cancel()
        }
    }
}