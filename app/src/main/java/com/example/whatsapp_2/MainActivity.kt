package com.example.whatsapp_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentPagerAdapter
import com.example.whatsapp_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    var title= arrayOf("Chats","Status","Calls")
    var frags= arrayOf(ChatFragment(),StatusFragment(),CallFragment())
    private var binding: ActivityMainBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pager.adapter = FragtPagerAdapter(supportFragmentManager, frags, title,)
        binding.tabs.setupWithViewPager(binding.pager)


    }
}