package com.azimuton.foreign.fragments.english.newwords

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.azimuton.domain.models.english.Word
import com.azimuton.foreign.fragments.english.NewWordsFragment
import com.azimuton.foreign.R
import com.azimuton.foreign.databinding.FragmentFruitsBinding
import com.azimuton.foreign.viewmodels.english.NewWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class FruitsFragment : Fragment() {
    private lateinit var binding : FragmentFruitsBinding
    private val viewModel: NewWordsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFruitsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Glide.with(this)
            .asGif()
            .load(R.drawable.leftarrow)
            .into(binding.ivBackToNewWordsList)
        binding.ivBackToNewWordsList.setOnClickListener {
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.flMain, NewWordsFragment())
                ?.commit()
        }

        binding.ivApple.setOnClickListener {
            val english : String = binding.apple.text.toString()
            val translate : String = binding.tvApple.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPear.setOnClickListener {
            val english : String = binding.pear.text.toString()
            val translate : String = binding.tvPear.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
           viewModel.insert(word)
            toast()
        }
        binding.ivPeach.setOnClickListener {
            val english : String = binding.peach.text.toString()
            val translate : String = binding.tvPeach.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPlum.setOnClickListener {
            val english : String = binding.plum.text.toString()
            val translate : String = binding.tvPlum.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivApricot.setOnClickListener {
            val english : String = binding.apricot.text.toString()
            val translate : String = binding.tvApricot.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBanana.setOnClickListener {
            val english : String = binding.banana.text.toString()
            val translate : String = binding.tvBanana.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivOrange.setOnClickListener {
            val english : String = binding.orange.text.toString()
            val translate : String = binding.tvOrange.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivMandarin.setOnClickListener {
            val english : String = binding.mandarin.text.toString()
            val translate : String = binding.tvMandarin.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLemon.setOnClickListener {
            val english : String = binding.lemon.text.toString()
            val translate : String = binding.tvLemon.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivMango.setOnClickListener {
            val english : String = binding.mango.text.toString()
            val translate : String = binding.tvMango.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivAvocado.setOnClickListener {
            val english : String = binding.avocado.text.toString()
            val translate : String = binding.tvAvocado.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPineapple.setOnClickListener {
            val english : String = binding.pineapple.text.toString()
            val translate : String = binding.tvPineapple.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGarnet.setOnClickListener {
            val english : String = binding.garnet.text.toString()
            val translate : String = binding.tvGarnet.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivKiwi.setOnClickListener {
            val english : String = binding.kiwi.text.toString()
            val translate : String = binding.tvKiwi.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGrapefruit.setOnClickListener {
            val english : String = binding.grapefruit.text.toString()
            val translate : String = binding.tvGrapefruit.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPomelo.setOnClickListener {
            val english : String = binding.pomelo.text.toString()
            val translate : String = binding.tvPomelo.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivQuince.setOnClickListener {
            val english : String = binding.quince.text.toString()
            val translate : String = binding.tvQuince.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPersimmon.setOnClickListener {
            val english : String = binding.persimmon.text.toString()
            val translate : String = binding.tvPersimmon.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivNectarine.setOnClickListener {
            val english : String = binding.nectarine.text.toString()
            val translate : String = binding.tvNectarine.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFigs.setOnClickListener {
            val english : String = binding.figs.text.toString()
            val translate : String = binding.tvFigs.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDatefruit.setOnClickListener {
            val english : String = binding.datefruit.text.toString()
            val translate : String = binding.tvDatefruit.text.toString()
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