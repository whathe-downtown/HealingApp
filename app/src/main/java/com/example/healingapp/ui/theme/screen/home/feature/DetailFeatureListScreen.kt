package com.example.healingapp.ui.theme.screen.home.feature

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.healingapp.R
import com.example.healingapp.data.Mindless
import com.example.healingapp.repository.CateGoryMusicList
import com.example.healingapp.ui.theme.DeepBlue
import com.skydoves.landscapist.coil.CoilImage

@Composable
fun DetailFeatureListScreen(
    detailHeaderName: String,
    onBackPressed: () -> Unit,
    detailViewModel: DetailViewModel = viewModel()
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(DeepBlue),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, start = 10.dp, end = 10.dp, bottom = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconButton(onClick = onBackPressed) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_back_24),
                    contentDescription = "DetailList Back Arrow Icon",
                    tint = Color.White
                )
            }
            Text(
                text = "$detailHeaderName",
                fontSize = 20.sp,
                color = Color.White,
                modifier = Modifier.padding(top = 10.dp, end = 20.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.ic_back_24),
                contentDescription = "DetailList Fake Icon For SpaceBetween",
                tint = DeepBlue
            )
        }

        DetailItemList(mindlessList = CateGoryMusicList.getSelect("숙면"))
    }


}

@Composable
fun DetailItemList(mindlessList: List<Mindless>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(start = 7.5.dp, end = 7.5.dp, bottom = 100.dp),
        modifier = Modifier.fillMaxHeight()
    )
    {
        items(mindlessList.size) {
            DetailItem(mindless = mindlessList[it])
        }
    }
}

@Composable
private fun DetailItem(mindless: Mindless) {
    BoxWithConstraints(
        modifier = Modifier
            .padding(7.5.dp)
            .aspectRatio(1f)
            .clickable { }
            .clip(RoundedCornerShape(10.dp))
    ) {
        CoilImage(
            modifier = Modifier.fillMaxSize(),
            imageModel = mindless.iconId,
            contentDescription = "DetailItem Image",
            contentScale = ContentScale.FillBounds
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp)
        ) {
            Text(text = mindless.title, fontSize = 10.sp, color = Color.White)
        }


    }
}

@Composable
fun DetailHeader(detailHeaderName: String) {
    val constraints = ConstraintSet {
        val topLeftSmallIcon = createRefFor("topLeftSmallIcon")
        val appBigName = createRefFor("appBigName")

        constrain(topLeftSmallIcon) {
            top.linkTo(parent.top, margin = 10.dp)
            start.linkTo(parent.start)
            width = Dimension.value(45.dp)
            height = Dimension.value(45.dp)
        }
        constrain(appBigName) {
            top.linkTo(parent.top, margin = 0.dp)
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
                text = detailHeaderName,
                fontSize = 40.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                fontFamily = fontFamily,
                fontWeight = FontWeight.Bold
            )
        }


    }
}
