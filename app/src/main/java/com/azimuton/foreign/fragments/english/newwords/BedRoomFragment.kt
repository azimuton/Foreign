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
import com.azimuton.foreign.databinding.FragmentBedRoomBinding
import com.azimuton.foreign.viewmodels.english.NewWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class BedRoomFragment : Fragment() {
    private lateinit var binding : FragmentBedRoomBinding
    private val viewModel: NewWordsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBedRoomBinding.inflate(inflater, container, false)
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
                ?.setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                ?.replace(R.id.flMain, NewWordsFragment())
                ?.commit()
        }
            binding.ivBedroom.setOnClickListener {
                val english: String = binding.bedroom.text.toString()
                val translate: String = binding.tvBedroom.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                toast()
            }
            binding.ivBed.setOnClickListener {
                val english: String = binding.bed.text.toString()
                val translate: String = binding.tvBed.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                toast()
            }
            binding.ivNightstand.setOnClickListener {
                val english: String = binding.nightstand.text.toString()
                val translate: String = binding.tvNightstand.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                toast()
            }
            binding.ivCloset.setOnClickListener {
                val english: String = binding.closet.text.toString()
                val translate: String = binding.tvCloset.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                toast()
            }
            binding.ivSconce.setOnClickListener {
                val english: String = binding.sconce.text.toString()
                val translate: String = binding.tvSconce.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                toast()
            }
            binding.ivCover.setOnClickListener {
                val english: String = binding.cover.text.toString()
                val translate: String = binding.tvCover.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                toast()
            }
            binding.ivPillow.setOnClickListener {
                val english: String = binding.pillow.text.toString()
                val translate: String = binding.tvPillow.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                toast()
            }
            binding.ivBlanket.setOnClickListener {
                val english: String = binding.blanket.text.toString()
                val translate: String = binding.tvBlanket.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                toast()
            }
            binding.ivSheet.setOnClickListener {
                val english: String = binding.sheet.text.toString()
                val translate: String = binding.tvSheet.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                toast()
            }
            binding.ivDuvetcover.setOnClickListener {
                val english: String = binding.duvetcover.text.toString()
                val translate: String = binding.tvDuvetcover.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                toast()
            }
            binding.ivPillowcase.setOnClickListener {
                val english: String = binding.pillowcase.text.toString()
                val translate: String = binding.tvPillowcase.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                toast()
            }
            binding.ivCurtains.setOnClickListener {
                val english: String = binding.curtains.text.toString()
                val translate: String = binding.tvCurtains.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                toast()
            }
            binding.ivTulle.setOnClickListener {
                val english: String = binding.tulle.text.toString()
                val translate: String = binding.tvTulle.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                toast()
            }
            binding.ivCarpet.setOnClickListener {
                val english: String = binding.carpet.text.toString()
                val translate: String = binding.tvCarpet.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                toast()
            }
            binding.ivSofa.setOnClickListener {
                val english: String = binding.sofa.text.toString()
                val translate: String = binding.tvSofa.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                toast()
            }
            binding.ivLamp.setOnClickListener {
                val english: String = binding.lamp.text.toString()
                val translate: String = binding.tvLamp.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                toast()
            }
            binding.ivMirror.setOnClickListener {
                val english: String = binding.mirror.text.toString()
                val translate: String = binding.tvMirror.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                toast()
            }
            binding.ivWardrobe.setOnClickListener {
                val english: String = binding.wardrobe.text.toString()
                val translate: String = binding.tvWardrobe.text.toString()
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