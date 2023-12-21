package com.zmei.serviceplayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zmei.serviceplayer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            startBtn.setOnClickListener {
                startService(Intent(this@MainActivity, MyService::class.java))
            }
            stopBtn.setOnClickListener {
                stopService(Intent(this@MainActivity, MyService::class.java))
            }
        }
    }
}