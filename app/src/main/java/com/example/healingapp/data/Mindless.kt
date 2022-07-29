package com.example.healingapp.data

import androidx.annotation.DrawableRes

data class Mindless(
        val category : String,
        val title :String,
//        @DrawableRes val iconId: Int,
        val iconId : String,
        val author : String,
        val song : String,
        val time : String,
        val content : String,


)