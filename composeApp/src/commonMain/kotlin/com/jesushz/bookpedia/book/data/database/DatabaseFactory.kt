package com.jesushz.bookpedia.book.data.database

import androidx.room.RoomDatabase

expect class DatabaseFactory {

    fun createDatabase(): RoomDatabase.Builder<FavoriteBookDatabase>

}
