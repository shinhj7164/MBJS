package com.example.mubyeongjangsu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var username = findViewById<EditText>(R.id.username)
        var password = findViewById<EditText>(R.id.password)

        var loginBtn = findViewById<Button>(R.id.login)
        var registerBtn = findViewById<Button>(R.id.regi)



        loginBtn.setOnClickListener(){
            val id = username.text.toString()
            val pw = password.text.toString()

            // 파베에서 유저 있는지

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

        registerBtn.setOnClickListener(){
            val intentRegi = Intent(this,RegiActivity::class.java)
            startActivity(intentRegi)
        }

    }
}