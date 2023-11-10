package com.azimuton.foreign

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.app.ActivityOptions
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewTreeObserver
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.LinearInterpolator
import android.view.animation.RotateAnimation
import androidx.core.graphics.drawable.toDrawable
import androidx.core.graphics.toColorInt
import com.azimuton.foreign.databinding.ActivitySplashBinding
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

        val remoteConfig = FirebaseRemoteConfig.getInstance()
        val configSettings = FirebaseRemoteConfigSettings.Builder()
            .setMinimumFetchIntervalInSeconds(0)
            .build()
        remoteConfig.setConfigSettingsAsync(configSettings)
        remoteConfig.fetchAndActivate().addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val splashbackground = remoteConfig.getString("splash_background")
                    val color = Color.parseColor(splashbackground)
                    binding.clSplash.setBackgroundColor(color)
                }
            }
            coroutine = coroutineScope.launch {
            binding.clSplash.viewTreeObserver.addOnGlobalLayoutListener(object : ViewTreeObserver.OnGlobalLayoutListener {
                override fun onGlobalLayout() {
                    binding.clSplash.viewTreeObserver.removeOnGlobalLayoutListener(this)
                    ObjectAnimator.ofFloat(binding.ivForeign, "scaleX", 5f).apply{
                        duration = 3000
                        start()
                    }
                    ObjectAnimator.ofFloat(binding.ivForeign, "scaleY", 5f).apply{
                        duration = 3000
                        start()
                    }
                    ObjectAnimator.ofFloat(binding.ivForeign, "translationX", (binding.clSplash.width/2).toFloat() + 100f).apply{
                        duration = 3000
                        start()
                    }
                    ObjectAnimator.ofFloat(binding.ivForeign, "translationY", (binding.clSplash.height/2).toFloat() + 300f).apply{
                        duration = 3000
                        start()
                    }
                    ObjectAnimator.ofFloat(binding.tvForeign, "translationY", (-binding.clSplash.height).toFloat() + 150f).apply{
                        duration = 3000
                        start()
                    }
                }
            })
                delay(3000)
                runOnUiThread {
                            binding.tvForeign.startAnimation(AnimationUtils.loadAnimation(this@SplashActivity, R.anim.alfa_down))
                            ObjectAnimator.ofFloat(binding.tvLanguage, "translationX", (binding.clSplash.width).toFloat() - 200f).apply{
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
                    startActivity(Intent(this@SplashActivity, MainActivity::class.java),
                        ActivityOptions.makeSceneTransitionAnimation(this@SplashActivity).toBundle())
                }
            coroutine?.cancel()
        }
    }
}