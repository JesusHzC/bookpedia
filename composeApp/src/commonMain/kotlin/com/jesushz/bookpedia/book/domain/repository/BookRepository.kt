package com.jesushz.bookpedia.book.domain.repository

import com.jesushz.bookpedia.book.domain.Book
import com.jesushz.bookpedia.core.domain.DataError
import com.jesushz.bookpedia.core.domain.Result

interface BookRepository {
    suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote>
}
