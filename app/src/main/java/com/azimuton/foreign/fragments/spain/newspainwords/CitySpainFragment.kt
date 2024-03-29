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
import com.azimuton.foreign.databinding.FragmentCityBinding
import com.azimuton.foreign.databinding.FragmentCitySpainBinding
import com.azimuton.foreign.fragments.english.NewWordsFragment
import com.azimuton.foreign.fragments.spain.NewWordsSpainFragment
import com.azimuton.foreign.viewmodels.english.NewWordsViewModel
import com.azimuton.foreign.viewmodels.spain.NewSpainWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class CitySpainFragment : Fragment() {
    private lateinit var binding : FragmentCitySpainBinding
    private val viewModel: NewSpainWordsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCitySpainBinding.inflate(inflater, container, false)
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

        binding.ivCitySpain.setOnClickListener {
            val spain : String = binding.citySpain.text.toString()
            val translate : String = binding.tvCitySpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivStreetSpain.setOnClickListener {
            val spain : String = binding.streetSpain.text.toString()
            val translate : String = binding.tvStreetSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRoadSpain.setOnClickListener {
            val spain : String = binding.roadSpain.text.toString()
            val translate : String = binding.tvRoadSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivOnewaySpain.setOnClickListener {
            val spain : String = binding.onewaySpain.text.toString()
            val translate : String = binding.tvOnewaySpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTrafficSpain.setOnClickListener {
            val spain : String = binding.trafficSpain.text.toString()
            val translate : String = binding.tvTrafficSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBusstopSpain.setOnClickListener {
            val spain : String = binding.busstopSpain.text.toString()
            val translate : String = binding.tvBusstopSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSidewalkSpain.setOnClickListener {
            val spain : String = binding.sidewalkSpain.text.toString()
            val translate : String = binding.tvSidewalkSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBorderSpain.setOnClickListener {
            val spain : String = binding.borderSpain.text.toString()
            val translate : String = binding.tvBorderSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSquareSpain.setOnClickListener {
            val spain : String = binding.squareSpain.text.toString()
            val translate : String = binding.tvSquareSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSubwaySpain.setOnClickListener {
            val spain : String = binding.subwaySpain.text.toString()
            val translate : String = binding.tvSubwaySpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDistrictSpain.setOnClickListener {
            val spain : String = binding.districtSpain.text.toString()
            val translate : String = binding.tvDistrictSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivQuarterSpain.setOnClickListener {
            val spain : String = binding.quarterSpain.text.toString()
            val translate : String = binding.tvQuarterSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPillarSpain.setOnClickListener {
            val spain : String = binding.pillarSpain.text.toString()
            val translate : String = binding.tvPillarSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCemeterySpain.setOnClickListener {
            val spain : String = binding.cemeterySpain.text.toString()
            val translate : String = binding.tvCemeterySpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBroadwaySpain.setOnClickListener {
            val spain : String = binding.broadwaySpain.text.toString()
            val translate : String = binding.tvBroadwaySpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBoulevardSpain.setOnClickListener {
            val spain : String = binding.boulevardSpain.text.toString()
            val translate : String = binding.tvBoulevardSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivAvenueSpain.setOnClickListener {
            val spain : String = binding.avenueSpain.text.toString()
            val translate : String = binding.tvAvenueSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivEmbankmentSpain.setOnClickListener {
            val spain : String = binding.embankmentSpain.text.toString()
            val translate : String = binding.tvEmbankmentSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBridgeSpain.setOnClickListener {
            val spain : String = binding.bridgeSpain.text.toString()
            val translate : String = binding.tvBridgeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLawnSpain.setOnClickListener {
            val spain : String = binding.lawnSpain.text.toString()
            val translate : String = binding.tvLawnSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivParkSpain.setOnClickListener {
            val spain : String = binding.parkSpain.text.toString()
            val translate : String = binding.tvParkSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivUndergroundpassSpain.setOnClickListener {
            val spain : String = binding.undergroundpassSpain.text.toString()
            val translate : String = binding.tvUndergroundpassSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivStoreshopSpain.setOnClickListener {
            val spain : String = binding.storeshopSpain.text.toString()
            val translate : String = binding.tvStoreshopeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivMarketSpain.setOnClickListener {
            val spain : String = binding.marketSpain.text.toString()
            val translate : String = binding.tvMarketSpain.text.toString()
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