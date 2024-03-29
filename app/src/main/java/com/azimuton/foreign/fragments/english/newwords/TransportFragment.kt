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
import com.azimuton.foreign.databinding.FragmentTransportBinding
import com.azimuton.foreign.viewmodels.english.NewWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class TransportFragment : Fragment() {
    private lateinit var binding : FragmentTransportBinding
    private val viewModel: NewWordsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTransportBinding.inflate(inflater, container, false)
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

        binding.ivBus.setOnClickListener {
            val english : String = binding.bus.text.toString()
            val translate : String = binding.tvBus.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivAutomobile.setOnClickListener {
            val english : String = binding.automobile.text.toString()
            val translate : String = binding.tvAutomobile.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTrolleybus.setOnClickListener {
            val english : String = binding.trolleybus.text.toString()
            val translate : String = binding.tvTrolleybus.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTram.setOnClickListener {
            val english : String = binding.tram.text.toString()
            val translate : String = binding.tvTram.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTruck.setOnClickListener {
            val english : String = binding.truck.text.toString()
            val translate : String = binding.tvTruck.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDumptruck.setOnClickListener {
            val english : String = binding.dumptruck.text.toString()
            val translate : String = binding.tvDumptruck.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTractor.setOnClickListener {
            val english : String = binding.tractor.text.toString()
            val translate : String = binding.tvTractor.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivMotorcycle.setOnClickListener {
            val english : String = binding.motorcycle.text.toString()
            val translate : String = binding.tvMotorcycle.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBike.setOnClickListener {
            val english : String = binding.bike.text.toString()
            val translate : String = binding.tvBike.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTaxi.setOnClickListener {
            val english : String = binding.taxi.text.toString()
            val translate : String = binding.tvTaxi.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivMinibus.setOnClickListener {
            val english : String = binding.minibus.text.toString()
            val translate : String = binding.tvMinibus.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTrain.setOnClickListener {
            val english : String = binding.train.text.toString()
            val translate : String = binding.tvTrain.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivElectrictrain.setOnClickListener {
            val english : String = binding.electrictrain.text.toString()
            val translate : String = binding.tvElectrictrain.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivAirplane.setOnClickListener {
            val english : String = binding.airplane.text.toString()
            val translate : String = binding.tvAirplane.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivConveyor.setOnClickListener {
            val english : String = binding.conveyor.text.toString()
            val translate : String = binding.tvConveyor.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHorsedrawn.setOnClickListener {
            val english : String = binding.horsedrawn.text.toString()
            val translate : String = binding.tvHorsedrawn.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivMetro.setOnClickListener {
            val english : String = binding.metro.text.toString()
            val translate : String = binding.tvMetro.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHelicopter.setOnClickListener {
            val english : String = binding.helicopter.text.toString()
            val translate : String = binding.tvHelicopter.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivShip.setOnClickListener {
            val english : String = binding.ship.text.toString()
            val translate : String = binding.tvShip.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivMope.setOnClickListener {
            val english : String = binding.mope.text.toString()
            val translate : String = binding.tvMope.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBoat.setOnClickListener {
            val english : String = binding.boat.text.toString()
            val translate : String = binding.tvBoat.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivYacht.setOnClickListener {
            val english : String = binding.yacht.text.toString()
            val translate : String = binding.tvYacht.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBarge.setOnClickListener {
            val english : String = binding.barge.text.toString()
            val translate : String = binding.tvBarge.text.toString()
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