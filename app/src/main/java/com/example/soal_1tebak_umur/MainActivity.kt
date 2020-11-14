package com.example.soal_1tebak_umur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        et_input.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                if (s.toString().trim({ it <= ' ' }).isEmpty()) {
                    btn_cek.setEnabled(false)
                } else {
                    btn_cek.setEnabled(true)
                }
            }

            override fun beforeTextChanged(
                s: CharSequence, start: Int, count: Int,
                after: Int
            ) {
                // TODO Auto-generated method stub
            }

            override fun afterTextChanged(s: Editable) {
                // TODO Auto-generated method stub
            }
        })
        btn_cek.setOnClickListener {
            var input = findViewById<EditText>(R.id.et_input)
            var output = findViewById<TextView>(R.id.tv_output)

            var hasil: Int = 2020 - input.text.toString().toInt()
            if (input.length() > 0) {
                if (hasil > 0) output.setText("Umur anda adalah $hasil tahun")
                else Toast.makeText(
                    this,
                    "masukkan tahun kelahiran dibawah 2020",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}

