package com.azimuton.foreign.fragments.spain

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.core.net.toUri
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.azimuton.foreign.R
import com.azimuton.foreign.databinding.FragmentNewsDetailsSpainBinding
import com.azimuton.foreign.databinding.FragmentNewsSpainBinding
import com.azimuton.foreign.fragments.english.NewsFragment
import com.azimuton.foreign.viewmodels.english.NewsDataViewModel
import com.azimuton.foreign.viewmodels.spain.NewsDataSpainViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NewsDetailsSpainFragment : Fragment() {
    lateinit var binding: FragmentNewsDetailsSpainBinding
    private val dataModel : NewsDataSpainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewsDetailsSpainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Glide.with(this)
            .asGif()
            .load(R.drawable.leftarrow)
            .into(binding.ivBackToNewsSpain)
        binding.ivBackToNewsSpain.setOnClickListener {
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                ?.replace(R.id.flMain, NewsSpainFragment())
                ?.commit()
        }
        dataModel.vmsTitle.observe(activity as LifecycleOwner) {
            binding.tvTitleSpain.text = it
        }
        dataModel.vmsDesc.observe(activity as LifecycleOwner) {
            binding.tvDescriptionSpain.text = it
        }
        dataModel.vmsContent.observe(activity as LifecycleOwner) {
            binding.tvContentSpain.text = it
        }
        dataModel.vmsImage.observe(activity as LifecycleOwner) {
            if (it != null) {
                Glide.with(requireContext())
                    .load(it.toUri())
                    .into(binding.ivBigPhotoSpain)
            } else{
                binding.ivBigPhotoSpain.setImageResource(R.drawable.errorload)
            }
        }
        hideSystemUI()
    }

    private fun hideSystemUI () {
        val window : Window? = activity?.window
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