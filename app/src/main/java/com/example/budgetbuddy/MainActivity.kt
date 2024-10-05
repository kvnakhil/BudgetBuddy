package com.example.budgetbuddy

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    lateinit var usernameInput:EditText
    lateinit var passwordInput:EditText
    lateinit var loginBtn:Button
    lateinit var signupBtn:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        usernameInput = findViewById(R.id.username_input)
        usernameInput = findViewById(R.id.password_input)
        loginBtn = findViewById(R.id.login_btn)
        signupBtn = findViewById(R.id.signup_btn)


        loginBtn.setOnClickListener {

            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

        }
    }

}