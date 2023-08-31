package com.example.baharapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity: AppCompatActivity() {
    private lateinit var btnMove: Button
    private fun constructor() {
        btnMove = findViewById(R.id.btn_move_activity)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        constructor()

        btnMove.setOnClickListener {
            val halloActivity = Intent(this@HomeActivity, HalloDunia::class.java)
            startActivity(halloActivity)
        }
    }

}