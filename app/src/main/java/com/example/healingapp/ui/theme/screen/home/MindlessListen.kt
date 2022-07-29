package com.example.healingapp.ui.theme.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.healingapp.R
import com.example.healingapp.data.Mindless
import com.skydoves.landscapist.coil.CoilImage

@Composable
fun MindlessListen(mindlessList: List<Mindless>) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "가볍게 듣기",
            color = Color.White,
            modifier = Modifier.padding(15.dp),
            fontSize = 15.sp
        )
        LazyHorizontalGrid(
            rows = GridCells.Fixed(1), modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        ) {
            items(mindlessList.size) {
                MindlessItem(mindless = mindlessList[it])
            }

        }
    }
}

@Composable
fun MindlessItem(
    mindless: Mindless
) {
    BoxWithConstraints(
        modifier = Modifier
            .padding(10.dp)
            .aspectRatio(1f)
    ) {
        Box(
            modifier = Modifier
                .padding(10.dp)
                .clip(RoundedCornerShape(topEnd = 10.dp, topStart = 10.dp, bottomStart = 10.dp))
                .shadow(
                    elevation = 10.dp,
                    shape = RoundedCornerShape(10.dp)
                )
        ) {
            CoilImage(
                imageModel = mindless.iconId,
                contentDescription = mindless.title,
                modifier = Modifier
                    .fillMaxSize(),
                contentScale = ContentScale.FillBounds// Your contentscale
            )
            Icon(
                painter = painterResource(id = R.drawable.ic_play),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .width(40.dp)
                    .height(40.dp)
            )
        }
    }


}