package com.azimuton.foreign

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.app.ActivityOptions
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewTreeObserver
import android.view.Window
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.LinearInterpolator
import android.view.animation.RotateAnimation
import androidx.core.graphics.drawable.toDrawable
import androidx.core.graphics.toColorInt
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.azimuton.foreign.databinding.ActivitySplashBinding
import com.bumptech.glide.Glide
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySplashBinding
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private var coroutine : Job? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        hideSystemUI()

        Glide.with(this).asGif().load(R.drawable.worldflagsglobe).into(binding.ivForeign)
//        val remoteConfig = FirebaseRemoteConfig.getInstance()
//        val configSettings = FirebaseRemoteConfigSettings.Builder()
//            .setMinimumFetchIntervalInSeconds(0)
//            .build()
//        remoteConfig.setConfigSettingsAsync(configSettings)
//        remoteConfig.fetchAndActivate().addOnCompleteListener(this) { task ->
//                if (task.isSuccessful) {
//                    binding.progressBar.visibility = View.GONE
//                    val splashbackground = remoteConfig.getString("splash_background")
//                    val color = Color.parseColor(splashbackground)
//                    binding.clSplash.setBackgroundColor(color)
//
//                }
//            }

        coroutine = coroutineScope.launch {
            binding.clSplash.viewTreeObserver.addOnGlobalLayoutListener(object : ViewTreeObserver.OnGlobalLayoutListener {
                override fun onGlobalLayout() {
                    binding.clSplash.viewTreeObserver.removeOnGlobalLayoutListener(this)
                    ObjectAnimator.ofFloat(binding.ivForeign, "scaleX", 4f).apply{
                        duration = 3000
                        start()
                    }
                    ObjectAnimator.ofFloat(binding.ivForeign, "scaleY", 4f).apply{
                        duration = 3000
                        start()
                    }
                    ObjectAnimator.ofFloat(binding.ivForeign, "translationX",
                        (binding.clSplash.width/2).toFloat() + 100f).apply{
                        duration = 3000
                        start()
                    }
                    ObjectAnimator.ofFloat(binding.ivForeign, "translationY",
                        (binding.clSplash.height/2).toFloat() + 100f).apply{
                        duration = 3000
                        start()
                    }
                    ObjectAnimator.ofFloat(binding.tvForeign, "translationY",
                        (-binding.clSplash.height).toFloat() ).apply{
                        duration = 3000
                        start()
                    }
                }
            })
            delay(3000)
            runOnUiThread {
                binding.tvForeign.startAnimation(AnimationUtils.loadAnimation(this@SplashActivity, R.anim.alfa_down))
                ObjectAnimator.ofFloat(binding.tvLanguage, "translationX",
                    binding.clSplash.width / 2f + binding.tvLanguage.width / 2f).apply{
                    duration = 1000
                    start()
                }
            }
            delay(800)
            runOnUiThread {
                binding.tvLanguage.startAnimation(AnimationUtils.loadAnimation(this@SplashActivity, R.anim.alfa_down))
                binding.tvForeign.startAnimation(AnimationUtils.loadAnimation(this@SplashActivity, R.anim.alfa_up))
            }
            delay(800)
            runOnUiThread {
                binding.tvLanguage.startAnimation(AnimationUtils.loadAnimation(this@SplashActivity, R.anim.alfa_up))
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                    overridePendingTransition(0, R.anim.open_activity)
                   // ActivityOptions.makeSceneTransitionAnimation(this@SplashActivity).toBundle())
                finish()
            }
            coroutine?.cancel()
        }
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
}