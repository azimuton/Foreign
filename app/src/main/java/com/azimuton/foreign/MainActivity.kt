package com.azimuton.foreign

import android.animation.ObjectAnimator
import android.content.SharedPreferences
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
import com.azimuton.foreign.fragments.spain.FrasalsSpainFragment
import com.azimuton.foreign.fragments.spain.LearnSpainFragment
import com.azimuton.foreign.fragments.spain.LearnedSpainFragment
import com.azimuton.foreign.fragments.spain.NewWordsSpainFragment
import com.azimuton.foreign.fragments.spain.NewsSpainFragment
import com.azimuton.foreign.fragments.spain.TranslaterSpainFragment
import com.azimuton.foreign.fragments.spain.WriteSpainFragment
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
    private var learnspaincor : Job? = null
    private var learnedcor : Job? = null
    private var learnedspaincor : Job? = null
    private var writecor : Job? = null
    private var writespaincor : Job? = null
    private var translatecor : Job? = null
    private var translatespaincor : Job? = null
    private var newscor : Job? = null
    private var newsspaincor : Job? = null
    private var newwordscor : Job? = null
    private var newwordsspaincor : Job? = null
    private var frasalscor : Job? = null
    private var frasalsspaincor : Job? = null
    private var seconds = 0
    private var running = false
    private var openmainmenu = false
    private var openmainenglishmenu = false
    private var openmainspainmenu = false
    private var openmainfrenchmenu = false
    private var openmainspanishmenu = false
    private var openmaingermanmenu = false
    private var openmainitalianmenu = false
    private lateinit var sharedPrefs : SharedPreferences
    private var pressEnglish = false
    private var pressFrench = false
    private var pressSpanish = false
    private var pressGermany = false
    private var pressItaly = false

    private var pressEngl = false
    private var pressFren = false
    private var pressSpan = false
    private var pressGerm = false
    private var pressItal = false

    private var enLearn = false
    private var enLearned = false
    private var enWrite = false
    private var enTranslate = false
    private var enChat = false
    private var enNews = false
    private var enNewWords = false
    private var enFrasals = false

    private var spLearn = false
    private var spLearned = false
    private var spWrite = false
    private var spTranslate = false
    private var spChat = false
    private var spNews = false
    private var spNewWords = false
    private var spFrasals = false

    private var engLearn = false
    private var engLearned = false
    private var engWrite = false
    private var engTranslate = false
    private var engChat = false
    private var engNews = false
    private var engNewWords = false
    private var engFrasals = false

    private var spnLearn = false
    private var spnLearned = false
    private var spnWrite = false
    private var spnTranslate = false
    private var spnChat = false
    private var spnNews = false
    private var spnNewWords = false
    private var spnFrasals = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        running = true
        runTimer()

        sharedPrefs = getSharedPreferences("OpenLanguage", MODE_PRIVATE)
        pressEngl = sharedPrefs.getBoolean("pressEnglish", false)
        pressFren = sharedPrefs.getBoolean("pressFrench", false)
        pressSpan = sharedPrefs.getBoolean("pressSpanish", false)
        pressGerm = sharedPrefs.getBoolean("pressGermany", false)
        pressItal = sharedPrefs.getBoolean("pressItaly", false)
        if(pressEngl){
            binding.ivMainEnglishMenu.visibility = View.VISIBLE
            binding.svEnglish.visibility = View.VISIBLE
            sharedPrefs = getSharedPreferences("EngMenu", MODE_PRIVATE)
            enLearn = sharedPrefs.getBoolean("engLearn", false)
            enLearned = sharedPrefs.getBoolean("engLearned", false)
            enWrite = sharedPrefs.getBoolean("engWrite", false)
            enTranslate = sharedPrefs.getBoolean("engTranslate", false)
            enNews = sharedPrefs.getBoolean("engNews", false)
            enNewWords = sharedPrefs.getBoolean("engNewWords", false)
            enFrasals = sharedPrefs.getBoolean("engFrasals", false)
            if(enLearn){
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, LearnFragment())
                    .commit()
            }
            if(enLearned){
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, LearnedFragment())
                    .commit()
            }
            if(enWrite){
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, WriteFragment())
                    .commit()
            }
            if(enTranslate){
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, TranslaterFragment())
                    .commit()
            }
            if(enNews){
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, NewsFragment())
                    .commit()
            }
            if(enNewWords){
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, NewWordsFragment())
                    .commit()
            }
            if(enFrasals){
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, FrasalsFragment())
                    .commit()
            }
        }
        if(pressFren){
            binding.ivMainFrenchMenu.visibility = View.VISIBLE
            binding.svFrench.visibility = View.VISIBLE
        }
        if(pressSpan){
            binding.ivMainSpanishMenu.visibility = View.VISIBLE
            binding.svSpanish.visibility = View.VISIBLE
            sharedPrefs = getSharedPreferences("SpainMenu", MODE_PRIVATE)
            spLearn = sharedPrefs.getBoolean("spnLearn", false)
            spLearned = sharedPrefs.getBoolean("spnLearned", false)
            spWrite = sharedPrefs.getBoolean("spnWrite", false)
            spTranslate = sharedPrefs.getBoolean("spnTranslate", false)
            spNews = sharedPrefs.getBoolean("spnNews", false)
            spNewWords = sharedPrefs.getBoolean("spnNewWords", false)
            spFrasals = sharedPrefs.getBoolean("spnFrasals", false)
            if(spLearn){
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, LearnSpainFragment())
                    .commit()
            }
            if(spLearned){
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, LearnedSpainFragment())
                    .commit()
            }
            if(spWrite){
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, WriteSpainFragment())
                    .commit()
            }
            if(spTranslate){
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, TranslaterSpainFragment())
                    .commit()
            }
            if(spNews){
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, NewsSpainFragment())
                    .commit()
            }
            if(spNewWords){
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, NewWordsSpainFragment())
                    .commit()
            }
            if(spFrasals){
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, FrasalsSpainFragment())
                    .commit()
            }
        }
        if(pressGerm){
            binding.ivMainGermanMenu.visibility = View.VISIBLE
            binding.svGerman.visibility = View.VISIBLE
        }
        if(pressItal){
            binding.ivMainItalianMenu.visibility = View.VISIBLE
            binding.svItalian.visibility = View.VISIBLE
        }

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
            supportFragmentManager
                .beginTransaction()
                .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                .replace(R.id.flMain, LearnFragment())
                .commit()
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

            pressEnglish = true
            pressFrench = false
            pressSpanish = false
            pressGermany = false
            pressItaly = false
            sharedPrefs = getSharedPreferences("OpenLanguage", AppCompatActivity.MODE_PRIVATE)
            sharedPrefs.edit().putBoolean("pressEnglish", pressEnglish).apply()
            sharedPrefs.edit().putBoolean("pressFrench", pressFrench).apply()
            sharedPrefs.edit().putBoolean("pressSpanish", pressSpanish).apply()
            sharedPrefs.edit().putBoolean("pressGermany", pressGermany).apply()
            sharedPrefs.edit().putBoolean("pressItaly", pressItaly).apply()
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

            pressEnglish = false
            pressFrench = true
            pressSpanish = false
            pressGermany = false
            pressItaly = false
            sharedPrefs = getSharedPreferences("OpenLanguage", AppCompatActivity.MODE_PRIVATE)
            sharedPrefs.edit().putBoolean("pressEnglish", pressEnglish).apply()
            sharedPrefs.edit().putBoolean("pressFrench", pressFrench).apply()
            sharedPrefs.edit().putBoolean("pressSpanish", pressSpanish).apply()
            sharedPrefs.edit().putBoolean("pressGermany", pressGermany).apply()
            sharedPrefs.edit().putBoolean("pressItaly", pressItaly).apply()
        }
        binding.ivFlagSpain.setOnClickListener {
            val dpValue = 150
            val pxValue = TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics)
            ObjectAnimator.ofFloat(binding.svMain, "translationX", -pxValue).apply{
                duration = 1000
                start()
            }
            supportFragmentManager
                .beginTransaction()
                .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                .replace(R.id.flMain, LearnSpainFragment())
                .commit()
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

            pressEnglish = false
            pressFrench = false
            pressSpanish = true
            pressGermany = false
            pressItaly = false
            sharedPrefs = getSharedPreferences("OpenLanguage", AppCompatActivity.MODE_PRIVATE)
            sharedPrefs.edit().putBoolean("pressEnglish", pressEnglish).apply()
            sharedPrefs.edit().putBoolean("pressFrench", pressFrench).apply()
            sharedPrefs.edit().putBoolean("pressSpanish", pressSpanish).apply()
            sharedPrefs.edit().putBoolean("pressGermany", pressGermany).apply()
            sharedPrefs.edit().putBoolean("pressItaly", pressItaly).apply()
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

            pressEnglish = false
            pressFrench = false
            pressSpanish = false
            pressGermany = true
            pressItaly = false
            sharedPrefs = getSharedPreferences("OpenLanguage", AppCompatActivity.MODE_PRIVATE)
            sharedPrefs.edit().putBoolean("pressEnglish", pressEnglish).apply()
            sharedPrefs.edit().putBoolean("pressFrench", pressFrench).apply()
            sharedPrefs.edit().putBoolean("pressSpanish", pressSpanish).apply()
            sharedPrefs.edit().putBoolean("pressGermany", pressGermany).apply()
            sharedPrefs.edit().putBoolean("pressItaly", pressItaly).apply()
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

            pressEnglish = false
            pressFrench = false
            pressSpanish = false
            pressGermany = false
            pressItaly = true
            sharedPrefs = getSharedPreferences("OpenLanguage", AppCompatActivity.MODE_PRIVATE)
            sharedPrefs.edit().putBoolean("pressEnglish", pressEnglish).apply()
            sharedPrefs.edit().putBoolean("pressFrench", pressFrench).apply()
            sharedPrefs.edit().putBoolean("pressSpanish", pressSpanish).apply()
            sharedPrefs.edit().putBoolean("pressGermany", pressGermany).apply()
            sharedPrefs.edit().putBoolean("pressItaly", pressItaly).apply()
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
               engLearn = true
               engLearned = false
               engWrite = false
               engTranslate = false
               engNews = false
               engNewWords = false
               engFrasals = false
               sharedPrefs = getSharedPreferences("EngMenu", AppCompatActivity.MODE_PRIVATE)
               sharedPrefs.edit().putBoolean("engLearn", engLearn).apply()
               sharedPrefs.edit().putBoolean("engLearned", engLearned).apply()
               sharedPrefs.edit().putBoolean("engWrite", engWrite).apply()
               sharedPrefs.edit().putBoolean("engTranslate", engTranslate).apply()
               sharedPrefs.edit().putBoolean("engNews", engNews).apply()
               sharedPrefs.edit().putBoolean("engNewWords", engNewWords).apply()
               sharedPrefs.edit().putBoolean("engFrasals", engFrasals).apply()
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
               engLearn = false
               engLearned = true
               engWrite = false
               engTranslate = false
               engNews = false
               engNewWords = false
               engFrasals = false
               sharedPrefs = getSharedPreferences("EngMenu", AppCompatActivity.MODE_PRIVATE)
               sharedPrefs.edit().putBoolean("engLearn", engLearn).apply()
               sharedPrefs.edit().putBoolean("engLearned", engLearned).apply()
               sharedPrefs.edit().putBoolean("engWrite", engWrite).apply()
               sharedPrefs.edit().putBoolean("engTranslate", engTranslate).apply()
               sharedPrefs.edit().putBoolean("engNews", engNews).apply()
               sharedPrefs.edit().putBoolean("engNewWords", engNewWords).apply()
               sharedPrefs.edit().putBoolean("engFrasals", engFrasals).apply()
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
               engLearn = false
               engLearned = false
               engWrite = true
               engTranslate = false
               engNews = false
               engNewWords = false
               engFrasals = false
               sharedPrefs = getSharedPreferences("EngMenu", AppCompatActivity.MODE_PRIVATE)
               sharedPrefs.edit().putBoolean("engLearn", engLearn).apply()
               sharedPrefs.edit().putBoolean("engLearned", engLearned).apply()
               sharedPrefs.edit().putBoolean("engWrite", engWrite).apply()
               sharedPrefs.edit().putBoolean("engTranslate", engTranslate).apply()
               sharedPrefs.edit().putBoolean("engNews", engNews).apply()
               sharedPrefs.edit().putBoolean("engNewWords", engNewWords).apply()
               sharedPrefs.edit().putBoolean("engFrasals", engFrasals).apply()
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
                engLearn = false
                engLearned = false
                engWrite = false
                engTranslate = true
                engNews = false
                engNewWords = false
                engFrasals = false
                sharedPrefs = getSharedPreferences("EngMenu", AppCompatActivity.MODE_PRIVATE)
                sharedPrefs.edit().putBoolean("engLearn", engLearn).apply()
                sharedPrefs.edit().putBoolean("engLearned", engLearned).apply()
                sharedPrefs.edit().putBoolean("engWrite", engWrite).apply()
                sharedPrefs.edit().putBoolean("engTranslate", engTranslate).apply()
                sharedPrefs.edit().putBoolean("engNews", engNews).apply()
                sharedPrefs.edit().putBoolean("engNewWords", engNewWords).apply()
                sharedPrefs.edit().putBoolean("engFrasals", engFrasals).apply()
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
                engLearn = false
                engLearned = false
                engWrite = false
                engTranslate = false
                engNews = true
                engNewWords = false
                engFrasals = false
                sharedPrefs = getSharedPreferences("EngMenu", AppCompatActivity.MODE_PRIVATE)
                sharedPrefs.edit().putBoolean("engLearn", engLearn).apply()
                sharedPrefs.edit().putBoolean("engLearned", engLearned).apply()
                sharedPrefs.edit().putBoolean("engWrite", engWrite).apply()
                sharedPrefs.edit().putBoolean("engTranslate", engTranslate).apply()
                sharedPrefs.edit().putBoolean("engNews", engNews).apply()
                sharedPrefs.edit().putBoolean("engNewWords", engNewWords).apply()
                sharedPrefs.edit().putBoolean("engFrasals", engFrasals).apply()
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
                engLearn = false
                engLearned = false
                engWrite = false
                engTranslate = false
                engNews = false
                engNewWords = true
                engFrasals = false
                sharedPrefs = getSharedPreferences("EngMenu", AppCompatActivity.MODE_PRIVATE)
                sharedPrefs.edit().putBoolean("engLearn", engLearn).apply()
                sharedPrefs.edit().putBoolean("engLearned", engLearned).apply()
                sharedPrefs.edit().putBoolean("engWrite", engWrite).apply()
                sharedPrefs.edit().putBoolean("engTranslate", engTranslate).apply()
                sharedPrefs.edit().putBoolean("engNews", engNews).apply()
                sharedPrefs.edit().putBoolean("engNewWords", engNewWords).apply()
                sharedPrefs.edit().putBoolean("engFrasals", engFrasals).apply()
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
                engLearn = false
                engLearned = false
                engWrite = false
                engTranslate = false
                engNews = false
                engNewWords = false
                engFrasals = true
                sharedPrefs = getSharedPreferences("EngMenu", AppCompatActivity.MODE_PRIVATE)
                sharedPrefs.edit().putBoolean("engLearn", engLearn).apply()
                sharedPrefs.edit().putBoolean("engLearned", engLearned).apply()
                sharedPrefs.edit().putBoolean("engWrite", engWrite).apply()
                sharedPrefs.edit().putBoolean("engTranslate", engTranslate).apply()
                sharedPrefs.edit().putBoolean("engNews", engNews).apply()
                sharedPrefs.edit().putBoolean("engNewWords", engNewWords).apply()
                sharedPrefs.edit().putBoolean("engFrasals", engFrasals).apply()
                frasalscor?.cancel()
            }
        }

        binding.ivLearnNewWordsSpanish.setOnClickListener {
            learnspaincor = coroutineScope.launch {
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, LearnSpainFragment())
                    .commit()
                val dpValue = 145
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics
                )
                ObjectAnimator.ofFloat(binding.svSpanish, "translationX", pxValue).apply {
                    duration = 1000
                    start()
                }
                openmainspainmenu = false
                spnLearn = true
                spnLearned = false
                spnWrite = false
                spnTranslate = false
                spnNews = false
                spnNewWords = false
                spnFrasals = false
                sharedPrefs = getSharedPreferences("SpainMenu", AppCompatActivity.MODE_PRIVATE)
                sharedPrefs.edit().putBoolean("spnLearn", spnLearn).apply()
                sharedPrefs.edit().putBoolean("spnLearned", spnLearned).apply()
                sharedPrefs.edit().putBoolean("spnWrite", spnWrite).apply()
                sharedPrefs.edit().putBoolean("spnTranslate", spnTranslate).apply()
                sharedPrefs.edit().putBoolean("spnNews", spnNews).apply()
                sharedPrefs.edit().putBoolean("spnNewWords", spnNewWords).apply()
                sharedPrefs.edit().putBoolean("spnFrasals", spnFrasals).apply()
                learnspaincor?.cancel()
            }
        }
        binding.ivLearnedWordsSpanish.setOnClickListener {
            learnedspaincor = coroutineScope.launch {
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, LearnedSpainFragment())
                    .commit()
                val dpValue = 145
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics
                )
                ObjectAnimator.ofFloat(binding.svSpanish, "translationX", pxValue).apply {
                    duration = 1000
                    start()
                }
                openmainspainmenu = false
                spnLearn = false
                spnLearned = true
                spnWrite = false
                spnTranslate = false
                spnNews = false
                spnNewWords = false
                spnFrasals = false
                sharedPrefs = getSharedPreferences("SpainMenu", AppCompatActivity.MODE_PRIVATE)
                sharedPrefs.edit().putBoolean("spnLearn", spnLearn).apply()
                sharedPrefs.edit().putBoolean("spnLearned", spnLearned).apply()
                sharedPrefs.edit().putBoolean("spnWrite", spnWrite).apply()
                sharedPrefs.edit().putBoolean("spnTranslate", spnTranslate).apply()
                sharedPrefs.edit().putBoolean("spnNews", spnNews).apply()
                sharedPrefs.edit().putBoolean("spnNewWords", spnNewWords).apply()
                sharedPrefs.edit().putBoolean("spnFrasals", spnFrasals).apply()
                learnedspaincor?.cancel()
            }
        }
        binding.ivWriteWordsSpanish.setOnClickListener {
            writespaincor = coroutineScope.launch {
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, WriteSpainFragment())
                    .commit()
                val dpValue = 145
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics
                )
                ObjectAnimator.ofFloat(binding.svSpanish, "translationX", pxValue).apply {
                    duration = 1000
                    start()
                }
                openmainspainmenu = false
                spnLearn = false
                spnLearned = false
                spnWrite = true
                spnTranslate = false
                spnNews = false
                spnNewWords = false
                spnFrasals = false
                sharedPrefs = getSharedPreferences("SpainMenu", AppCompatActivity.MODE_PRIVATE)
                sharedPrefs.edit().putBoolean("spnLearn", spnLearn).apply()
                sharedPrefs.edit().putBoolean("spnLearned", spnLearned).apply()
                sharedPrefs.edit().putBoolean("spnWrite", spnWrite).apply()
                sharedPrefs.edit().putBoolean("spnTranslate", spnTranslate).apply()
                sharedPrefs.edit().putBoolean("spnNews", spnNews).apply()
                sharedPrefs.edit().putBoolean("spnNewWords", spnNewWords).apply()
                sharedPrefs.edit().putBoolean("spnFrasals", spnFrasals).apply()
                writespaincor?.cancel()
            }
        }
        binding.ivTranslateWordsSpanish.setOnClickListener {
            translatespaincor = coroutineScope.launch {
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, TranslaterSpainFragment())
                    .commit()
                val dpValue = 145
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics
                )
                ObjectAnimator.ofFloat(binding.svSpanish, "translationX", pxValue).apply {
                    duration = 1000
                    start()
                }
                openmainspainmenu = false
                spnLearn = false
                spnLearned = false
                spnWrite = false
                spnTranslate = true
                spnNews = false
                spnNewWords = false
                spnFrasals = false
                sharedPrefs = getSharedPreferences("SpainMenu", AppCompatActivity.MODE_PRIVATE)
                sharedPrefs.edit().putBoolean("spnLearn", spnLearn).apply()
                sharedPrefs.edit().putBoolean("spnLearned", spnLearned).apply()
                sharedPrefs.edit().putBoolean("spnWrite", spnWrite).apply()
                sharedPrefs.edit().putBoolean("spnTranslate", spnTranslate).apply()
                sharedPrefs.edit().putBoolean("spnNews", spnNews).apply()
                sharedPrefs.edit().putBoolean("spnNewWords", spnNewWords).apply()
                sharedPrefs.edit().putBoolean("spnFrasals", spnFrasals).apply()
                translatespaincor?.cancel()
            }
        }
        binding.ivReadNewsSpanish.setOnClickListener {
            newsspaincor = coroutineScope.launch {
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, NewsSpainFragment())
                    .commit()
                val dpValue = 145
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics
                )
                ObjectAnimator.ofFloat(binding.svSpanish, "translationX", pxValue).apply {
                    duration = 1000
                    start()
                }
                openmainspainmenu = false
                spnLearn = false
                spnLearned = false
                spnWrite = false
                spnTranslate = false
                spnNews = true
                spnNewWords = false
                spnFrasals = false
                sharedPrefs = getSharedPreferences("SpainMenu", AppCompatActivity.MODE_PRIVATE)
                sharedPrefs.edit().putBoolean("spnLearn", spnLearn).apply()
                sharedPrefs.edit().putBoolean("spnLearned", spnLearned).apply()
                sharedPrefs.edit().putBoolean("spnWrite", spnWrite).apply()
                sharedPrefs.edit().putBoolean("spnTranslate", spnTranslate).apply()
                sharedPrefs.edit().putBoolean("spnNews", spnNews).apply()
                sharedPrefs.edit().putBoolean("spnNewWords", spnNewWords).apply()
                sharedPrefs.edit().putBoolean("spnFrasals", spnFrasals).apply()
                newsspaincor?.cancel()
            }
        }
        binding.ivFrasalsSpanish.setOnClickListener {
            frasalsspaincor = coroutineScope.launch {
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, FrasalsSpainFragment())
                    .commit()
                val dpValue = 145
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics
                )
                ObjectAnimator.ofFloat(binding.svSpanish, "translationX", pxValue).apply {
                    duration = 1000
                    start()
                }
                openmainspainmenu = false
                spnLearn = false
                spnLearned = false
                spnWrite = false
                spnTranslate = false
                spnNews = false
                spnNewWords = true
                spnFrasals = false
                sharedPrefs = getSharedPreferences("SpainMenu", AppCompatActivity.MODE_PRIVATE)
                sharedPrefs.edit().putBoolean("spnLearn", spnLearn).apply()
                sharedPrefs.edit().putBoolean("spnLearned", spnLearned).apply()
                sharedPrefs.edit().putBoolean("spnWrite", spnWrite).apply()
                sharedPrefs.edit().putBoolean("spnTranslate", spnTranslate).apply()
                sharedPrefs.edit().putBoolean("spnNews", spnNews).apply()
                sharedPrefs.edit().putBoolean("spnNewWords", spnNewWords).apply()
                sharedPrefs.edit().putBoolean("spnFrasals", spnFrasals).apply()
                frasalsspaincor?.cancel()
            }
        }
        binding.ivNewWordsSpanish.setOnClickListener {
            newwordsspaincor = coroutineScope.launch {
                supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                    .replace(R.id.flMain, NewWordsSpainFragment())
                    .commit()
                val dpValue = 145
                val pxValue = TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, dpValue.toFloat(), resources.displayMetrics
                )
                ObjectAnimator.ofFloat(binding.svSpanish, "translationX", pxValue).apply {
                    duration = 1000
                    start()
                }
                openmainspainmenu = false
                spnLearn = false
                spnLearned = false
                spnWrite = false
                spnTranslate = false
                spnNews = false
                spnNewWords = false
                spnFrasals = true
                sharedPrefs = getSharedPreferences("SpainMenu", AppCompatActivity.MODE_PRIVATE)
                sharedPrefs.edit().putBoolean("spnLearn", spnLearn).apply()
                sharedPrefs.edit().putBoolean("spnLearned", spnLearned).apply()
                sharedPrefs.edit().putBoolean("spnWrite", spnWrite).apply()
                sharedPrefs.edit().putBoolean("spnTranslate", spnTranslate).apply()
                sharedPrefs.edit().putBoolean("spnNews", spnNews).apply()
                sharedPrefs.edit().putBoolean("spnNewWords", spnNewWords).apply()
                sharedPrefs.edit().putBoolean("spnFrasals", spnFrasals).apply()
                newwordsspaincor?.cancel()
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