package com.jesushz.bookpedia.book.data.mappers

import com.jesushz.bookpedia.book.data.dto.SearchedBookDto
import com.jesushz.bookpedia.book.domain.Book

fun SearchedBookDto.toBook(): Book {
    return Book(
        id = id.substringAfterLast("/"),
        title = title,
        imageUrl = if (coverEditionKey != null)
            "https://covers.openlibrary.org/b/olid/${coverEditionKey}-L.jpg"
        else
            "https://covers.openlibrary.org/b/olid/${coverAlternativeKey}-L.jpg",
        authors = authorNames ?: emptyList(),
        description = null,
        languages = languages ?: emptyList(),
        firstPublishYear = firstPublishYear.toString(),
        averageRating = ratingsAverage,
        ratingCount = ratingsCount,
        numPages = numberOfPagesMedian,
        numEditions = editionCount ?: 0
    )
}
