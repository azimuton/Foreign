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
import com.azimuton.foreign.databinding.FragmentPartsOfBodySpainBinding
import com.azimuton.foreign.databinding.FragmentSeaSpainBinding
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
class SeaSpainFragment : Fragment() {
    private lateinit var binding : FragmentSeaSpainBinding
    private val viewModel: NewSpainWordsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSeaSpainBinding.inflate(inflater, container, false)
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

        binding.ivOceanSpain.setOnClickListener {
            val spain : String = binding.oceanSpain.text.toString()
            val translate : String = binding.tvOceanSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSeaSpain.setOnClickListener {
            val spain : String = binding.seaSpain.text.toString()
            val translate : String = binding.tvSeaSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRiverSpain.setOnClickListener {
            val spain : String = binding.riverSpain.text.toString()
            val translate : String = binding.tvRiverSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLakeSpain.setOnClickListener {
            val spain : String = binding.lakeSpain.text.toString()
            val translate : String = binding.tvLakeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivIcebergSpain.setOnClickListener {
            val spain : String = binding.icebergSpain.text.toString()
            val translate : String = binding.tvIcebergSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCapeSpain.setOnClickListener {
            val spain : String = binding.capeSpain.text.toString()
            val translate : String = binding.tvCapeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFjordSpain.setOnClickListener {
            val spain : String = binding.fjordSpain.text.toString()
            val translate : String = binding.tvFjordSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBaySpain.setOnClickListener {
            val spain : String = binding.baySpain.text.toString()
            val translate : String = binding.tvBaySpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBasinSpain.setOnClickListener {
            val spain : String = binding.basinSpain.text.toString()
            val translate : String = binding.tvBasinSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWaterfallSpain.setOnClickListener {
            val spain : String = binding.waterfallSpain.text.toString()
            val translate : String = binding.tvWaterfallSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivStraitSpain.setOnClickListener {
            val spain : String = binding.straitSpain.text.toString()
            val translate : String = binding.tvStraitSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivChannelSpain.setOnClickListener {
            val spain : String = binding.channelSpain.text.toString()
            val translate : String = binding.tvChannelSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSwampSpain.setOnClickListener {
            val spain : String = binding.swampSpain.text.toString()
            val translate : String = binding.tvSwampSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBeachSpain.setOnClickListener {
            val spain : String = binding.beachSpain.text.toString()
            val translate : String = binding.tvBeachSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPeninsulaSpain.setOnClickListener {
            val spain : String = binding.peninsulaSpain.text.toString()
            val translate : String = binding.tvPeninsulaSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivIslandSpain.setOnClickListener {
            val spain : String = binding.islandSpain.text.toString()
            val translate : String = binding.tvIslandSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivArchipelagoSpain.setOnClickListener {
            val spain : String = binding.archipelagoSpain.text.toString()
            val translate : String = binding.tvArchipelagoSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCoastSpain.setOnClickListener {
            val spain : String = binding.coastSpain.text.toString()
            val translate : String = binding.tvCoastSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGulfSpain.setOnClickListener {
            val spain : String = binding.gulfSpain.text.toString()
            val translate : String = binding.tvGulfSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDeltaSpain.setOnClickListener {
            val spain : String = binding.deltaSpain.text.toString()
            val translate : String = binding.tvDeltaSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivOasisSpain.setOnClickListener {
            val spain : String = binding.oasisSpain.text.toString()
            val translate : String = binding.tvOasisSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGeyserSpain.setOnClickListener {
            val spain : String = binding.geyserSpain.text.toString()
            val translate : String = binding.tvGeyserSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGlacierSpain.setOnClickListener {
            val spain : String = binding.glacierSpain.text.toString()
            val translate : String = binding.tvGlacierSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFlowSpain.setOnClickListener {
            val spain : String = binding.flowSpain.text.toString()
            val translate : String = binding.tvFlowSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDepthSpain.setOnClickListener {
            val spain : String = binding.depthSpain.text.toString()
            val translate : String = binding.tvDepthSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWaveSpain.setOnClickListener {
            val spain : String = binding.waveSpain.text.toString()
            val translate : String = binding.tvWaveSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSurfSpain.setOnClickListener {
            val spain : String = binding.surfSpain.text.toString()
            val translate : String = binding.tvSurfSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivStreamSpain.setOnClickListener {
            val spain : String = binding.streamSpain.text.toString()
            val translate : String = binding.tvStreamSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSpringSpain.setOnClickListener {
            val spain : String = binding.springSpain.text.toString()
            val translate : String = binding.tvSpringSpain.text.toString()
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