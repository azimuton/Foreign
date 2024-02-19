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
import com.azimuton.foreign.databinding.FragmentFamilySpainBinding
import com.azimuton.foreign.databinding.FragmentFruitsSpainBinding
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
class FruitsSpainFragment : Fragment() {
    private lateinit var binding : FragmentFruitsSpainBinding
    private val viewModel: NewSpainWordsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFruitsSpainBinding.inflate(inflater, container, false)
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

        binding.ivAppleSpain.setOnClickListener {
            val spain : String = binding.appleSpain.text.toString()
            val translate : String = binding.tvAppleSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPearSpain.setOnClickListener {
            val spain : String = binding.pearSpain.text.toString()
            val translate : String = binding.tvPearSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPeachSpain.setOnClickListener {
            val spain : String = binding.peachSpain.text.toString()
            val translate : String = binding.tvPeachSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPlumSpain.setOnClickListener {
            val spain : String = binding.plumSpain.text.toString()
            val translate : String = binding.tvPlumSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivApricotSpain.setOnClickListener {
            val spain : String = binding.apricotSpain.text.toString()
            val translate : String = binding.tvApricotSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBananaSpain.setOnClickListener {
            val spain : String = binding.bananaSpain.text.toString()
            val translate : String = binding.tvBananaSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivOrangeSpain.setOnClickListener {
            val spain : String = binding.orangeSpain.text.toString()
            val translate : String = binding.tvOrangeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivMandarinSpain.setOnClickListener {
            val spain : String = binding.mandarinSpain.text.toString()
            val translate : String = binding.tvMandarinSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLemonSpain.setOnClickListener {
            val spain : String = binding.lemonSpain.text.toString()
            val translate : String = binding.tvLemonSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivMangoSpain.setOnClickListener {
            val spain : String = binding.mangoSpain.text.toString()
            val translate : String = binding.tvMangoSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivAvocadoSpain.setOnClickListener {
            val spain : String = binding.avocadoSpain.text.toString()
            val translate : String = binding.tvAvocadoSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPineappleSpain.setOnClickListener {
            val spain : String = binding.pineappleSpain.text.toString()
            val translate : String = binding.tvPineappleSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGarnetSpain.setOnClickListener {
            val spain : String = binding.garnetSpain.text.toString()
            val translate : String = binding.tvGarnetSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivKiwiSpain.setOnClickListener {
            val spain : String = binding.kiwiSpain.text.toString()
            val translate : String = binding.tvKiwiSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGrapefruitSpain.setOnClickListener {
            val spain : String = binding.grapefruitSpain.text.toString()
            val translate : String = binding.tvGrapefruitSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPomeloSpain.setOnClickListener {
            val spain : String = binding.pomeloSpain.text.toString()
            val translate : String = binding.tvPomeloSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivQuinceSpain.setOnClickListener {
            val spain : String = binding.quinceSpain.text.toString()
            val translate : String = binding.tvQuinceSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPersimmonSpain.setOnClickListener {
            val spain : String = binding.persimmonSpain.text.toString()
            val translate : String = binding.tvPersimmonSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivNectarineSpain.setOnClickListener {
            val spain : String = binding.nectarineSpain.text.toString()
            val translate : String = binding.tvNectarineSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFigsSpain.setOnClickListener {
            val spain : String = binding.figsSpain.text.toString()
            val translate : String = binding.tvFigsSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDatefruitSpain.setOnClickListener {
            val spain : String = binding.datefruitSpain.text.toString()
            val translate : String = binding.tvDatefruitSpain.text.toString()
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