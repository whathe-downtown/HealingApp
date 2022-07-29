@file:OptIn(ExperimentalPagerApi::class)

package com.example.healingapp.ui.home


import androidx.compose.foundation.*

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text

import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.healingapp.Count

import com.example.healingapp.R
import com.example.healingapp.repository.CateGoryMusicList
import com.example.healingapp.repository.SampleRepository
import com.example.healingapp.ui.theme.*
import com.example.healingapp.ui.theme.screen.home.Banner
import com.example.healingapp.ui.theme.screen.home.FeatureSection

import com.example.healingapp.ui.theme.screen.home.HomeHeader
import com.example.healingapp.ui.theme.screen.home.MindlessListen
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState


@Composable
fun HomeScreen(
    onClickFeatureItem: (String) -> Unit,

) {
    Box(
        modifier = Modifier
            .background(DeepBlue)
//            .background(color = MaterialTheme.colors.background)
            .fillMaxSize()
    ) {
//       BackgroundImage()
        val scrollState = rememberScrollState()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
                .padding(bottom = 100.dp)
        ) {
            HomeHeader(appName = stringResource(R.string.app_home_name))
            FeatureSection(features = SampleRepository.featureSectionList, onClickFeatureItem =  onClickFeatureItem)
            MindlessListen(mindlessList = CateGoryMusicList.newMusicList)
            Spacer(modifier = Modifier.height(20.dp))
            CardList()
            Spacer(modifier = Modifier.height(20.dp))
            Banner(bannerPageList = SampleRepository.bannerPageList)
            
            


//            CoilImage(
//                imageModel = "https://i.pinimg.com/736x/8a/d1/90/8ad1907008c01385d53aeb3108eb1630.jpg",
//                shimmerParams = ShimmerParams(
//                    baseColor = background800,
//                    highlightColor = shimmerHighLight
//                ),
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(8.dp)
//                    .height(300.dp)
//                    .clip(RoundedCornerShape(8.dp)),
//
//                error = painterResource(R.drawable.ic_play),
//            )
        }
    }

}

@Composable
fun CardList() {
    Column (modifier = Modifier.padding(10.dp)){
        val pagerState = rememberPagerState()

        val emojiCode = 0x1F315
        val emojiText = "${String(Character.toChars(emojiCode))}"
        Text(text = "마음을 더 평온하게 해주는 음악  $emojiText", color = Color.White, fontSize = 15.sp)
        HorizontalPager(count = Count.MAX_COUNT, state = pagerState) { page ->

            Card(
                modifier =  Modifier.padding(10.dp),
                backgroundColor = Color.Yellow,
                elevation = 10.dp
            ) {
                Text(
                    text = "하하하 쩡대리 카드 $page",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center, modifier = Modifier.padding(100.dp)
                )
                Text(
                    text = "Page: $page",
                    modifier = Modifier.fillMaxWidth()
                )

            }

        }
        HorizontalPagerIndicator(
            activeColor = Color.White,
            inactiveColor = Color.Red,
            pagerState = pagerState,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(16.dp),
        )
    }
}


@Composable
fun BackgroundImage() {
    Image(
        painter = painterResource(R.drawable.ic_ocean),
        contentDescription = null,
        modifier = Modifier
            .fillMaxSize(),
        contentScale = ContentScale.FillBounds// Your contentscale
    )
}




@Preview
@Composable
fun PreviewHomeScreen() {

}

