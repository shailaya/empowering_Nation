package com.example.xhaw5112final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.PopupMenu
import android.widget.TextView

class Week : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_week)

        val week = findViewById<TextView>(R.id.textView11)
        val childMinding = findViewById<TextView>(R.id.textView12)
        val cooking = findViewById<TextView>(R.id.textView13)
        val gardenMaintenance = findViewById<TextView>(R.id.textView14)

        val button9 = findViewById<Button>(R.id.button9)
        button9.setOnClickListener {
            val intent = Intent(this, ChildMinding::class.java)
            startActivity(intent)
        }

        val button10 = findViewById<Button>(R.id.button10)
        button10.setOnClickListener {
            val intent = Intent(this, Cooking::class.java)
            startActivity(intent)
        }

        val button11 = findViewById<Button>(R.id.button11)
        button11.setOnClickListener {
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
                    val intent = Intent(this@Week,MainActivity::class.java)
                    startActivity(intent)
                }

                "6WeekCourses" -> {
                    val intent = Intent(this@Week,Week::class.java)
                    startActivity(intent)
                }

                "6MonthCourses" -> {
                    val intent = Intent(this@Week,Month::class.java)
                    startActivity(intent)
                }

                "ContactUs" -> {
                    val intent = Intent(this@Week,Contact::class.java)
                    startActivity(intent)
                }


            }
            true
        }

    }
}