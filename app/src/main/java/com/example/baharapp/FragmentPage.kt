package com.example.baharapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class FragmentPage: AppCompatActivity() {
    private lateinit var containerFragmentResult: RelativeLayout
    private lateinit var btnFragment: Button
    private fun constructor() {
        btnFragment = findViewById(R.id.btn_first_fragment)
        containerFragmentResult = findViewById(R.id.container_fragment)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_fragment_page)
        constructor()

        val supportFragment = supportFragmentManager
        val homeFragment = HomeFragment()
        val fragment = supportFragment.findFragmentByTag(HomeFragment::class.java.simpleName)

        btnFragment.setOnClickListener {
            if ( fragment !is HomeFragment ) {
                if ( containerFragmentResult.childCount == 0 ) {
                    supportFragment
                        .beginTransaction()
                        .add(R.id.container_fragment, homeFragment)
                        .commit()
                }else {
                    supportFragment
                        .beginTransaction()
                        .remove(homeFragment)
                        .commit()
                }
            }
        }
    }

}