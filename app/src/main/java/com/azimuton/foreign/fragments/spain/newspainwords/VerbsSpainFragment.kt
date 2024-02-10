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
import com.azimuton.foreign.databinding.FragmentVegetablesSpainBinding
import com.azimuton.foreign.databinding.FragmentVerbsSpainBinding
import com.azimuton.foreign.fragments.english.NewWordsFragment
import com.azimuton.foreign.fragments.spain.NewWordsSpainFragment
import com.azimuton.foreign.viewmodels.spain.NewSpainWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class VerbsSpainFragment : Fragment() {
    private lateinit var binding : FragmentVerbsSpainBinding
    private val viewModel: NewSpainWordsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentVerbsSpainBinding.inflate(inflater, container, false)
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

        binding.ivAriseSpain.setOnClickListener {
            val spain : String = binding.ariseSpain.text.toString()
            val translate : String = binding.tvAriseSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivAwakeSpain.setOnClickListener {
            val spain : String = binding.awakeSpain.text.toString()
            val translate : String = binding.tvAwakeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBeSpain.setOnClickListener {
            val spain : String = binding.beSpain.text.toString()
            val translate : String = binding.tvBeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBearsSpain.setOnClickListener {
            val spain : String = binding.bearsSpain.text.toString()
            val translate : String = binding.tvBearsSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBeatSpain.setOnClickListener {
            val spain : String = binding.beatSpain.text.toString()
            val translate : String = binding.tvBeatSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBecomeSpain.setOnClickListener {
            val spain : String = binding.becomeSpain.text.toString()
            val translate : String = binding.tvBecomeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBeginSpain.setOnClickListener {
            val spain : String = binding.beginSpain.text.toString()
            val translate : String = binding.tvBeginSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBendSpain.setOnClickListener {
            val spain : String = binding.bendSpain.text.toString()
            val translate : String = binding.tvBendSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBetSpain.setOnClickListener {
            val spain : String = binding.betSpain.text.toString()
            val translate : String = binding.tvBetSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBindSpain.setOnClickListener {
            val spain : String = binding.bindSpain.text.toString()
            val translate : String = binding.tvBindSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBiteSpain.setOnClickListener {
            val spain : String = binding.biteSpain.text.toString()
            val translate : String = binding.tvBiteSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBleedSpain.setOnClickListener {
            val spain : String = binding.bleedSpain.text.toString()
            val translate : String = binding.tvBleedSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBlowSpain.setOnClickListener {
            val spain : String = binding.blowSpain.text.toString()
            val translate : String = binding.tvBlowSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBreakSpain.setOnClickListener {
            val spain : String = binding.BreakSpain.text.toString()
            val translate : String = binding.tvBreakSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBreedSpain.setOnClickListener {
            val spain : String = binding.breedSpain.text.toString()
            val translate : String = binding.tvBreedSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBringSpain.setOnClickListener {
            val spain : String = binding.bringSpain.text.toString()
            val translate : String = binding.tvBringSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBuildSpain.setOnClickListener {
            val spain : String = binding.buildSpain.text.toString()
            val translate : String = binding.tvBuildSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBuySpain.setOnClickListener {
            val spain : String = binding.buySpain.text.toString()
            val translate : String = binding.tvBuySpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivCatchSpain.setOnClickListener {
            val spain : String = binding.CatchSpain.text.toString()
            val translate : String = binding.tvCatchSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivChooseSpain.setOnClickListener {
            val spain : String = binding.chooseSpain.text.toString()
            val translate : String = binding.tvChooseSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivClingSpain.setOnClickListener {
            val spain : String = binding.clingSpain.text.toString()
            val translate : String = binding.tvClingSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivComeSpain.setOnClickListener {
            val spain : String = binding.comeSpain.text.toString()
            val translate : String = binding.tvComeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivCostSpain.setOnClickListener {
            val spain : String = binding.costSpain.text.toString()
            val translate : String = binding.tvCostSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivCutSpain.setOnClickListener {
            val spain : String = binding.cutSpain.text.toString()
            val translate : String = binding.tvCutSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDealSpain.setOnClickListener {
            val spain : String = binding.dealSpain.text.toString()
            val translate : String = binding.tvDealSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDigSpain.setOnClickListener {
            val spain : String = binding.digSpain.text.toString()
            val translate : String = binding.tvDigSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDoSpain.setOnClickListener {
            val spain : String = binding.DoSpain.text.toString()
            val translate : String = binding.tvDoSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDrawSpain.setOnClickListener {
            val spain : String = binding.drawSpain.text.toString()
            val translate : String = binding.tvDrawSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDrinkSpain.setOnClickListener {
            val spain : String = binding.drinkSpain.text.toString()
            val translate : String = binding.tvDrinkSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDriveSpain.setOnClickListener {
            val spain : String = binding.driveSpain.text.toString()
            val translate : String = binding.tvDriveSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivEatSpain.setOnClickListener {
            val spain : String = binding.eatSpain.text.toString()
            val translate : String = binding.tvEatSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFallSpain.setOnClickListener {
            val spain : String = binding.fallSpain.text.toString()
            val translate : String = binding.tvFallSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFeedSpain.setOnClickListener {
            val spain : String = binding.feedSpain.text.toString()
            val translate : String = binding.tvFeedSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFeelSpain.setOnClickListener {
            val spain : String = binding.feelSpain.text.toString()
            val translate : String = binding.tvFeelSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFightSpain.setOnClickListener {
            val spain : String = binding.fightSpain.text.toString()
            val translate : String = binding.tvFightSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFindSpain.setOnClickListener {
            val spain : String = binding.findSpain.text.toString()
            val translate : String = binding.tvFindSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFleeSpain.setOnClickListener {
            val spain : String = binding.fleeSpain.text.toString()
            val translate : String = binding.tvFleeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFlySpain.setOnClickListener {
            val spain : String = binding.flySpain.text.toString()
            val translate : String = binding.tvFlySpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivForbidSpain.setOnClickListener {
            val spain : String = binding.forbidSpain.text.toString()
            val translate : String = binding.tvForbidSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivForgetSpain.setOnClickListener {
            val spain : String = binding.forgetSpain.text.toString()
            val translate : String = binding.tvForgetSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivForgiveSpain.setOnClickListener {
            val spain : String = binding.forgiveSpain.text.toString()
            val translate : String = binding.tvForgiveSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFreezeSpain.setOnClickListener {
            val spain : String = binding.freezeSpain.text.toString()
            val translate : String = binding.tvFreezeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivGetSpain.setOnClickListener {
            val spain : String = binding.getSpain.text.toString()
            val translate : String = binding.tvGetSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivGiveSpain.setOnClickListener {
            val spain : String = binding.giveSpain.text.toString()
            val translate : String = binding.tvGiveSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivGoSpain.setOnClickListener {
            val spain : String = binding.goSpain.text.toString()
            val translate : String = binding.tvGoSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivGrowSpain.setOnClickListener {
            val spain : String = binding.growSpain.text.toString()
            val translate : String = binding.tvGrowSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHangSpain.setOnClickListener {
            val spain : String = binding.hangSpain.text.toString()
            val translate : String = binding.tvHangSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHaveSpain.setOnClickListener {
            val spain : String = binding.haveSpain.text.toString()
            val translate : String = binding.tvHaveSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHearSpain.setOnClickListener {
            val spain : String = binding.hearSpain.text.toString()
            val translate : String = binding.tvHearSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHideSpain.setOnClickListener {
            val spain : String = binding.hideSpain.text.toString()
            val translate : String = binding.tvHideSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHitSpain.setOnClickListener {
            val spain : String = binding.hitSpain.text.toString()
            val translate : String = binding.tvHitSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHoldSpain.setOnClickListener {
            val spain : String = binding.holdSpain.text.toString()
            val translate : String = binding.tvHoldSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHurtSpain.setOnClickListener {
            val spain : String = binding.hurtSpain.text.toString()
            val translate : String = binding.tvHurtSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivKeepSpain.setOnClickListener {
            val spain : String = binding.keepSpain.text.toString()
            val translate : String = binding.tvKeepSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivKnowSpain.setOnClickListener {
            val spain : String = binding.knowSpain.text.toString()
            val translate : String = binding.tvKnowSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivLaySpain.setOnClickListener {
            val spain : String = binding.laySpain.text.toString()
            val translate : String = binding.tvLaySpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivLeadSpain.setOnClickListener {
            val spain : String = binding.leadSpain.text.toString()
            val translate : String = binding.tvLeadSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivLearnSpain.setOnClickListener {
            val spain : String = binding.learnSpain.text.toString()
            val translate : String = binding.tvLearnSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivLeaveSpain.setOnClickListener {
            val spain : String = binding.leaveSpain.text.toString()
            val translate : String = binding.tvLeaveSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivLendSpain.setOnClickListener {
            val spain : String = binding.lendSpain.text.toString()
            val translate : String = binding.tvLendSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }

    }
}