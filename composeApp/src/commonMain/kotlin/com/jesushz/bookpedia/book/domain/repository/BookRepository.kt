package com.jesushz.bookpedia.book.domain.repository

import com.jesushz.bookpedia.book.domain.Book
import com.jesushz.bookpedia.core.domain.DataError
import com.jesushz.bookpedia.core.domain.EmptyResult
import com.jesushz.bookpedia.core.domain.Result
import kotlinx.coroutines.flow.Flow

interface BookRepository {
    suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote>
    suspend fun getBookDescription(bookId: String): Result<String?, DataError>

    fun getFavoriteBooks(): Flow<List<Book>>
    fun isBookFavorite(bookId: String): Flow<Boolean>
    suspend fun markAsFavorite(book: Book): EmptyResult<DataError.Local>
    suspend fun deleteFromFavorites(bookId: String)

}
