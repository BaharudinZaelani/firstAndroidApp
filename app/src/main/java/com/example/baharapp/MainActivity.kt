package com.example.baharapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var kata: EditText
    private lateinit var submitButton: Button
    private lateinit var textResult: TextView
    private lateinit var tvsayHallo: TextView

    private fun initComponents() {
        kata = findViewById(R.id.editText)
        submitButton = findViewById(R.id.submit)
        textResult = findViewById(R.id.textView)
        tvsayHallo = findViewById(R.id.tvsayHallo)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hallo_world)

        initComponents()
        tvsayHallo.text = resources.getString(R.string.say_hello, " Bahar Disini")
        textResult.text = resources.getString(R.string.app_name)

        submitButton.setOnClickListener {
            val tmpName = kata.text.toString()
            if ( tmpName.trim().isEmpty() ) textResult.text = resources.getString(R.string.error_text_null) else {
                textResult.text = tmpName
            }
        }

        resources.getStringArray(R.array.names).forEach{
            Log.i("PZN", it)
        }
    }
}