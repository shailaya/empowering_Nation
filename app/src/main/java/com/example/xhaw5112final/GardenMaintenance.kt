package com.example.xhaw5112final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class GardenMaintenance : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_garden_maintenance)

        val gardenMaintenance = findViewById<TextView>(R.id.textView19)
        val fees = findViewById<TextView>(R.id.textView26)
        val purpose = findViewById<TextView>(R.id.textView27)
        val content = findViewById<TextView>(R.id.textView28)
        val content1 = findViewById<TextView>(R.id.textView30)
        val content2 = findViewById<TextView>(R.id.textView31)
        val content3 = findViewById<TextView>(R.id.textView32)
        val cooking = findViewById<TextView>(R.id.textView33)
        val childMinding = findViewById<TextView>(R.id.textView43)

        val button15 = findViewById<Button>(R.id.button15)
        button15.setOnClickListener {
            val intent = Intent(this, Cooking::class.java)
            startActivity(intent)
        }

        val button17 = findViewById<Button>(R.id.button17)
        button17.setOnClickListener {
            val intent = Intent(this, ChildMinding::class.java)
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
                    val intent = Intent(this@GardenMaintenance,MainActivity::class.java)
                    startActivity(intent)
                }

                "6WeekCourses" -> {
                    val intent = Intent(this@GardenMaintenance,Week::class.java)
                    startActivity(intent)
                }

                "ChildMinding" -> {
                    val intent = Intent(this@GardenMaintenance, ChildMinding::class.java)
                    startActivity(intent)
                }

                "Cooking" -> {
                    val intent = Intent(this@GardenMaintenance, Cooking::class.java)
                    startActivity(intent)
                }

                "FirstAid" -> {
                    val intent = Intent(this@GardenMaintenance, FirstAid::class.java)
                    startActivity(intent)
                }

            }
            true
        }
    }
}