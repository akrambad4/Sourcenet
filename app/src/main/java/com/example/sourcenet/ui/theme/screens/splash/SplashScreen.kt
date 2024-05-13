package com.example.sourcenet.ui.theme.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.sourcenet.R
import com.example.sourcenet.navigation.ROUT_LOGIN
import com.example.sourcenet.ui.theme.main
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable

fun SplashScreen(navController: NavHostController){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = main),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

        val coroutine = rememberCoroutineScope()
        coroutine.launch {
            delay(3000)
            navController.navigate(ROUT_LOGIN)
        }

        val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.splash))
        LottieAnimation(
            composition = composition,
            iterations = Int.MAX_VALUE
        )


    }


}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){

    SplashScreen(rememberNavController())

}