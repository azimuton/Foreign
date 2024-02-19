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
import com.azimuton.foreign.databinding.FragmentNatureBinding
import com.azimuton.foreign.viewmodels.english.NewWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class NatureFragment : Fragment() {
    private lateinit var binding : FragmentNatureBinding
    private val viewModel: NewWordsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNatureBinding.inflate(inflater, container, false)
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

        binding.ivF2.setOnClickListener {
            val english : String = binding.tvE1.text.toString()
            val translate : String = binding.tvT2.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLand.setOnClickListener {
            val english : String = binding.land.text.toString()
            val translate : String = binding.tvLand.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivMountain.setOnClickListener {
            val english : String = binding.mountain.text.toString()
            val translate : String = binding.tvMountain.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTree.setOnClickListener {
            val english : String = binding.tree.text.toString()
            val translate : String = binding.tvTree.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGrass.setOnClickListener {
            val english : String = binding.grass.text.toString()
            val translate : String = binding.tvGrass.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBush.setOnClickListener {
            val english : String = binding.bush.text.toString()
            val translate : String = binding.tvBush.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLandscapes.setOnClickListener {
            val english : String = binding.landscapes.text.toString()
            val translate : String = binding.tvLandscapes.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPlain.setOnClickListener {
            val english : String = binding.plain.text.toString()
            val translate : String = binding.tvPlain.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivForest.setOnClickListener {
            val english : String = binding.forest.text.toString()
            val translate : String = binding.tvForest.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDesert.setOnClickListener {
            val english : String = binding.desert.text.toString()
            val translate : String = binding.tvDesert.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivField.setOnClickListener {
            val english : String = binding.field.text.toString()
            val translate : String = binding.tvField.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGlade.setOnClickListener {
            val english : String = binding.glade.text.toString()
            val translate : String = binding.tvGlade.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBranch.setOnClickListener {
            val english : String = binding.branch.text.toString()
            val translate : String = binding.tvBranch.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivElevation.setOnClickListener {
            val english : String = binding.elevation.text.toString()
            val translate : String = binding.tvElevation.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLowland.setOnClickListener {
            val english : String = binding.lowland.text.toString()
            val translate : String = binding.tvLowland.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCliff.setOnClickListener {
            val english : String = binding.cliff.text.toString()
            val translate : String = binding.tvCliff.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCareer.setOnClickListener {
            val english : String = binding.career.text.toString()
            val translate : String = binding.tvCareer.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLandscape.setOnClickListener {
            val english : String = binding.landscape.text.toString()
            val translate : String = binding.tvLandscape.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivValley.setOnClickListener {
            val english : String = binding.valley.text.toString()
            val translate : String = binding.tvValley.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSand.setOnClickListener {
            val english : String = binding.sand.text.toString()
            val translate : String = binding.tvSand.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRock.setOnClickListener {
            val english : String = binding.rock.text.toString()
            val translate : String = binding.tvRock.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSheet.setOnClickListener {
            val english : String = binding.sheet.text.toString()
            val translate : String = binding.tvSheet.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHill.setOnClickListener {
            val english : String = binding.hill.text.toString()
            val translate : String = binding.tvHill.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSoil.setOnClickListener {
            val english : String = binding.soil.text.toString()
            val translate : String = binding.tvSoil.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPrairie.setOnClickListener {
            val english : String = binding.prairie.text.toString()
            val translate : String = binding.tvPrairie.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRainforest.setOnClickListener {
            val english : String = binding.rainforest.text.toString()
            val translate : String = binding.tvRainforest.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivJungle.setOnClickListener {
            val english : String = binding.jungle.text.toString()
            val translate : String = binding.tvJungle.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivMesa.setOnClickListener {
            val english : String = binding.mesa.text.toString()
            val translate : String = binding.tvMesa.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPlateau.setOnClickListener {
            val english : String = binding.plateau.text.toString()
            val translate : String = binding.tvPlateau.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDune.setOnClickListener {
            val english : String = binding.dune.text.toString()
            val translate : String = binding.tvDune.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCanyon.setOnClickListener {
            val english : String = binding.canyon.text.toString()
            val translate : String = binding.tvCanyon.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCave.setOnClickListener {
            val english : String = binding.cave.text.toString()
            val translate : String = binding.tvCave.text.toString()
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