package com.jesushz.bookpedia.di

import com.jesushz.bookpedia.book.data.network.KtorRemoteBooksDataSource
import com.jesushz.bookpedia.book.data.network.RemoteBookDataSource
import com.jesushz.bookpedia.book.data.repository.DefaultBookRepository
import com.jesushz.bookpedia.book.domain.repository.BookRepository
import com.jesushz.bookpedia.book.presentation.SelectedBookViewModel
import com.jesushz.bookpedia.book.presentation.book_detail.BookDetailViewModel
import com.jesushz.bookpedia.book.presentation.book_list.BookListViewModel
import com.jesushz.bookpedia.core.data.HttpClientFactory
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    single { HttpClientFactory.create(get()) }
    singleOf(::KtorRemoteBooksDataSource).bind<RemoteBookDataSource>()
    singleOf(::DefaultBookRepository).bind<BookRepository>()

    viewModelOf(::BookListViewModel)
    viewModelOf(::SelectedBookViewModel)
    viewModelOf(::BookDetailViewModel)
}
