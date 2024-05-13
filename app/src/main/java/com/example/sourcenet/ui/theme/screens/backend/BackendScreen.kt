package com.example.sourcenet.ui.theme.screens.backend

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.sourcenet.R
import com.example.sourcenet.navigation.ROUT_APPLY
import com.example.sourcenet.navigation.ROUT_HOME

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BackendScreen(navController: NavHostController){

    val mContext = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize()

    ) {

        //TopAppBar
        TopAppBar(title = {
            Text(text = "BACKEND DEVELOPER",
                fontSize = 35.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = Color.Black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Gray),
            navigationIcon = {
                IconButton(onClick = {
                    navController.navigate(ROUT_HOME)
                }) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Arrowback",
                        tint = Color.Black)

                }
            }
        )

        //End of TopAppBar

        //Start of box

        Box (
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.Center
        ){
            Image(
                painter = painterResource(id = R.drawable.backend),
                contentDescription = "Miami",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop

            )


        }

        //End of Box

        Spacer(modifier = Modifier.height(20.dp))


        //ROLES
        Text(
            text = "ROLES",
            fontSize = 20.sp,
            modifier = Modifier.padding(start = 30.dp),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
        )

        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = "1. Create, maintain and test the back end of an application.",
            modifier = Modifier.padding(start = 30.dp),
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "2. Build automation tools and working in an agile environment.",
            modifier = Modifier.padding(start = 30.dp),
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "3. Troubleshoot, debug, and optimize performance.",
            modifier = Modifier.padding(start = 30.dp),
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "4. Support the full application lifecycle and integrating APIs.",
            modifier = Modifier.padding(start = 30.dp),
        )

        Spacer(modifier = Modifier.height(20.dp))



        //QUALIFICATIONS
        Text(
            text = "QUALIFICATIONS",
            fontSize = 20.sp,
            modifier = Modifier.padding(start = 30.dp),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
        )

        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = "1. Knowledge of database management.",
            modifier = Modifier.padding(start = 30.dp),
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "2. Imaginative and technical creativity skills.",
            modifier = Modifier.padding(start = 30.dp),
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "3. Expertise in API.",
            modifier = Modifier.padding(start = 30.dp),
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "4. Proficiency in programming and server languages.",
            modifier = Modifier.padding(start = 30.dp),
        )

        Spacer(modifier = Modifier.height(30.dp))

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(start = 10.dp)
                .fillMaxWidth()
        ) {

            Button(
                modifier = Modifier.size(width = 250.dp, height = 50.dp),
                onClick = {
                    navController.navigate(ROUT_APPLY)
                }) {
                Text(text = "APPLY NOW")
            }

            Spacer(modifier = Modifier.height(10.dp))


        }














    }

}

@Preview(showBackground = true)
@Composable
fun BackendScreenPreview(){

    BackendScreen(rememberNavController())

}