package com.example.bookcatalog

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.widget.Button





class BooksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        val closeButton: Button = findViewById(R.id.close_button)
        val categoryLabel: TextView = findViewById(R.id.categoryLabel)
        val selectedCategory = intent.getStringExtra(CategoryFragment.EXTRA_SELECTED_CATEGORY)

        categoryLabel.text = selectedCategory ?: ""

        closeButton.setOnClickListener { finish() }
        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .replace(R.id.book_long_container, BooksLongFragment())
                .commit()
        }


    }
}