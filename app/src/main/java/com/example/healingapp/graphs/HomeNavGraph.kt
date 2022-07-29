package com.example.healingapp

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.*
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.healingapp.graphs.Graph
import com.example.healingapp.repository.CateGoryMusicList
import com.example.healingapp.repository.SampleRepository
import com.example.healingapp.ui.theme.screen.bottomView.BottomNavItem
import com.example.healingapp.ui.home.HomeScreen
import com.example.healingapp.ui.search.SearchScreen
import com.example.healingapp.ui.setting.SettingScreen
import com.example.healingapp.ui.theme.screen.home.HomeNavItem
import com.example.healingapp.ui.theme.screen.home.feature.DetailFeatureListScreen

@ExperimentalFoundationApi
@Composable
fun HomeNavGraph(
    navController: NavHostController,
    modifier: Modifier
) {
    NavHost(
        navController = navController,
        startDestination = BottomNavItem.Home.route,
        modifier = modifier
    ) {
        val selectsFeature =  BottomNavItem.Home.route

        composable(
            route = "$selectsFeature/{name}",
            arguments = listOf(
                navArgument("name"){
                    type = NavType.StringType
                }
            )
        ){  entry ->
            val selectFeature = entry.arguments?.getString("name")
            val select=  CateGoryMusicList.getSelect(selectFeature)



        }

        composable(BottomNavItem.Home.route) {
            HomeScreen(onClickFeatureItem = { navController.navigate(DetailScreen.Sleep.route){

            } })
        }
        composable(BottomNavItem.Search.route){
            SearchScreen()
        }
        composable(BottomNavItem.Settings.route){
            SettingScreen()
        }

       detailsFeatureGraph(navController =  navController)
    }
}

fun NavGraphBuilder.detailsFeatureGraph(navController: NavHostController){
    navigation(
        route = Graph.FDETAILS,
        startDestination = DetailScreen.Sleep.route
    ){
        composable(route = DetailScreen.Sleep.route){
            DetailFeatureListScreen("명상", onBackPressed = { navController.navigate(BottomNavItem.Home.route){
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
                restoreState = true
            } })

        }

    }
}


sealed class DetailScreen(val route :String){
    object  Sleep : DetailScreen(route ="SlEEP")
    object  Meditation : DetailScreen(route = "MEDITATION")
    object  Mind : DetailScreen(route = "MIND")
    object  Music : DetailScreen(route = "MUSIC")
}