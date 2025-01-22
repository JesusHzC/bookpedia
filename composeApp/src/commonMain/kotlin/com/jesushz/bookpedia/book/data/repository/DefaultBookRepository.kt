package com.jesushz.bookpedia.book.data.repository

import com.jesushz.bookpedia.book.data.mappers.toBook
import com.jesushz.bookpedia.book.data.network.RemoteBookDataSource
import com.jesushz.bookpedia.book.domain.Book
import com.jesushz.bookpedia.book.domain.repository.BookRepository
import com.jesushz.bookpedia.core.domain.DataError
import com.jesushz.bookpedia.core.domain.Result
import com.jesushz.bookpedia.core.domain.map

class DefaultBookRepository(
    private val remoteBookDataSource: RemoteBookDataSource
): BookRepository {

    override suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote> {
        return remoteBookDataSource
            .searchBooks(query)
            .map { dto ->
                dto.results.map { it.toBook() }
            }
    }

}
