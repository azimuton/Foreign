package com.azimuton.foreign.fragments.english

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.azimuton.foreign.R
import com.azimuton.foreign.databinding.FragmentNewsDetailsBinding
import com.azimuton.foreign.viewmodels.NewsDataViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NewsDetailsFragment : Fragment() {
    private lateinit var binding : FragmentNewsDetailsBinding
    private val dataModel : NewsDataViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewsDetailsBinding.inflate(inflater, container, false)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Glide.with(this)
            .asGif()
            .load(R.drawable.backnote)
            .into(binding.ivBackToNews)
        binding.ivBackToNews.setOnClickListener {
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.flMain, NewsFragment())
                ?.commit()
        }
        dataModel.vmTitle.observe(activity as LifecycleOwner) {
            binding.tvTitle.text = it
        }
        dataModel.vmDesc.observe(activity as LifecycleOwner) {
            binding.tvDescription.text = it
        }
        dataModel.vmContent.observe(activity as LifecycleOwner) {
            binding.tvContent.text = it
        }
        dataModel.vmImage.observe(activity as LifecycleOwner) {
            if (it != null) {
                Glide.with(requireContext())
                    .load(it.toUri())
                    .into(binding.ivBigPhoto)
            } else{
                binding.ivBigPhoto.setImageResource(R.drawable.errorload)
            }
        }
        val  w : Window? = activity?.window
        w?.decorView?.systemUiVisibility = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
    }
}