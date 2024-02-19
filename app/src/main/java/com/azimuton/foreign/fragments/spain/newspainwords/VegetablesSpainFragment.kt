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
import com.azimuton.foreign.databinding.FragmentTransportSpainBinding
import com.azimuton.foreign.databinding.FragmentVegetablesSpainBinding
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
class VegetablesSpainFragment : Fragment() {
    private lateinit var binding : FragmentVegetablesSpainBinding
    private val viewModel: NewSpainWordsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentVegetablesSpainBinding.inflate(inflater, container, false)
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

        binding.ivTomatoSpain.setOnClickListener {
            val spain : String = binding.tomatoSpain.text.toString()
            val translate : String = binding.tvTomatoSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCucumberSpain.setOnClickListener {
            val spain : String = binding.cucumberSpain.text.toString()
            val translate : String = binding.tvCucumberSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCabbageSpain.setOnClickListener {
            val spain : String = binding.cabbageSpain.text.toString()
            val translate : String = binding.tvCabbageSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivVegetablemarrowSpain.setOnClickListener {
            val spain : String = binding.vegetablemarrowSpain.text.toString()
            val translate : String = binding.tvVegetablemarrowSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivEggplantSpain.setOnClickListener {
            val spain : String = binding.eggplantSpain.text.toString()
            val translate : String = binding.tvEggplantSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCarrotSpain.setOnClickListener {
            val spain : String = binding.carrotSpain.text.toString()
            val translate : String = binding.tvCarrotSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBeetSpain.setOnClickListener {
            val spain : String = binding.beetSpain.text.toString()
            val translate : String = binding.tvBeetSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPotatoSpain.setOnClickListener {
            val spain : String = binding.potatoSpain.text.toString()
            val translate : String = binding.tvPotatoSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRadishSpain.setOnClickListener {
            val spain : String = binding.radishSpain.text.toString()
            val translate : String = binding.tvRadishSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPepperSpain.setOnClickListener {
            val spain : String = binding.pepperSpain.text.toString()
            val translate : String = binding.tvPepperSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivOnionSpain.setOnClickListener {
            val spain : String = binding.onionSpain.text.toString()
            val translate : String = binding.tvOnionSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGarlicSpain.setOnClickListener {
            val spain : String = binding.garlicSpain.text.toString()
            val translate : String = binding.tvGarlicSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPeasSpain.setOnClickListener {
            val spain : String = binding.peasSpain.text.toString()
            val translate : String = binding.tvPeasSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTurnipSpain.setOnClickListener {
            val spain : String = binding.turnipSpain.text.toString()
            val translate : String = binding.tvTurnipSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGingerSpain.setOnClickListener {
            val spain : String = binding.gingerSpain.text.toString()
            val translate : String = binding.tvGingerSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivJerusalemartichokSpain.setOnClickListener {
            val spain : String = binding.jerusalemartichokeSpain.text.toString()
            val translate : String = binding.tvJerusalemartichokSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBeansSpain.setOnClickListener {
            val spain : String = binding.beansSpain.text.toString()
            val translate : String = binding.tvBeansSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivAsparagusSpain.setOnClickListener {
            val spain : String = binding.asparagusSpain.text.toString()
            val translate : String = binding.tvAsparagusSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHorseradishSpain.setOnClickListener {
            val spain : String = binding.horseradishSpain.text.toString()
            val translate : String = binding.tvHorseradishSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivParsnipSpain.setOnClickListener {
            val spain : String = binding.parsnipSpain.text.toString()
            val translate : String = binding.tvParsnipSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSquashSpain.setOnClickListener {
            val spain : String = binding.squashSpain.text.toString()
            val translate : String = binding.tvSquashSpain.text.toString()
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