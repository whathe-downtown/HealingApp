package com.example.healingapp

import android.annotation.SuppressLint
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

import com.example.healingapp.ui.theme.screen.bottomView.BottomNavItem
import com.example.healingapp.ui.theme.AquaBlue
import com.example.healingapp.ui.theme.DeepBlue

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@ExperimentalFoundationApi
@Composable
fun MainScreen() {
    val navController: NavHostController = rememberNavController()
    Scaffold(
        bottomBar = { BottomBar(navController = navController) }
    ) {
        HomeNavGraph(navController = navController, modifier = Modifier.padding())

    }
}

@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        BottomNavItem.Home,
        BottomNavItem.Search,
        BottomNavItem.Settings
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    val bottomBarDestination = screens.any { it.route == currentDestination?.route }

    if (bottomBarDestination) {
        BottomNavigation(
            backgroundColor = DeepBlue
        ) {
            screens.forEach { screens ->
                AddItem(
                    screen = screens,
                    currentDestination = currentDestination,
                    navController = navController
                )
            }
        }
    }

}


@Composable
fun RowScope.AddItem(
    screen: BottomNavItem,
    currentDestination: NavDestination?,
    navController: NavHostController
) {

    BottomNavigationItem(
        label = {
            Text(stringResource(id = screen.title), color = Color.White, fontSize = 10.sp)
        },
        icon = {
            Icon(
                painter = painterResource(id = screen.icon),
                contentDescription = "Navigation Icon",
                modifier = Modifier
                    .width(22.dp)
                    .height(20.dp)
            )
        },
        selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
        alwaysShowLabel = false,
        selectedContentColor = Color.White,
        unselectedContentColor = AquaBlue,
//        unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.disabled),
        onClick = {
            navController.navigate(screen.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
                restoreState = true
//                navController.graph.startDestinationRoute?.let {   // 둘의 함수 차이점 알아보기
//                    popUpTo(it) { saveState = true }
//                }
//                launchSingleTop = true
//                restoreState = true
            }
        }
    )
}



