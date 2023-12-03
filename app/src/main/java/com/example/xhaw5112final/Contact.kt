package com.example.xhaw5112final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Contact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val calculateButton = findViewById<Button>(R.id.button30)
        val totalFeeTextView = findViewById<TextView>(R.id.textView93)

        calculateButton.setOnClickListener {
            val firstAid = findViewById<CheckBox>(R.id.checkBox)
            val sewing = findViewById<CheckBox>(R.id.checkBox2)
            val lifeSkills = findViewById<CheckBox>(R.id.checkBox3)
            val landscaping = findViewById<CheckBox>(R.id.checkBox4)
            val childMinding = findViewById<CheckBox>(R.id.checkBox5)
            val gardenMaintenance = findViewById<CheckBox>(R.id.checkBox6)
            val cooking = findViewById<CheckBox>(R.id.checkBox7)


            val dropdownButton = findViewById<Button>(R.id.dropdown01)

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
                        val intent = Intent(this@Contact,MainActivity::class.java)
                        startActivity(intent)
                    }

                    "6WeekCourses" -> {
                        val intent = Intent(this@Contact,Week::class.java)
                        startActivity(intent)
                    }

                    "6MonthCourses" -> {
                        val intent = Intent(this@Contact,Month::class.java)
                        startActivity(intent)
                    }

                    "ContactUs" -> {
                        val intent = Intent(this@Contact,Contact::class.java)
                        startActivity(intent)
                    }




                }
                true
            }

            val numberOfSelectedCourses = calculateSelectedCourses(
                firstAid.isChecked, sewing.isChecked, lifeSkills.isChecked,
                landscaping.isChecked, childMinding.isChecked,
                gardenMaintenance.isChecked, cooking.isChecked
            )

            val totalFee = calculateTotalFee(numberOfSelectedCourses)
            totalFeeTextView.apply {
                visibility = View.VISIBLE
                text = "Total Fee: $totalFee"
            }
        }
    }

    private fun calculateTotalFee(selectedCourses: Int): Double {
        val coursePrice = 1500
        var totalFee = selectedCourses * coursePrice.toDouble()

        when (selectedCourses) {
            1 -> totalFee *= 1.0 // No discount
            2 -> totalFee *= 0.95 // 5% discount
            3 -> totalFee *= 0.9 // 10% discount
            else -> totalFee *= 0.85 // More than three courses - 15% discount
        }

        // Adding VAT (15%)
        val vat = 0.15
        totalFee *= (1 + vat)

        return totalFee
    }

    private fun calculateSelectedCourses(vararg courses: Boolean): Int {
        var count = 0
        for (course in courses) {
            if (course) {
                count++
            }
        }
        return count
    }
}