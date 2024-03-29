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
import com.azimuton.foreign.databinding.FragmentVegetablesBinding
import com.azimuton.foreign.viewmodels.english.NewWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class VegetablesFragment : Fragment() {
    private lateinit var binding : FragmentVegetablesBinding
    private val viewModel: NewWordsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentVegetablesBinding.inflate(inflater, container, false)
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

        binding.ivTomato.setOnClickListener {
            val english : String = binding.tomato.text.toString()
            val translate : String = binding.tvTomato.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCucumber.setOnClickListener {
            val english : String = binding.cucumber.text.toString()
            val translate : String = binding.tvCucumber.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCabbage.setOnClickListener {
            val english : String = binding.cabbage.text.toString()
            val translate : String = binding.tvCabbage.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivVegetablemarrow.setOnClickListener {
            val english : String = binding.vegetablemarrow.text.toString()
            val translate : String = binding.tvVegetablemarrow.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivEggplant.setOnClickListener {
            val english : String = binding.eggplant.text.toString()
            val translate : String = binding.tvEggplant.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCarrot.setOnClickListener {
            val english : String = binding.carrot.text.toString()
            val translate : String = binding.tvCarrot.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBeet.setOnClickListener {
            val english : String = binding.beet.text.toString()
            val translate : String = binding.tvBeet.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPotato.setOnClickListener {
            val english : String = binding.potato.text.toString()
            val translate : String = binding.tvPotato.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRadish.setOnClickListener {
            val english : String = binding.radish.text.toString()
            val translate : String = binding.tvRadish.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPepper.setOnClickListener {
            val english : String = binding.pepper.text.toString()
            val translate : String = binding.tvPepper.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivOnion.setOnClickListener {
            val english : String = binding.onion.text.toString()
            val translate : String = binding.tvOnion.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGarlic.setOnClickListener {
            val english : String = binding.garlic.text.toString()
            val translate : String = binding.tvGarlic.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPeas.setOnClickListener {
            val english : String = binding.peas.text.toString()
            val translate : String = binding.tvPeas.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTurnip.setOnClickListener {
            val english : String = binding.turnip.text.toString()
            val translate : String = binding.tvTurnip.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGinger.setOnClickListener {
            val english : String = binding.ginger.text.toString()
            val translate : String = binding.tvGinger.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivJerusalemartichok.setOnClickListener {
            val english : String = binding.jerusalemartichoke.text.toString()
            val translate : String = binding.tvJerusalemartichok.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBeans.setOnClickListener {
            val english : String = binding.beans.text.toString()
            val translate : String = binding.tvBeans.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivAsparagus.setOnClickListener {
            val english : String = binding.asparagus.text.toString()
            val translate : String = binding.tvAsparagus.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHorseradish.setOnClickListener {
            val english : String = binding.horseradish.text.toString()
            val translate : String = binding.tvHorseradish.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivParsnip.setOnClickListener {
            val english : String = binding.parsnip.text.toString()
            val translate : String = binding.tvParsnip.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSquash.setOnClickListener {
            val english : String = binding.squash.text.toString()
            val translate : String = binding.tvSquash.text.toString()
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