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
import com.azimuton.foreign.databinding.FragmentKitchenSpainBinding
import com.azimuton.foreign.databinding.FragmentNatureSpainBinding
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
class NatureSpainFragment : Fragment() {
    private lateinit var binding : FragmentNatureSpainBinding
    private val viewModel: NewSpainWordsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNatureSpainBinding.inflate(inflater, container, false)
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

        binding.ivF2Spain.setOnClickListener {
            val spain : String = binding.tvE1Spain.text.toString()
            val translate : String = binding.tvT2Spain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLandSpain.setOnClickListener {
            val spain : String = binding.landSpain.text.toString()
            val translate : String = binding.tvLandSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivMountainSpain.setOnClickListener {
            val spain : String = binding.mountainSpain.text.toString()
            val translate : String = binding.tvMountainSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTreeSpain.setOnClickListener {
            val spain : String = binding.treeSpain.text.toString()
            val translate : String = binding.tvTreeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGrassSpain.setOnClickListener {
            val spain : String = binding.grassSpain.text.toString()
            val translate : String = binding.tvGrassSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBushSpain.setOnClickListener {
            val spain : String = binding.bushSpain.text.toString()
            val translate : String = binding.tvBushSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLandscapesSpain.setOnClickListener {
            val spain : String = binding.landscapesSpain.text.toString()
            val translate : String = binding.tvLandscapesSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPlainSpain.setOnClickListener {
            val spain : String = binding.plainSpain.text.toString()
            val translate : String = binding.tvPlainSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivForestSpain.setOnClickListener {
            val spain : String = binding.forestSpain.text.toString()
            val translate : String = binding.tvForestSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDesertSpain.setOnClickListener {
            val spain : String = binding.desertSpain.text.toString()
            val translate : String = binding.tvDesertSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFieldSpain.setOnClickListener {
            val spain : String = binding.fieldSpain.text.toString()
            val translate : String = binding.tvFieldSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGladeSpain.setOnClickListener {
            val spain : String = binding.gladeSpain.text.toString()
            val translate : String = binding.tvGladeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBranchSpain.setOnClickListener {
            val spain : String = binding.branchSpain.text.toString()
            val translate : String = binding.tvBranchSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivElevationSpain.setOnClickListener {
            val spain : String = binding.elevationSpain.text.toString()
            val translate : String = binding.tvElevationSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLowlandSpain.setOnClickListener {
            val spain : String = binding.lowlandSpain.text.toString()
            val translate : String = binding.tvLowlandSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCliffSpain.setOnClickListener {
            val spain : String = binding.cliffSpain.text.toString()
            val translate : String = binding.tvCliffSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCareerSpain.setOnClickListener {
            val spain : String = binding.careerSpain.text.toString()
            val translate : String = binding.tvCareerSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLandscapeSpain.setOnClickListener {
            val spain : String = binding.landscapeSpain.text.toString()
            val translate : String = binding.tvLandscapeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivValleySpain.setOnClickListener {
            val spain : String = binding.valleySpain.text.toString()
            val translate : String = binding.tvValleySpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSandSpain.setOnClickListener {
            val spain : String = binding.sandSpain.text.toString()
            val translate : String = binding.tvSandSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRockSpain.setOnClickListener {
            val spain : String = binding.rockSpain.text.toString()
            val translate : String = binding.tvRockSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSheetSpain.setOnClickListener {
            val spain : String = binding.sheetSpain.text.toString()
            val translate : String = binding.tvSheetSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHillSpain.setOnClickListener {
            val spain : String = binding.hillSpain.text.toString()
            val translate : String = binding.tvHillSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSoilSpain.setOnClickListener {
            val spain : String = binding.soilSpain.text.toString()
            val translate : String = binding.tvSoilSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPrairieSpain.setOnClickListener {
            val spain : String = binding.prairieSpain.text.toString()
            val translate : String = binding.tvPrairieSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRainforestSpain.setOnClickListener {
            val spain : String = binding.rainforestSpain.text.toString()
            val translate : String = binding.tvRainforestSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivJungleSpain.setOnClickListener {
            val spain : String = binding.jungleSpain.text.toString()
            val translate : String = binding.tvJungleSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivMesaSpain.setOnClickListener {
            val spain : String = binding.mesaSpain.text.toString()
            val translate : String = binding.tvMesaSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPlateauSpain.setOnClickListener {
            val spain : String = binding.plateauSpain.text.toString()
            val translate : String = binding.tvPlateauSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDuneSpain.setOnClickListener {
            val spain : String = binding.duneSpain.text.toString()
            val translate : String = binding.tvDuneSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCanyonSpain.setOnClickListener {
            val spain : String = binding.canyonSpain.text.toString()
            val translate : String = binding.tvCanyonSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCaveSpain.setOnClickListener {
            val spain : String = binding.caveSpain.text.toString()
            val translate : String = binding.tvCaveSpain.text.toString()
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