package com.visiontrade.ai

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.visiontrade.ai.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = MainPagerAdapter(this)
        binding.viewPager.adapter = adapter

        val tabLayout = binding.tabLayout
        val viewPager = binding.viewPager

        val tabTitles = listOf("Home", "Analysis", "Prediction", "Settings")

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = tabTitles[position]
        }.attach()
    }
}
