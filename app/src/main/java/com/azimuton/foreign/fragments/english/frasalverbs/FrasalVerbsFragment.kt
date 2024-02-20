package com.azimuton.foreign.fragments.english.frasalverbs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.azimuton.domain.models.english.Word
import com.azimuton.foreign.databinding.FragmentFrasalVerbsBinding
import com.azimuton.foreign.viewmodels.english.FrasalsViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class FrasalVerbsFragment : Fragment() {
    private lateinit var binding : FragmentFrasalVerbsBinding
    private val viewModel : FrasalsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFrasalVerbsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.ivF1.setOnClickListener {
            val english : String = binding.tvE1.text.toString()
            val translate : String = binding.tvT1.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF2.setOnClickListener {
            val english : String =  binding.tvE2.text.toString()
            val translate : String =  binding.tvT2.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF3.setOnClickListener {
            val english : String =  binding.tvE3.text.toString()
            val translate : String =  binding.tvT3.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF4.setOnClickListener {
            val english : String =  binding.tvE4.text.toString()
            val translate : String =  binding.tvT4.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF5.setOnClickListener {
            val english : String =  binding.tvE5.text.toString()
            val translate : String =  binding.tvT5.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF6.setOnClickListener {
            val english : String =  binding.tvE6.text.toString()
            val translate : String =  binding.tvT6.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF7.setOnClickListener {
            val english : String =  binding.tvE7.text.toString()
            val translate : String =  binding.tvT7.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF8.setOnClickListener {
            val english : String =  binding.tvE8.text.toString()
            val translate : String =  binding.tvT8.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF9.setOnClickListener {
            val english : String =  binding.tvE9.text.toString()
            val translate : String =  binding.tvT9.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF10.setOnClickListener {
            val english : String =  binding.tvE10.text.toString()
            val translate : String =  binding.tvT10.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF11.setOnClickListener {
            val english : String =  binding.tvE11.text.toString()
            val translate : String =  binding.tvT11.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF12.setOnClickListener {
            val english : String =  binding.tvE12.text.toString()
            val translate : String =  binding.tvT12.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF13.setOnClickListener {
            val english : String =  binding.tvE13.text.toString()
            val translate : String =  binding.tvT13.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF14.setOnClickListener {
            val english : String =  binding.tvE14.text.toString()
            val translate : String =  binding.tvT14.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF15.setOnClickListener {
            val english : String =  binding.tvE15.text.toString()
            val translate : String =  binding.tvT15.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF16.setOnClickListener {
            val english : String =  binding.tvE16.text.toString()
            val translate : String =  binding.tvT16.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF17.setOnClickListener {
            val english : String =  binding.tvE17.text.toString()
            val translate : String =  binding.tvT17.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF18.setOnClickListener {
            val english : String =  binding.tvE18.text.toString()
            val translate : String =  binding.tvT18.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF19.setOnClickListener {
            val english : String =  binding.tvE19.text.toString()
            val translate : String =  binding.tvT19.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF20.setOnClickListener {
            val english : String =  binding.tvE20.text.toString()
            val translate : String =  binding.tvT20.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF21.setOnClickListener {
            val english : String =  binding.tvE21.text.toString()
            val translate : String =  binding.tvT21.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF22.setOnClickListener {
            val english : String = binding.tvE22.text.toString()
            val translate : String =  binding.tvT22.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF23.setOnClickListener {
            val english : String =  binding.tvE23.text.toString()
            val translate : String =  binding.tvT23.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF24.setOnClickListener {
            val english : String =  binding.tvE24.text.toString()
            val translate : String =  binding.tvT24.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF25.setOnClickListener {
            val english : String =  binding.tvE25.text.toString()
            val translate : String =  binding.tvT25.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF26.setOnClickListener {
            val english : String =  binding.tvE26.text.toString()
            val translate : String =  binding.tvT26.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF27.setOnClickListener {
            val english : String =  binding.tvE27.text.toString()
            val translate : String =  binding.tvT27.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF28.setOnClickListener {
            val english : String =  binding.tvE28.text.toString()
            val translate : String =  binding.tvT28.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF29.setOnClickListener {
            val english : String =  binding.tvE29.text.toString()
            val translate : String =  binding.tvT29.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF30.setOnClickListener {
            val english : String =  binding.tvE30.text.toString()
            val translate : String =  binding.tvT30.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF31.setOnClickListener {
            val english : String =  binding.tvE31.text.toString()
            val translate : String =  binding.tvT31.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF32.setOnClickListener {
            val english : String =  binding.tvE32.text.toString()
            val translate : String =  binding.tvT32.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF33.setOnClickListener {
            val english : String =  binding.tvE33.text.toString()
            val translate : String =  binding.tvT33.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivF34.setOnClickListener {
            val english : String =  binding.tvE34.text.toString()
            val translate : String =  binding.tvT34.text.toString()
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