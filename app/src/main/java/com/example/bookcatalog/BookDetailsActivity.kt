package com.example.bookcatalog

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class BookDetailsActivity : AppCompatActivity() {

    private var book: Book? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_details)


        val book: Book? = intent.getParcelableExtra("book_details")

        // Initialize views
        val bookImage: ImageView = findViewById(R.id.detail_book_image)
        val bookTitle: TextView = findViewById(R.id.detail_book_title)
        val bookAuthor: TextView = findViewById(R.id.detail_book_author)
        val bookDesc: TextView = findViewById(R.id.detail_book_desc)
        val bookCategories: TextView = findViewById(R.id.detail_book_categories)
        val closeButton: Button = findViewById(R.id.close_button)

        if (book != null) {
            bookImage.setImageResource(book.imageId)
            bookTitle.text = book.title
            bookAuthor.text = "by ${book.author}"
            bookDesc.text = book.desc
            bookCategories.text = book.categories.joinToString(", ")
        } else {
            Toast.makeText(this, "No book details found", Toast.LENGTH_SHORT).show()
            finish()
        }

        closeButton.setOnClickListener {
            finish()
        }
    }
}