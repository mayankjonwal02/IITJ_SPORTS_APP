package com.example.dd_sports_app.android

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.dd_sports_app.android.navigation.screen


@Composable
fun SignInPage(navController: NavHostController) {
    Surface(
        color = Color.Red,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
       // shape = RoundedCornerShape(20.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Card(
                modifier = Modifier.width(300.dp),
                backgroundColor = Color.White,
                elevation = 8.dp,
                shape = RoundedCornerShape(20.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Sign In",
                        style = MaterialTheme.typography.h5
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    NameTextField()
                    Spacer(modifier = Modifier.height(8.dp))
                    EmailTextField()
                    Spacer(modifier = Modifier.height(8.dp))
                    PasswordTextField()
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(
                        onClick = { navController.navigate(screen.listpage.route) },
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red)
                    ) {
                        Text(text = "Sign In", color = Color.White)
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "Not Registered Yet, Sign Up", modifier = Modifier.clickable{navController.navigate(screen.signup.route)})
                }
            }
        }
    }
}

@Composable
fun NameTextField() {
    OutlinedTextField(
        value = "",
        onValueChange = { },
        label = { Text(text = "Name") },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "Name icon"
            )
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text
        ),
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun EmailTextField() {
    OutlinedTextField(
        value = "",
        onValueChange = { },
        label = { Text(text = "Email") },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "Email icon"
            )
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Email
        ),
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun PasswordTextField() {
    var password by remember { mutableStateOf("") }
    OutlinedTextField(
        value = password,
        onValueChange = { password = it },
        label = { Text(text = "Password") },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Lock,
                contentDescription = "Password icon"
            )
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password
        ),
        visualTransformation = PasswordVisualTransformation(),
        modifier = Modifier.fillMaxWidth()
    )
}
