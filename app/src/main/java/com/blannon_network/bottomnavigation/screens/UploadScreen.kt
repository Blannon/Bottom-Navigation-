package com.blannon_network.bottomnavigation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp

@Composable
fun UploadScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Cyan),
        contentAlignment = Alignment.Center
    ){
        Text(
            text ="UploadScreen",
            fontFamily = FontFamily.Serif,
            fontSize = 22.sp
        )
    }
}