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
import com.azimuton.foreign.databinding.FragmentHomeAnimalsSpainBinding
import com.azimuton.foreign.databinding.FragmentKitchenSpainBinding
import com.azimuton.foreign.fragments.english.NewWordsFragment
import com.azimuton.foreign.fragments.spain.NewWordsSpainFragment
import com.azimuton.foreign.viewmodels.spain.NewSpainWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class KitchenSpainFragment : Fragment() {
    private lateinit var binding : FragmentKitchenSpainBinding
    private val viewModel: NewSpainWordsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentKitchenSpainBinding.inflate(inflater, container, false)
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
                ?.replace(R.id.flMain, NewWordsSpainFragment())
                ?.commit()
        }


        binding.ivKitchenSpain.setOnClickListener {
            val spain : String = binding.kitchenSpain.text.toString()
            val translate : String = binding.tvKitchenSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSpoonSpain.setOnClickListener {
            val spain : String = binding.spoonSpain.text.toString()
            val translate : String = binding.tvSpoonSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivForkSpain.setOnClickListener {
            val spain : String = binding.forkSpain.text.toString()
            val translate : String = binding.tvForkSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivKnifeSpain.setOnClickListener {
            val spain : String = binding.knifeSpain.text.toString()
            val translate : String = binding.tvKnifeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivTableSpain.setOnClickListener {
            val spain : String = binding.tableSpain.text.toString()
            val translate : String = binding.tvTableSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivChairSpain.setOnClickListener {
            val spain : String = binding.chairSpain.text.toString()
            val translate : String = binding.tvChairSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivKithenstoveSpain.setOnClickListener {
            val spain : String = binding.kithenstoveSpain.text.toString()
            val translate : String = binding.tvKithenstoveSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSinkSpain.setOnClickListener {
            val spain : String = binding.sinkSpain.text.toString()
            val translate : String = binding.tvSinkSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBreadboxSpain.setOnClickListener {
            val spain : String = binding.breadboxSpain.text.toString()
            val translate : String = binding.tvBreadboxSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHodgepodgeSpain.setOnClickListener {
            val spain : String = binding.hodgepodgeSpain.text.toString()
            val translate : String = binding.tvHodgepodgeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivRefrigeratorSpain.setOnClickListener {
            val spain : String = binding.refrigeratorSpain.text.toString()
            val translate : String = binding.tvRefrigeratorSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivPlateSpain.setOnClickListener {
            val spain : String = binding.plateSpain.text.toString()
            val translate : String = binding.tvPlateSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivCupSpain.setOnClickListener {
            val spain : String = binding.cupSpain.text.toString()
            val translate : String = binding.tvCupSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSaucerSpain.setOnClickListener {
            val spain : String = binding.saucerSpain.text.toString()
            val translate : String = binding.tvSaucerSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivKithencupboardSpain.setOnClickListener {
            val spain : String = binding.kithencupboardSpain.text.toString()
            val translate : String = binding.tvKithencupboardSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFoodprocessorSpain.setOnClickListener {
            val spain : String = binding.foodprocessorSpain.text.toString()
            val translate : String = binding.tvFoodprocessorSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBinSpain.setOnClickListener {
            val spain : String = binding.binSpain.text.toString()
            val translate : String = binding.tvBinSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHoodSpain.setOnClickListener {
            val spain : String = binding.hoodSpain.text.toString()
            val translate : String = binding.tvHoodSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivOvenSpain.setOnClickListener {
            val spain : String = binding.ovenSpain.text.toString()
            val translate : String = binding.tvOvenSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBurnerSpain.setOnClickListener {
            val spain : String = binding.burnerSpain.text.toString()
            val translate : String = binding.tvBurnerSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivPanSpain.setOnClickListener {
            val spain : String = binding.panSpain.text.toString()
            val translate : String = binding.tvPanSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFryingpanSpain.setOnClickListener {
            val spain : String = binding.fryingpanSpain.text.toString()
            val translate : String = binding.tvFryingpanSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivCuttingboardSpain.setOnClickListener {
            val spain : String = binding.cuttingboardSpain.text.toString()
            val translate : String = binding.tvCuttingboardSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBottleopenerSpain.setOnClickListener {
            val spain : String = binding.bottleopenerSpain.text.toString()
            val translate : String = binding.tvBottleopenerSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivCorkscrewSpain.setOnClickListener {
            val spain : String = binding.corkscrewSpain.text.toString()
            val translate : String = binding.tvCorkscrewSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivGraterSpain.setOnClickListener {
            val spain : String = binding.graterSpain.text.toString()
            val translate : String = binding.tvGraterSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivJuicerSpain.setOnClickListener {
            val spain : String = binding.juicerSpain.text.toString()
            val translate : String = binding.tvJuicerSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBowlSpain.setOnClickListener {
            val spain : String = binding.bowlSpain.text.toString()
            val translate : String = binding.tvBowlSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivJarSpain.setOnClickListener {
            val spain : String = binding.jarSpain.text.toString()
            val translate : String = binding.tvJarSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivJugSpain.setOnClickListener {
            val spain : String = binding.jugSpain.text.toString()
            val translate : String = binding.tvJugSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivShugarbowlSpain.setOnClickListener {
            val spain : String = binding.shugarbowlSpain.text.toString()
            val translate : String = binding.tvShugarbowlSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivTraySpain.setOnClickListener {
            val spain : String = binding.traySpain.text.toString()
            val translate : String = binding.tvTraySpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivTablewareSpain.setOnClickListener {
            val spain : String = binding.tablewareSpain.text.toString()
            val translate : String = binding.tvTablewareSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
    }
}