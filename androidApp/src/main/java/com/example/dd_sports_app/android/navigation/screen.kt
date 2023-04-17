package com.example.dd_sports_app.android.navigation

sealed class screen(var route : String)
{

    object signin : screen(route = "signin")

    object signup : screen(route = "signup")

    object verify : screen(route = "verify")

    object qrpage : screen(route = "qrpage")

    object profile : screen(route = "profile")

    object listpage: screen(route = "listpage")

    object buttonpage :screen(route = "buttonpage")

}