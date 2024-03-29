package com.azimuton.foreign.fragments.english.frasalverbs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.azimuton.domain.models.english.Word
import com.azimuton.foreign.databinding.FragmentFrasalVerbsTwoBinding
import com.azimuton.foreign.viewmodels.english.FrasalVerbsTwoModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class FrasalVerbsTwoFragment : Fragment() {
   private lateinit var binding : FragmentFrasalVerbsTwoBinding
    private val viewModel : FrasalVerbsTwoModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       binding = FragmentFrasalVerbsTwoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.ivF71.setOnClickListener {
            val english : String =  binding.tvE71.text.toString()
            val translate : String =  binding.tvT71.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF72.setOnClickListener {
            val english : String =  binding.tvE72.text.toString()
            val translate : String =  binding.tvT72.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF73.setOnClickListener {
            val english : String =  binding.tvE73.text.toString()
            val translate : String =  binding.tvT73.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF74.setOnClickListener {
            val english : String =  binding.tvE74.text.toString()
            val translate : String =  binding.tvT74.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF75.setOnClickListener {
            val english : String =  binding.tvE75.text.toString()
            val translate : String =  binding.tvT75.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF76.setOnClickListener {
            val english : String =  binding.tvE76.text.toString()
            val translate : String =  binding.tvT76.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF77.setOnClickListener {
            val english : String =  binding.tvE77.text.toString()
            val translate : String =  binding.tvT77.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF78.setOnClickListener {
            val english : String =  binding.tvE78.text.toString()
            val translate : String =  binding.tvT78.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF79.setOnClickListener {
            val english : String =  binding.tvE79.text.toString()
            val translate : String =  binding.tvT79.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF80.setOnClickListener {
            val english : String =  binding.tvE80.text.toString()
            val translate : String =  binding.tvT80.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF81.setOnClickListener {
            val english : String =  binding.tvE81.text.toString()
            val translate : String =  binding.tvT81.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF82.setOnClickListener {
            val english : String =  binding.tvE82.text.toString()
            val translate : String =  binding.tvT82.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF83.setOnClickListener {
            val english : String =  binding.tvE83.text.toString()
            val translate : String =  binding.tvT83.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF84.setOnClickListener {
            val english : String =  binding.tvE84.text.toString()
            val translate : String =  binding.tvT84.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF85.setOnClickListener {
            val english : String =  binding.tvE85.text.toString()
            val translate : String =  binding.tvT85.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF86.setOnClickListener {
            val english : String =  binding.tvE86.text.toString()
            val translate : String =  binding.tvT86.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF87.setOnClickListener {
            val english : String =  binding.tvE87.text.toString()
            val translate : String =  binding.tvT87.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF88.setOnClickListener {
            val english : String =  binding.tvE88.text.toString()
            val translate : String =  binding.tvT88.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF89.setOnClickListener {
            val english : String =  binding.tvE89.text.toString()
            val translate : String =  binding.tvT89.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF90.setOnClickListener {
            val english : String =  binding.tvE90.text.toString()
            val translate : String =  binding.tvT90.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF91.setOnClickListener {
            val english : String =  binding.tvE91.text.toString()
            val translate : String =  binding.tvT91.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF92.setOnClickListener {
            val english : String =  binding.tvE92.text.toString()
            val translate : String =  binding.tvT92.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF93.setOnClickListener {
            val english : String =  binding.tvE93.text.toString()
            val translate : String =  binding.tvT93.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF94.setOnClickListener {
            val english : String =  binding.tvE94.text.toString()
            val translate : String =  binding.tvT94.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF95.setOnClickListener {
            val english : String =  binding.tvE95.text.toString()
            val translate : String =  binding.tvT95.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF96.setOnClickListener {
            val english : String =  binding.tvE96.text.toString()
            val translate : String =  binding.tvT96.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF97.setOnClickListener {
            val english : String =  binding.tvE97.text.toString()
            val translate : String =  binding.tvT97.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF98.setOnClickListener {
            val english : String =  binding.tvE98.text.toString()
            val translate : String =  binding.tvT98.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF99.setOnClickListener {
            val english : String =  binding.tvE99.text.toString()
            val translate : String =  binding.tvT99.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF100.setOnClickListener {
            val english : String =  binding.tvE100.text.toString()
            val translate : String =  binding.tvT100.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF101.setOnClickListener {
            val english : String =  binding.tvE101.text.toString()
            val translate : String =  binding.tvT101.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF102.setOnClickListener {
            val english : String =  binding.tvE102.text.toString()
            val translate : String =  binding.tvT102.text.toString()
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