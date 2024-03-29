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
import com.azimuton.foreign.databinding.FragmentHomeAnimalsBinding
import com.azimuton.foreign.viewmodels.english.NewWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HomeAnimalsFragment : Fragment() {
    private lateinit var binding : FragmentHomeAnimalsBinding
    private val viewModel: NewWordsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeAnimalsBinding.inflate(inflater, container, false)
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

        binding.ivCat.setOnClickListener {
            val english : String = binding.cat.text.toString()
            val translate : String = binding.tvCat.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDog.setOnClickListener {
            val english : String = binding.dog.text.toString()
            val translate : String = binding.tvDog.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivMouse.setOnClickListener {
            val english : String = binding.mouse.text.toString()
            val translate : String = binding.tvMouse.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivParrot.setOnClickListener {
            val english : String = binding.parrot.text.toString()
            val translate : String = binding.tvParrot.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCow.setOnClickListener {
            val english : String = binding.cow.text.toString()
            val translate : String = binding.tvCow.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGoat.setOnClickListener {
            val english : String = binding.goat.text.toString()
            val translate : String = binding.tvGoat.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivChik.setOnClickListener {
            val english : String = binding.chik.text.toString()
            val translate : String = binding.tvChik.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDuck.setOnClickListener {
            val english : String = binding.duck.text.toString()
            val translate : String = binding.tvDuck.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGoose.setOnClickListener {
            val english : String =binding.goose.text.toString()
            val translate : String = binding.tvGoose.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPig.setOnClickListener {
            val english : String = binding.pig.text.toString()
            val translate : String = binding.tvPig.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTurkey.setOnClickListener {
            val english : String = binding.turkey.text.toString()
            val translate : String = binding.tvTurkey.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSheep.setOnClickListener {
            val english : String = binding.sheep.text.toString()
            val translate : String = binding.tvSheep.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHorse.setOnClickListener {
            val english : String = binding.horse.text.toString()
            val translate : String = binding.tvHorse.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRabbit.setOnClickListener {
            val english : String = binding.rabbit.text.toString()
            val translate : String = binding.tvRabbit.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivQuail.setOnClickListener {
            val english : String = binding.quail.text.toString()
            val translate : String = binding.tvQuail.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDonkey.setOnClickListener {
            val english : String = binding.donkey.text.toString()
            val translate : String = binding.tvDonkey.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHamster.setOnClickListener {
            val english : String = binding.hamster.text.toString()
            val translate : String = binding.tvHamster.text.toString()
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