package com.example.healingapp.ui.theme.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.healingapp.graphs.RootNavigationGraph
import com.example.healingapp.ui.theme.HealingAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HealingAppTheme {
                RootNavigationGraph(navController = rememberNavController())
            }
        }
    }
}






