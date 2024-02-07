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
import com.azimuton.foreign.databinding.FragmentPopularExpSpainFourBinding
import com.azimuton.foreign.databinding.FragmentPopularExpSpainThreeBinding
import com.azimuton.foreign.viewmodels.spain.PopExpSpainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PopularExpSpainFourFragment : Fragment() {
    lateinit var binding : FragmentPopularExpSpainFourBinding
    private val viewModel : PopExpSpainViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPopularExpSpainFourBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.ivF85.setOnClickListener {
            val spain: String = binding.tvE85.text.toString()
            val translate: String = binding.tvT85.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF86.setOnClickListener {
            val spain: String = binding.tvE86.text.toString()
            val translate: String = binding.tvT86.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF87.setOnClickListener {
            val spain: String = binding.tvE87.text.toString()
            val translate: String = binding.tvT87.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF88.setOnClickListener {
            val spain: String = binding.tvE88.text.toString()
            val translate: String = binding.tvT88.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF89.setOnClickListener {
            val spain: String = binding.tvE89.text.toString()
            val translate: String = binding.tvT89.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF90.setOnClickListener {
            val spain: String = binding.tvE90.text.toString()
            val translate: String = binding.tvT90.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF91.setOnClickListener {
            val spain: String = binding.tvE91.text.toString()
            val translate: String = binding.tvT91.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF92.setOnClickListener {
            val spain: String = binding.tvE92.text.toString()
            val translate: String = binding.tvT92.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF93.setOnClickListener {
            val spain: String = binding.tvE93.text.toString()
            val translate: String = binding.tvT93.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF94.setOnClickListener {
            val spain: String = binding.tvE94.text.toString()
            val translate: String = binding.tvT94.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF95.setOnClickListener {
            val spain: String = binding.tvE95.text.toString()
            val translate: String = binding.tvT95.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF96.setOnClickListener {
            val spain: String = binding.tvE96.text.toString()
            val translate: String = binding.tvT96.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF97.setOnClickListener {
            val spain: String = binding.tvE97.text.toString()
            val translate: String = binding.tvT97.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF98.setOnClickListener {
            val spain: String = binding.tvE98.text.toString()
            val translate: String = binding.tvT98.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF99.setOnClickListener {
            val spain: String = binding.tvE99.text.toString()
            val translate: String = binding.tvT99.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF100.setOnClickListener {
            val spain: String = binding.tvE100.text.toString()
            val translate: String = binding.tvT100.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF101.setOnClickListener {
            val spain: String = binding.tvE101.text.toString()
            val translate: String = binding.tvT101.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF102.setOnClickListener {
            val spain: String = binding.tvE102.text.toString()
            val translate: String = binding.tvT102.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF103.setOnClickListener {
            val spain: String = binding.tvE103.text.toString()
            val translate: String = binding.tvT103.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF104.setOnClickListener {
            val spain: String = binding.tvE104.text.toString()
            val translate: String = binding.tvT104.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF105.setOnClickListener {
            val spain: String = binding.tvE105.text.toString()
            val translate: String = binding.tvT105.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF106.setOnClickListener {
            val spain: String = binding.tvE106.text.toString()
            val translate: String = binding.tvT106.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF107.setOnClickListener {
            val spain: String = binding.tvE107.text.toString()
            val translate: String = binding.tvT107.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF108.setOnClickListener {
            val spain: String = binding.tvE108.text.toString()
            val translate: String = binding.tvT108.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF109.setOnClickListener {
            val spain: String = binding.tvE109.text.toString()
            val translate: String = binding.tvT109.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF110.setOnClickListener {
            val spain: String = binding.tvE110.text.toString()
            val translate: String = binding.tvT110.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF111.setOnClickListener {
            val spain: String = binding.tvE111.text.toString()
            val translate: String = binding.tvT111.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF112.setOnClickListener {
            val spain: String = binding.tvE112.text.toString()
            val translate: String = binding.tvT112.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
    }
}