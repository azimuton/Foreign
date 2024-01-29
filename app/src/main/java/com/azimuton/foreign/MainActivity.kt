package com.azimuton.foreign

import android.animation.ObjectAnimator
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.view.Window
import androidx.annotation.RequiresApi
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.azimuton.foreign.databinding.ActivityMainBinding
import com.azimuton.foreign.fragments.english.FrasalsFragment
import com.azimuton.foreign.fragments.english.LearnFragment
import com.azimuton.foreign.fragments.english.LearnedFragment
import com.azimuton.foreign.fragments.english.NewWordsFragment
import com.azimuton.foreign.fragments.english.NewsFragment
import com.azimuton.foreign.fragments.english.TranslaterFragment
import com.azimuton.foreign.fragments.english.WriteFragment
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.Locale
import java.util.logging.Handler

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val coroutineScope = CoroutineScope(Dispatchers.Main + Job())
    private var coroutine : Job? = null
    private var learncor : Job? = null
    private var learnedcor : Job? = null
    private var writecor : Job? = null
    private var translatecor : Job? = null
    private var newscor : Job? = null
    private var newwordscor : Job? = null
    private var frasalscor : Job? = null
    private var seconds = 0
    private var running = false
    private var openmainmenu = false
    private var openmainenglishmenu = false
    private var openmainfrenchmenu = false
    private var openmainspanishmenu = false
    private var openmaingermanmenu = false
    private var openmainitalianmenu = false
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
        Glide.with(this).asGif().load(R.drawable.flagfrance).into(binding.ivMainFrenchMenu)
        Glide.with(this).asGif().load(R.drawable.flagspain).into(binding.ivMainSpanishMenu)
        Glide.with(this).asGif().load(R.drawable.flaggermany).into(binding.ivMainGermanMenu)
        Glide.with(this).asGif().load(R.drawable.flagitaly).into(binding.ivMainItalianMenu)
        binding.ivMainMenu.setOnClickListener {
            if (openmainmenu) {
                val dpValue = 150
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
                ObjectAnimator.ofFloat(binding.svMain, "translationX", -pxValue).apply{
                    duration = 1000
                    start()
                }
                openmainmenu = false
            } else {
                val dpValue = 150
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
                ObjectAnimator.ofFloat(binding.svMain, "translationX", pxValue).apply{
                    duration = 1000
                    start()
                }
                openmainmenu = true
            }
        }
        binding.tvMainClose.setOnClickListener { finishAffinity() }
        binding.ivMainEnglishMenu.setOnClickListener {
            if (openmainenglishmenu) {
                val dpValue = 145
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
                ObjectAnimator.ofFloat(binding.svEnglish, "translationX", pxValue).apply{
                    duration = 1000
                    start()
                }
                openmainenglishmenu = false
            } else {
                val dpValue = 145
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
                ObjectAnimator.ofFloat(binding.svEnglish, "translationX", -pxValue).apply{
                    duration = 1000
                    start()
                }
                openmainenglishmenu = true
            }
        }
        binding.ivMainFrenchMenu.setOnClickListener {
            if (openmainfrenchmenu) {
                val dpValue = 145
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
                ObjectAnimator.ofFloat(binding.svFrench, "translationX", pxValue).apply{
                    duration = 1000
                    start()
                }
                openmainfrenchmenu = false
            } else {
                val dpValue = 145
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
                ObjectAnimator.ofFloat(binding.svFrench, "translationX", -pxValue).apply{
                    duration = 1000
                    start()
                }
                openmainfrenchmenu = true
            }
        }
        binding.ivMainSpanishMenu.setOnClickListener {
            if (openmainspanishmenu) {
                val dpValue = 145
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
                ObjectAnimator.ofFloat(binding.svSpanish, "translationX", pxValue).apply{
                    duration = 1000
                    start()
                }
                openmainspanishmenu = false
            } else {
                val dpValue = 145
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
                ObjectAnimator.ofFloat(binding.svSpanish, "translationX", -pxValue).apply{
                    duration = 1000
                    start()
                }
                openmainspanishmenu = true
            }
        }
        binding.ivMainGermanMenu.setOnClickListener {
            if (openmaingermanmenu) {
                val dpValue = 145
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
                ObjectAnimator.ofFloat(binding.svGerman, "translationX", pxValue).apply{
                    duration = 1000
                    start()
                }
                openmaingermanmenu = false
            } else {
                val dpValue = 145
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
                ObjectAnimator.ofFloat(binding.svGerman, "translationX", -pxValue).apply{
                    duration = 1000
                    start()
                }
                openmaingermanmenu = true
            }
        }
        binding.ivMainItalianMenu.setOnClickListener {
            if (openmainitalianmenu) {
                val dpValue = 145
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
                ObjectAnimator.ofFloat(binding.svItalian, "translationX", pxValue).apply{
                    duration = 1000
                    start()
                }
                openmainitalianmenu = false
            } else {
                val dpValue = 145
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
                ObjectAnimator.ofFloat(binding.svItalian, "translationX", -pxValue).apply{
                    duration = 1000
                    start()
                }
                openmainitalianmenu = true
            }
        }

        binding.ivFlagEngland.setOnClickListener {
            val dpValue = 150
            val pxValue = TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
            ObjectAnimator.ofFloat(binding.svMain, "translationX", -pxValue).apply{
                duration = 1000
                start()
            }
            openmainmenu = false

            binding.svEnglish.visibility = View.VISIBLE
            binding.svFrench.visibility = View.GONE
            binding.svSpanish.visibility = View.GONE
            binding.svGerman.visibility = View.GONE
            binding.svItalian.visibility = View.GONE
            binding.ivMainEnglishMenu.visibility = View.VISIBLE
            binding.ivMainFrenchMenu.visibility = View.GONE
            binding.ivMainSpanishMenu.visibility = View.GONE
            binding.ivMainGermanMenu.visibility = View.GONE
            binding.ivMainItalianMenu.visibility = View.GONE
        }
        binding.ivFlagFrance.setOnClickListener {
            val dpValue = 150
            val pxValue = TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
            ObjectAnimator.ofFloat(binding.svMain, "translationX", -pxValue).apply{
                duration = 1000
                start()
            }
            openmainmenu = false
            binding.svFrench.visibility = View.VISIBLE
            binding.svEnglish.visibility = View.GONE
            binding.svSpanish.visibility = View.GONE
            binding.svGerman.visibility = View.GONE
            binding.svItalian.visibility = View.GONE
            binding.ivMainFrenchMenu.visibility = View.VISIBLE
            binding.ivMainEnglishMenu.visibility = View.GONE
            binding.ivMainSpanishMenu.visibility = View.GONE
            binding.ivMainGermanMenu.visibility = View.GONE
            binding.ivMainItalianMenu.visibility = View.GONE
        }
        binding.ivFlagSpain.setOnClickListener {
            val dpValue = 150
            val pxValue = TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
            ObjectAnimator.ofFloat(binding.svMain, "translationX", -pxValue).apply{
                duration = 1000
                start()
            }
            openmainmenu = false
            binding.svEnglish.visibility = View.GONE
            binding.svFrench.visibility = View.GONE
            binding.svSpanish.visibility = View.VISIBLE
            binding.svGerman.visibility = View.GONE
            binding.svItalian.visibility = View.GONE
            binding.ivMainEnglishMenu.visibility = View.GONE
            binding.ivMainFrenchMenu.visibility = View.GONE
            binding.ivMainSpanishMenu.visibility = View.VISIBLE
            binding.ivMainGermanMenu.visibility = View.GONE
            binding.ivMainItalianMenu.visibility = View.GONE
        }
        binding.ivFlagGermany.setOnClickListener {
            val dpValue = 150
            val pxValue = TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
            ObjectAnimator.ofFloat(binding.svMain, "translationX", -pxValue).apply{
                duration = 1000
                start()
            }
            openmainmenu = false
            binding.svEnglish.visibility = View.GONE
            binding.svFrench.visibility = View.GONE
            binding.svSpanish.visibility = View.GONE
            binding.svGerman.visibility = View.VISIBLE
            binding.svItalian.visibility = View.GONE
            binding.ivMainEnglishMenu.visibility = View.GONE
            binding.ivMainFrenchMenu.visibility = View.GONE
            binding.ivMainSpanishMenu.visibility = View.GONE
            binding.ivMainGermanMenu.visibility = View.VISIBLE
            binding.ivMainItalianMenu.visibility = View.GONE
        }
        binding.ivFlagItaly.setOnClickListener {
            val dpValue = 150
            val pxValue = TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
            ObjectAnimator.ofFloat(binding.svMain, "translationX", -pxValue).apply{
                duration = 1000
                start()
            }
            openmainmenu = false
            binding.svEnglish.visibility = View.GONE
            binding.svFrench.visibility = View.GONE
            binding.svSpanish.visibility = View.GONE
            binding.svGerman.visibility = View.GONE
            binding.svItalian.visibility = View.VISIBLE
            binding.ivMainEnglishMenu.visibility = View.GONE
            binding.ivMainFrenchMenu.visibility = View.GONE
            binding.ivMainSpanishMenu.visibility = View.GONE
            binding.ivMainGermanMenu.visibility = View.GONE
            binding.ivMainItalianMenu.visibility = View.VISIBLE
        }

        binding.ivLearnNewWordsEnglish.setOnClickListener {
           learncor = coroutineScope.launch {
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, LearnFragment())
                    .commit()
                val dpValue = 145
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
                ObjectAnimator.ofFloat(binding.svEnglish, "translationX", pxValue).apply {
                    duration = 1000
                    start()
                }
                openmainenglishmenu = false
               learncor?.cancel()
            }
        }
        binding.ivLearnedWordsEnglish.setOnClickListener {
           learnedcor = coroutineScope.launch {
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, LearnedFragment())
                    .commit()
                val dpValue = 145
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
                ObjectAnimator.ofFloat(binding.svEnglish, "translationX", pxValue).apply {
                    duration = 1000
                    start()
                }
                openmainenglishmenu = false
               learnedcor?.cancel()
            }
        }
        binding.ivWriteWordsEnglish.setOnClickListener {
           writecor = coroutineScope.launch {
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, WriteFragment())
                    .commit()
                val dpValue = 145
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
                ObjectAnimator.ofFloat(binding.svEnglish, "translationX", pxValue).apply {
                    duration = 1000
                    start()
                }
                openmainenglishmenu = false
               writecor?.cancel()
            }
        }
        binding.ivTranslateWordsEnglish.setOnClickListener {
            translatecor = coroutineScope.launch {
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, TranslaterFragment())
                    .commit()
                val dpValue = 145
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
                ObjectAnimator.ofFloat(binding.svEnglish, "translationX", pxValue).apply {
                    duration = 1000
                    start()
                }
                openmainenglishmenu = false
                translatecor?.cancel()
            }
        }
        binding.ivReadNewsEnglish.setOnClickListener {
            newscor = coroutineScope.launch {
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, NewsFragment())
                    .commit()
                val dpValue = 145
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
                ObjectAnimator.ofFloat(binding.svEnglish, "translationX", pxValue).apply {
                    duration = 1000
                    start()
                }
                openmainenglishmenu = false
                newscor?.cancel()
            }
        }
        binding.ivNewWordsEnglish.setOnClickListener {
            newwordscor = coroutineScope.launch {
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, NewWordsFragment())
                    .commit()
                val dpValue = 145
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
                ObjectAnimator.ofFloat(binding.svEnglish, "translationX", pxValue).apply {
                    duration = 1000
                    start()
                }
                openmainenglishmenu = false
                newwordscor?.cancel()
            }
        }
        binding.ivFrasalsEnglish.setOnClickListener {
            frasalscor = coroutineScope.launch {
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, FrasalsFragment())
                    .commit()
                val dpValue = 145
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
                ObjectAnimator.ofFloat(binding.svEnglish, "translationX", pxValue).apply {
                    duration = 1000
                    start()
                }
                openmainenglishmenu = false
                frasalscor?.cancel()
            }
        }
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
    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }
    private fun hideSystemUI () {
        val window : Window? = window
        if (window != null) {
            WindowCompat.setDecorFitsSystemWindows(window, false)
        }
        if (window != null) {
                WindowInsetsControllerCompat (window, window.decorView).let { controller ->
                    controller.hide (WindowInsetsCompat.Type.systemBars ())
                    controller.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
                }
        }
    }
    override fun onResume() {
        super.onResume()
        hideSystemUI()
    }
}