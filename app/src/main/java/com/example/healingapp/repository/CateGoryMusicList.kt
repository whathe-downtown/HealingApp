package com.example.healingapp.repository

import com.example.healingapp.R
import com.example.healingapp.data.Feature
import com.example.healingapp.data.Mindless
import com.example.healingapp.ui.theme.screen.home.FeatureItem

object CateGoryMusicList {
    // "명상" , "숙면", "심리", "음악"
    val newMusicList = listOf(
        Mindless(
            "숙면",
            title = "안녕하세요 청규입니다",
            iconId = "https://ncsmusic.s3.eu-west-1.amazonaws.com/tracks/000/001/162/325x325/spirit-1657620037-xoCy7z9CVP.jpg",
            author = "유청규",
            song ="https://ncsmusic.s3.eu-west-1.amazonaws.com/tracks/000/001/156/faster-1656669639-AiydEWO566.mp3",
            time = "3:20",
            content = "이것은 우리들만 아는노래 "
        ),
        Mindless(
            "명상",
            title = "안녕하세요 청규입니다",
            iconId = "https://ncsmusic.s3.eu-west-1.amazonaws.com/tracks/000/001/160/325x325/1657791566_q0nQ8753JM_Demo-Canvas.jpeg",
            author = "유청규",
            song ="https://ncsmusic.s3.eu-west-1.amazonaws.com/tracks/000/001/156/faster-1656669639-AiydEWO566.mp3",
            time = "3:20",
            content = "이것은 우리들만 아는노래 "
        ),
        Mindless(
            "심리",
            title = "안녕하세요 청규입니다",
            iconId = "https://ncsmusic.s3.eu-west-1.amazonaws.com/tracks/000/001/160/325x325/1657791566_q0nQ8753JM_Demo-Canvas.jpeg",
            author = "유청규",
            song ="https://ncsmusic.s3.eu-west-1.amazonaws.com/tracks/000/001/156/faster-1656669639-AiydEWO566.mp3",
            time = "3:20",
            content = "이것은 우리들만 아는노래 "
        ),
    )
    val allMusicList = listOf(
        Mindless(
            "숙면",
            title = "안녕하세요 청규입니다",
            iconId = "https://ncsmusic.s3.eu-west-1.amazonaws.com/tracks/000/001/162/325x325/spirit-1657620037-xoCy7z9CVP.jpg",
            author = "유청규",
            song ="https://ncsmusic.s3.eu-west-1.amazonaws.com/tracks/000/001/162/spirit-1657620039-HPJE1wF0bg.mp3",
            time = "3:20",
            content = "이것은 우리들만 아는노래 "
        ),
        Mindless(
            "명상",
            title = "안녕하세요 민수입니다",
            iconId = "https://ncsmusic.s3.eu-west-1.amazonaws.com/tracks/000/001/158/325x325/sunrise-1657018838-ZZ62Lhsm4p.jpg",
            author = "유청규",
            song ="https://ncsmusic.s3.eu-west-1.amazonaws.com/tracks/000/001/158/sunrise-1657018840-EPxbz2cIzA.mp3",
            time = "3:20",
            content = "이것은 우리들만 아는노래 "
        ),
        Mindless(
            "심리",
            title = "안녕하세요 청규입니다",
            iconId = "https://ncsmusic.s3.eu-west-1.amazonaws.com/tracks/000/001/169/325x325/not-enough-1658844039-DfDKa1tylP.jpg",
            author = "유청규",
            song ="슬픈노래.mp3",
            time = "3:20",
            content = "이것은 우리들만 아는노래"
        ),
        Mindless(
            "음악",
            title = "안녕하세요 청규입니다",
            iconId = "https://ncsmusic.s3.eu-west-1.amazonaws.com/tracks/000/001/160/325x325/1657791566_q0nQ8753JM_Demo-Canvas.jpeg",
            author = "유청규",
            song ="https://ncsmusic.s3.eu-west-1.amazonaws.com/tracks/000/001/160/dioma-demo-1657270836-bM6caFKCod.mp3",
            time = "3:20",
            content = "이것은 우리들만 아는노래 "
        ),
    )


    fun getSelect(selectName : String?) : List<Mindless>{
        return  allMusicList.filter { it.category == selectName }
    }
}