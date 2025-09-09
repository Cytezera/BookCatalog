package com.example.bookcatalog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import android.content.Intent

class SearchFragment : Fragment() {
    private lateinit var searchView: SearchView
    private val bookViewModel: BookViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        searchView = view.findViewById(R.id.searchView)

        val btnFilter: ImageButton = view.findViewById(R.id.btnFilter)
        val btnFavourite: ImageButton = view.findViewById(R.id.btnFavourite)

        searchView.queryHint = "Books or Author"
        searchView.setIconifiedByDefault(false)
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                bookViewModel.setSearchQuery(newText.orEmpty())
                return true
            }
        })

        btnFilter.setOnClickListener{
            showFilterFragment()
        }
        btnFavourite.setOnClickListener{
            var bundle = Bundle()
            bundle.putStringArrayList("category", arrayListOf("Favourite"))
            val intent = Intent(requireContext(), BooksActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }

    private fun showFilterFragment() {
        // Collect all unique categories from your books
        val categories = Book.bookList
            .flatMap { it.categories }
            .distinct()
            .toTypedArray()

        val selectedItems = mutableListOf<String>()

        AlertDialog.Builder(requireContext())
            .setTitle("Choose Categories")
            .setMultiChoiceItems(categories, null) { _, which, isChecked ->
                if (isChecked) {
                    selectedItems.add(categories[which])
                } else {
                    selectedItems.remove(categories[which])
                }
            }
            .setPositiveButton("Apply") { dialog, _ ->
                if (selectedItems.isNotEmpty()) {
                    val bundle = Bundle().apply {
                        putStringArrayList("category", ArrayList(selectedItems))
                    }
                    val intent = Intent(requireContext(), BooksActivity::class.java).apply {
                        putExtras(bundle)
                    }
                    startActivity(intent)
                }
                dialog.dismiss()
            }
            .setNegativeButton("Cancel") { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }
}
