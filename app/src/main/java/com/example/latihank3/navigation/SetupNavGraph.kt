package com.example.latihank3.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.latihank3.Screens.HomeScreen
import com.example.latihank3.Screens.ProfileScreen
import com.example.latihank3.Screens.ResultScreen
import com.example.latihank3.screens.LoginScreen
import com.example.latihank3.screens.RegisterScreen

@Composable
fun SetupNavGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = Screen.Login.route,
        modifier = modifier
    ) {

        // Halaman Home
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController)
        }

        composable(
            route = Screen.Result.route,
            arguments = listOf(navArgument("text") {
                type = NavType.StringType // Tipe parameter: String
            })
        ) {
            // Mengambil argumen "text" dari route dan mengirim ke ResultScreen
            ResultScreen(it.arguments?.getString("text").toString(), navController)
        }

        composable(
            route = Screen.Profile.route
        ) {
            ProfileScreen(navController)
        }
        composable(Screen.Login.route) {
            LoginScreen(navController)
        }

        composable(Screen.Register.route) {
            RegisterScreen(navController)
        }

    }
}
