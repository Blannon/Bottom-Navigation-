package com.blannon_network.bottomnavigation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItems(
    val label: String,
    val icon: ImageVector,
    val route: String
)
val listOfNavItems = listOf(
    NavItems(
        label = "Home",
        icon = Icons.Default.Home,
        route = Screen.HomeScreen.name
    ),

    NavItems(
        label = "Upload",
        icon = Icons.Default.AddCircle,
        route = Screen.UploadScreen.name
    ),

    NavItems(
        label = "Profile",
        icon = Icons.Default.Person,
        route = Screen.ProfileScreen.name
    ),
)