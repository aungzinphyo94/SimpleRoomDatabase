package com.azp.roomdatabase.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class BookEntity {
    @PrimaryKey
    var bookID: Int = 0

    @ColumnInfo(name = "book_name")
    var bookName: String = ""
}