package com.example.sourcenet.ui.theme.screens.cloud

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
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
import com.example.sourcenet.navigation.ROUT_APPLY
import com.example.sourcenet.navigation.ROUT_HOME

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CloudScreen(navController: NavHostController){


    val mContext = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize()

    ) {

        //TopAppBar
        TopAppBar(title = {
            Text(text = "CLOUD ENGINEER",
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
                painter = painterResource(id = R.drawable.cloud),
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
            text = "1. Build and maintain cloud infrastructure.",
            modifier = Modifier.padding(start = 30.dp),
            )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "2. Debug initiatives related to cloud computing.",
            modifier = Modifier.padding(start = 30.dp),
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "3. Develop and manage cloud-based infrastructure.",
            modifier = Modifier.padding(start = 30.dp),
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "4. Help companies succeed with cloud-based storage.",
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
            text = "1. A Bachelor's degree in Computer Science.",
            modifier = Modifier.padding(start = 30.dp),
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "2. Have practical experience in developing cloud-based infrastructure.",
            modifier = Modifier.padding(start = 30.dp),
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "3. Have a certification in a cloud-based discipline, such as AWS, Azure, or Google Cloud.",
            modifier = Modifier.padding(start = 30.dp),
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "4. Have knowledge in programming languages, such as Java, Python, C++, or C#.",
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
fun CloudScreenPreview(){

    CloudScreen(rememberNavController())

}