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
import com.azimuton.foreign.databinding.FragmentBerryBinding
import com.azimuton.foreign.databinding.FragmentBerrySpainBinding
import com.azimuton.foreign.fragments.english.NewWordsFragment
import com.azimuton.foreign.fragments.spain.NewWordsSpainFragment
import com.azimuton.foreign.viewmodels.english.NewWordsViewModel
import com.azimuton.foreign.viewmodels.spain.NewSpainWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BerrySpainFragment : Fragment() {
    private lateinit var binding : FragmentBerrySpainBinding
    private val viewModel: NewSpainWordsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBerrySpainBinding.inflate(inflater, container, false)
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
            binding.ivStrawberrySpain.setOnClickListener {
                val spain : String = binding.strawberrySpain.text.toString()
                val translate : String = binding.tvStrawberrySpain.text.toString()
                val word = WordSpain(spainWord = spain, translateSpainWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
            }
            binding.ivRaspberriesSpain.setOnClickListener {
                val spain : String = binding.raspberriesSpain.text.toString()
                val translate : String = binding.tvRaspberriesSpain.text.toString()
                val word = WordSpain(spainWord = spain, translateSpainWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
            }
            binding.ivStrawberriesSpain.setOnClickListener {
                val spain : String = binding.strawberriesSpain.text.toString()
                val translate : String = binding.tvStrawberriesSpain.text.toString()
                val word = WordSpain(spainWord = spain, translateSpainWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
            }
            binding.ivCherriesSpain.setOnClickListener {
                val spain : String = binding.cherriesSpain.text.toString()
                val translate : String = binding.tvCherriesSpain.text.toString()
                val word = WordSpain(spainWord = spain, translateSpainWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
            }
            binding.ivGooseberrySpain.setOnClickListener {
                val spain : String = binding.gooseberrySpain.text.toString()
                val translate : String = binding.tvGooseberrySpain.text.toString()
                val word = WordSpain(spainWord = spain, translateSpainWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
            }
            binding.ivCurrantSpain.setOnClickListener {
                val spain : String = binding.currantSpain.text.toString()
                val translate : String = binding.tvCurrantSpain.text.toString()
                val word = WordSpain(spainWord = spain, translateSpainWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
            }
            binding.ivCherrySpain.setOnClickListener {
                val spain : String = binding.cherrySpain.text.toString()
                val translate : String = binding.tvCherrySpain.text.toString()
                val word = WordSpain(spainWord = spain, translateSpainWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
            }
            binding.ivGrapeSpain.setOnClickListener {
                val spain : String = binding.grapeSpain.text.toString()
                val translate : String = binding.tvGrapeSpain.text.toString()
                val word = WordSpain(spainWord = spain, translateSpainWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
            }
            binding.ivWatermelonSpain.setOnClickListener {
                val spain : String = binding.watermelonSpain.text.toString()
                val translate : String = binding.tvWatermelonSpain.text.toString()
                val word = WordSpain(spainWord = spain, translateSpainWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
            }
            binding.ivMelonSpain.setOnClickListener {
                val spain : String = binding.melonSpain.text.toString()
                val translate : String = binding.tvMelonSpain.text.toString()
                val word = WordSpain(spainWord = spain, translateSpainWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
            }
            binding.ivPumpkinSpain.setOnClickListener {
                val spain : String = binding.pumpkinSpain.text.toString()
                val translate : String = binding.tvPumpkinSpain.text.toString()
                val word = WordSpain(spainWord = spain, translateSpainWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
            }
            binding.ivBlueberrySpain.setOnClickListener {
                val spain : String = binding.blueberrySpain.text.toString()
                val translate : String = binding.tvBlueberrySpain.text.toString()
                val word = WordSpain(spainWord = spain, translateSpainWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
            }
            binding.ivBlackberrySpain.setOnClickListener {
                val spain : String = binding.blackberrySpain.text.toString()
                val translate : String = binding.tvBlackberrySpain.text.toString()
                val word = WordSpain(spainWord = spain, translateSpainWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
            }
            binding.ivCranberrySpain.setOnClickListener {
                val spain : String = binding.cranberrySpain.text.toString()
                val translate : String = binding.tvCranberrySpain.text.toString()
                val word = WordSpain(spainWord = spain, translateSpainWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
            }
            binding.ivDogwoodSpain.setOnClickListener {
                val spain : String = binding.dogwoodSpain.text.toString()
                val translate : String = binding.tvDogwoodSpain.text.toString()
                val word = WordSpain(spainWord = spain, translateSpainWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
            }
            binding.ivLemongrassSpain.setOnClickListener {
                val spain : String = binding.lemongrassSpain.text.toString()
                val translate : String = binding.tvLemongrassSpain.text.toString()
                val word = WordSpain(spainWord = spain, translateSpainWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
            }
            binding.ivSeabuckthornSpain.setOnClickListener {
                val spain : String = binding.seabuckthornSpain.text.toString()
                val translate : String = binding.tvSeabuckthornSpain.text.toString()
                val word = WordSpain(spainWord = spain, translateSpainWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
            }
            binding.ivOlivesSpain.setOnClickListener {
                val spain : String = binding.olivesSpain.text.toString()
                val translate : String = binding.tvOlivesSpain.text.toString()
                val word = WordSpain(spainWord = spain, translateSpainWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
            }
            binding.ivRowanSpain.setOnClickListener {
                val spain : String = binding.rowanSpain.text.toString()
                val translate : String = binding.tvRowanSpain.text.toString()
                val word = WordSpain(spainWord = spain, translateSpainWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
            }
            binding.ivViburnumSpain.setOnClickListener {
                val spain : String = binding.viburnumSpain.text.toString()
                val translate : String = binding.tvViburnumSpain.text.toString()
                val word = WordSpain(spainWord = spain, translateSpainWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
            }
            binding.ivMulberrySpain.setOnClickListener {
                val spain : String = binding.mulberrySpain.text.toString()
                val translate : String = binding.tvMulberrySpain.text.toString()
                val word = WordSpain(spainWord = spain, translateSpainWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
            }
            binding.ivBlueberrysSpain.setOnClickListener {
                val spain : String = binding.blueberrysSpain.text.toString()
                val translate : String = binding.tvBlueberrysSpain.text.toString()
                val word = WordSpain(spainWord = spain, translateSpainWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
            }
            binding.ivYoshtaSpain.setOnClickListener {
                val spain : String = binding.yoshtaSpain.text.toString()
                val translate : String = binding.tvYoshtaSpain.text.toString()
                val word = WordSpain(spainWord = spain, translateSpainWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
            }
        }
    }

