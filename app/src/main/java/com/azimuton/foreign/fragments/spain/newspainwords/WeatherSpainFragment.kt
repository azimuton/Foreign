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
import com.azimuton.foreign.databinding.FragmentWashRoomSpainBinding
import com.azimuton.foreign.databinding.FragmentWeatherSpainBinding
import com.azimuton.foreign.fragments.english.NewWordsFragment
import com.azimuton.foreign.fragments.spain.NewWordsSpainFragment
import com.azimuton.foreign.viewmodels.spain.NewSpainWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WeatherSpainFragment : Fragment() {
    private lateinit var binding : FragmentWeatherSpainBinding
    private val viewModel: NewSpainWordsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWeatherSpainBinding.inflate(inflater, container, false)
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

        binding.ivWeatherSpain.setOnClickListener {
            val spain : String = binding.weatherSpain.text.toString()
            val translate : String = binding.tvWeatherSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivWinterSpain.setOnClickListener {
            val spain : String = binding.winterSpain.text.toString()
            val translate : String = binding.tvWinterSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivAutumnSpain.setOnClickListener {
            val spain : String = binding.autumnSpain.text.toString()
            val translate : String = binding.tvAutumnSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSummerSpain.setOnClickListener {
            val spain : String = binding.summerSpain.text.toString()
            val translate : String = binding.tvSummerSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSpringSpain.setOnClickListener {
            val spain : String = binding.springSpain.text.toString()
            val translate : String = binding.tvSpringSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivWindSpain.setOnClickListener {
            val spain : String = binding.windSpain.text.toString()
            val translate : String = binding.tvWindSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHurricaneSpain.setOnClickListener {
            val spain : String = binding.hurricaneSpain.text.toString()
            val translate : String = binding.tvHurricaneSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivStormsSpain.setOnClickListener {
            val spain : String = binding.stormsSpain.text.toString()
            val translate : String = binding.tvStormsSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSnowstormSpain.setOnClickListener {
            val spain : String = binding.snowstormSpain.text.toString()
            val translate : String = binding.tvSnowstormSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBlizzardSpain.setOnClickListener {
            val spain : String = binding.blizzardSpain.text.toString()
            val translate : String = binding.tvBlizzardSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSnowSpain.setOnClickListener {
            val spain : String = binding.snowSpain.text.toString()
            val translate : String = binding.tvSnowSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivIcesSpain.setOnClickListener {
            val spain : String = binding.icesSpain.text.toString()
            val translate : String = binding.tvIcesSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivRainSpain.setOnClickListener {
            val spain : String = binding.rainSpain.text.toString()
            val translate : String = binding.tvRainSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFogSpain.setOnClickListener {
            val spain : String = binding.fogSpain.text.toString()
            val translate : String = binding.tvFogSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivPrecipitationSpain.setOnClickListener {
            val spain : String = binding.precipitationSpain.text.toString()
            val translate : String = binding.tvPrecipitationSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDrizzleSpain.setOnClickListener {
            val spain : String = binding.drizzleSpain.text.toString()
            val translate : String = binding.tvDrizzleSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFreezingSpain.setOnClickListener {
            val spain : String = binding.freezingSpain.text.toString()
            val translate : String = binding.tvFreezingSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSunSpain.setOnClickListener {
            val spain : String = binding.sunSpain.text.toString()
            val translate : String = binding.tvSunSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSkySpain.setOnClickListener {
            val spain : String = binding.skySpain.text.toString()
            val translate : String = binding.tvSkySpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivCloudsSpain.setOnClickListener {
            val spain : String = binding.cloudsSpain.text.toString()
            val translate : String = binding.tvCloudsSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivCloudSpain.setOnClickListener {
            val spain : String = binding.cloudSpain.text.toString()
            val translate : String = binding.tvCloudSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivStormsSpain.setOnClickListener {
            val spain : String = binding.stormsSpain.text.toString()
            val translate : String = binding.tvStormsSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivClearSpain.setOnClickListener {
            val spain : String = binding.clearSpain.text.toString()
            val translate : String = binding.tvClearSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivMainlycloudySpain.setOnClickListener {
            val spain : String = binding.mainlycloudySpain.text.toString()
            val translate : String = binding.tvMainlycloudySpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFrostSpain.setOnClickListener {
            val spain : String = binding.frostSpain.text.toString()
            val translate : String = binding.tvFrostSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivIceSpain.setOnClickListener {
            val spain : String = binding.iceSpain.text.toString()
            val translate : String = binding.tvIceSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivWarmSpain.setOnClickListener {
            val spain : String = binding.warmSpain.text.toString()
            val translate : String = binding.tvWarmSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivColdSpain.setOnClickListener {
            val spain : String = binding.coldSpain.text.toString()
            val translate : String = binding.tvColdSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivTemperatureSpain.setOnClickListener {
            val spain : String = binding.temperatureSpain.text.toString()
            val translate : String = binding.tvTemperatureSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivWeatherforecastSpain.setOnClickListener {
            val spain : String = binding.weatherforecastSpain.text.toString()
            val translate : String = binding.tvWeatherforecastSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDegreeSpain.setOnClickListener {
            val spain : String = binding.degreeSpain.text.toString()
            val translate : String = binding.tvDegreeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDrySpain.setOnClickListener {
            val spain : String = binding.drySpain.text.toString()
            val translate : String = binding.tvDrySpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFreshnessSpain.setOnClickListener {
            val spain : String = binding.freshnessSpain.text.toString()
            val translate : String = binding.tvFreshnessSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHeatSpain.setOnClickListener {
            val spain : String = binding.heatSpain.text.toString()
            val translate : String = binding.tvHeatSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHumiditySpain.setOnClickListener {
            val spain : String = binding.humiditySpain.text.toString()
            val translate : String = binding.tvHumiditySpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivGustwindSpain.setOnClickListener {
            val spain : String = binding.gustwindSpain.text.toString()
            val translate : String = binding.tvGustwindSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSquallSpain.setOnClickListener {
            val spain : String = binding.squallSpain.text.toString()
            val translate : String = binding.tvSquallSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivTornadoSpain.setOnClickListener {
            val spain : String = binding.tornadoSpain.text.toString()
            val translate : String = binding.tvTornadoSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivVisibilitySpain.setOnClickListener {
            val spain : String = binding.visibilitySpain.text.toString()
            val translate : String = binding.tvVisibilitySpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivLightningSpain.setOnClickListener {
            val spain : String = binding.lightningSpain.text.toString()
            val translate : String =binding.tvLightningSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivThunderSpain.setOnClickListener {
            val spain : String = binding.thunderSpain.text.toString()
            val translate : String = binding.tvThunderSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivThunderstormSpain.setOnClickListener {
            val spain : String = binding.thunderstormSpain.text.toString()
            val translate : String = binding.tvThunderstormSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDewSpain.setOnClickListener {
            val spain : String = binding.dewSpain.text.toString()
            val translate : String = binding.tvDewSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHailSpain.setOnClickListener {
            val spain : String = binding.hailSpain.text.toString()
            val translate : String = binding.tvHailSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDampnessSpain.setOnClickListener {
            val spain : String = binding.dampnessSpain.text.toString()
            val translate : String = binding.tvDampnessSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHazeSpain.setOnClickListener {
            val spain : String = binding.hazeSpain.text.toString()
            val translate : String = binding.tvHazeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivShowerSpain.setOnClickListener {
            val spain : String = binding.showerSpain.text.toString()
            val translate : String = binding.tvShowerSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSnowdriftSpain.setOnClickListener {
            val spain : String = binding.snowdriftSpain.text.toString()
            val translate : String = binding.tvSnowdriftSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSnowflakeSpain.setOnClickListener {
            val spain : String = binding.snowflakeSpain.text.toString()
            val translate : String = binding.tvSnowflakeSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDirtSpain.setOnClickListener {
            val spain : String = binding.dirtSpain.text.toString()
            val translate : String = binding.tvDirtSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivRainbowSpain.setOnClickListener {
            val spain : String = binding.rainbowSpain.text.toString()
            val translate : String = binding.tvRainbowSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFloodSpain.setOnClickListener {
            val spain : String = binding.floodSpain.text.toString()
            val translate : String = binding.tvFloodSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivTsunamiSpain.setOnClickListener {
            val spain : String = binding.tsunamiSpain.text.toString()
            val translate : String = binding.tvTsunamiSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDroughtSpain.setOnClickListener {
            val spain : String = binding.droughtSpain.text.toString()
            val translate : String = binding.tvDroughtSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivIcicleSpain.setOnClickListener {
            val spain : String = binding.icicleSpain.text.toString()
            val translate : String = binding.tvIcicleSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivPaddleSpain.setOnClickListener {
            val spain : String = binding.paddleSpain.text.toString()
            val translate : String = binding.tvPaddleSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDarkSpain.setOnClickListener {
            val spain : String = binding.darkSpain.text.toString()
            val translate : String = binding.tvDarkSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSunriseSpain.setOnClickListener {
            val spain : String = binding.sunriseSpain.text.toString()
            val translate : String = binding.tvSunriseSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSunsetSpain.setOnClickListener {
            val spain : String = binding.sunsetSpain.text.toString()
            val translate : String = binding.tvSunsetSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
        binding.ivThawSpain.setOnClickListener {
            val spain : String = binding.thawSpain.text.toString()
            val translate : String = binding.tvThawSpain.text.toString()
            val word = WordSpain(spainWord = spain, translateSpainWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Record copied!", Toast.LENGTH_SHORT).show()
        }
    }
}