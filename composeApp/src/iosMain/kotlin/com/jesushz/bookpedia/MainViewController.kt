package com.jesushz.bookpedia

import androidx.compose.ui.window.ComposeUIViewController
import com.jesushz.bookpedia.di.initKoin
import io.ktor.client.engine.darwin.Darwin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    App()
}