package com.azp.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import com.azp.roomdatabase.database.BookDatabase
import com.azp.roomdatabase.entity.BookEntity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var db = Room.databaseBuilder(
            applicationContext,
            BookDatabase::class.java,
            "BookDB"
        ).build()

        Thread {
            var bookEntity = BookEntity()
            bookEntity.bookID = 1
            bookEntity.bookName = "Kotlin for Android Developer"

            db.bookDao().saveBook(bookEntity)

            db.bookDao().getAllBooks().forEach {
                Log.i("FetchDatabase>>>>>", "id: ${it.bookID}")
                Log.i("FetchDatabase>>>>>", "Name: ${it.bookName}")
            }
        }.start()
    }
}
