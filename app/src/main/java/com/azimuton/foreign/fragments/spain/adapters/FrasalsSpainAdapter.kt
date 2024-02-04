package com.azimuton.foreign.fragments.spain.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.azimuton.foreign.fragments.spain.popularspainexpressions.PopularExpSpainFragment
import com.azimuton.foreign.fragments.spain.popularspainexpressions.PopularExpSpainThreeFragment
import com.azimuton.foreign.fragments.spain.popularspainexpressions.PopularExpSpainTwoFragment

class FrasalsSpainAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 8
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> PopularExpSpainFragment()
            1 -> PopularExpSpainTwoFragment()
            //2 -> FrasalVerbsThreeFragment()
//            3 -> FrasalVerbsFourFragment()
//            4 -> PopularExpressionsFragment()
//            5 -> PopularExpressionsTwoFragment()
//            6 -> PopularExpressionsThreeFragment()
            else -> PopularExpSpainThreeFragment()
        }
    }
}