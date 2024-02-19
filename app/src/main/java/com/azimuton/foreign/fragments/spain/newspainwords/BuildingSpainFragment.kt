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
import com.azimuton.foreign.databinding.FragmentBerrySpainBinding
import com.azimuton.foreign.databinding.FragmentBuildingSpainBinding
import com.azimuton.foreign.fragments.english.NewWordsFragment
import com.azimuton.foreign.fragments.spain.NewWordsSpainFragment
import com.azimuton.foreign.viewmodels.spain.NewSpainWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class BuildingSpainFragment : Fragment() {
    private lateinit var binding : FragmentBuildingSpainBinding
    private val viewModel: NewSpainWordsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBuildingSpainBinding.inflate(inflater, container, false)
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

        binding.ivBuildingSpain.setOnClickListener {
            val spain : String = binding.buildingSpain.text.toString()
            val translate : String = binding.tvBuildingSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWindowSpain.setOnClickListener {
            val spain : String = binding.windowsSpain.text.toString()
            val translate : String = binding.tvWindowSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDoorSpain.setOnClickListener {
            val spain : String = binding.doorSpain.text.toString()
            val translate : String = binding.tvDoorSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFloorSpain.setOnClickListener {
            val spain : String = binding.floorSpain.text.toString()
            val translate : String = binding.tvFloorSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCeilingSpain.setOnClickListener {
            val spain : String = binding.ceilingSpain.text.toString()
            val translate : String = binding.tvCeilingSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWallSpain.setOnClickListener {
            val spain : String = binding.wallSpain.text.toString()
            val translate : String = binding.tvWallSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFloorsSpain.setOnClickListener {
            val spain : String = binding.floorsSpain.text.toString()
            val translate : String = binding.tvFloorsSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRoofSpain.setOnClickListener {
            val spain : String = binding.roofSpain.text.toString()
            val translate : String = binding.tvRoofSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBasementSpain.setOnClickListener {
            val spain : String = binding.basementSpain.text.toString()
            val translate : String = binding.tvBasementSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivStairsSpain.setOnClickListener {
            val spain : String = binding.stairsSpain.text.toString()
            val translate : String = binding.tvStairsSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivElevatorSpain.setOnClickListener {
            val spain : String = binding.elevatorSpain.text.toString()
            val translate : String = binding.tvElevatorSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBalconySpain.setOnClickListener {
            val spain : String = binding.balconySpain.text.toString()
            val translate : String = binding.tvBalconySpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLoggiaSpain.setOnClickListener {
            val spain : String = binding.loggiaSpain.text.toString()
            val translate : String = binding.tvLoggiaSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivEntranceSpain.setOnClickListener {
            val spain : String = binding.entranceSpain.text.toString()
            val translate : String = binding.tvEntranceSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivVerandaSpain.setOnClickListener {
            val spain : String = binding.verandaSpain.text.toString()
            val translate : String = binding.tvVerandaSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPorchSpain.setOnClickListener {
            val spain : String = binding.porchSpain.text.toString()
            val translate : String = binding.tvPorchSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivStepsSpain.setOnClickListener {
            val spain : String = binding.stepsSpain.text.toString()
            val translate : String = binding.tvStepsSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRailingSpain.setOnClickListener {
            val spain : String = binding.railingSpain.text.toString()
            val translate : String = binding.tvRailingSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCorridorSpain.setOnClickListener {
            val spain : String = binding.corridorSpain.text.toString()
            val translate : String = binding.tvCorridorSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLandingSpain.setOnClickListener {
            val spain : String = binding.landingSpain.text.toString()
            val translate : String = binding.tvLandingSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
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