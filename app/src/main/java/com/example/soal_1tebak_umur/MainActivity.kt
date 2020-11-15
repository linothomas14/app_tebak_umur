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
        val input = et_input
        val output = tv_output

        btn_cek.setOnClickListener {
            if (input.text.toString().isNotEmpty()) { //Check input
                val hasil: Int = 2020 - input.text.toString().toInt()
                if (hasil > 0) output.text = "Umur anda adalah $hasil tahun"
                else Toast.makeText(this, "Masukkan tahun kelahiran dibawah 2020", Toast.LENGTH_LONG).show()
            } else Toast.makeText(this, "Masukkan tahun anda !!", Toast.LENGTH_LONG).show()
        }
    }
}