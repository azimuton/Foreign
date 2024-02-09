package com.azimuton.foreign.fragments.spain.newspainwords

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import com.azimuton.domain.models.english.Word
import com.azimuton.domain.models.spain.WordSpain
import com.azimuton.foreign.R
import com.azimuton.foreign.databinding.FragmentToolsSpainBinding
import com.azimuton.foreign.databinding.FragmentTransportSpainBinding
import com.azimuton.foreign.fragments.english.NewWordsFragment
import com.azimuton.foreign.fragments.spain.NewWordsSpainFragment
import com.azimuton.foreign.viewmodels.spain.NewSpainWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TransportSpainFragment : Fragment() {
    private lateinit var binding : FragmentTransportSpainBinding
    private val viewModel: NewSpainWordsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTransportSpainBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Glide.with(this)
            .asGif()
            .load(R.drawable.leftarrow)
            .into(binding.ivBackToNewWordsListSpain)
        binding.ivBackToNewWordsListSpain.setOnClickListener {
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                ?.replace(R.id.flMain, NewWordsSpainFragment())
                ?.commit()
        }

        binding.ivBusSpain.setOnClickListener {
            val spain : String = binding.busSpain.text.toString()
            val translate : String = binding.tvBusSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivAutomobileSpain.setOnClickListener {
            val spain : String = binding.automobileSpain.text.toString()
            val translate : String = binding.tvAutomobileSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivTrolleybusSpain.setOnClickListener {
            val spain : String = binding.trolleybusSpain.text.toString()
            val translate : String = binding.tvTrolleybusSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivTramSpain.setOnClickListener {
            val spain : String = binding.tramSpain.text.toString()
            val translate : String = binding.tvTramSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivTruckSpain.setOnClickListener {
            val spain : String = binding.truckSpain.text.toString()
            val translate : String = binding.tvTruckSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDumptruckSpain.setOnClickListener {
            val spain : String = binding.dumptruckSpain.text.toString()
            val translate : String = binding.tvDumptruckSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivTractorSpain.setOnClickListener {
            val spain : String = binding.tractorSpain.text.toString()
            val translate : String = binding.tvTractorSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivMotorcycleSpain.setOnClickListener {
            val spain : String = binding.motorcycleSpain.text.toString()
            val translate : String = binding.tvMotorcycleSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBikeSpain.setOnClickListener {
            val spain : String = binding.bikeSpain.text.toString()
            val translate : String = binding.tvBikeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivTaxiSpain.setOnClickListener {
            val spain : String = binding.taxiSpain.text.toString()
            val translate : String = binding.tvTaxiSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivMinibusSpain.setOnClickListener {
            val spain : String = binding.minibusSpain.text.toString()
            val translate : String = binding.tvMinibusSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivTrainSpain.setOnClickListener {
            val spain : String = binding.trainSpain.text.toString()
            val translate : String = binding.tvTrainSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivElectrictrainSpain.setOnClickListener {
            val spain : String = binding.electrictrainSpain.text.toString()
            val translate : String = binding.tvElectrictrainSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivAirplaneSpain.setOnClickListener {
            val spain : String = binding.airplaneSpain.text.toString()
            val translate : String = binding.tvAirplaneSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivConveyorSpain.setOnClickListener {
            val spain : String = binding.conveyorSpain.text.toString()
            val translate : String = binding.tvConveyorSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHorsedrawnSpain.setOnClickListener {
            val spain : String = binding.horsedrawnSpain.text.toString()
            val translate : String = binding.tvHorsedrawnSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivMetroSpain.setOnClickListener {
            val spain : String = binding.metroSpain.text.toString()
            val translate : String = binding.tvMetroSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHelicopterSpain.setOnClickListener {
            val spain : String = binding.helicopterSpain.text.toString()
            val translate : String = binding.tvHelicopterSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivShipSpain.setOnClickListener {
            val spain : String = binding.shipSpain.text.toString()
            val translate : String = binding.tvShipSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivMopeSpain.setOnClickListener {
            val spain : String = binding.mopeSpain.text.toString()
            val translate : String = binding.tvMopeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBoatSpain.setOnClickListener {
            val spain : String = binding.boatSpain.text.toString()
            val translate : String = binding.tvBoatSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivYachtSpain.setOnClickListener {
            val spain : String = binding.yachtSpain.text.toString()
            val translate : String = binding.tvYachtSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBargeSpain.setOnClickListener {
            val spain : String = binding.bargeSpain.text.toString()
            val translate : String = binding.tvBargeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
    }

}