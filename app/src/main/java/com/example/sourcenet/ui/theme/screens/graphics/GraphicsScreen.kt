package com.example.sourcenet.ui.theme.screens.graphics

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
fun GraphicsScreen(navController: NavHostController){


    val mContext = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize()

    ) {



        //TopAppBar
        TopAppBar(title = {
            Text(text = "GRAPHICS DESIGNER",
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
                painter = painterResource(id = R.drawable.graphics),
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
            text = "1. Design brand kits to ensure branding consistency.",
            modifier = Modifier.padding(start = 30.dp),
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "2. Keep abreast of contemporary design techniques and tools.",
            modifier = Modifier.padding(start = 30.dp),
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "3. Proofread designs before finalization.",
            modifier = Modifier.padding(start = 30.dp),
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "4. Develop creative concepts and designs.",
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
            text = "1. A post-secondary degree in graphic design from an accredited program.",
            modifier = Modifier.padding(start = 30.dp),
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "2. Soft skills, such as communication, teamwork, problem-solving, etc.",
            modifier = Modifier.padding(start = 30.dp),
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "3. A portfolio of previous work that showcases your skills and creativity.",
            modifier = Modifier.padding(start = 30.dp),
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "4. Relevant experience in the field of graphic design.",
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
fun GraphicsScreenPreview(){

    GraphicsScreen(rememberNavController())

}