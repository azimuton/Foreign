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
import com.azimuton.foreign.databinding.FragmentWeatherBinding
import com.azimuton.foreign.viewmodels.english.NewWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class WeatherFragment : Fragment() {
    private lateinit var binding : FragmentWeatherBinding
    private val viewModel: NewWordsViewModel by activityViewModels()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var cor : Job? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWeatherBinding.inflate(inflater, container, false)
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

        binding.ivWeather.setOnClickListener {
            val english : String = binding.weather.text.toString()
            val translate : String = binding.tvWeather.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWinter.setOnClickListener {
            val english : String = binding.winter.text.toString()
            val translate : String = binding.tvWinter.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivAutumn.setOnClickListener {
            val english : String = binding.autumn.text.toString()
            val translate : String = binding.tvAutumn.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSummer.setOnClickListener {
            val english : String = binding.summer.text.toString()
            val translate : String = binding.tvSummer.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSpring.setOnClickListener {
            val english : String = binding.spring.text.toString()
            val translate : String = binding.tvSpring.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWind.setOnClickListener {
            val english : String = binding.wind.text.toString()
            val translate : String = binding.tvWind.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHurricane.setOnClickListener {
            val english : String = binding.hurricane.text.toString()
            val translate : String = binding.tvHurricane.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivStorms.setOnClickListener {
            val english : String = binding.storms.text.toString()
            val translate : String = binding.tvStorms.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSnowstorm.setOnClickListener {
            val english : String = binding.snowstorm.text.toString()
            val translate : String = binding.tvSnowstorm.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivBlizzard.setOnClickListener {
            val english : String = binding.blizzard.text.toString()
            val translate : String = binding.tvBlizzard.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSnow.setOnClickListener {
            val english : String = binding.snow.text.toString()
            val translate : String = binding.tvSnow.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivIces.setOnClickListener {
            val english : String = binding.ices.text.toString()
            val translate : String = binding.tvIces.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRain.setOnClickListener {
            val english : String = binding.rain.text.toString()
            val translate : String = binding.tvRain.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFog.setOnClickListener {
            val english : String = binding.fog.text.toString()
            val translate : String = binding.tvFog.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPrecipitation.setOnClickListener {
            val english : String = binding.precipitation.text.toString()
            val translate : String = binding.tvPrecipitation.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDrizzle.setOnClickListener {
            val english : String = binding.drizzle.text.toString()
            val translate : String = binding.tvDrizzle.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFreezing.setOnClickListener {
            val english : String = binding.freezing.text.toString()
            val translate : String = binding.tvFreezing.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSun.setOnClickListener {
            val english : String = binding.sun.text.toString()
            val translate : String = binding.tvSun.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSky.setOnClickListener {
            val english : String = binding.sky.text.toString()
            val translate : String = binding.tvSky.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivClouds.setOnClickListener {
            val english : String = binding.clouds.text.toString()
            val translate : String = binding.tvClouds.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCloud.setOnClickListener {
            val english : String = binding.cloud.text.toString()
            val translate : String = binding.tvCloud.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivStorms.setOnClickListener {
            val english : String = binding.storms.text.toString()
            val translate : String = binding.tvStorms.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivClear.setOnClickListener {
            val english : String = binding.clear.text.toString()
            val translate : String = binding.tvClear.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivMainlycloudy.setOnClickListener {
            val english : String = binding.mainlycloudy.text.toString()
            val translate : String = binding.tvMainlycloudy.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFrost.setOnClickListener {
            val english : String = binding.frost.text.toString()
            val translate : String = binding.tvFrost.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivIce.setOnClickListener {
            val english : String = binding.ice.text.toString()
            val translate : String = binding.tvIce.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWarm.setOnClickListener {
            val english : String = binding.warm.text.toString()
            val translate : String = binding.tvWarm.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivCold.setOnClickListener {
            val english : String = binding.cold.text.toString()
            val translate : String = binding.tvCold.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTemperature.setOnClickListener {
            val english : String = binding.temperature.text.toString()
            val translate : String = binding.tvTemperature.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivWeatherforecast.setOnClickListener {
            val english : String = binding.weatherforecast.text.toString()
            val translate : String = binding.tvWeatherforecast.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDegree.setOnClickListener {
            val english : String = binding.degree.text.toString()
            val translate : String = binding.tvDegree.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDry.setOnClickListener {
            val english : String = binding.dry.text.toString()
            val translate : String = binding.tvDry.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFreshness.setOnClickListener {
            val english : String = binding.freshness.text.toString()
            val translate : String = binding.tvFreshness.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHeat.setOnClickListener {
            val english : String = binding.heat.text.toString()
            val translate : String = binding.tvHeat.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHumidity.setOnClickListener {
            val english : String = binding.humidity.text.toString()
            val translate : String = binding.tvHumidity.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivGustwind.setOnClickListener {
            val english : String = binding.gustwind.text.toString()
            val translate : String = binding.tvGustwind.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSquall.setOnClickListener {
            val english : String = binding.squall.text.toString()
            val translate : String = binding.tvSquall.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTornado.setOnClickListener {
            val english : String = binding.tornado.text.toString()
            val translate : String = binding.tvTornado.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivVisibility.setOnClickListener {
            val english : String = binding.visibility.text.toString()
            val translate : String = binding.tvVisibility.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivLightning.setOnClickListener {
            val english : String = binding.lightning.text.toString()
            val translate : String =binding.tvLightning.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivThunder.setOnClickListener {
            val english : String = binding.thunder.text.toString()
            val translate : String = binding.tvThunder.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivThunderstorm.setOnClickListener {
            val english : String = binding.thunderstorm.text.toString()
            val translate : String = binding.tvThunderstorm.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDew.setOnClickListener {
            val english : String = binding.dew.text.toString()
            val translate : String = binding.tvDew.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHail.setOnClickListener {
            val english : String = binding.hail.text.toString()
            val translate : String = binding.tvHail.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDampness.setOnClickListener {
            val english : String = binding.dampness.text.toString()
            val translate : String = binding.tvDampness.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivHaze.setOnClickListener {
            val english : String = binding.haze.text.toString()
            val translate : String = binding.tvHaze.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivShower.setOnClickListener {
            val english : String = binding.shower.text.toString()
            val translate : String = binding.tvShower.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSnowdrift.setOnClickListener {
            val english : String = binding.snowdrift.text.toString()
            val translate : String = binding.tvSnowdrift.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
           viewModel.insert(word)
            toast()
        }
        binding.ivSnowflake.setOnClickListener {
            val english : String = binding.snowflake.text.toString()
            val translate : String = binding.tvSnowflake.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDirt.setOnClickListener {
            val english : String = binding.dirt.text.toString()
            val translate : String = binding.tvDirt.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivRainbow.setOnClickListener {
            val english : String = binding.rainbow.text.toString()
            val translate : String = binding.tvRainbow.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivFlood.setOnClickListener {
            val english : String = binding.flood.text.toString()
            val translate : String = binding.tvFlood.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivTsunami.setOnClickListener {
            val english : String = binding.tsunami.text.toString()
            val translate : String = binding.tvTsunami.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDrought.setOnClickListener {
            val english : String = binding.drought.text.toString()
            val translate : String = binding.tvDrought.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivIcicle.setOnClickListener {
            val english : String = binding.icicle.text.toString()
            val translate : String = binding.tvIcicle.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivPaddle.setOnClickListener {
            val english : String = binding.paddle.text.toString()
            val translate : String = binding.tvPaddle.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivDark.setOnClickListener {
            val english : String = binding.dark.text.toString()
            val translate : String = binding.tvDark.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSunrise.setOnClickListener {
            val english : String = binding.sunrise.text.toString()
            val translate : String = binding.tvSunrise.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivSunset.setOnClickListener {
            val english : String = binding.sunset.text.toString()
            val translate : String = binding.tvSunset.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            toast()
        }
        binding.ivThaw.setOnClickListener {
            val english : String = binding.thaw.text.toString()
            val translate : String = binding.tvThaw.text.toString()
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