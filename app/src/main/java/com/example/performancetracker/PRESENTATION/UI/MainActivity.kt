package com.example.performancetracker.PRESENTATION.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.performancetracker.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = findNavController(R.id.activity_main_nav_host_fragment)
        // Find reference to bottom navigation view
        val navView: BottomNavigationView = findViewById(R.id.BottomNavViewId)
        // Hook your navigation controller to bottom navigation view
        navView.setupWithNavController(navController)
    }
}