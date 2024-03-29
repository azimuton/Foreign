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
import com.azimuton.foreign.databinding.FragmentCitySpainBinding
import com.azimuton.foreign.databinding.FragmentFamilySpainBinding
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
class FamilySpainFragment : Fragment() {
    private lateinit var binding : FragmentFamilySpainBinding
    private val viewModel: NewSpainWordsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFamilySpainBinding.inflate(inflater, container, false)
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

        binding.ivMotherSpain.setOnClickListener {
            val spain : String = binding.motherSpain.text.toString()
            val translate : String = binding.tvMotherSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFatherSpain.setOnClickListener {
            val spain : String = binding.fatherSpain.text.toString()
            val translate : String = binding.tvFatherSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSisterSpain.setOnClickListener {
            val spain : String = binding.sisterSpain.text.toString()
            val translate : String = binding.tvSisterSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBrotherSpain.setOnClickListener {
            val spain : String = binding.brotherSpain.text.toString()
            val translate : String = binding.tvBrotherSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWifeSpain.setOnClickListener {
            val spain : String = binding.wifeSpain.text.toString()
            val translate : String = binding.tvWifeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHusbandSpain.setOnClickListener {
            val spain : String = binding.husbandSpain.text.toString()
            val translate : String = binding.tvHusbandSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSonSpain.setOnClickListener {
            val spain : String = binding.sonSpain.text.toString()
            val translate : String = binding.tvSonSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDaughterSpain.setOnClickListener {
            val spain : String = binding.daughterSpain.text.toString()
            val translate : String = binding.tvDaughterSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGrandmotherSpain.setOnClickListener {
            val spain : String = binding.grandmotherSpain.text.toString()
            val translate : String = binding.tvGrandmotherSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGrandfatherSpain.setOnClickListener {
            val spain : String = binding.grandfatherSpain.text.toString()
            val translate : String = binding.tvGrandfatherSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFatherInLawSpain.setOnClickListener {
            val spain : String = binding.fatherinlawSpain.text.toString()
            val translate : String = binding.tvFatherInLawSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivMotherInLawSpain.setOnClickListener {
            val spain : String = binding.motherinlawSpain.text.toString()
            val translate : String = binding.tvMotherInLawSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBrotherInLawSpain.setOnClickListener {
            val spain : String = binding.brotherinlawSpain.text.toString()
            val translate : String = binding.tvBrotherInLawSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSisterInLawSpain.setOnClickListener {
            val spain : String = binding.sisterinlawSpain.text.toString()
            val translate : String = binding.tvSisterInLawSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivUncleSpain.setOnClickListener {
            val spain : String = binding.uncleSpain.text.toString()
            val translate : String = binding.tvUncleSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivAuntSpain.setOnClickListener {
            val spain : String = binding.auntSpain.text.toString()
            val translate : String = binding.tvAuntSpain.text.toString()
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