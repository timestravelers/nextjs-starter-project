package com.visiontrade.ai.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.visiontrade.ai.ui.fragments.AnalysisFragment
import com.visiontrade.ai.ui.fragments.HomeFragment
import com.visiontrade.ai.ui.fragments.PredictionFragment
import com.visiontrade.ai.ui.fragments.SettingsFragment

class MainPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    private val fragments = listOf(
        HomeFragment(),
        AnalysisFragment(),
        PredictionFragment(),
        SettingsFragment()
    )

    override fun getItemCount(): Int = fragments.size

    override fun createFragment(position: Int): Fragment = fragments[position]
}
