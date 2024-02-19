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
import com.azimuton.foreign.databinding.FragmentToolsBinding
import com.azimuton.foreign.viewmodels.english.NewWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class ToolsFragment : Fragment() {
    private lateinit var binding : FragmentToolsBinding
    private val viewModel: NewWordsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentToolsBinding.inflate(inflater, container, false)
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

        binding.ivHammer.setOnClickListener {
            val english : String = binding.hammer.text.toString()
            val translate : String = binding.tvHammer.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivScrewdrivers.setOnClickListener {
            val english : String = binding.screwdrivers.text.toString()
            val translate : String = binding.tvScrewdrivers.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPliers.setOnClickListener {
            val english : String = binding.pliers.text.toString()
            val translate : String = binding.tvPliers.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWrenchs.setOnClickListener {
            val english : String = binding.wrenchs.text.toString()
            val translate : String = binding.tvWrenchs.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivAxe.setOnClickListener {
            val english : String = binding.axe.text.toString()
            val translate : String = binding.tvAxe.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSaw.setOnClickListener {
            val english : String = binding.saw.text.toString()
            val translate : String = binding.tvSaw.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivNail.setOnClickListener {
            val english : String = binding.nail.text.toString()
            val translate : String = binding.tvNail.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSelftappingscrew.setOnClickListener {
            val english : String = binding.selftappingscrew.text.toString()
            val translate : String = binding.tvSelftappingscrew.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSandpaper.setOnClickListener {
            val english : String = binding.sandpaper.text.toString()
            val translate : String = binding.tvSandpaper.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDrill.setOnClickListener {
            val english : String = binding.drill.text.toString()
            val translate : String = binding.tvDrill.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivScrewdriver.setOnClickListener {
            val english : String = binding.screwdriver.text.toString()
            val translate : String = binding.tvScrewdriver.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLevel.setOnClickListener {
            val english : String = binding.level.text.toString()
            val translate : String = binding.tvLevel.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivVise.setOnClickListener {
            val english : String = binding.vise.text.toString()
            val translate : String = binding.tvVise.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRouter.setOnClickListener {
            val english : String = binding.router.text.toString()
            val translate : String = binding.tvRouter.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGlue.setOnClickListener {
            val english : String = binding.glue.text.toString()
            val translate : String = binding.tvGlue.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBolt.setOnClickListener {
            val english : String = binding.bolt.text.toString()
            val translate : String = binding.tvBolt.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivScrews.setOnClickListener {
            val english : String = binding.screws.text.toString()
            val translate : String = binding.tvScrews.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWrench.setOnClickListener {
            val english : String = binding.wrench.text.toString()
            val translate : String = binding.tvWrench.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHacksaw.setOnClickListener {
            val english : String = binding.hacksaw.text.toString()
            val translate : String = binding.tvHacksaw.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivJigsaw.setOnClickListener {
            val english : String = binding.jigsaw.text.toString()
            val translate : String = binding.tvJigsaw.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivScrew.setOnClickListener {
            val english : String = binding.screw.text.toString()
            val translate : String = binding.tvScrew.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWire.setOnClickListener {
            val english : String = binding.wire.text.toString()
            val translate : String = binding.tvWire.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivChisel.setOnClickListener {
            val english : String = binding.chisel.text.toString()
            val translate : String = binding.tvChisel.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTicks.setOnClickListener {
            val english : String = binding.ticks.text.toString()
            val translate : String = binding.tvTicks.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWasher.setOnClickListener {
            val english : String = binding.washer.text.toString()
            val translate : String = binding.tvWasher.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivClamp.setOnClickListener {
            val english : String = binding.clamp.text.toString()
            val translate : String = binding.tvClamp.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRoulette.setOnClickListener {
            val english : String = binding.roulette.text.toString()
            val translate : String = binding.tvRoulette.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCalipers.setOnClickListener {
            val english : String = binding.calipers.text.toString()
            val translate : String = binding.tvCalipers.text.toString()
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