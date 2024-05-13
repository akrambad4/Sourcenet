package com.example.sourcenet.ui.theme.screens.signup


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.sourcenet.R
import com.example.sourcenet.data.AuthViewModel
import com.example.sourcenet.navigation.ROUT_LOGIN
import com.example.sourcenet.ui.theme.main


@Composable
fun SignupScreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = main),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Create a sourcenet account",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
        )

        Spacer(modifier = Modifier.height(10.dp))

        //ANIMATION START
        Column(
            modifier = Modifier.size(250.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.signup))
            LottieAnimation(
                composition = composition,
                iterations = Int.MAX_VALUE
            )

        }
        //ANIMATION END

        Spacer(modifier = Modifier.height(20.dp))

        var name by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        OutlinedTextField(
            value = name,
            onValueChange = {name = it},
            label = { Text(
                text = "Enter name",
                fontWeight = FontWeight.Bold,
                color = Color.Black
                ) },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            ),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Person") },
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            label = { Text(
                text = "Enter email",
                fontWeight = FontWeight.Bold,
                color = Color.Black
                ) },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            ),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "Email") },
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            label = { Text(
                text = "Enter password",
                fontWeight = FontWeight.Bold,
                color = Color.Black
                ) },
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "Password") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            )
        )

        Spacer(modifier = Modifier.height(30.dp))

        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)


        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp, end = 40.dp, bottom = 10.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
            onClick = {
            authViewModel.signup(name, email, password)
        }) {
            Text(text = "Create Account")
        }


        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp, end = 40.dp, bottom = 10.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
            onClick = {
            navController.navigate(ROUT_LOGIN)
        }) {
            Text(text = "Already have an account ?")
        }

    }
}

@Composable
@Preview(showBackground = true)
fun SignupScreenPreview(){
    SignupScreen(navController = rememberNavController())
}