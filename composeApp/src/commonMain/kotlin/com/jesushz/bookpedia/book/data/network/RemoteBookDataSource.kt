package com.jesushz.bookpedia.book.data.network

import com.jesushz.bookpedia.book.data.dto.BookWorkDto
import com.jesushz.bookpedia.book.data.dto.SearchResponseDto
import com.jesushz.bookpedia.core.domain.DataError
import com.jesushz.bookpedia.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null,
    ): Result<SearchResponseDto, DataError.Remote>

    suspend fun getBookDetails(bookWorkId: String): Result<BookWorkDto, DataError.Remote>
}
