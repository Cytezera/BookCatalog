package com.example.bookcatalog

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BooksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .replace(R.id.search_container, SearchFragment())
                .replace(R.id.book_long_container, BooksLongFragment())
                .commit()
        }
    }
}