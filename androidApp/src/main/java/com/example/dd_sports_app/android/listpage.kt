package com.example.dd_sports_app.android

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Storage
//import androidx.compose.material.icons.filled.Storage
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.dd_sports_app.android.navigation.screen

//import com.example.jetpackcompose.R

@Composable
fun ListPage(navController: NavHostController) {
    Surface(
        color = MaterialTheme.colors.background,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "User-Type",
                style = MaterialTheme.typography.h3.copy(
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier.padding(16.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                CircularButton(
                    text = "Check In",
                    icon = Icons.Default.Home,
                    onClick = { navController.navigate(screen.qrpage.route) }
                ) { /* Perform check-in */ }
                CircularButton(
                    text = "Check Out",
                    icon = Icons.Default.DateRange,
                    onClick = { navController.navigate(screen.qrpage.route) }
                ) { /* Perform check-in */ }
                CircularButton(
                    text = "Availability",
                    icon = Icons.Default.Person,
                    onClick = { navController.navigate(screen.buttonpage.route) }
                ) { /* Perform check-in */ }
                CircularButton(
                    text = "Database",
                    icon = Icons.Default.Storage,
                    { /* Open database */ }
                ) { /* Perform check-in */ }
                CircularButton(
                    text = "Profile",
                    icon = Icons.Default.Person,
                    onClick = { navController.navigate(screen.profile.route) }
                ) { /* Perform check-in */ }
            }
        }
    }
}

@Composable
fun CircularButton(
    text: String,
    icon: ImageVector,
    onClick: () -> Unit,
    function: () -> Unit
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .height(40.dp)
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = icon,
                contentDescription = "$text icon",
                tint = Color.White,
                modifier = Modifier.padding(end = 8.dp)
            )
            Text(
                text = text,
                style = MaterialTheme.typography.caption,
                color = Color.White
            )
        }
    }
}

@Preview
@Composable
fun PreviewHomePage() {

}
