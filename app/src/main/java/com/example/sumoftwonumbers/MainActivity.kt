package com.example.sumoftwonumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val var1 = findViewById<EditText>(R.id.etVar1)
        val var2 = findViewById<EditText>(R.id.etVar2)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val result = findViewById<TextView>(R.id.tvResult)

        btnAdd.setOnClickListener {
            val value1 = var1.text.toString()
            val value2 = var2.text.toString()

            if (value1.isNotEmpty() && value2.isNotEmpty()) {
                val res = value1.toInt() + value2.toInt()
                result.text = res.toString()
            } else {
                AlertDialog.Builder(this)
                    .setTitle("Invalid Operation")
                    .setMessage("Please enter both numbers")
                    .setPositiveButton("Ok") { dialog, _ -> dialog.dismiss() }
                    .setCancelable(false)
                    .show()
            }


        }
    }
}