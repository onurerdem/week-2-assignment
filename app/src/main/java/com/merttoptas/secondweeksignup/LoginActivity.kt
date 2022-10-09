package com.merttoptas.secondweeksignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class LoginActivity : AppCompatActivity() {
    private lateinit var ivChangePasswordVisibility: ImageView
    private var isVisibilityOn = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        ivChangePasswordVisibility  = findViewById(R.id.ivShowPassword)

        ivChangePasswordVisibility.setOnClickListener {
            if (isVisibilityOn) {
                ivChangePasswordVisibility.setImageResource(R.drawable.ic_baseline_visibility_24)
                isVisibilityOn = false
            } else {
                ivChangePasswordVisibility.setImageResource(R.drawable.ic_baseline_visibility_off_24)
                isVisibilityOn = true
            }
        }

        // get reference to button
        val btnSignUp = findViewById(R.id.btnSignUp) as Button
        // set on-click listener
        btnSignUp.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}