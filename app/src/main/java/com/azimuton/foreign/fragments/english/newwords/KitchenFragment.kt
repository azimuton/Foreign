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
import com.azimuton.foreign.databinding.FragmentKitchenBinding
import com.azimuton.foreign.viewmodels.english.NewWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class KitchenFragment : Fragment() {
    private lateinit var binding : FragmentKitchenBinding
    private val viewModel: NewWordsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentKitchenBinding.inflate(inflater, container, false)
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


        binding.ivKitchen.setOnClickListener {
            val english : String = binding.kitchen.text.toString()
            val translate : String = binding.tvKitchen.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSpoon.setOnClickListener {
            val english : String = binding.spoon.text.toString()
            val translate : String = binding.tvSpoon.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFork.setOnClickListener {
            val english : String = binding.fork.text.toString()
            val translate : String = binding.tvFork.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivKnife.setOnClickListener {
            val english : String = binding.knife.text.toString()
            val translate : String = binding.tvKnife.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTable.setOnClickListener {
            val english : String = binding.table.text.toString()
            val translate : String = binding.tvTable.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivChair.setOnClickListener {
            val english : String = binding.chair.text.toString()
            val translate : String = binding.tvChair.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivKithenstove.setOnClickListener {
            val english : String = binding.kithenstove.text.toString()
            val translate : String = binding.tvKithenstove.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSink.setOnClickListener {
            val english : String = binding.sink.text.toString()
            val translate : String = binding.tvSink.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBreadbox.setOnClickListener {
            val english : String = binding.breadbox.text.toString()
            val translate : String = binding.tvBreadbox.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHodgepodge.setOnClickListener {
            val english : String = binding.hodgepodge.text.toString()
            val translate : String = binding.tvHodgepodge.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRefrigerator.setOnClickListener {
            val english : String = binding.refrigerator.text.toString()
            val translate : String = binding.tvRefrigerator.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPlate.setOnClickListener {
            val english : String = binding.plate.text.toString()
            val translate : String = binding.tvPlate.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCup.setOnClickListener {
            val english : String = binding.cup.text.toString()
            val translate : String = binding.tvCup.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSaucer.setOnClickListener {
            val english : String = binding.saucer.text.toString()
            val translate : String = binding.tvSaucer.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivKithencupboard.setOnClickListener {
            val english : String = binding.kithencupboard.text.toString()
            val translate : String = binding.tvKithencupboard.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFoodprocessor.setOnClickListener {
            val english : String = binding.foodprocessor.text.toString()
            val translate : String = binding.tvFoodprocessor.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBin.setOnClickListener {
            val english : String = binding.bin.text.toString()
            val translate : String = binding.tvBin.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHood.setOnClickListener {
            val english : String = binding.hood.text.toString()
            val translate : String = binding.tvHood.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivOven.setOnClickListener {
            val english : String = binding.oven.text.toString()
            val translate : String = binding.tvOven.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBurner.setOnClickListener {
            val english : String = binding.burner.text.toString()
            val translate : String = binding.tvBurner.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPan.setOnClickListener {
            val english : String = binding.pan.text.toString()
            val translate : String = binding.tvPan.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFryingpan.setOnClickListener {
            val english : String = binding.fryingpan.text.toString()
            val translate : String = binding.tvFryingpan.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCuttingboard.setOnClickListener {
            val english : String = binding.cuttingboard.text.toString()
            val translate : String = binding.tvCuttingboard.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBottleopener.setOnClickListener {
            val english : String = binding.bottleopener.text.toString()
            val translate : String = binding.tvBottleopener.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCorkscrew.setOnClickListener {
            val english : String = binding.corkscrew.text.toString()
            val translate : String = binding.tvCorkscrew.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGrater.setOnClickListener {
            val english : String = binding.grater.text.toString()
            val translate : String = binding.tvGrater.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivJuicer.setOnClickListener {
            val english : String = binding.juicer.text.toString()
            val translate : String = binding.tvJuicer.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBowl.setOnClickListener {
            val english : String = binding.bowl.text.toString()
            val translate : String = binding.tvBowl.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivJar.setOnClickListener {
            val english : String = binding.jar.text.toString()
            val translate : String = binding.tvJar.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivJug.setOnClickListener {
            val english : String = binding.jug.text.toString()
            val translate : String = binding.tvJug.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivShugarbowl.setOnClickListener {
            val english : String = binding.shugarbowl.text.toString()
            val translate : String = binding.tvShugarbowl.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTray.setOnClickListener {
            val english : String = binding.tray.text.toString()
            val translate : String = binding.tvTray.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
           viewModel.insert(word)
            toast()
        }
        binding.ivTableware.setOnClickListener {
            val english : String = binding.tableware.text.toString()
            val translate : String = binding.tvTableware.text.toString()
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