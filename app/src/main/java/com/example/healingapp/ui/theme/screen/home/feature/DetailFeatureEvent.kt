package com.example.healingapp.ui.theme.screen.home.feature

sealed class DetailFeatureEvent{
    data class OnSelectChange(val title:String): DetailFeatureEvent()
}
