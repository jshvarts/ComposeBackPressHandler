package com.jshvarts.composebackpresshandler.navigation

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jshvarts.composebackpresshandler.DetailScreen
import com.jshvarts.composebackpresshandler.ListScreen

sealed class Screen(val route: String) {
    object List : Screen("list_screen")
    object Detail : Screen("detail_screen")
}

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController, startDestination = Screen.List.route) {
        composable(Screen.List.route) {
            ListScreen(navController)
        }
        composable(Screen.Detail.route) {
            DetailScreen()
        }
    }
}
