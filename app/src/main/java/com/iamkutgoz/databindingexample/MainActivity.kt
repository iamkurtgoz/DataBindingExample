package com.iamkutgoz.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.iamkutgoz.databindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.userModel = getUser()

        binding.textUsername.text = "Mehmet!"
    }

    fun getUser(): User {
        return User().apply {
            username = "Mehmet"
            userAge = 23
        }
    }
}