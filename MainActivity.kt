package com.example.bmicalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val weightText = findViewById<EditText>(R.id.etWeight)
        val heightText = findViewById<EditText>(R.id.etHeight)
        val calc = findViewById<Button>(R.id.calc)
//
        calc.setOnClickListener {
            val weight = weightText.text.toString()
            val height = heightText.text.toString()

            val bmi = weight.toFloat() / ((height.toFloat() / 100) * (height.toFloat() / 100))
            // limit to 2 decimal places

            val bmi2d = String.format("%.2f", bmi).toFloat()

            display(bmi2d)
        }
    }

    private fun display(bmi: Float) {
        val resindex = findViewById<TextView>(R.id.ansBMI)
        resindex.text=bmi.toString()


    }

}