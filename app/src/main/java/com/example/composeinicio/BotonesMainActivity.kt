package com.example.composeinicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.composeinicio.databinding.ActivityMainBotonesBinding


class BotonesMainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBotonesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBotonesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {
            val intent = Intent(this,MainActivityEj2Column::class.java)
            startActivity(intent)
        }

        binding.button2.setOnClickListener {
            val intent = Intent(this,MainActivityEj3Column::class.java)
            startActivity(intent)
        }

        binding.button3.setOnClickListener {
            val intent = Intent(this,MainActivityEj3Row::class.java)
            startActivity(intent)
        }
    }
}