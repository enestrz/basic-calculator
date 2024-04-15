package com.example.basiccalculator

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.basiccalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var number1: Double? = null
    var number2: Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        val view = binding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


    }

    fun toplama(view: View) {
        if(binding.editText1.text.isNotEmpty() && binding.editText2.text.isNotEmpty()) {
            val num: Number = binding.editText1.text.toString().toInt() + binding.editText2.text.toString().toInt()
            binding.textView.text = "Result: ${num}"
        } else {
            binding.textView.text = "Please enter number!"
        }
    }

    fun cikarma(view: View) {
        if(binding.editText1.text.isNotEmpty() && binding.editText2.text.isNotEmpty()) {
            val num: Number = binding.editText1.text.toString().toInt() - binding.editText2.text.toString().toInt()
            binding.textView.text = "Result: ${num}"
        } else {
            binding.textView.text = "Please enter number!"
        }
    }

    fun carpma(view: View) {
        if(binding.editText1.text.isNotEmpty() && binding.editText2.text.isNotEmpty()) {
            val num: Number = binding.editText1.text.toString().toInt() * binding.editText2.text.toString().toInt()
            binding.textView.text = "Result: ${num}"
        } else {
            binding.textView.text = "Please enter number!"
        }
    }

    fun bolme(view: View) {
        if(binding.editText1.text.isNotEmpty() && binding.editText2.text.isNotEmpty()) {
            val num: Number = binding.editText1.text.toString().toInt() / binding.editText2.text.toString().toInt()
            binding.textView.text = "Result: ${num}"
        } else {
            binding.textView.text = "Please enter number!"
        }
    }
}