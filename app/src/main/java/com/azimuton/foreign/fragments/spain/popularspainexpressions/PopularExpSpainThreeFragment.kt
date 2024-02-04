package com.azimuton.foreign.fragments.spain.popularspainexpressions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import com.azimuton.domain.models.spain.WordSpain
import com.azimuton.foreign.R
import com.azimuton.foreign.databinding.FragmentPopularExpSpainThreeBinding
import com.azimuton.foreign.databinding.FragmentPopularExpSpainTwoBinding
import com.azimuton.foreign.viewmodels.spain.PopExpSpainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PopularExpSpainThreeFragment : Fragment() {
    lateinit var binding : FragmentPopularExpSpainThreeBinding
    private val viewModel : PopExpSpainViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPopularExpSpainThreeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.ivF57.setOnClickListener {
            val spain: String = binding.tvE57.text.toString()
            val translate: String = binding.tvT57.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF58.setOnClickListener {
            val spain: String = binding.tvE58.text.toString()
            val translate: String = binding.tvT58.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF59.setOnClickListener {
            val spain: String = binding.tvE59.text.toString()
            val translate: String = binding.tvT59.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF60.setOnClickListener {
            val spain: String = binding.tvE60.text.toString()
            val translate: String = binding.tvT60.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF61.setOnClickListener {
            val spain: String = binding.tvE61.text.toString()
            val translate: String = binding.tvT61.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF62.setOnClickListener {
            val spain: String = binding.tvE62.text.toString()
            val translate: String = binding.tvT62.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF63.setOnClickListener {
            val spain: String = binding.tvE63.text.toString()
            val translate: String = binding.tvT63.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF64.setOnClickListener {
            val spain: String = binding.tvE64.text.toString()
            val translate: String = binding.tvT64.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF65.setOnClickListener {
            val spain: String = binding.tvE65.text.toString()
            val translate: String = binding.tvT65.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF66.setOnClickListener {
            val spain: String = binding.tvE66.text.toString()
            val translate: String = binding.tvT66.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF67.setOnClickListener {
            val spain: String = binding.tvE67.text.toString()
            val translate: String = binding.tvT67.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF68.setOnClickListener {
            val spain: String = binding.tvE68.text.toString()
            val translate: String = binding.tvT68.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF69.setOnClickListener {
            val spain: String = binding.tvE69.text.toString()
            val translate: String = binding.tvT69.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF70.setOnClickListener {
            val spain: String = binding.tvE70.text.toString()
            val translate: String = binding.tvT70.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF71.setOnClickListener {
            val spain: String = binding.tvE71.text.toString()
            val translate: String = binding.tvT71.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF72.setOnClickListener {
            val spain: String = binding.tvE72.text.toString()
            val translate: String = binding.tvT72.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF73.setOnClickListener {
            val spain: String = binding.tvE73.text.toString()
            val translate: String = binding.tvT73.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF74.setOnClickListener {
            val spain: String = binding.tvE74.text.toString()
            val translate: String = binding.tvT74.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF75.setOnClickListener {
            val spain: String = binding.tvE75.text.toString()
            val translate: String = binding.tvT75.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF76.setOnClickListener {
            val spain: String = binding.tvE76.text.toString()
            val translate: String = binding.tvT76.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF77.setOnClickListener {
            val spain: String = binding.tvE77.text.toString()
            val translate: String = binding.tvT77.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF78.setOnClickListener {
            val spain: String = binding.tvE78.text.toString()
            val translate: String = binding.tvT78.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF79.setOnClickListener {
            val spain: String = binding.tvE79.text.toString()
            val translate: String = binding.tvT79.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF80.setOnClickListener {
            val spain: String = binding.tvE80.text.toString()
            val translate: String = binding.tvT80.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF81.setOnClickListener {
            val spain: String = binding.tvE81.text.toString()
            val translate: String = binding.tvT81.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF82.setOnClickListener {
            val spain: String = binding.tvE82.text.toString()
            val translate: String = binding.tvT82.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF83.setOnClickListener {
            val spain: String = binding.tvE83.text.toString()
            val translate: String = binding.tvT83.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF84.setOnClickListener {
            val spain: String = binding.tvE84.text.toString()
            val translate: String = binding.tvT84.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
    }
}