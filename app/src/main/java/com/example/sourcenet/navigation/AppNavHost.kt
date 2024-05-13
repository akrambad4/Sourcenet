package com.example.sourcenet.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sourcenet.data.ShareViewModel
import com.example.sourcenet.ui.theme.screens.apply.ApplyScreen
import com.example.sourcenet.ui.theme.screens.backend.BackendScreen
import com.example.sourcenet.ui.theme.screens.cloud.CloudScreen
import com.example.sourcenet.ui.theme.screens.cyber.CyberScreen
import com.example.sourcenet.ui.theme.screens.frontend.FrontendScreen
import com.example.sourcenet.ui.theme.screens.fullstack.FullstackScreen
import com.example.sourcenet.ui.theme.screens.graphics.GraphicsScreen
import com.example.sourcenet.ui.theme.screens.home.HomeScreen
import com.example.sourcenet.ui.theme.screens.login.LoginScreen
import com.example.sourcenet.ui.theme.screens.other.OthersScreen
import com.example.sourcenet.ui.theme.screens.signup.SignupScreen
import com.example.sourcenet.ui.theme.screens.splash.SplashScreen
import com.example.sourcenet.ui.theme.screens.success.SuccessScreen
import com.example.sourcenet.ui.theme.screens.test.TestScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController: NavHostController = rememberNavController(), startDestination:String = ROUT_SPLASH) {
    NavHost(navController = navController, modifier = modifier, startDestination = startDestination) {

        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }

        composable(ROUT_HOME) {
            HomeScreen(navController)
        }

        composable(ROUT_LOGIN) {
            LoginScreen(navController)
        }

        composable(ROUT_SIGNUP) {
            SignupScreen(navController)
        }


        composable(ROUT_APPLY) {
            ApplyScreen(navController, shareViewModel = ShareViewModel())
        }

        composable(ROUT_BACKEND) {
            BackendScreen(navController)
        }

        composable(ROUT_CLOUD) {
            CloudScreen(navController)
        }

        composable(ROUT_CYBER) {
            CyberScreen(navController)
        }

        composable(ROUT_FRONTEND) {
            FrontendScreen(navController)
        }

        composable(ROUT_FULLSTACK) {
            FullstackScreen(navController)
        }

        composable(ROUT_GRAPHICS) {
            GraphicsScreen(navController)
        }

        composable(ROUT_TEST) {
            TestScreen(navController)
        }

        composable(ROUT_OTHERS) {
            OthersScreen(navController)
        }

        composable(ROUT_SUCCESS) {
            SuccessScreen(navController)
        }



    }

}