package com.example.dd_sports_app.android

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun TwoButtonPage(navController: NavHostController) {
    Surface(
        color = Color.Red,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize()

                ,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = { /* Perform select action */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    ,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                shape = RoundedCornerShape(10.dp),
                border = BorderStroke(2.dp, Color.Red)
            ) {
                Text(
                    text = "Select",
                    style = MaterialTheme.typography.button,
                    color = Color.Red
                )
            }
            Spacer(modifier = Modifier.height(40.dp))
            Button(
                onClick = { /* Perform count action */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    ,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                shape = RoundedCornerShape(10.dp),
                border = BorderStroke(2.dp, Color.Red)
            ) {
                Text(
                    text = "Count",
                    style = MaterialTheme.typography.button,
                    color = Color.Red
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewTwoButtonPage() {

}
