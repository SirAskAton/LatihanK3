package com.example.latihank3.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Profile : Screen("profile")
    object Login : Screen("login")
    object Register : Screen("register")


    object Result : Screen("result/{text}") {
        fun passText(text: String): String {
            return "result/$text"
        }
    }
}
