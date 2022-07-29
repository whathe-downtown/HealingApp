package com.example.healingapp.ui.theme.screen.bottomView

import com.example.healingapp.R

sealed class BottomNavItem(
    val title: Int, val route: String, val icon: Int
) {
    object Home : BottomNavItem(R.string.text_home, HOME, R.drawable.ic_home)
    object Search : BottomNavItem(R.string.text_search, SEARCH, R.drawable.ic_baseline_search_24)
    object Settings : BottomNavItem(R.string.text_settings, SETTINGS, R.drawable.ic_settings)
}