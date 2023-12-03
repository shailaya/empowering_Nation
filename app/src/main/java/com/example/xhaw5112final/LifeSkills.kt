package com.example.xhaw5112final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView

class LifeSkills : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_skills)

        val logo = findViewById<ImageView>(R.id.imageView10)
        val firstAid = findViewById<TextView>(R.id.textView44)
        val fees = findViewById<TextView>(R.id.textView45)
        val purpose = findViewById<TextView>(R.id.textView46)
        val content = findViewById<TextView>(R.id.textView47)
        val content2 = findViewById<TextView>(R.id.textView48)
        val content3 = findViewById<TextView>(R.id.textView49)
        val content4 = findViewById<TextView>(R.id.textView50)
        val sewing = findViewById<TextView>(R.id.textView52)
        val landscaping = findViewById<TextView>(R.id.textView53)
        val lifeSkills = findViewById<TextView>(R.id.textView54)

        val button19 = findViewById<Button>(R.id.button19)
        button19.setOnClickListener {
            val intent = Intent(this, Sewing::class.java)
            startActivity(intent)
        }

        val button20 = findViewById<Button>(R.id.button20)
        button20.setOnClickListener {
            val intent = Intent(this, Landscaping::class.java)
            startActivity(intent)
        }

        val button21 = findViewById<Button>(R.id.button21)
        button21.setOnClickListener {
            val intent = Intent(this, LifeSkills::class.java)
            startActivity(intent)
        }

        val dropdownButton = findViewById<Button>(R.id.dropdown10)

        val options = arrayOf("Home", "MonthCourses", "ShortCourses", "ContactUs", )

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
                    val intent = Intent(this@LifeSkills,MainActivity::class.java)
                    startActivity(intent)
                }

                "6WeekCourses" -> {
                    val intent = Intent(this@LifeSkills,Week::class.java)
                    startActivity(intent)
                }

                "6MonthCourses" -> {
                    val intent = Intent(this@LifeSkills,Month::class.java)
                    startActivity(intent)
                }

                "ContactUs" -> {
                    val intent = Intent(this@LifeSkills,Contact::class.java)
                    startActivity(intent)
                }



            }
            true
        }
    }
}