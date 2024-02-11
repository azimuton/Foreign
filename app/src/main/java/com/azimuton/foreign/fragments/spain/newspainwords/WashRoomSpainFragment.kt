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
import com.azimuton.foreign.databinding.FragmentVerbsContinuedSpainBinding
import com.azimuton.foreign.databinding.FragmentWashRoomSpainBinding
import com.azimuton.foreign.fragments.english.NewWordsFragment
import com.azimuton.foreign.fragments.spain.NewWordsSpainFragment
import com.azimuton.foreign.viewmodels.spain.NewSpainWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WashRoomSpainFragment : Fragment() {
    private lateinit var binding : FragmentWashRoomSpainBinding
    private val viewModel: NewSpainWordsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWashRoomSpainBinding.inflate(inflater, container, false)
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

        binding.ivWashroomSpain.setOnClickListener {
            val spain : String = binding.washroomSpain.text.toString()
            val translate : String = binding.tvWashroomSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBathSpain.setOnClickListener {
            val spain : String = binding.bathSpain.text.toString()
            val translate : String = binding.tvBathSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivToiletSpain.setOnClickListener {
            val spain : String = binding.toiletSpain.text.toString()
            val translate : String = binding.tvToiletSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFlushtankSpain.setOnClickListener {
            val spain : String = binding.flushtankSpain.text.toString()
            val translate : String = binding.tvFlushtankSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivToiletseatSpain.setOnClickListener {
            val spain : String = binding.toiletseatSpain.text.toString()
            val translate : String = binding.tvToiletseatSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivToiletpaperSpain.setOnClickListener {
            val spain : String = binding.toiletpaperSpain.text.toString()
            val translate : String = binding.tvToiletpaperSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivShowerSpain.setOnClickListener {
            val spain : String = binding.showerSpain.text.toString()
            val translate : String = binding.tvShowerSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivShowercabinSpain.setOnClickListener {
            val spain : String = binding.showercabinSpain.text.toString()
            val translate : String = binding.tvShowercabinSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivTowelSpain.setOnClickListener {
            val spain : String = binding.towelSpain.text.toString()
            val translate : String = binding.tvTowelSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivLaundrybasketSpain.setOnClickListener {
            val spain : String = binding.laundrybasketSpain.text.toString()
            val translate : String = binding.tvLaundrybasketSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivWashingmashineSpain.setOnClickListener {
            val spain : String = binding.washingmashineSpain.text.toString()
            val translate : String = binding.tvWashingmashineSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDrainerSpain.setOnClickListener {
            val spain : String = binding.drainerSpain.text.toString()
            val translate : String = binding.tvDrainerSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivToothbrushSpain.setOnClickListener {
            val spain : String = binding.toothbrushSpain.text.toString()
            val translate : String = binding.tvToothbrushSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivToothpasteSpain.setOnClickListener {
            val spain : String = binding.toothpasteSpain.text.toString()
            val translate : String = binding.tvToothpasteSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSoapSpain.setOnClickListener {
            val spain : String = binding.soapSpain.text.toString()
            val translate : String = binding.tvSoapSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivShampooSpain.setOnClickListener {
            val spain : String = binding.shampooSpain.text.toString()
            val translate : String = binding.tvShampooSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSpongeforbodySpain.setOnClickListener {
            val spain : String = binding.spongeforbodySpain.text.toString()
            val translate : String = binding.tvSpongeforbodySpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivWashbasinSpain.setOnClickListener {
            val spain : String = binding.washbasinSpain.text.toString()
            val translate : String = binding.tvWashbasinSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivWashbasincabinetSpain.setOnClickListener {
            val spain : String = binding.washbasincabinetSpain.text.toString()
            val translate : String = binding.tvWashbasincabinetSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
    }
}