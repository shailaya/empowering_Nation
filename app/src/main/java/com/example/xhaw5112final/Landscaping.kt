package com.example.xhaw5112final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.PopupMenu
import android.widget.TextView

class Landscaping : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landscaping)

        val landscaping = findViewById<TextView>(R.id.textView66)
        val fees = findViewById<TextView>(R.id.textView67)
        val purpose = findViewById<TextView>(R.id.textView68)
        val content = findViewById<TextView>(R.id.textView69)
        val content2 = findViewById<TextView>(R.id.textView70)
        val content3 = findViewById<TextView>(R.id.textView71)
        val content4 = findViewById<TextView>(R.id.textView72)
        val content5 = findViewById<TextView>(R.id.textView73)
        val firstAid = findViewById<TextView>(R.id.textView74)
        val sewing = findViewById<TextView>(R.id.textView75)
        val lifeSkills = findViewById<TextView>(R.id.textView76)

        val button25 = findViewById<Button>(R.id.button25)
        button25.setOnClickListener {
            val intent = Intent(this, FirstAid::class.java)
            startActivity(intent)
        }

        val button26 = findViewById<Button>(R.id.button26)
        button26.setOnClickListener {
            val intent = Intent(this, Sewing::class.java)
            startActivity(intent)
        }

        val button27 = findViewById<Button>(R.id.button27)
        button27.setOnClickListener {
            val intent = Intent(this, LifeSkills::class.java)
            startActivity(intent)
        }

        val dropdownButton = findViewById<Button>(R.id.dropdown9)

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
                    val intent = Intent(this@Landscaping,MainActivity::class.java)
                    startActivity(intent)
                }

                "6WeekCourses" -> {
                    val intent = Intent(this@Landscaping,Week::class.java)
                    startActivity(intent)
                }

                "6MonthCourses" -> {
                    val intent = Intent(this@Landscaping,Month::class.java)
                    startActivity(intent)
                }

                "ContactUs" -> {
                    val intent = Intent(this@Landscaping,Contact::class.java)
                    startActivity(intent)
                }




            }
            true
        }
    }
}