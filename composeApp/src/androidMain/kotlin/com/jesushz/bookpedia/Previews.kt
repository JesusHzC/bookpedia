package com.jesushz.bookpedia

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jesushz.bookpedia.book.domain.Book
import com.jesushz.bookpedia.book.presentation.book_list.BookListScreen
import com.jesushz.bookpedia.book.presentation.book_list.BookListState
import com.jesushz.bookpedia.book.presentation.book_list.components.BookSearchBar

@Preview(showBackground = true)
@Composable
fun BookSearchBarPreview() {
    MaterialTheme {
        BookSearchBar(
            searchQuery = "",
            onSearchQueryChange = {},
            onImeSearch = {},
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun BookListScreenPrev() {
    val books = (1..100).map {
        Book(
            id = it.toString(),
            title = "Book $it",
            authors = listOf("Author $it"),
            imageUrl = "https://picsum.photos/200/300?random=$it",
            averageRating = it.toDouble(),
            description = "Description $it",
            languages = listOf("Language $it"),
            firstPublishYear = null,
            ratingCount = 5,
            numPages = 100,
            numEditions = 3
        )
    }
    BookListScreen(
        state = BookListState(
            searchResults = books
        ),
        onAction = {}
    )
}
