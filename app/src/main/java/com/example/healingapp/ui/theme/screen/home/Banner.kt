@file:OptIn(ExperimentalPagerApi::class)

package com.example.healingapp.ui.theme.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.healingapp.data.BannerPage
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState

@Composable
fun Banner(bannerPageList: List<BannerPage>) {

    val pagerState = rememberPagerState()
    HorizontalPager(count = bannerPageList.size, state = pagerState, modifier = Modifier
        .fillMaxWidth()
        .height(100.dp)
        .clickable { }) { count ->

        when (count) {
            0 -> {
                Text(
                    text = "Page: $count" , textAlign = TextAlign.Center , color = Color.White,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black)
                )
            }
            1 -> {
                Text(
                    text = "Page: $count" , textAlign = TextAlign.Center , color = Color.White,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Red)
                )
            }
            2 -> {
                Text(
                    text = "Page: $count" , textAlign = TextAlign.Center , color = Color.White,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Yellow)
                )
            }
        }

    }
}
