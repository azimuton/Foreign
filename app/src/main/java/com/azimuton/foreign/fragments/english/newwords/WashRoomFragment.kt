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
import com.azimuton.foreign.databinding.FragmentWashRoomBinding
import com.azimuton.foreign.viewmodels.english.NewWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class WashRoomFragment : Fragment() {
    private lateinit var binding : FragmentWashRoomBinding
    private val viewModel: NewWordsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWashRoomBinding.inflate(inflater, container, false)
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

        binding.ivWashroom.setOnClickListener {
            val english : String = binding.washroom.text.toString()
            val translate : String = binding.tvWashroom.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBath.setOnClickListener {
            val english : String = binding.bath.text.toString()
            val translate : String = binding.tvBath.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivToilet.setOnClickListener {
            val english : String = binding.toilet.text.toString()
            val translate : String = binding.tvToilet.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFlushtank.setOnClickListener {
            val english : String = binding.flushtank.text.toString()
            val translate : String = binding.tvFlushtank.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivToiletseat.setOnClickListener {
            val english : String = binding.toiletseat.text.toString()
            val translate : String = binding.tvToiletseat.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivToiletpaper.setOnClickListener {
            val english : String = binding.toiletpaper.text.toString()
            val translate : String = binding.tvToiletpaper.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivShower.setOnClickListener {
            val english : String = binding.shower.text.toString()
            val translate : String = binding.tvShower.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivShowercabin.setOnClickListener {
            val english : String = binding.showercabin.text.toString()
            val translate : String = binding.tvShowercabin.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTowel.setOnClickListener {
            val english : String = binding.towel.text.toString()
            val translate : String = binding.tvTowel.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLaundrybasket.setOnClickListener {
            val english : String = binding.laundrybasket.text.toString()
            val translate : String = binding.tvLaundrybasket.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWashingmashine.setOnClickListener {
            val english : String = binding.washingmashine.text.toString()
            val translate : String = binding.tvWashingmashine.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDrainer.setOnClickListener {
            val english : String = binding.drainer.text.toString()
            val translate : String = binding.tvDrainer.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivToothbrush.setOnClickListener {
            val english : String = binding.toothbrush.text.toString()
            val translate : String = binding.tvToothbrush.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivToothpaste.setOnClickListener {
            val english : String = binding.toothpaste.text.toString()
            val translate : String = binding.tvToothpaste.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSoap.setOnClickListener {
            val english : String = binding.soap.text.toString()
            val translate : String = binding.tvSoap.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivShampoo.setOnClickListener {
            val english : String = binding.shampoo.text.toString()
            val translate : String = binding.tvShampoo.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSpongeforbody.setOnClickListener {
            val english : String = binding.spongeforbody.text.toString()
            val translate : String = binding.tvSpongeforbody.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWashbasin.setOnClickListener {
            val english : String = binding.washbasin.text.toString()
            val translate : String = binding.tvWashbasin.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWashbasincabinet.setOnClickListener {
            val english : String = binding.washbasincabinet.text.toString()
            val translate : String = binding.tvWashbasincabinet.text.toString()
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