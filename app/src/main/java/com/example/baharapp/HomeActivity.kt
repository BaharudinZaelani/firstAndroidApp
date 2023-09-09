package com.example.baharapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class HomeActivity: AppCompatActivity() {
    private lateinit var btnMove: Button
    private lateinit var btnMoveToIntent: Button
    private lateinit var btnRcycleViewer: Button
    private lateinit var btnFragment: Button
    private fun constructor() {
        btnMove = findViewById(R.id.btn_move_activity)
        btnMoveToIntent = findViewById(R.id.btnMoveToIntent)
        btnRcycleViewer = findViewById(R.id.btnRecyclerView)
        btnFragment = findViewById(R.id.btnFragmen)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        constructor()

        // Move to Latihan 1 : Hallo Dunia
        btnMove.setOnClickListener {
            startActivity(Intent(this@HomeActivity, HalloDunia::class.java))
        }

        // Move to Latihan 2 : Intent
        btnMoveToIntent.setOnClickListener {
            startActivity(Intent(this@HomeActivity, IntentActivity::class.java))
        }

        // Move to Latihan 3 : Recycle Viewer
        btnRcycleViewer.setOnClickListener {
            startActivity(Intent(this@HomeActivity, RecycleActivity::class.java))
        }

        // Move to Fragment Page
        val supportFragment = supportFragmentManager
        val homeFragment = HomeFragment()
        val fragment = supportFragment.findFragmentByTag(HomeFragment::class.java.simpleName)

        val container: LinearLayout = findViewById(R.id.container_fragment)
        btnFragment.setOnClickListener {
            if ( fragment !is HomeFragment ) {
                if ( container.childCount == 0 ) {
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