package com.example.healingapp.repository

import com.example.healingapp.R
import com.example.healingapp.data.BannerPage
import com.example.healingapp.data.Feature
import com.example.healingapp.data.Mindless
import com.example.healingapp.ui.theme.*

object SampleRepository {

    val featureSectionList = listOf(
        Feature(
            title = "숙면",
            R.drawable.ic_sleep,
            BlueViolet1,
            BlueViolet2,
            BlueViolet3
        ),
        Feature(
            title = "명상",
            R.drawable.ic_meditation,
            LightGreen1,
            LightGreen2,
            LightGreen3
        ),
        Feature(
            title = "심리",
            R.drawable.ic_mind,
            OrangeYellow1,
            OrangeYellow2,
            OrangeYellow3
        ),
        Feature(
            title = "음악",
            R.drawable.ic_music,
            Beige1,
            Beige2,
            Beige3
        )
    )


    val bannerPageList = listOf(
        BannerPage(
            color = R.drawable.ic_bluebackground,
            title = "1 Page"
        ),
        BannerPage(
            color = R.drawable.ic_bluebackground,
            title = "2 Page"
        ),
        BannerPage(
            color = R.drawable.ic_bluebackground,
            title = "3 Page"
        ),
        BannerPage(
            color = R.drawable.ic_bluebackground,
            title = "4 Page"
        ),
//        BannerPage(
//            color =Color.Red,
//            title = "5 Page"
//        ),
//        BannerPage(
//            color =Color.Transparent,
//            title = "6 Page"
//        )
    )
}