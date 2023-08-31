package com.example.baharapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity: AppCompatActivity() {
    private lateinit var btnMove: Button
    private lateinit var btnMoveToIntent: Button
    private fun constructor() {
        btnMove = findViewById(R.id.btn_move_activity)
        btnMoveToIntent = findViewById(R.id.btnMoveToIntent)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        constructor()

        // Move to Latihan 1
        btnMove.setOnClickListener {
            startActivity(Intent(this@HomeActivity, HalloDunia::class.java))
        }

        // Move to Latihan 2
        btnMoveToIntent.setOnClickListener {
            startActivity(Intent(this@HomeActivity, IntentActivity::class.java))
        }
    }

}