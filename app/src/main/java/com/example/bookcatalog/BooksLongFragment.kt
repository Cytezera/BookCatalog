//Fragment for books in main page

package com.example.bookcatalog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager




class BooksLongFragment : Fragment() {

    private lateinit var adapter: BookLongAdapter
    private var selectedCategory: String? = null
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        selectedCategory = requireActivity().intent.getStringExtra(CategoryFragment.EXTRA_SELECTED_CATEGORY)
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
        var filteredList: List<Book> = emptyList()
        if (selectedCategory == "Favourite" ){
        }else {
            filteredList = Book.bookList.filter { it.categories.contains(selectedCategory) }
        }

        val recyclerView = view.findViewById<RecyclerView>(R.id.bookRecylerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        adapter = BookLongAdapter(filteredList,requireContext())
        recyclerView.adapter = adapter
    }
}