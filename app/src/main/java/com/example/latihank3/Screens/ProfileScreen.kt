package com.example.latihank3.Screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun ProfileScreen(navController: NavController) {
    Text("ini Profile Screen")
}

@Preview
@Composable
fun ProfileScreenView() {
    ProfileScreen(
        navController = rememberNavController()
    )
}