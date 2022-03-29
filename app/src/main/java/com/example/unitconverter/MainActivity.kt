package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.view.isGone
import androidx.core.view.isVisible
import java.math.RoundingMode

class MainActivity : AppCompatActivity() {

    lateinit var spinner: Spinner
    lateinit var editText: EditText
    lateinit var textView1: TextView
    lateinit var textView2: TextView
    lateinit var textView3: TextView
    lateinit var textView4: TextView
    lateinit var textView5: TextView
    lateinit var textView6: TextView
    lateinit var imageButton1: ImageButton
    lateinit var imageButton2: ImageButton
    lateinit var imageButton3: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spinner = findViewById(R.id.spinner)
        editText = findViewById(R.id.editText)
        textView1 = findViewById(R.id.textView1)
        textView2 = findViewById(R.id.textView2)
        textView3 = findViewById(R.id.textView3)
        textView4 = findViewById(R.id.textView4)
        textView5 = findViewById(R.id.textView5)
        textView6 = findViewById(R.id.textView6)
        imageButton1 = findViewById(R.id.imageButton1)
        imageButton2 = findViewById(R.id.imageButton2)
        imageButton3 = findViewById(R.id.imageButton3)

        imageButton1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                if (editText.text.isEmpty()) {
                    Toast.makeText(this@MainActivity,"Please enter a number", Toast.LENGTH_SHORT).show()
                } else {
                    if (spinner.selectedItemPosition == 0) {
                        var value = editText.text.toString().toDouble()
                        textView1.text = (value * 100).toBigDecimal().setScale(2, RoundingMode.UP).toString()
                        textView2.text = "Centimetre"
                        textView3.text = (value * 3.28).toBigDecimal().setScale(2, RoundingMode.UP).toString()
                        textView4.text = "Foot"
                        textView5.isVisible = true
                        textView6.isVisible = true
                        textView5.text = (value * 39.37).toBigDecimal().setScale(2, RoundingMode.UP).toString()
                        textView6.text = "Inch"
                    } else {
                        Toast.makeText(this@MainActivity, "Please select the correct conversion icon", Toast.LENGTH_SHORT).show()
                    }
                }

            }
        })

        imageButton2.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                if (editText.text.isEmpty()) {
                    Toast.makeText(this@MainActivity,"Please enter a number", Toast.LENGTH_SHORT).show()
                } else {
                    if (spinner.selectedItemPosition == 1) {
                        var value = editText.text.toString().toDouble()
                        textView1.text = (value * 1000).toBigDecimal().setScale(2, RoundingMode.UP).toString()
                        textView2.text = "Grams"
                        textView3.text = (value * 35.27).toBigDecimal().setScale(2, RoundingMode.UP).toString()
                        textView4.text = "Ounces (Oz)"
                        textView5.isVisible = true
                        textView6.isVisible = true
                        textView5.text = (value * 2.20).toBigDecimal().setScale(2, RoundingMode.UP).toString()
                        textView6.text = "Pound(lb)"
                    } else {
                        Toast.makeText(this@MainActivity, "Please select the correct conversion icon", Toast.LENGTH_SHORT).show()
                    }
                }


            }
        })

        imageButton3.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                if (editText.text.isEmpty()) {
                    Toast.makeText(this@MainActivity,"Please enter a number", Toast.LENGTH_SHORT).show()
                } else {
                    if (spinner.selectedItemPosition == 2) {
                        var value = editText.text.toString().toDouble()
                        textView1.text = (value * 33.8).toBigDecimal().setScale(2, RoundingMode.UP).toString()
                        textView2.text = "Fahrenheit"
                        textView3.text = (value * 274.15).toBigDecimal().setScale(2, RoundingMode.UP).toString()
                        textView4.text = "Kelvin"
                        textView5.isVisible = false
                        textView6.isVisible = false
                    } else {
                        Toast.makeText(this@MainActivity, "Please select the correct conversion icon", Toast.LENGTH_SHORT).show()
                    }
                }

            }
        })


    }





}