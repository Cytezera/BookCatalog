//Fragment for books in main page

package com.example.bookcatalog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.content.Context

import androidx.recyclerview.widget.GridLayoutManager

class BooksLongFragment : Fragment() {

    private lateinit var adapter: BookLongAdapter

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_books_long, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val selectedCategory = requireActivity().intent.getStringArrayListExtra("category")
        val selectedAuthor = requireActivity().intent.getStringArrayListExtra("author")

        var filteredList: List<Book> = emptyList()
        if (selectedCategory?.contains("Favourite") == true){
            val sharedPref = requireContext().getSharedPreferences("book_favorites", Context.MODE_PRIVATE)
            val favIds = sharedPref.all
                .filterValues { it as? Boolean == true }
                .keys
                .mapNotNull { key ->
                    key.removePrefix("book_").toIntOrNull()
                }
            // Now filter your Book list using the favIds
            filteredList = Book.bookList.filter { book -> book.id in favIds }
        }else if(!selectedCategory.isNullOrEmpty()) {
            filteredList =
                Book.bookList.filter { book ->
                    book.categories.any { it in selectedCategory}
                }
        }

        if(!selectedAuthor.isNullOrEmpty()){
            filteredList =
                Book.bookList.filter{ book ->
                    selectedAuthor.contains(book.author)
                }
        }

        val recyclerView = view.findViewById<RecyclerView>(R.id.bookRecylerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        adapter = BookLongAdapter(filteredList,requireContext())
        recyclerView.adapter = adapter
    }
}