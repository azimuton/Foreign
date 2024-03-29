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
import com.azimuton.foreign.databinding.FragmentBedRoomBinding
import com.azimuton.foreign.databinding.FragmentBedRoomSpainBinding
import com.azimuton.foreign.fragments.english.NewWordsFragment
import com.azimuton.foreign.fragments.spain.NewWordsSpainFragment
import com.azimuton.foreign.viewmodels.english.NewWordsViewModel
import com.azimuton.foreign.viewmodels.spain.NewSpainWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class BedRoomSpainFragment : Fragment() {
    private lateinit var binding : FragmentBedRoomSpainBinding
    private val viewModel: NewSpainWordsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBedRoomSpainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
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
        binding.ivBedroomSpain.setOnClickListener {
            val spain : String = binding.bedroomSpain.text.toString()
            val translate : String = binding.tvBedroomSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBedSpain.setOnClickListener {
            val spain : String = binding.bedSpain.text.toString()
            val translate : String = binding.tvBedSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivNightstandSpain.setOnClickListener {
            val spain : String = binding.nightstandSpain.text.toString()
            val translate : String = binding.tvNightstandSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivClosetSpain.setOnClickListener {
            val spain : String = binding.closetSpain.text.toString()
            val translate : String = binding.tvClosetSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSconceSpain.setOnClickListener {
            val spain : String = binding.sconceSpain.text.toString()
            val translate : String = binding.tvSconceSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCoverSpain.setOnClickListener {
            val spain : String = binding.coverSpain.text.toString()
            val translate : String = binding.tvCoverSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPillowSpain.setOnClickListener {
            val spain : String = binding.pillowSpain.text.toString()
            val translate : String = binding.tvPillowSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBlanketSpain.setOnClickListener {
            val spain : String = binding.blanketSpain.text.toString()
            val translate : String = binding.tvBlanketSpain.text.toString()
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
        binding.ivDuvetcoverSpain.setOnClickListener {
            val spain : String =binding. duvetcoverSpain.text.toString()
            val translate : String = binding.tvDuvetcoverSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPillowcaseSpain.setOnClickListener {
            val spain : String = binding.pillowcaseSpain.text.toString()
            val translate : String = binding.tvPillowcaseSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCurtainsSpain.setOnClickListener {
            val spain : String = binding.curtainsSpain.text.toString()
            val translate : String = binding.tvCurtainsSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTulleSpain.setOnClickListener {
            val spain : String = binding.tulleSpain.text.toString()
            val translate : String = binding.tvTulleSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCarpetSpain.setOnClickListener {
            val spain : String = binding.carpetSpain.text.toString()
            val translate : String = binding.tvCarpetSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSofaSpain.setOnClickListener {
            val spain : String = binding.sofaSpain.text.toString()
            val translate : String = binding.tvSofaSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLampSpain.setOnClickListener {
            val spain : String = binding.lampSpain.text.toString()
            val translate : String = binding.tvLampSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivMirrorSpain.setOnClickListener {
            val spain : String = binding.mirrorSpain.text.toString()
            val translate : String = binding.tvMirrorSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWardrobeSpain.setOnClickListener {
            val spain : String = binding.wardrobeSpain.text.toString()
            val translate : String = binding.tvWardrobeSpain.text.toString()
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