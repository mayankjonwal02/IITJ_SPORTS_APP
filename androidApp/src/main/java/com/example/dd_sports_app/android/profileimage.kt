package com.example.dd_sports_app.android

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PowerSettingsNew
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProfilePage() {
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
            ProfileImage(image = painterResource(id = R.drawable.profile_image))
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "John Doe",
                style = MaterialTheme.typography.h6,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "john.doe@example.com",
                style = MaterialTheme.typography.subtitle1,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(32.dp))
            ChangePasswordButton(onClick = { /* Perform change password action */ })
            Spacer(modifier = Modifier.height(8.dp))
            LogoutButton(onClick = { /* Perform logout action */ })
        }
    }
}

@Composable
fun ProfileImage(image: Painter) {
    Box(
        modifier = Modifier
            .size(96.dp)
            .padding(16.dp)
            .background(Color.White, CircleShape),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = image,
            contentDescription = "Profile Image",
            modifier = Modifier.size(80.dp),
            contentScale = androidx.compose.ui.layout.ContentScale.Crop
        )
    }
}

@Composable
fun ChangePasswordButton(onClick: () -> Unit) {
    OutlinedButton(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth(),
        shape = MaterialTheme.shapes.medium
    ) {
        Icon(
            imageVector = Icons.Default.Lock,
            contentDescription = "Change Password",
            tint = Color.Red
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = "Change Password",
            style = MaterialTheme.typography.button,
            color = Color.Red
        )
    }
}

@Composable
fun LogoutButton(onClick: () -> Unit) {
    OutlinedButton(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth(),
        shape = MaterialTheme.shapes.medium
    ) {
        Icon(
            imageVector = Icons.Default.PowerSettingsNew,
            contentDescription = "Logout",
            tint = Color.Red
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = "Logout",
            style = MaterialTheme.typography.button,
            color = Color.Red
        )
    }
}

@Preview
@Composable
fun PreviewProfilePage() {
    ProfilePage()
}
