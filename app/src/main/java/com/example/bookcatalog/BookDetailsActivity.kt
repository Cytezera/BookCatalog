package com.example.bookcatalog

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class BookDetailsActivity : AppCompatActivity() {
    private var isFavorite: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_details)

        val book: Book? = intent.getParcelableExtra("book_details")

        val closeButton: Button = findViewById(R.id.close_button)
        val favoriteButton: Button = findViewById(R.id.favorite_button)
        val titleText: TextView = findViewById(R.id.textTitle)
        val descText: TextView = findViewById(R.id.textDesc)
        val imageView: ImageView = findViewById(R.id.bookImage)

        if (book != null) {
            titleText.text = book.title
            descText.text = book.desc
            imageView.setImageResource(book.imageId)
            

            if (savedInstanceState == null) {
                val fragment = BookDetailsFragment.newInstance(book)
                supportFragmentManager.beginTransaction()
                    .replace(R.id.book_details_container, fragment)
                    .commit()
            }

            loadFavoriteStatus(book)
            updateFavoriteButton(favoriteButton)
        } else {
            Toast.makeText(this, "No book details found", Toast.LENGTH_SHORT).show()
            finish()
        }

        closeButton.setOnClickListener { finish() }

        favoriteButton.setOnClickListener {
            book?.let {
                toggleFavorite()
                updateFavoriteButton(favoriteButton)
                saveFavoriteStatus(it)
            }
        }
    }

    private fun loadFavoriteStatus(book: Book) {
        val sharedPref = getSharedPreferences("book_favorites", MODE_PRIVATE)
        isFavorite = sharedPref.getBoolean("book_${book.id}", false)
    }

    private fun saveFavoriteStatus(book: Book) {
        val sharedPref = getSharedPreferences("book_favorites", MODE_PRIVATE)
        with(sharedPref.edit()) {
            putBoolean("book_${book.id}", isFavorite)
            apply()
        }
    }

    private fun toggleFavorite() {
        isFavorite = !isFavorite
        val message = if (isFavorite) "Added to favorites" else "Removed from favorites"
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun updateFavoriteButton(favoriteButton: Button) {
        if (isFavorite) {
            favoriteButton.text = "Remove from Favorites"
            favoriteButton.setCompoundDrawablesWithIntrinsicBounds(
                R.drawable.ic_favorite_filled, 0, 0, 0
            )
            favoriteButton.setBackgroundColor(
                ContextCompat.getColor(this, android.R.color.holo_red_light)
            )
        } else {
            favoriteButton.text = "Add to Favorites"
            favoriteButton.setCompoundDrawablesWithIntrinsicBounds(
                R.drawable.ic_favorite_border, 0, 0, 0
            )
            favoriteButton.setBackgroundColor(
                ContextCompat.getColor(this, android.R.color.holo_blue_light)
            )

        }
    }
}
