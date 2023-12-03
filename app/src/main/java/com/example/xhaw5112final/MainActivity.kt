package com.example.xhaw5112final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.PopupMenu
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val home = findViewById<TextView>(R.id.textView)
        val month = findViewById<TextView>(R.id.textView2)
        val week = findViewById<TextView>(R.id.textView3)
        val contact = findViewById<TextView>(R.id.textView4)
        val fees = findViewById<TextView>(R.id.textView5)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, month::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent = Intent(this, week::class.java)
            startActivity(intent)
        }

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val intent = Intent(this, contact::class.java)
            startActivity(intent)
        }

        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val intent = Intent(this, fees::class.java)
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
                    val intent = Intent(this@MainActivity,MainActivity::class.java)
                    startActivity(intent)
                }

                "6WeekCourses" -> {
                    val intent = Intent(this@MainActivity,Week::class.java)
                    startActivity(intent)
                }

                "6MonthCourses" -> {
                    val intent = Intent(this@MainActivity,Month::class.java)
                    startActivity(intent)
                }

                "ContactUs" -> {
                    val intent = Intent(this@MainActivity,Contact::class.java)
                    startActivity(intent)
                }

            }
            true
        }





    }
}