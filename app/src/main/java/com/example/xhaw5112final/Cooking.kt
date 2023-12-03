package com.example.xhaw5112final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Cooking : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cooking)
        
        val cooking = findViewById<TextView>(R.id.textView34)
        val fees = findViewById<TextView>(R.id.textView35)
        val purpose = findViewById<TextView>(R.id.textView36)
        val content = findViewById<TextView>(R.id.textView37)
        val content2 = findViewById<TextView>(R.id.textView38)
        val content3 = findViewById<TextView>(R.id.textView39)
        val content4 = findViewById<TextView>(R.id.textView40)
        val content5 = findViewById<TextView>(R.id.textView41)
        val childMinding = findViewById<TextView>(R.id.textView42)
        val gardenMaintenance = findViewById<TextView>(R.id.textView29)

        val button16 = findViewById<Button>(R.id.button16)
        button16.setOnClickListener {
            val intent = Intent(this, ChildMinding::class.java)
            startActivity(intent)
        }

        val button13 = findViewById<Button>(R.id.button13)
        button13.setOnClickListener {
            val intent = Intent(this, GardenMaintenance::class.java)
            startActivity(intent)
        }

        val dropdownButton = findViewById<Button>(R.id.dropdown4)

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
                    val intent = Intent(this@Cooking,MainActivity::class.java)
                    startActivity(intent)
                }

                "6WeekCourses" -> {
                    val intent = Intent(this@Cooking,Week::class.java)
                    startActivity(intent)
                }

                "6MonthCourses" -> {
                    val intent = Intent(this@Cooking,Month::class.java)
                    startActivity(intent)
                }



            }
            true
        }
        }
    }


