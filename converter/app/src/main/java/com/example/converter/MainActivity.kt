package com.example.converter

import android.R
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.converter.databinding.ActivityMainBinding
import com.example.converter.MainActivity.SpinnerAdapter as SpinnerAdapter1


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.convertButton.setOnClickListener{convertedAmount()}

    }
    private fun convertedAmount() {
        val stringInTextField = binding.convertingAmount.text.toString()
        val amount = stringInTextField.toDoubleOrNull()
        if (amount==null){
            binding.convertedAmount.text= " "
            return
        }
        val mySpinner: Spinner = binding.amount1
        when (mySpinner.selectedItem.toString()) {
            "meters" -> {

            }
            "feet" -> {

            }
            "yards" -> {

            }
            "millimeters" -> {

            }
            "kilometers" -> {

            }
            "centimeters" -> {

            }
            "miles" -> {

            }
            "inches" -> {

            }
            "nautical miles" -> {

            }
        }
        val adapter: SpinnerAdapter1<String> = SpinnerAdapter1<String>(
            this,
            R.layout.simple_spinner_item, list
        ).also{adapter->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        }
    }
    interface Adapter
    interface SpinnerAdapter<T> : Adapter

}

