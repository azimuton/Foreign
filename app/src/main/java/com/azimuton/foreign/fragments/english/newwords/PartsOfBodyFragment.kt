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
import com.azimuton.foreign.databinding.FragmentPartsOfBodyBinding
import com.azimuton.foreign.viewmodels.english.NewWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class PartsOfBodyFragment : Fragment() {
    private lateinit var binding : FragmentPartsOfBodyBinding
    private val viewModel: NewWordsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPartsOfBodyBinding.inflate(inflater, container, false)
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

        binding.ivHand.setOnClickListener {
            val english : String = binding.hand.text.toString()
            val translate : String = binding.tvHand.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHead.setOnClickListener {
            val english : String = binding.head.text.toString()
            val translate : String = binding.tvHead.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFace.setOnClickListener {
            val english : String = binding.face.text.toString()
            val translate : String = binding.tvFace.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivEye.setOnClickListener {
            val english : String = binding.eye.text.toString()
            val translate : String = binding.tvEye.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivNose.setOnClickListener {
            val english : String = binding.nose.text.toString()
            val translate : String = binding.tvNose.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTooth.setOnClickListener {
            val english : String = binding.tooth.text.toString()
            val translate : String = binding.tvTooth.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHair.setOnClickListener {
            val english : String = binding.hair.text.toString()
            val translate : String = binding.tvHair.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLip.setOnClickListener {
            val english : String = binding.lip.text.toString()
            val translate : String = binding.tvLip.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivNeck.setOnClickListener {
            val english : String = binding.neck.text.toString()
            val translate : String = binding.tvNeck.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivMouth.setOnClickListener {
            val english : String = binding.mouth.text.toString()
            val translate : String = binding.tvMouth.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivEar.setOnClickListener {
            val english : String = binding.ear.text.toString()
            val translate : String = binding.tvEar.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivShoulder.setOnClickListener {
            val english : String = binding.shoulder.text.toString()
            val translate : String = binding.tvShoulder.text.toString()
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
        binding.ivArm.setOnClickListener {
            val english : String = binding.arm.text.toString()
            val translate : String = binding.tvArm.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFinger.setOnClickListener {
            val english : String = binding.finger.text.toString()
            val translate : String = binding.tvFinger.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivThumb.setOnClickListener {
            val english : String = binding.thumb.text.toString()
            val translate : String = binding.tvThumb.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivKnee.setOnClickListener {
            val english : String = binding.knee.text.toString()
            val translate : String = binding.tvKnee.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFoot.setOnClickListener {
            val english : String = binding.foot.text.toString()
            val translate : String = binding.tvFoot.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivToe.setOnClickListener {
            val english : String = binding.toe.text.toString()
            val translate : String = binding.tvToe.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLeg.setOnClickListener {
            val english : String = binding.leg.text.toString()
            val translate : String = binding.tvLeg.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBack.setOnClickListener {
            val english : String = binding.back.text.toString()
            val translate : String = binding.tvBack.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWaist.setOnClickListener {
            val english : String = binding.waist.text.toString()
            val translate : String = binding.tvWaist.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHip.setOnClickListener {
            val english : String = binding.hip.text.toString()
            val translate : String = binding.tvHip.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivChest.setOnClickListener {
            val english : String = binding.chest.text.toString()
            val translate : String = binding.tvChest.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivStomack.setOnClickListener {
            val english : String = binding.stomach.text.toString()
            val translate : String = binding.tvStomach.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSide.setOnClickListener {
            val english : String = binding.side.text.toString()
            val translate : String = binding.tvSide.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBrain.setOnClickListener {
            val english : String = binding.brain.text.toString()
            val translate : String = binding.tvBrain.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHeart.setOnClickListener {
            val english : String = binding.heart.text.toString()
            val translate : String = binding.tvHeart.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSkin.setOnClickListener {
            val english : String = binding.skin.text.toString()
            val translate : String = binding.tvSkin.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBlood.setOnClickListener {
            val english : String = binding.blood.text.toString()
            val translate : String = binding.tvBlood.text.toString()
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