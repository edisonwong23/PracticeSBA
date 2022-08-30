package com.example.sba5

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.RadioButton
import android.widget.Spinner
import com.example.sba5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var answer: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        binding.btnContactUs.setOnClickListener{ contactus() }

        binding.checkweightBtn.setOnClickListener{ checkweight() }

    }


    fun checkweight(){
        val selectedAge = binding.AgeGroupRadioBtn.checkedRadioButtonId
        val radioBtnAge =  binding.root.findViewById<RadioButton>(selectedAge)

        if(radioBtnAge.text.equals(binding.young.text)){
            if(binding.GenderSpinner.selectedItem.equals("Male")){
                binding.weightCheckTxt.text = "You are Ok"
            }
            else{
                binding.weightCheckTxt.text = "You are Not Ok"
            }

        }

    }

    fun contactus(){
        var intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:0102214933")
        startActivity(intent)

    }

    fun web (){
        val url = "http://www.google.com"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
}