package com.example.xhaw5112final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.PopupMenu
import android.widget.TextView

class Sewing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sewing)

        val sewing = findViewById<TextView>(R.id.textView51)
        val fees = findViewById<TextView>(R.id.textView55)
        val purpose = findViewById<TextView>(R.id.textView56)
        val content = findViewById<TextView>(R.id.textView57)
        val content2 = findViewById<TextView>(R.id.textView58)
        val content3 = findViewById<TextView>(R.id.textView59)
        val content4 = findViewById<TextView>(R.id.textView60)
        val content5 = findViewById<TextView>(R.id.textView61)
        val content6 = findViewById<TextView>(R.id.textView62)
        val firstAid = findViewById<TextView>(R.id.textView63)
        val landscaping = findViewById<TextView>(R.id.textView64)
        val lifeSkills = findViewById<TextView>(R.id.textView65)

        val button22 = findViewById<Button>(R.id.button22)
        button22.setOnClickListener {
            val intent = Intent(this, FirstAid::class.java)
            startActivity(intent)
        }

        val button23 = findViewById<Button>(R.id.button23)
        button23.setOnClickListener {
            val intent = Intent(this, Landscaping::class.java)
            startActivity(intent)
        }

        val button24 = findViewById<Button>(R.id.button24)
        button24.setOnClickListener {
            val intent = Intent(this, LifeSkills::class.java)
            startActivity(intent)
        }

        val dropdownButton = findViewById<Button>(R.id.dropdown8)

        val options = arrayOf("Home", "MonthCourses", "shortCourses", "ContactUs")

        val popupMenu = PopupMenu(this, dropdownButton)
        for (option in options) {
            popupMenu.menu.add(option)
        }

        dropdownButton.setOnClickListener {
            popupMenu.show()
        }

        popupMenu.setOnMenuItemClickListener { item ->
            val selectedOption = item.title.toString()

            when (selectedOption) {
                "Home" -> {
                    val intent = Intent(this@Sewing,MainActivity::class.java)
                    startActivity(intent)
                }

                "6WeekCourses" -> {
                    val intent = Intent(this@Sewing,Week::class.java)
                    startActivity(intent)
                }

                "6MonthCourses" -> {
                    val intent = Intent(this@Sewing,Month::class.java)
                    startActivity(intent)
                }

                "ContactUs" -> {
                    val intent = Intent(this@Sewing,Contact::class.java)
                    startActivity(intent)
                }




            }
            true
        }
    }
}