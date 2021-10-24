package com.example.mubyeongjangsu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class RegiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regi)

        var id = findViewById<EditText>(R.id.et_id_regi)
        var pw = findViewById<EditText>(R.id.et_pw_regi)
        var repw = findViewById<EditText>(R.id.et_pwpw_regi)

        // 정보 더 넣고

        // 파베 계정 등록

    }
}