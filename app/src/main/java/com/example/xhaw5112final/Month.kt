package com.example.xhaw5112final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Month : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_month)

        val textView = findViewById<TextView>(R.id.textView6)
        val firstAid1 = findViewById<TextView>(R.id.textView7)
        val sewing1 = findViewById<TextView>(R.id.textView8)
        val landscaping1 = findViewById<TextView>(R.id.textView9)
        val lifeSkills1 = findViewById<TextView>(R.id.textView10)

        val button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            val intent = Intent(this, FirstAid::class.java)
            startActivity(intent)
        }

        val button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener {
            val intent = Intent(this, Sewing::class.java)
            startActivity(intent)
        }

        val button7 = findViewById<Button>(R.id.button7)
        button7.setOnClickListener {
            val intent = Intent(this, Landscaping::class.java)
            startActivity(intent)
        }

        val button8 = findViewById<Button>(R.id.button8)
        button8.setOnClickListener {
            val intent = Intent(this, LifeSkills::class.java)
            startActivity(intent)
        }

    }
}