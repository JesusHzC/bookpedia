package com.jesushz.bookpedia

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.jesushz.bookpedia.book.data.network.KtorRemoteBooksDataSource
import com.jesushz.bookpedia.book.data.repository.DefaultBookRepository
import com.jesushz.bookpedia.book.presentation.book_list.BookListScreenRoot
import com.jesushz.bookpedia.book.presentation.book_list.BookListViewModel
import com.jesushz.bookpedia.core.data.HttpClientFactory
import io.ktor.client.engine.HttpClientEngine
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(engine: HttpClientEngine) {
    BookListScreenRoot(
        viewModel = remember {
            BookListViewModel(
                dataSource = DefaultBookRepository(
                    remoteBookDataSource = KtorRemoteBooksDataSource(
                        httpClient = HttpClientFactory.create(
                            engine = engine
                        )
                    )
                )
            )
        },
        onBookClick = { book ->

        }
    )
}