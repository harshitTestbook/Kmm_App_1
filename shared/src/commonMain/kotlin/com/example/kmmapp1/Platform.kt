package com.example.kmmapp1

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform