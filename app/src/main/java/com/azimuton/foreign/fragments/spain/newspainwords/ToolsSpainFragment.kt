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
import com.azimuton.foreign.databinding.FragmentSeaSpainBinding
import com.azimuton.foreign.databinding.FragmentToolsSpainBinding
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
class ToolsSpainFragment : Fragment() {
    private lateinit var binding : FragmentToolsSpainBinding
    private val viewModel: NewSpainWordsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentToolsSpainBinding.inflate(inflater, container, false)
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

        binding.ivHammerSpain.setOnClickListener {
            val spain : String = binding.hammerSpain.text.toString()
            val translate : String = binding.tvHammerSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivScrewdriversSpain.setOnClickListener {
            val spain : String = binding.screwdriversSpain.text.toString()
            val translate : String = binding.tvScrewdriversSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPliersSpain.setOnClickListener {
            val spain : String = binding.pliersSpain.text.toString()
            val translate : String = binding.tvPliersSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWrenchsSpain.setOnClickListener {
            val spain : String = binding.wrenchsSpain.text.toString()
            val translate : String = binding.tvWrenchsSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivAxeSpain.setOnClickListener {
            val spain : String = binding.axeSpain.text.toString()
            val translate : String = binding.tvAxeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSawSpain.setOnClickListener {
            val spain : String = binding.sawSpain.text.toString()
            val translate : String = binding.tvSawSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivNailSpain.setOnClickListener {
            val spain : String = binding.nailSpain.text.toString()
            val translate : String = binding.tvNailSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSelftappingscrewSpain.setOnClickListener {
            val spain : String = binding.selftappingscrewSpain.text.toString()
            val translate : String = binding.tvSelftappingscrewSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSandpaperSpain.setOnClickListener {
            val spain : String = binding.sandpaperSpain.text.toString()
            val translate : String = binding.tvSandpaperSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDrillSpain.setOnClickListener {
            val spain : String = binding.drillSpain.text.toString()
            val translate : String = binding.tvDrillSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivScrewdriverSpain.setOnClickListener {
            val spain : String = binding.screwdriverSpain.text.toString()
            val translate : String = binding.tvScrewdriverSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLevelSpain.setOnClickListener {
            val spain : String = binding.levelSpain.text.toString()
            val translate : String = binding.tvLevelSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivViseSpain.setOnClickListener {
            val spain : String = binding.viseSpain.text.toString()
            val translate : String = binding.tvViseSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRouterSpain.setOnClickListener {
            val spain : String = binding.routerSpain.text.toString()
            val translate : String = binding.tvRouterSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGlueSpain.setOnClickListener {
            val spain : String = binding.glueSpain.text.toString()
            val translate : String = binding.tvGlueSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBoltSpain.setOnClickListener {
            val spain : String = binding.boltSpain.text.toString()
            val translate : String = binding.tvBoltSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivScrewsSpain.setOnClickListener {
            val spain : String = binding.screwsSpain.text.toString()
            val translate : String = binding.tvScrewsSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWrenchSpain.setOnClickListener {
            val spain : String = binding.wrenchSpain.text.toString()
            val translate : String = binding.tvWrenchSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHacksawSpain.setOnClickListener {
            val spain : String = binding.hacksawSpain.text.toString()
            val translate : String = binding.tvHacksawSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivJigsawSpain.setOnClickListener {
            val spain : String = binding.jigsawSpain.text.toString()
            val translate : String = binding.tvJigsawSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivScrewSpain.setOnClickListener {
            val spain : String = binding.screwSpain.text.toString()
            val translate : String = binding.tvScrewSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWireSpain.setOnClickListener {
            val spain : String = binding.wireSpain.text.toString()
            val translate : String = binding.tvWireSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivChiselSpain.setOnClickListener {
            val spain : String = binding.chiselSpain.text.toString()
            val translate : String = binding.tvChiselSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTicksSpain.setOnClickListener {
            val spain : String = binding.ticksSpain.text.toString()
            val translate : String = binding.tvTicksSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWasherSpain.setOnClickListener {
            val spain : String = binding.washerSpain.text.toString()
            val translate : String = binding.tvWasherSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivClampSpain.setOnClickListener {
            val spain : String = binding.clampSpain.text.toString()
            val translate : String = binding.tvClampSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRouletteSpain.setOnClickListener {
            val spain : String = binding.rouletteSpain.text.toString()
            val translate : String = binding.tvRouletteSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCalipersSpain.setOnClickListener {
            val spain : String = binding.calipersSpain.text.toString()
            val translate : String = binding.tvCalipersSpain.text.toString()
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