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
import com.azimuton.foreign.databinding.FragmentBuildingBinding
import com.azimuton.foreign.viewmodels.english.NewWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class BuildingFragment : Fragment() {
    private lateinit var binding : FragmentBuildingBinding
    private val viewModel: NewWordsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.Main + Job())
    private var cor : Job? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBuildingBinding.inflate(inflater, container, false)
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

        binding.ivBuilding.setOnClickListener {
            val english : String = binding.building.text.toString()
            val translate : String = binding.tvBuilding.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
           toast()
        }
        binding.ivWindow.setOnClickListener {
            val english : String = binding.windows.text.toString()
            val translate : String = binding.tvWindow.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDoor.setOnClickListener {
            val english : String = binding.door.text.toString()
            val translate : String = binding.tvDoor.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFloor.setOnClickListener {
            val english : String = binding.floor.text.toString()
            val translate : String = binding.tvFloor.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCeiling.setOnClickListener {
            val english : String = binding.ceiling.text.toString()
            val translate : String = binding.tvCeiling.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWall.setOnClickListener {
            val english : String = binding.wall.text.toString()
            val translate : String = binding.tvWall.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFloors.setOnClickListener {
            val english : String = binding.floors.text.toString()
            val translate : String = binding.tvFloors.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRoof.setOnClickListener {
            val english : String = binding.roof.text.toString()
            val translate : String = binding.tvRoof.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBasement.setOnClickListener {
            val english : String = binding.basement.text.toString()
            val translate : String = binding.tvBasement.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivStairs.setOnClickListener {
            val english : String = binding.stairs.text.toString()
            val translate : String = binding.tvStairs.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivElevator.setOnClickListener {
            val english : String = binding.elevator.text.toString()
            val translate : String = binding.tvElevator.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBalcony.setOnClickListener {
            val english : String = binding.balcony.text.toString()
            val translate : String = binding.tvBalcony.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLoggia.setOnClickListener {
            val english : String = binding.loggia.text.toString()
            val translate : String = binding.tvLoggia.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivEntrance.setOnClickListener {
            val english : String = binding.entrance.text.toString()
            val translate : String = binding.tvEntrance.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivVeranda.setOnClickListener {
            val english : String = binding.veranda.text.toString()
            val translate : String = binding.tvVeranda.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPorch.setOnClickListener {
            val english : String = binding.porch.text.toString()
            val translate : String = binding.tvPorch.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSteps.setOnClickListener {
            val english : String = binding.steps.text.toString()
            val translate : String = binding.tvSteps.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRailing.setOnClickListener {
            val english : String = binding.railing.text.toString()
            val translate : String = binding.tvRailing.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCorridor.setOnClickListener {
            val english : String = binding.corridor.text.toString()
            val translate : String = binding.tvCorridor.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLanding.setOnClickListener {
            val english : String = binding.landing.text.toString()
            val translate : String = binding.tvLanding.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivApartment.setOnClickListener {
            val english : String = binding.apartment.text.toString()
            val translate : String = binding.tvApartment.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
    }
        private fun toast(){
        val toast = Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT)
        toast.show()
         cor = coroutineScope.launch(Dispatchers.Main) {
            delay(350)
            toast.cancel()
            cor?.cancel()
        }
    }
}