package com.azp.roomdatabase.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.azp.roomdatabase.dao.BookDao
import com.azp.roomdatabase.entity.BookEntity

@Database(entities = [(BookEntity::class)], version = 1)
abstract class BookDatabase : RoomDatabase(){

    abstract fun bookDao() : BookDao
}