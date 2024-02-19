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
import com.azimuton.foreign.databinding.FragmentVerbsSpainBinding
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
class VerbsContinuedSpainFragment : Fragment() {
    private lateinit var binding : FragmentVerbsContinuedSpainBinding
    private val viewModel: NewSpainWordsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentVerbsContinuedSpainBinding.inflate(inflater, container, false)
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

        binding.ivLetSpain.setOnClickListener {
            val spain : String = binding.letSpain.text.toString()
            val translate : String = binding.tvLetSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLieSpain.setOnClickListener {
            val spain : String = binding.lieSpain.text.toString()
            val translate : String = binding.tvLieSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLightSpain.setOnClickListener {
            val spain : String = binding.lightSpain.text.toString()
            val translate : String = binding.tvLightSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLoseSpain.setOnClickListener {
            val spain : String = binding.loseSpain.text.toString()
            val translate : String = binding.tvLoseSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivMakeSpain.setOnClickListener {
            val spain : String = binding.makeSpain.text.toString()
            val translate : String = binding.tvMakeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivMeanSpain.setOnClickListener {
            val spain : String = binding.meanSpain.text.toString()
            val translate : String = binding.tvMeanSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivMeetSpain.setOnClickListener {
            val spain : String = binding.meetSpain.text.toString()
            val translate : String = binding.tvMeetSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPaySpain.setOnClickListener {
            val spain : String = binding.paySpain.text.toString()
            val translate : String = binding.tvPaySpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPutSpain.setOnClickListener {
            val spain : String = binding.putSpain.text.toString()
            val translate : String = binding.tvPutSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivReadSpain.setOnClickListener {
            val spain : String = binding.readSpain.text.toString()
            val translate : String = binding.tvReadSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRideSpain.setOnClickListener {
            val spain : String = binding.rideSpain.text.toString()
            val translate : String = binding.tvRideSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRingSpain.setOnClickListener {
            val spain : String = binding.ringSpain.text.toString()
            val translate : String = binding.tvRingSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRiseSpain.setOnClickListener {
            val spain : String = binding.riseSpain.text.toString()
            val translate : String = binding.tvRiseSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRunSpain.setOnClickListener {
            val spain : String = binding.runSpain.text.toString()
            val translate : String = binding.tvRunSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSaySpain.setOnClickListener {
            val spain : String = binding.saySpain.text.toString()
            val translate : String = binding.tvSaySpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSeeSpain.setOnClickListener {
            val spain : String = binding.seeSpain.text.toString()
            val translate : String = binding.tvSeeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSeekSpain.setOnClickListener {
            val spain : String = binding.seekSpain.text.toString()
            val translate : String = binding.tvSeekSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSellSpain.setOnClickListener {
            val spain : String = binding.sellSpain.text.toString()
            val translate : String = binding.tvSellSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSendSpain.setOnClickListener {
            val spain : String = binding.sendSpain.text.toString()
            val translate : String = binding.tvSendSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSetSpain.setOnClickListener {
            val spain : String = binding.setSpain.text.toString()
            val translate : String = binding.tvSetSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivShakeSpain.setOnClickListener {
            val spain : String = binding.shakeSpain.text.toString()
            val translate : String = binding.tvShakeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivShineSpain.setOnClickListener {
            val spain : String = binding.shineSpain.text.toString()
            val translate : String = binding.tvShineSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivShootSpain.setOnClickListener {
            val spain : String = binding.shootSpain.text.toString()
            val translate : String = binding.tvShootSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivShowSpain.setOnClickListener {
            val spain : String = binding.showSpain.text.toString()
            val translate : String = binding.tvShowSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivShrinkSpain.setOnClickListener {
            val spain : String = binding.shrinkSpain.text.toString()
            val translate : String = binding.tvShrinkSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivShutSpain.setOnClickListener {
            val spain : String = binding.shutSpain.text.toString()
            val translate : String = binding.tvShutSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSingSpain.setOnClickListener {
            val spain : String = binding.singSpain.text.toString()
            val translate : String = binding.tvSingSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSitSpain.setOnClickListener {
            val spain : String = binding.sitSpain.text.toString()
            val translate : String = binding.tvSitSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSleepSpain.setOnClickListener {
            val spain : String = binding.sleepSpain.text.toString()
            val translate : String = binding.tvSleepSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSlideSpain.setOnClickListener {
            val spain : String = binding.slideSpain.text.toString()
            val translate : String = binding.tvSlideSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSmellSpain.setOnClickListener {
            val spain : String = binding.smellSpain.text.toString()
            val translate : String = binding.tvSmellSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSpeakSpain.setOnClickListener {
            val spain : String = binding.speakSpain.text.toString()
            val translate : String = binding.tvSpeakSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSpellSpain.setOnClickListener {
            val spain : String = binding.spellSpain.text.toString()
            val translate : String = binding.tvSpellSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSpendSpain.setOnClickListener {
            val spain : String = binding.spendSpain.text.toString()
            val translate : String = binding.tvSpendSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSpillSpain.setOnClickListener {
            val spain : String = binding.spillSpain.text.toString()
            val translate : String = binding.tvSpillSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSpinSpain.setOnClickListener {
            val spain : String = binding.spinSpain.text.toString()
            val translate : String = binding.tvSpinSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSplitSpain.setOnClickListener {
            val spain : String = binding.splitSpain.text.toString()
            val translate : String = binding.tvSplitSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSpoilSpain.setOnClickListener {
            val spain : String = binding.spoilSpain.text.toString()
            val translate : String = binding.tvSpoilSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSpreadSpain.setOnClickListener {
            val spain : String = binding.spreadSpain.text.toString()
            val translate : String = binding.tvSpreadSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivStandSpain.setOnClickListener {
            val spain : String = binding.standSpain.text.toString()
            val translate : String = binding.tvStandSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivStealSpain.setOnClickListener {
            val spain : String = binding.stealSpain.text.toString()
            val translate : String = binding.tvStealSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivStingSpain.setOnClickListener {
            val spain : String = binding.stingSpain.text.toString()
            val translate : String = binding.tvStingSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivStinkSpain.setOnClickListener {
            val spain : String = binding.stinkSpain.text.toString()
            val translate : String = binding.tvStinkSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivStrikeSpain.setOnClickListener {
            val spain : String = binding.strikeSpain.text.toString()
            val translate : String = binding.tvStrikeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSwearSpain.setOnClickListener {
            val spain : String = binding.swearSpain.text.toString()
            val translate : String = binding.tvSwearSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSweepSpain.setOnClickListener {
            val spain : String = binding.sweepSpain.text.toString()
            val translate : String = binding.tvSweepSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSwellSpain.setOnClickListener {
            val spain : String = binding.swellSpain.text.toString()
            val translate : String = binding.tvSwellSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSwimSpain.setOnClickListener {
            val spain : String = binding.swimSpain.text.toString()
            val translate : String = binding.tvSwimSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTakeSpain.setOnClickListener {
            val spain : String = binding.takeSpain.text.toString()
            val translate : String = binding.tvTakeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTeachSpain.setOnClickListener {
            val spain : String = binding.teachSpain.text.toString()
            val translate : String = binding.tvTeachSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTearSpain.setOnClickListener {
            val spain : String = binding.tearSpain.text.toString()
            val translate : String = binding.tvTearSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTellSpain.setOnClickListener {
            val spain : String = binding.tellSpain.text.toString()
            val translate : String = binding.tvTellSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivThinkSpain.setOnClickListener {
            val spain : String = binding.thinkSpain.text.toString()
            val translate : String = binding.tvThinkSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivThrowSpain.setOnClickListener {
            val spain : String = binding.ThrowSpain.text.toString()
            val translate : String = binding.tvThrowSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivUnderstandSpain.setOnClickListener {
            val spain : String = binding.understandSpain.text.toString()
            val translate : String = binding.tvUnderstandSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWakeSpain.setOnClickListener {
            val spain : String = binding.wakeSpain.text.toString()
            val translate : String = binding.tvWakeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWearSpain.setOnClickListener {
            val spain : String = binding.wearSpain.text.toString()
            val translate : String = binding.tvWearSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWinSpain.setOnClickListener {
            val spain : String = binding.winSpain.text.toString()
            val translate : String = binding.tvWinSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWindSpain.setOnClickListener {
            val spain : String = binding.windSpain.text.toString()
            val translate : String = binding.tvWindSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWriteSpain.setOnClickListener {
            val spain : String = binding.writeSpain.text.toString()
            val translate : String = binding.tvWriteSpain.text.toString()
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