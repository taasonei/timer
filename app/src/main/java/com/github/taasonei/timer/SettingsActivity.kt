package com.github.taasonei.timer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.taasonei.timer.databinding.ActivitySettingsBinding

class SettingsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySettingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        supportActionBar?.title = "Settings"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}