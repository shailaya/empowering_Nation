package com.example.xhaw5112final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class ChildMinding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_minding)

        val childMinding2 = findViewById<TextView>(R.id.textView15)
        val fees = findViewById<TextView>(R.id.textView16)
        val purpose = findViewById<TextView>(R.id.textView17)
        val content = findViewById<TextView>(R.id.textView18)
        val content2 = findViewById<TextView>(R.id.textView20)
        val content3 = findViewById<TextView>(R.id.textView21)
        val content4 = findViewById<TextView>(R.id.textView22)
        val content5 = findViewById<TextView>(R.id.textView23)
        val cooking = findViewById<TextView>(R.id.textView24)
        val gardenMain = findViewById<TextView>(R.id.textView25)

        val button10 = findViewById<Button>(R.id.button10)
        button10.setOnClickListener {
            val intent = Intent(this, Cooking::class.java)
            startActivity(intent)
        }

        val button14 = findViewById<Button>(R.id.button14)
        button14.setOnClickListener {
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
                    val intent = Intent(this@ChildMinding,MainActivity::class.java)
                    startActivity(intent)
                }

                "6WeekCourses" -> {
                    val intent = Intent(this@ChildMinding,Week::class.java)
                    startActivity(intent)
                }

                "ChildMinding" -> {
                    val intent = Intent(this@ChildMinding, ChildMinding::class.java)
                    startActivity(intent)
                }

                "Cooking" -> {
                    val intent = Intent(this@ChildMinding, Cooking::class.java)
                    startActivity(intent)
                }

                "FirstAid" -> {
                    val intent = Intent(this@ChildMinding, FirstAid::class.java)
                    startActivity(intent)
                }

            }
            true
        }

    }
}
