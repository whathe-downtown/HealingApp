@file:OptIn(ExperimentalFoundationApi::class)

package com.example.healingapp.graphs

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.healingapp.MainScreen



@Composable
fun RootNavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Graph.HOME,
        route = Graph.ROOT
    ){
        composable(route =Graph.HOME){
            MainScreen()
        }
    }
}


object Graph {
    const val ROOT = "root_graph"
    //    const val AUTHENTICATION = "auth_graph"
    const val HOME = "home_graph"
    const val FDETAILS = "fdetails_graph"
}