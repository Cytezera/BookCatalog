//Fragment for books in main page

package com.example.bookcatalog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager

class BookshortFragment : Fragment() {

    private lateinit var adapter: BookShortAdapter
    private val bookViewModel: BookViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_bookshort, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.bookRecylerView)
        recyclerView.layoutManager = GridLayoutManager(requireContext(),2)

        adapter = BookShortAdapter(Book.bookList,requireContext())
        recyclerView.adapter = adapter

        bookViewModel.searchQuery.observe(viewLifecycleOwner){ query ->
            val filtered = if (query.isEmpty()){
                Book.bookList
            }else{
                Book.bookList.filter { book ->
                    book.title.contains(query, ignoreCase = true ) || book.author.contains( query, ignoreCase = true )
                }
            }
            adapter.updateList(filtered)
        }
    }
}