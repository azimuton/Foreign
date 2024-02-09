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
import com.azimuton.foreign.databinding.FragmentNatureSpainBinding
import com.azimuton.foreign.databinding.FragmentPartsOfBodySpainBinding
import com.azimuton.foreign.fragments.english.NewWordsFragment
import com.azimuton.foreign.fragments.spain.NewWordsSpainFragment
import com.azimuton.foreign.viewmodels.spain.NewSpainWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PartsOfBodySpainFragment : Fragment() {
    private lateinit var binding : FragmentPartsOfBodySpainBinding
    private val viewModel: NewSpainWordsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPartsOfBodySpainBinding.inflate(inflater, container, false)
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

        binding.ivHandSpain.setOnClickListener {
            val spain : String = binding.handSpain.text.toString()
            val translate : String = binding.tvHandSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHeadSpain.setOnClickListener {
            val spain : String = binding.headSpain.text.toString()
            val translate : String = binding.tvHeadSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFaceSpain.setOnClickListener {
            val spain : String = binding.faceSpain.text.toString()
            val translate : String = binding.tvFaceSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivEyeSpain.setOnClickListener {
            val spain : String = binding.eyeSpain.text.toString()
            val translate : String = binding.tvEyeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivNoseSpain.setOnClickListener {
            val spain : String = binding.noseSpain.text.toString()
            val translate : String = binding.tvNoseSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivToothSpain.setOnClickListener {
            val spain : String = binding.toothSpain.text.toString()
            val translate : String = binding.tvToothSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHairSpain.setOnClickListener {
            val spain : String = binding.hairSpain.text.toString()
            val translate : String = binding.tvHairSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivLipSpain.setOnClickListener {
            val spain : String = binding.lipSpain.text.toString()
            val translate : String = binding.tvLipSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivNeckSpain.setOnClickListener {
            val spain : String = binding.neckSpain.text.toString()
            val translate : String = binding.tvNeckSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivMouthSpain.setOnClickListener {
            val spain : String = binding.mouthSpain.text.toString()
            val translate : String = binding.tvMouthSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivEarSpain.setOnClickListener {
            val spain : String = binding.earSpain.text.toString()
            val translate : String = binding.tvEarSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivShoulderSpain.setOnClickListener {
            val spain : String = binding.shoulderSpain.text.toString()
            val translate : String = binding.tvShoulderSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivNailSpain.setOnClickListener {
            val spain : String = binding.nailSpain.text.toString()
            val translate : String = binding.tvNailSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivArmSpain.setOnClickListener {
            val spain : String = binding.armSpain.text.toString()
            val translate : String = binding.tvArmSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFingerSpain.setOnClickListener {
            val spain : String = binding.fingerSpain.text.toString()
            val translate : String = binding.tvFingerSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivThumbSpain.setOnClickListener {
            val spain : String = binding.thumbSpain.text.toString()
            val translate : String = binding.tvThumbSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivKneeSpain.setOnClickListener {
            val spain : String = binding.kneeSpain.text.toString()
            val translate : String = binding.tvKneeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFootSpain.setOnClickListener {
            val spain : String = binding.footSpain.text.toString()
            val translate : String = binding.tvFootSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivToeSpain.setOnClickListener {
            val spain : String = binding.toeSpain.text.toString()
            val translate : String = binding.tvToeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivLegSpain.setOnClickListener {
            val spain : String = binding.legSpain.text.toString()
            val translate : String = binding.tvLegSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBackSpain.setOnClickListener {
            val spain : String = binding.backSpain.text.toString()
            val translate : String = binding.tvBackSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivWaistSpain.setOnClickListener {
            val spain : String = binding.waistSpain.text.toString()
            val translate : String = binding.tvWaistSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHipSpain.setOnClickListener {
            val spain : String = binding.hipSpain.text.toString()
            val translate : String = binding.tvHipSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivChestSpain.setOnClickListener {
            val spain : String = binding.chestSpain.text.toString()
            val translate : String = binding.tvChestSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivStomackSpain.setOnClickListener {
            val spain : String = binding.stomachSpain.text.toString()
            val translate : String = binding.tvStomachSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSideSpain.setOnClickListener {
            val spain : String = binding.sideSpain.text.toString()
            val translate : String = binding.tvSideSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBrainSpain.setOnClickListener {
            val spain : String = binding.brainSpain.text.toString()
            val translate : String = binding.tvBrainSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHeartSpain.setOnClickListener {
            val spain : String = binding.heartSpain.text.toString()
            val translate : String = binding.tvHeartSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSkinSpain.setOnClickListener {
            val spain : String = binding.skinSpain.text.toString()
            val translate : String = binding.tvSkinSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBloodSpain.setOnClickListener {
            val spain : String = binding.bloodSpain.text.toString()
            val translate : String = binding.tvBloodSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
    }

}