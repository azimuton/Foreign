package com.azimuton.foreign.fragments.spain.popularspainexpressions

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
import com.azimuton.foreign.databinding.FragmentPopularExpSpainBinding
import com.azimuton.foreign.viewmodels.english.PopExpViewModel
import com.azimuton.foreign.viewmodels.spain.PopExpSpainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PopularExpSpainFragment : Fragment() {
    lateinit var binding : FragmentPopularExpSpainBinding
    private val viewModel : PopExpSpainViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPopularExpSpainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.ivF1.setOnClickListener {
            val spain: String = binding.tvE1.text.toString()
            val translate: String = binding.tvT1.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF2.setOnClickListener {
            val spain: String = binding.tvE2.text.toString()
            val translate: String = binding.tvT2.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF3.setOnClickListener {
            val spain: String = binding.tvE3.text.toString()
            val translate: String = binding.tvT3.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF4.setOnClickListener {
            val spain: String = binding.tvE4.text.toString()
            val translate: String = binding.tvT4.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF5.setOnClickListener {
            val spain: String = binding.tvE5.text.toString()
            val translate: String = binding.tvT5.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF6.setOnClickListener {
            val spain: String = binding.tvE6.text.toString()
            val translate: String = binding.tvT6.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF7.setOnClickListener {
            val spain: String = binding.tvE7.text.toString()
            val translate: String = binding.tvT7.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF8.setOnClickListener {
            val spain: String = binding.tvE8.text.toString()
            val translate: String = binding.tvT8.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF9.setOnClickListener {
            val spain: String = binding.tvE9.text.toString()
            val translate: String = binding.tvT9.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF10.setOnClickListener {
            val spain: String = binding.tvE10.text.toString()
            val translate: String = binding.tvT10.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF11.setOnClickListener {
            val spain: String = binding.tvE11.text.toString()
            val translate: String = binding.tvT11.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF12.setOnClickListener {
            val spain: String = binding.tvE12.text.toString()
            val translate: String = binding.tvT12.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF13.setOnClickListener {
            val spain: String = binding.tvE13.text.toString()
            val translate: String = binding.tvT13.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF14.setOnClickListener {
            val spain: String = binding.tvE14.text.toString()
            val translate: String = binding.tvT14.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF15.setOnClickListener {
            val spain: String = binding.tvE15.text.toString()
            val translate: String = binding.tvT15.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF16.setOnClickListener {
            val spain: String = binding.tvE16.text.toString()
            val translate: String = binding.tvT16.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF17.setOnClickListener {
            val spain: String = binding.tvE17.text.toString()
            val translate: String = binding.tvT17.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF18.setOnClickListener {
            val spain: String = binding.tvE18.text.toString()
            val translate: String = binding.tvT18.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF19.setOnClickListener {
            val spain: String = binding.tvE19.text.toString()
            val translate: String = binding.tvT19.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF20.setOnClickListener {
            val spain: String = binding.tvE20.text.toString()
            val translate: String = binding.tvT20.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF21.setOnClickListener {
            val spain: String = binding.tvE21.text.toString()
            val translate: String = binding.tvT21.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF22.setOnClickListener {
            val spain: String = binding.tvE22.text.toString()
            val translate: String = binding.tvT22.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF23.setOnClickListener {
            val spain: String = binding.tvE23.text.toString()
            val translate: String = binding.tvT23.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF24.setOnClickListener {
            val spain: String = binding.tvE24.text.toString()
            val translate: String = binding.tvT24.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF25.setOnClickListener {
            val spain: String = binding.tvE25.text.toString()
            val translate: String = binding.tvT25.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF26.setOnClickListener {
            val spain: String = binding.tvE26.text.toString()
            val translate: String = binding.tvT26.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF27.setOnClickListener {
            val spain: String = binding.tvE27.text.toString()
            val translate: String = binding.tvT27.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF28.setOnClickListener {
            val spain: String = binding.tvE28.text.toString()
            val translate: String = binding.tvT28.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
    }
}