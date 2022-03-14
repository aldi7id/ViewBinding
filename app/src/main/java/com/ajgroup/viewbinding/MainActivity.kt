package com.ajgroup.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ajgroup.viewbinding.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnClickMe.text = "Klik Saya"
        binding.btnClickMe.setOnClickListener {
            Snackbar.make(binding.btnClickMe, "Tombol Ditekan", Snackbar.LENGTH_LONG).setAction("OK BosQ", View.OnClickListener {

            }).show() }
        }
    }