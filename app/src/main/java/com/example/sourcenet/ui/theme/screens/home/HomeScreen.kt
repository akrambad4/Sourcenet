package com.example.sourcenet.ui.theme.screens.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
import com.example.sourcenet.navigation.ROUT_BACKEND
import com.example.sourcenet.navigation.ROUT_CLOUD
import com.example.sourcenet.navigation.ROUT_CYBER
import com.example.sourcenet.navigation.ROUT_FRONTEND
import com.example.sourcenet.navigation.ROUT_FULLSTACK
import com.example.sourcenet.navigation.ROUT_GRAPHICS
import com.example.sourcenet.navigation.ROUT_OTHERS
import com.example.sourcenet.ui.theme.main

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController){
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
        .background(color = main)
    ) {

        val mContext = LocalContext.current

        //TopAppBar
        TopAppBar(title = {
            Text(text = "Sourcenet Franchise",
                fontSize = 30.sp,
                modifier = Modifier.fillMaxWidth(),
                color = Color.Black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Gray),
            navigationIcon = {
                IconButton(onClick = {
                }) {
                    Icon(imageVector = Icons.Default.Home,
                        contentDescription = "Arrowback",
                        modifier = Modifier.size(35.dp),
                        tint = Color.Black)

                }
            }
        )

        //End of TopAppBar

        Row(
            modifier = Modifier
                .padding(30.dp),
        ) {

            Image(painter = painterResource(id = R.drawable.profile),
                contentDescription = "LOGIN",
                modifier = Modifier
                    .size(60.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(20.dp))

            Text(
                text = "My Profile",
                color = Color.Black,
                fontSize = 25.sp,
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 10.dp)
                )

        }


        //COLUMN CARDS
        Column(
            modifier = Modifier
                .padding(start = 15.dp)
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(start = 10.dp)
                    .fillMaxWidth()
            ) {

                Text(
                    text = "Available Positions",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Monospace
                )

            }

            Spacer(modifier = Modifier.height(10.dp))

            //ROW 1 START
            Row {

                //CARD START
                Card (
                    modifier = Modifier
                        .size(width = 165.dp, height = 150.dp)
                        .clickable {
                            navController.navigate(ROUT_FULLSTACK)
                        }
                ){
                    Column {

                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(painter = painterResource(id = R.drawable.fullstack),
                                contentDescription = "amazon",
                                modifier = Modifier.size(50.dp)
                            )
                        }

                        Text(text = "Full Stack Developer",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth()

                        )

                    }

                }
                //CARD END

                Spacer(modifier = Modifier.width(20.dp))

                //CARD START
                Card (
                    modifier = Modifier
                        .size(width = 165.dp, height = 150.dp)
                        .clickable {
                            navController.navigate(ROUT_FRONTEND)
                        }

                    ){
                    Column {

                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(painter = painterResource(id = R.drawable.frontend),
                                contentDescription = "amazon",
                                modifier = Modifier.size(50.dp)
                            )
                        }

                        Text(text = "Front End Developer",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth()

                        )


                    }

                }
                //CARD END


            }

            //ROW 1 END

            Spacer(modifier = Modifier.height(15.dp))


            //ROW 2 START
            Row {

                //CARD START
                Card (
                    modifier = Modifier
                        .size(width = 165.dp, height = 150.dp)
                        .clickable {
                        navController.navigate(ROUT_CYBER)
                    }
                    ){
                    Column {

                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(painter = painterResource(id = R.drawable.cybersecurity),
                                contentDescription = "amazon",
                                modifier = Modifier.size(50.dp)
                            )
                        }

                        Text(text = "Cyber Security",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth()

                        )

                    }

                }
                //CARD END

                Spacer(modifier = Modifier.width(20.dp))

                //CARD START
                Card (
                    modifier = Modifier
                        .size(width = 165.dp, height = 150.dp)
                        .clickable {
                            navController.navigate(ROUT_CLOUD)
                        }
                    ){
                    Column {

                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(painter = painterResource(id = R.drawable.cloud),
                                contentDescription = "amazon",
                                modifier = Modifier.size(50.dp)
                            )
                        }

                        Text(text = "Cloud Engineer",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth()

                        )


                    }

                }
                //CARD END


            }

            //ROW 2 END

            Spacer(modifier = Modifier.height(15.dp))

            //ROW 3 START
            Row {

                //CARD START
                Card (
                    modifier = Modifier
                        .size(width = 165.dp, height = 150.dp)
                        .clickable {
                            navController.navigate(ROUT_GRAPHICS)
                        }
                    ){
                    Column {

                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(painter = painterResource(id = R.drawable.graphics),
                                contentDescription = "amazon",
                                modifier = Modifier.size(50.dp)
                            )
                        }

                        Text(text = "Graphics Designer",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth()

                        )

                    }

                }
                //CARD END

                Spacer(modifier = Modifier.width(20.dp))

                //CARD START
                Card (
                    modifier = Modifier
                        .size(width = 165.dp, height = 150.dp)
                        .clickable {
                            navController.navigate(ROUT_BACKEND)
                        }
                    ){
                    Column {

                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(painter = painterResource(id = R.drawable.backend),
                                contentDescription = "amazon",
                                modifier = Modifier.size(50.dp)
                            )
                        }

                        Text(text = "Backend Developer",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth()

                        )


                    }

                }
                //CARD END

            }
            //ROW 3 END

        }
        //COLUMN CARD END

        Spacer(modifier = Modifier.height(20.dp))

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(start = 10.dp)
                .fillMaxWidth()
        ) {

            Button(
                modifier = Modifier.size(width = 250.dp, height = 50.dp),
                colors = ButtonDefaults.buttonColors(Color.Black),
                onClick = {
                    navController.navigate(ROUT_OTHERS)
                }) {
                Text(text = "VIEW OTHER APPLICANTS")
            }

        }

        Spacer(modifier = Modifier.height(30.dp))


    }

}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}