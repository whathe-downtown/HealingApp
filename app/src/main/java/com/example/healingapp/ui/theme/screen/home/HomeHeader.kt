package com.example.healingapp.ui.theme.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import com.example.healingapp.R

@Composable
fun HomeHeader(appName: String) {
    val constraints = ConstraintSet {
        val topLeftSmallIcon = createRefFor("topLeftSmallIcon")
        val appBigName = createRefFor("appBigName")

        constrain(topLeftSmallIcon) {
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            width = Dimension.value(40.dp)
            height = Dimension.value(40.dp)
        }
        constrain(appBigName) {
            top.linkTo(parent.top, margin = 20.dp)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            width = Dimension.value(100.dp)
            height = Dimension.value(100.dp)
        }

    }
    val fontFamily = FontFamily(
        Font(R.font.appname_font, FontWeight.Bold)
    )

    ConstraintLayout(
        constraints, modifier = Modifier
            .fillMaxWidth()
            .height(280.dp)
    ) {
        Box(
            modifier = Modifier
                .background(Color.Green)
                .layoutId("topLeftSmallIcon")
        )
        Box(
//            contentAlignment = Alignment.Center,
            modifier = Modifier

                .layoutId("appBigName")

        ) {
            Text(
                text = appName,
                fontSize = 40.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                fontFamily = fontFamily,
                fontWeight = FontWeight.Bold
            )
        }


    }
}