package com.merttoptas.secondweeksignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class SignUpActivity : AppCompatActivity() {
    private lateinit var ivChangePasswordVisibility2: ImageView
    private var isVisibilityOn2 = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        ivChangePasswordVisibility2  = findViewById(R.id.ivShowPassword)

        ivChangePasswordVisibility2.setOnClickListener {
            if (isVisibilityOn2) {
                ivChangePasswordVisibility2.setImageResource(R.drawable.ic_baseline_visibility_24)
                isVisibilityOn2 = false
            } else {
                ivChangePasswordVisibility2.setImageResource(R.drawable.ic_baseline_visibility_off_24)
                isVisibilityOn2 = true
            }
        }

        // get reference to ImageButton
        val back = findViewById(R.id.back) as ImageButton
        // set on-click listener
        back.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}