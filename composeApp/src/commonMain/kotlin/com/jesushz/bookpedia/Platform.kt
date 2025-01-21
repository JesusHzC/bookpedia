package com.jesushz.bookpedia

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform