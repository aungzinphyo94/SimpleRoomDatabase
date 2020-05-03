package com.azp.roomdatabase.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.azp.roomdatabase.entity.BookEntity

@Dao
interface BookDao {

    @Insert
    fun saveBook(book: BookEntity)

    @Query(value = "Select * from BookEntity")
    fun getAllBooks(): List<BookEntity>
}