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
import com.azimuton.foreign.databinding.FragmentVerbsBinding
import com.azimuton.foreign.viewmodels.english.NewWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class VerbsFragment : Fragment() {
    private lateinit var binding : FragmentVerbsBinding
    private val viewModel: NewWordsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentVerbsBinding.inflate(inflater, container, false)
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

        binding.ivArise.setOnClickListener {
            val english : String = binding.arise.text.toString()
            val translate : String = binding.tvArise.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivAwake.setOnClickListener {
            val english : String = binding.awake.text.toString()
            val translate : String = binding.tvAwake.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBe.setOnClickListener {
            val english : String = binding.be.text.toString()
            val translate : String = binding.tvBe.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBears.setOnClickListener {
            val english : String = binding.bears.text.toString()
            val translate : String = binding.tvBears.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBeat.setOnClickListener {
            val english : String = binding.beat.text.toString()
            val translate : String = binding.tvBeat.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBecome.setOnClickListener {
            val english : String = binding.become.text.toString()
            val translate : String = binding.tvBecome.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBegin.setOnClickListener {
            val english : String = binding.begin.text.toString()
            val translate : String = binding.tvBegin.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBend.setOnClickListener {
            val english : String = binding.bend.text.toString()
            val translate : String = binding.tvBend.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBet.setOnClickListener {
            val english : String = binding.bet.text.toString()
            val translate : String = binding.tvBet.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBind.setOnClickListener {
            val english : String = binding.bind.text.toString()
            val translate : String = binding.tvBind.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBite.setOnClickListener {
            val english : String = binding.bite.text.toString()
            val translate : String = binding.tvBite.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBleed.setOnClickListener {
            val english : String = binding.bleed.text.toString()
            val translate : String = binding.tvBleed.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBlow.setOnClickListener {
            val english : String = binding.blow.text.toString()
            val translate : String = binding.tvBlow.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBreak.setOnClickListener {
            val english : String = binding.Break.text.toString()
            val translate : String = binding.tvBreak.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBreed.setOnClickListener {
            val english : String = binding.breed.text.toString()
            val translate : String = binding.tvBreed.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBring.setOnClickListener {
            val english : String = binding.bring.text.toString()
            val translate : String = binding.tvBring.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBuild.setOnClickListener {
            val english : String = binding.build.text.toString()
            val translate : String = binding.tvBuild.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBuy.setOnClickListener {
            val english : String = binding.buy.text.toString()
            val translate : String = binding.tvBuy.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCatch.setOnClickListener {
            val english : String = binding.Catch.text.toString()
            val translate : String = binding.tvCatch.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivChoose.setOnClickListener {
            val english : String = binding.choose.text.toString()
            val translate : String = binding.tvChoose.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCling.setOnClickListener {
            val english : String = binding.cling.text.toString()
            val translate : String = binding.tvCling.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCome.setOnClickListener {
            val english : String = binding.come.text.toString()
            val translate : String = binding.tvCome.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCost.setOnClickListener {
            val english : String = binding.cost.text.toString()
            val translate : String = binding.tvCost.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCut.setOnClickListener {
            val english : String = binding.cut.text.toString()
            val translate : String = binding.tvCut.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDeal.setOnClickListener {
            val english : String = binding.deal.text.toString()
            val translate : String = binding.tvDeal.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDig.setOnClickListener {
            val english : String = binding.dig.text.toString()
            val translate : String = binding.tvDig.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDo.setOnClickListener {
            val english : String = binding.Do.text.toString()
            val translate : String = binding.tvDo.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDraw.setOnClickListener {
            val english : String = binding.draw.text.toString()
            val translate : String = binding.tvDraw.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDrink.setOnClickListener {
            val english : String = binding.drink.text.toString()
            val translate : String = binding.tvDrink.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDrive.setOnClickListener {
            val english : String = binding.drive.text.toString()
            val translate : String = binding.tvDrive.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivEat.setOnClickListener {
            val english : String = binding.eat.text.toString()
            val translate : String = binding.tvEat.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFall.setOnClickListener {
            val english : String = binding.fall.text.toString()
            val translate : String = binding.tvFall.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFeed.setOnClickListener {
            val english : String = binding.feed.text.toString()
            val translate : String = binding.tvFeed.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFeel.setOnClickListener {
            val english : String = binding.feel.text.toString()
            val translate : String = binding.tvFeel.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFight.setOnClickListener {
            val english : String = binding.fight.text.toString()
            val translate : String = binding.tvFight.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFind.setOnClickListener {
            val english : String = binding.find.text.toString()
            val translate : String = binding.tvFind.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFlee.setOnClickListener {
            val english : String = binding.flee.text.toString()
            val translate : String = binding.tvFlee.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFly.setOnClickListener {
            val english : String = binding.fly.text.toString()
            val translate : String = binding.tvFly.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivForbid.setOnClickListener {
            val english : String = binding.forbid.text.toString()
            val translate : String = binding.tvForbid.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivForget.setOnClickListener {
            val english : String = binding.forget.text.toString()
            val translate : String = binding.tvForget.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivForgive.setOnClickListener {
            val english : String = binding.forgive.text.toString()
            val translate : String = binding.tvForgive.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFreeze.setOnClickListener {
            val english : String = binding.freeze.text.toString()
            val translate : String = binding.tvFreeze.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGet.setOnClickListener {
            val english : String = binding.get.text.toString()
            val translate : String = binding.tvGet.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGive.setOnClickListener {
            val english : String = binding.give.text.toString()
            val translate : String = binding.tvGive.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGo.setOnClickListener {
            val english : String = binding.go.text.toString()
            val translate : String = binding.tvGo.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGrow.setOnClickListener {
            val english : String = binding.grow.text.toString()
            val translate : String = binding.tvGrow.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHang.setOnClickListener {
            val english : String = binding.hang.text.toString()
            val translate : String = binding.tvHang.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHave.setOnClickListener {
            val english : String = binding.have.text.toString()
            val translate : String = binding.tvHave.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHear.setOnClickListener {
            val english : String = binding.hear.text.toString()
            val translate : String = binding.tvHear.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHide.setOnClickListener {
            val english : String = binding.hide.text.toString()
            val translate : String = binding.tvHide.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHit.setOnClickListener {
            val english : String = binding.hit.text.toString()
            val translate : String = binding.tvHit.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHold.setOnClickListener {
            val english : String = binding.hold.text.toString()
            val translate : String = binding.tvHold.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHurt.setOnClickListener {
            val english : String = binding.hurt.text.toString()
            val translate : String = binding.tvHurt.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivKeep.setOnClickListener {
            val english : String = binding.keep.text.toString()
            val translate : String = binding.tvKeep.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivKnow.setOnClickListener {
            val english : String = binding.know.text.toString()
            val translate : String = binding.tvKnow.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLay.setOnClickListener {
            val english : String = binding.lay.text.toString()
            val translate : String = binding.tvLay.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLead.setOnClickListener {
            val english : String = binding.lead.text.toString()
            val translate : String = binding.tvLead.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLearn.setOnClickListener {
            val english : String = binding.learn.text.toString()
            val translate : String = binding.tvLearn.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLeave.setOnClickListener {
            val english : String = binding.leave.text.toString()
            val translate : String = binding.tvLeave.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLend.setOnClickListener {
            val english : String = binding.lend.text.toString()
            val translate : String = binding.tvLend.text.toString()
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