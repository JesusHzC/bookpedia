package com.jesushz.bookpedia

import androidx.compose.ui.window.ComposeUIViewController
import com.jesushz.bookpedia.app.App
import com.jesushz.bookpedia.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    App()
}