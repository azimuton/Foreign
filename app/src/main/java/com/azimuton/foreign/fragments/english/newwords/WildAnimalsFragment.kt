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
import com.azimuton.foreign.databinding.FragmentWildAnimalsBinding
import com.azimuton.foreign.viewmodels.english.NewWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class WildAnimalsFragment : Fragment() {
    private lateinit var binding : FragmentWildAnimalsBinding
    private val viewModel: NewWordsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWildAnimalsBinding.inflate(inflater, container, false)
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

        binding.ivWolf.setOnClickListener {
            val english : String = binding.wolf.text.toString()
            val translate : String = binding.tvWolf.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFox.setOnClickListener {
            val english : String = binding.fox.text.toString()
            val translate : String = binding.tvFox.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFrog.setOnClickListener {
            val english : String = binding.frog.text.toString()
            val translate : String = binding.tvFrog.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDeer.setOnClickListener {
            val english : String = binding.deer.text.toString()
            val translate : String = binding.tvDeer.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBear.setOnClickListener {
            val english : String = binding.bear.text.toString()
            val translate : String = binding.tvBear.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLion.setOnClickListener {
            val english : String = binding.lion.text.toString()
            val translate : String = binding.tvLion.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTiger.setOnClickListener {
            val english : String = binding.tiger.text.toString()
            val translate : String = binding.tvTiger.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBoar.setOnClickListener {
            val english : String = binding.boar.text.toString()
            val translate : String = binding.tvBoar.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSalmon.setOnClickListener {
            val english : String = binding.salmon.text.toString()
            val translate : String = binding.tvSalmon.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBison.setOnClickListener {
            val english : String = binding.bison.text.toString()
            val translate : String = binding.tvBison.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivZebra.setOnClickListener {
            val english : String = binding.zebra.text.toString()
            val translate : String = binding.tvZebra.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLynx.setOnClickListener {
            val english : String = binding.lynx.text.toString()
            val translate : String = binding.tvLynx.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPuma.setOnClickListener {
            val english : String = binding.puma.text.toString()
            val translate : String = binding.tvPuma.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRhinoceros.setOnClickListener {
            val english : String = binding.rhinoceros.text.toString()
            val translate : String = binding.tvRhinoceros.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivElephant.setOnClickListener {
            val english : String = binding.elephant.text.toString()
            val translate : String = binding.tvElephant.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBeaver.setOnClickListener {
            val english : String = binding.beaver.text.toString()
            val translate : String = binding.tvBeaver.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRat.setOnClickListener {
            val english : String = binding.rat.text.toString()
            val translate : String = binding.tvRat.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBird.setOnClickListener {
            val english : String = binding.bird.text.toString()
            val translate : String = binding.tvBird.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHyena.setOnClickListener {
            val english : String = binding.hyena.text.toString()
            val translate : String = binding.tvHyena.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSnake.setOnClickListener {
            val english : String = binding.snake.text.toString()
            val translate : String = binding.tvSnake.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivMonkey.setOnClickListener {
            val english : String = binding.monkey.text.toString()
            val translate : String = binding.tvMonkey.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHippopotamus.setOnClickListener {
            val english : String = binding.hippopotamus.text.toString()
            val translate : String = binding.tvHippopotamus.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCrocodile.setOnClickListener {
            val english : String = binding.crocodile.text.toString()
            val translate : String = binding.tvCrocodile.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBorsuk.setOnClickListener {
            val english : String = binding.borsuk.text.toString()
            val translate : String = binding.tvBorsuk.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSquirrel.setOnClickListener {
            val english : String = binding.squirrel.text.toString()
            val translate : String = binding.tvSquirrel.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGiraffe.setOnClickListener {
            val english : String = binding.giraffe.text.toString()
            val translate : String = binding.tvGiraffe.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivKangaroo.setOnClickListener {
            val english : String = binding.kangaroo.text.toString()
            val translate : String = binding.tvKangaroo.text.toString()
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