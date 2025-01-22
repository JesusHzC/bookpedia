package com.jesushz.bookpedia

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.jesushz.bookpedia.app.App
import com.jesushz.bookpedia.di.initKoin

fun main() {
    initKoin()
    application {

        Window(
            onCloseRequest = ::exitApplication,
            title = "Bookpedia",
        ) {
            App()
        }
    }
}