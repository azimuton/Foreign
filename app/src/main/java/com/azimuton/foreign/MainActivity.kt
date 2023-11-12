package com.azimuton.foreign

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import com.azimuton.foreign.databinding.ActivityMainBinding
import com.bumptech.glide.Glide
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.Locale
import java.util.logging.Handler

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var coroutine : Job? = null
    private var seconds = 0
    private var running = false
    private var openmainmenu = false
    private var openmainenglishmenu = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        running = true
        runTimer()
        Glide.with(this).asGif().load(R.drawable.stopwatchs).into(binding.ivTimer)
        Glide.with(this).asGif().load(R.drawable.flagengland).into(binding.ivFlagEngland)
        Glide.with(this).asGif().load(R.drawable.flagfrance).into(binding.ivFlagFrance)
        Glide.with(this).asGif().load(R.drawable.flagspain).into(binding.ivFlagSpain)
        Glide.with(this).asGif().load(R.drawable.flaggermany).into(binding.ivFlagGermany)
        Glide.with(this).asGif().load(R.drawable.flagitaly).into(binding.ivFlagItaly)
        Glide.with(this).asGif().load(R.drawable.flagengland).into(binding.ivMainEnglishMenu)
        binding.ivMainMenu.setOnClickListener {
            if (openmainmenu) {
                val dpValue = 150
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
                ObjectAnimator.ofFloat(binding.llMainMenu, "translationX", -pxValue).apply{
                    duration = 1000
                    start()
                }
                openmainmenu = false
            } else {
                val dpValue = 150
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
                ObjectAnimator.ofFloat(binding.llMainMenu, "translationX", pxValue).apply{
                    duration = 1000
                    start()
                }
                openmainmenu = true
            }
        }
        binding.tvMainClose.setOnClickListener { finishAffinity() }
        binding.ivMainEnglishMenu.setOnClickListener {
            if (openmainenglishmenu) {
                val dpValue = 180
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
                ObjectAnimator.ofFloat(binding.svEnglish, "translationX", pxValue).apply{
                    duration = 1000
                    start()
                }
                openmainenglishmenu = false
            } else {
                val dpValue = 180
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
                ObjectAnimator.ofFloat(binding.svEnglish, "translationX", -pxValue).apply{
                    duration = 1000
                    start()
                }
                openmainenglishmenu = true
            }
        }
        binding.ivFlagEngland.setOnClickListener {  }
        binding.ivFlagFrance.setOnClickListener {  }
        binding.ivFlagSpain.setOnClickListener {  }
        binding.ivFlagGermany.setOnClickListener {  }
        binding.ivFlagItaly.setOnClickListener {  }
    }
    private fun runTimer() {
        coroutine?.cancel()
        coroutine = coroutineScope.launch {
            while (true) {
                val hours = seconds / 3600
                val minutes = seconds % 3600 / 60
                val secs = seconds % 60
                val time = String.format(Locale.getDefault(), "%d:%02d:%02d", hours, minutes, secs)
                runOnUiThread {
                    binding.tvTimer.text = time
                    if (running) {
                        seconds++
                    }
                }
                delay(1000)
            }
        }
    }
}