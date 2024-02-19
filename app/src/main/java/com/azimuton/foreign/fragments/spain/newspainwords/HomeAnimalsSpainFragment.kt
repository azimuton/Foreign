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
import com.azimuton.foreign.databinding.FragmentFruitsSpainBinding
import com.azimuton.foreign.databinding.FragmentHomeAnimalsSpainBinding
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
class HomeAnimalsSpainFragment : Fragment() {
    private lateinit var binding : FragmentHomeAnimalsSpainBinding
    private val viewModel: NewSpainWordsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeAnimalsSpainBinding.inflate(inflater, container, false)
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

        binding.ivCatSpain.setOnClickListener {
            val spain : String = binding.catSpain.text.toString()
            val translate : String = binding.tvCatSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDogSpain.setOnClickListener {
            val spain : String = binding.dogSpain.text.toString()
            val translate : String = binding.tvDogSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivMouseSpain.setOnClickListener {
            val spain : String = binding.mouseSpain.text.toString()
            val translate : String = binding.tvMouseSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivParrotSpain.setOnClickListener {
            val spain : String = binding.parrotSpain.text.toString()
            val translate : String = binding.tvParrotSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCowSpain.setOnClickListener {
            val spain : String = binding.cowSpain.text.toString()
            val translate : String = binding.tvCowSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGoatSpain.setOnClickListener {
            val spain : String = binding.goatSpain.text.toString()
            val translate : String = binding.tvGoatSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivChikSpain.setOnClickListener {
            val spain : String = binding.chikSpain.text.toString()
            val translate : String = binding.tvChikSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDuckSpain.setOnClickListener {
            val spain : String = binding.duckSpain.text.toString()
            val translate : String = binding.tvDuckSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGooseSpain.setOnClickListener {
            val spain : String =binding.gooseSpain.text.toString()
            val translate : String = binding.tvGooseSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPigSpain.setOnClickListener {
            val spain : String = binding.pigSpain.text.toString()
            val translate : String = binding.tvPigSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTurkeySpain.setOnClickListener {
            val spain : String = binding.turkeySpain.text.toString()
            val translate : String = binding.tvTurkeySpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSheepSpain.setOnClickListener {
            val spain : String = binding.sheepSpain.text.toString()
            val translate : String = binding.tvSheepSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHorseSpain.setOnClickListener {
            val spain : String = binding.horseSpain.text.toString()
            val translate : String = binding.tvHorseSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRabbitSpain.setOnClickListener {
            val spain: String = binding.rabbitSpain.text.toString()
            val translate : String = binding.tvRabbitSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivQuailSpain.setOnClickListener {
            val spain : String = binding.quailSpain.text.toString()
            val translate : String = binding.tvQuailSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDonkeySpain.setOnClickListener {
            val spain : String = binding.donkeySpain.text.toString()
            val translate : String = binding.tvDonkeySpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHamsterSpain.setOnClickListener {
            val spain : String = binding.hamsterSpain.text.toString()
            val translate : String = binding.tvHamsterSpain.text.toString()
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