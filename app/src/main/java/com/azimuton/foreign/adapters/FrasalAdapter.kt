package com.azimuton.foreign.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.azimuton.foreign.fragments.english.frasalverbs.FrasalVerbsFourFragment
import com.azimuton.foreign.fragments.english.frasalverbs.FrasalVerbsFragment
import com.azimuton.foreign.fragments.english.frasalverbs.FrasalVerbsThreeFragment
import com.azimuton.foreign.fragments.english.frasalverbs.FrasalVerbsTwoFragment
import com.azimuton.foreign.fragments.english.popularexpressions.PopularExpressionsFourFragment
import com.azimuton.foreign.fragments.english.popularexpressions.PopularExpressionsFragment
import com.azimuton.foreign.fragments.english.popularexpressions.PopularExpressionsThreeFragment
import com.azimuton.foreign.fragments.english.popularexpressions.PopularExpressionsTwoFragment

class FrasalAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 8
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FrasalVerbsFragment()
            1 -> FrasalVerbsTwoFragment()
            2 -> FrasalVerbsThreeFragment()
            3 -> FrasalVerbsFourFragment()
            4 -> PopularExpressionsFragment()
            5 -> PopularExpressionsTwoFragment()
            6 -> PopularExpressionsThreeFragment()
            else -> PopularExpressionsFourFragment()
        }
    }
}