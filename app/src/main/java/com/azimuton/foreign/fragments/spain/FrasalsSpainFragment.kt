package com.azimuton.foreign.fragments.spain

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.fragment.app.Fragment
import com.azimuton.foreign.R
import com.azimuton.foreign.databinding.FragmentFrasalsSpainBinding
import com.azimuton.foreign.fragments.english.DepthPageTransformer
import com.azimuton.foreign.fragments.english.adapters.FrasalAdapter
import com.azimuton.foreign.fragments.spain.adapters.FrasalsSpainAdapter
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FrasalsSpainFragment : Fragment() {
    private lateinit var binding : FragmentFrasalsSpainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFrasalsSpainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initial()
        hideSystemUI()
    }
    private fun initial() {
        binding.vpPager2Spain.adapter = FrasalsSpainAdapter(requireActivity())
        binding.tabLayoutSpain.tabIconTint = null
        TabLayoutMediator(binding.tabLayoutSpain, binding.vpPager2Spain){
                tab, pos ->
            when(pos) {
                0 -> {
                    tab.text = "popular expressions"
                    tab.icon?.setTint(ContextCompat.getColor(requireActivity(), R.color.two))
                    binding.vpPager2Spain.setPageTransformer(DepthPageTransformer())
                }
                1 -> {
                    tab.text = "popular expressions"
                    tab.icon?.setTint(ContextCompat.getColor(requireActivity(), R.color.two))
                    binding.vpPager2Spain.setPageTransformer(DepthPageTransformer())
                }
                2 -> {
                    tab.text = "popular expressions"
                    tab.icon?.setTint(ContextCompat.getColor(requireActivity(), R.color.two))
                    binding.vpPager2Spain.setPageTransformer(DepthPageTransformer())
                }
                3 -> {
                    tab.text = "popular expressions"
                    tab.icon?.setTint(ContextCompat.getColor(requireActivity(), R.color.two))
                    binding.vpPager2Spain.setPageTransformer(DepthPageTransformer())
                }
//                4 -> {
//                    tab.text = "popular expressions"
//                    tab.icon?.setTint(ContextCompat.getColor(requireActivity(), R.color.two))
//                    binding.vpPager2Spain.setPageTransformer(DepthPageTransformer())
//                }
//                5 -> {
//                    tab.text = "popular expressions"
//                    tab.icon?.setTint(ContextCompat.getColor(requireActivity(), R.color.two))
//                    binding.vpPager2Spain.setPageTransformer(DepthPageTransformer())
//                }
//                6 -> {
//                    tab.text = "popular expressions"
//                    tab.icon?.setTint(ContextCompat.getColor(requireActivity(), R.color.two))
//                    binding.vpPager2Spain.setPageTransformer(DepthPageTransformer())
//                }
//                7 -> {
//                    tab.text = "popular expressions"
//                    tab.icon?.setTint(ContextCompat.getColor(requireActivity(), R.color.two))
//                    binding.vpPager2Spain.setPageTransformer(DepthPageTransformer())
//                }
            }

        }.attach()
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