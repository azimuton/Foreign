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
import com.azimuton.foreign.databinding.FragmentWeatherSpainBinding
import com.azimuton.foreign.databinding.FragmentWildAnimalsSpainBinding
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
class WildAnimalsSpainFragment : Fragment() {
    private lateinit var binding : FragmentWildAnimalsSpainBinding
    private val viewModel: NewSpainWordsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWildAnimalsSpainBinding.inflate(inflater, container, false)
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

        binding.ivWolfSpain.setOnClickListener {
            val spain : String = binding.wolfSpain.text.toString()
            val translate : String = binding.tvWolfSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFoxSpain.setOnClickListener {
            val spain : String = binding.foxSpain.text.toString()
            val translate : String = binding.tvFoxSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFrogSpain.setOnClickListener {
            val spain : String = binding.frogSpain.text.toString()
            val translate : String = binding.tvFrogSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDeerSpain.setOnClickListener {
            val spain : String = binding.deerSpain.text.toString()
            val translate : String = binding.tvDeerSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBearSpain.setOnClickListener {
            val spain : String = binding.bearSpain.text.toString()
            val translate : String = binding.tvBearSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLionSpain.setOnClickListener {
            val spain : String = binding.lionSpain.text.toString()
            val translate : String = binding.tvLionSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTigerSpain.setOnClickListener {
            val spain : String = binding.tigerSpain.text.toString()
            val translate : String = binding.tvTigerSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBoarSpain.setOnClickListener {
            val spain : String = binding.boarSpain.text.toString()
            val translate : String = binding.tvBoarSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSalmonSpain.setOnClickListener {
            val spain : String = binding.salmonSpain.text.toString()
            val translate : String = binding.tvSalmonSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBisonSpain.setOnClickListener {
            val spain : String = binding.bisonSpain.text.toString()
            val translate : String = binding.tvBisonSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivZebraSpain.setOnClickListener {
            val spain : String = binding.zebraSpain.text.toString()
            val translate : String = binding.tvZebraSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLynxSpain.setOnClickListener {
            val spain : String = binding.lynxSpain.text.toString()
            val translate : String = binding.tvLynxSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPumaSpain.setOnClickListener {
            val spain : String = binding.pumaSpain.text.toString()
            val translate : String = binding.tvPumaSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRhinocerosSpain.setOnClickListener {
            val spain : String = binding.rhinocerosSpain.text.toString()
            val translate : String = binding.tvRhinocerosSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivElephantSpain.setOnClickListener {
            val spain : String = binding.elephantSpain.text.toString()
            val translate : String = binding.tvElephantSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBeaverSpain.setOnClickListener {
            val spain : String = binding.beaverSpain.text.toString()
            val translate : String = binding.tvBeaverSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRatSpain.setOnClickListener {
            val spain : String = binding.ratSpain.text.toString()
            val translate : String = binding.tvRatSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBirdSpain.setOnClickListener {
            val spain : String = binding.birdSpain.text.toString()
            val translate : String = binding.tvBirdSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHyenaSpain.setOnClickListener {
            val spain : String = binding.hyenaSpain.text.toString()
            val translate : String = binding.tvHyenaSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSnakeSpain.setOnClickListener {
            val spain : String = binding.snakeSpain.text.toString()
            val translate : String = binding.tvSnakeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivMonkeySpain.setOnClickListener {
            val spain : String = binding.monkeySpain.text.toString()
            val translate : String = binding.tvMonkeySpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHippopotamusSpain.setOnClickListener {
            val spain : String = binding.hippopotamusSpain.text.toString()
            val translate : String = binding.tvHippopotamusSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCrocodileSpain.setOnClickListener {
            val spain : String = binding.crocodileSpain.text.toString()
            val translate : String = binding.tvCrocodileSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBorsukSpain.setOnClickListener {
            val spain : String = binding.borsukSpain.text.toString()
            val translate : String = binding.tvBorsukSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSquirrelSpain.setOnClickListener {
            val spain : String = binding.squirrelSpain.text.toString()
            val translate : String = binding.tvSquirrelSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGiraffeSpain.setOnClickListener {
            val spain : String = binding.giraffeSpain.text.toString()
            val translate : String = binding.tvGiraffeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivKangarooSpain.setOnClickListener {
            val spain : String = binding.kangarooSpain.text.toString()
            val translate : String = binding.tvKangarooSpain.text.toString()
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