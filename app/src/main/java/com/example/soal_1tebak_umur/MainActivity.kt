package com.example.soal_1tebak_umur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var input = findViewById<EditText>(R.id.et_input)
        var btn_cek = findViewById<Button>(R.id.btn_cek)
        var output = findViewById<TextView>(R.id.tv_output)

        btn_cek.setOnClickListener {
            try {
                var hasil: Int = 2020 - input.text.toString().toInt()
                if(input.length() > 0){
                    output.setText("Umur anda adalah $hasil")
                }
                else {
                    Toast.makeText(this, "Fill in numbers", Toast.LENGTH_LONG).show()
                }
            } catch (e: Exception) {
                Toast.makeText(this, "Masukkan angka!", Toast.LENGTH_LONG).show()
            }

        }
    }
}

