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
import com.azimuton.foreign.databinding.FragmentSeaBinding
import com.azimuton.foreign.viewmodels.english.NewWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SeaFragment : Fragment() {
    private lateinit var binding : FragmentSeaBinding
    private val viewModel: NewWordsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSeaBinding.inflate(inflater, container, false)
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

        binding.ivOcean.setOnClickListener {
            val english : String = binding.ocean.text.toString()
            val translate : String = binding.tvOcean.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSea.setOnClickListener {
            val english : String = binding.sea.text.toString()
            val translate : String = binding.tvSea.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRiver.setOnClickListener {
            val english : String = binding.river.text.toString()
            val translate : String = binding.tvRiver.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLake.setOnClickListener {
            val english : String = binding.lake.text.toString()
            val translate : String = binding.tvLake.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivIceberg.setOnClickListener {
            val english : String = binding.iceberg.text.toString()
            val translate : String = binding.tvIceberg.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCape.setOnClickListener {
            val english : String = binding.cape.text.toString()
            val translate : String = binding.tvCape.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFjord.setOnClickListener {
            val english : String = binding.fjord.text.toString()
            val translate : String = binding.tvFjord.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBay.setOnClickListener {
            val english : String = binding.bay.text.toString()
            val translate : String = binding.tvBay.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBasin.setOnClickListener {
            val english : String = binding.basin.text.toString()
            val translate : String = binding.tvBasin.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWaterfall.setOnClickListener {
            val english : String = binding.waterfall.text.toString()
            val translate : String = binding.tvWaterfall.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivStrait.setOnClickListener {
            val english : String = binding.strait.text.toString()
            val translate : String = binding.tvStrait.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivChannel.setOnClickListener {
            val english : String = binding.channel.text.toString()
            val translate : String = binding.tvChannel.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSwamp.setOnClickListener {
            val english : String = binding.swamp.text.toString()
            val translate : String = binding.tvSwamp.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBeach.setOnClickListener {
            val english : String = binding.beach.text.toString()
            val translate : String = binding.tvBeach.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPeninsula.setOnClickListener {
            val english : String = binding.peninsula.text.toString()
            val translate : String = binding.tvPeninsula.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivIsland.setOnClickListener {
            val english : String = binding.island.text.toString()
            val translate : String = binding.tvIsland.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivArchipelago.setOnClickListener {
            val english : String = binding.archipelago.text.toString()
            val translate : String = binding.tvArchipelago.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCoast.setOnClickListener {
            val english : String = binding.coast.text.toString()
            val translate : String = binding.tvCoast.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGulf.setOnClickListener {
            val english : String = binding.gulf.text.toString()
            val translate : String = binding.tvGulf.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDelta.setOnClickListener {
            val english : String = binding.delta.text.toString()
            val translate : String = binding.tvDelta.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivOasis.setOnClickListener {
            val english : String = binding.oasis.text.toString()
            val translate : String = binding.tvOasis.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGeyser.setOnClickListener {
            val english : String = binding.geyser.text.toString()
            val translate : String = binding.tvGeyser.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGlacier.setOnClickListener {
            val english : String = binding.glacier.text.toString()
            val translate : String = binding.tvGlacier.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFlow.setOnClickListener {
            val english : String = binding.flow.text.toString()
            val translate : String = binding.tvFlow.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDepth.setOnClickListener {
            val english : String = binding.depth.text.toString()
            val translate : String = binding.tvDepth.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWave.setOnClickListener {
            val english : String = binding.wave.text.toString()
            val translate : String = binding.tvWave.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSurf.setOnClickListener {
            val english : String = binding.surf.text.toString()
            val translate : String = binding.tvSurf.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivStream.setOnClickListener {
            val english : String = binding.stream.text.toString()
            val translate : String = binding.tvStream.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSpring.setOnClickListener {
            val english : String = binding.spring.text.toString()
            val translate : String = binding.tvSpring.text.toString()
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