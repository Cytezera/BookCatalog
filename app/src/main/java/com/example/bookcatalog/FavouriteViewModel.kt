package com.example.bookcatalog


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FavouriteViewModel: ViewModel() {
    private val _books = MutableLiveData<List<Book>>(emptyList())
    val books: LiveData<List<Book>> = _books



    fun toggle(book: Book) {
        if (_books.value.orEmpty().any { it.id == book.id }) {
            _books.value = _books.value.orEmpty().filter { it.id != book.id }
        } else {
            _books.value = _books.value.orEmpty() + book
        }
    }
}