package com.example.dd_sports_app.android.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.dd_sports_app.android.*

@Composable
fun navgraph(navController: NavHostController)
{
    NavHost(navController = navController, startDestination = screen.signin.route )
    {
        composable(route = screen.signin.route)
        {
            SignInPage(navController)
        }

        composable(route = screen.signup.route)
        {
            SignUpPage(navController)
        }

        composable(route = screen.buttonpage.route)
        {

            TwoButtonPage(navController)

        }

        composable(route = screen.listpage.route)
        {
            ListPage(navController)
        }

        composable(route = screen.profile.route)
        {
            ProfilePage(navController)

        }
        composable(route = screen.qrpage.route)
        {
                ScanQRCodePage(navController)

        }
        composable(route= screen.verify.route)
        {
                VerificationPage(navController)
        }

    }
}
