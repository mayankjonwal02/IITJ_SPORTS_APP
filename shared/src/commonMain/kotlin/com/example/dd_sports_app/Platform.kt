package com.example.dd_sports_app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform