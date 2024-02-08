package com.azimuton.foreign.fragments.spain

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.azimuton.foreign.R
import com.azimuton.foreign.databinding.FragmentNewWordsBinding
import com.azimuton.foreign.databinding.FragmentNewWordsSpainBinding
import com.azimuton.foreign.fragments.english.newwords.BedRoomFragment
import com.azimuton.foreign.fragments.english.newwords.BerryFragment
import com.azimuton.foreign.fragments.english.newwords.BuildingFragment
import com.azimuton.foreign.fragments.english.newwords.CityFragment
import com.azimuton.foreign.fragments.english.newwords.FamilyFragment
import com.azimuton.foreign.fragments.english.newwords.FruitsFragment
import com.azimuton.foreign.fragments.english.newwords.HomeAnimalsFragment
import com.azimuton.foreign.fragments.english.newwords.KitchenFragment
import com.azimuton.foreign.fragments.english.newwords.NatureFragment
import com.azimuton.foreign.fragments.english.newwords.PartsOfBodyFragment
import com.azimuton.foreign.fragments.english.newwords.SeaFragment
import com.azimuton.foreign.fragments.english.newwords.ToolsFragment
import com.azimuton.foreign.fragments.english.newwords.TransportFragment
import com.azimuton.foreign.fragments.english.newwords.VegetablesFragment
import com.azimuton.foreign.fragments.english.newwords.VerbsContinuedFragment
import com.azimuton.foreign.fragments.english.newwords.VerbsFragment
import com.azimuton.foreign.fragments.english.newwords.WashRoomFragment
import com.azimuton.foreign.fragments.english.newwords.WeatherFragment
import com.azimuton.foreign.fragments.english.newwords.WildAnimalsFragment
import com.azimuton.foreign.fragments.spain.newspainwords.BedRoomSpainFragment
import com.azimuton.foreign.fragments.spain.newspainwords.BerrySpainFragment
import com.azimuton.foreign.fragments.spain.newspainwords.BuildingSpainFragment
import com.azimuton.foreign.fragments.spain.newspainwords.CitySpainFragment
import com.azimuton.foreign.fragments.spain.newspainwords.FamilySpainFragment
import com.azimuton.foreign.fragments.spain.newspainwords.FruitsSpainFragment
import com.azimuton.foreign.fragments.spain.newspainwords.HomeAnimalsSpainFragment
import com.azimuton.foreign.fragments.spain.newspainwords.KitchenSpainFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NewWordsSpainFragment : Fragment() {
    private lateinit var binding : FragmentNewWordsSpainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewWordsSpainBinding.inflate(inflater, container, false)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val formuls = resources.getStringArray(R.array.names)
        val arrayAdapter = ArrayAdapter(requireActivity(), R.layout.item_adapter, formuls)
        binding.listViewNewWordsSpain.adapter = arrayAdapter

        binding.listViewNewWordsSpain.onItemClickListener = object : AdapterView.OnItemSelectedListener,
            AdapterView.OnItemClickListener {
            override fun onItemSelected(
                parent: AdapterView<*>?, view: View?,
                position: Int, id: Long
            ) {
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                when (position) {
                    0 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                            ?.replace(R.id.flMain, WashRoomFragment())
                            ?.commit()
                    }
                    1 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                            ?.replace(R.id.flMain, SeaFragment())
                            ?.commit()
                    }
                    2 ->{
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                            ?.replace(R.id.flMain, VerbsFragment())
                            ?.commit()
                    }
                    3 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                            ?.replace(R.id.flMain, VerbsContinuedFragment())
                            ?.commit()
                    }
                    4 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                            ?.replace(R.id.flMain, CitySpainFragment())
                            ?.commit()
                    }
                    5 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                            ?.replace(R.id.flMain, WildAnimalsFragment())
                            ?.commit()
                    }
                    6 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                            ?.replace(R.id.flMain, HomeAnimalsSpainFragment())
                            ?.commit()
                    }
                    7 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                            ?.replace(R.id.flMain, BuildingSpainFragment())
                            ?.commit()
                    }
                    8 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                            ?.replace(R.id.flMain, ToolsFragment())
                            ?.commit()
                    }
                    9 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                            ?.replace(R.id.flMain, KitchenSpainFragment())
                            ?.commit()
                    }
                    10 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                            ?.replace(R.id.flMain, VegetablesFragment())
                            ?.commit()
                    }
                    11 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                            ?.replace(R.id.flMain, WeatherFragment())
                            ?.commit()
                    }
                    12-> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                            ?.replace(R.id.flMain, NatureFragment())
                            ?.commit()
                    }
                    13 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                            ?.replace(R.id.flMain, FamilySpainFragment())
                            ?.commit()
                    }
                    14 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                            ?.replace(R.id.flMain, BedRoomSpainFragment())
                            ?.commit()
                    }
                    15 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                            ?.replace(R.id.flMain, TransportFragment())
                            ?.commit()
                    }
                    16 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                            ?.replace(R.id.flMain, FruitsSpainFragment())
                            ?.commit()
                    }
                    17 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                            ?.replace(R.id.flMain,  PartsOfBodyFragment())
                            ?.commit()
                    }
                    18 -> {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.setCustomAnimations(R.anim.alfa_up, R.anim.alfa_down)
                            ?.replace(R.id.flMain, BerrySpainFragment())
                            ?.commit()
                    }
                }
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