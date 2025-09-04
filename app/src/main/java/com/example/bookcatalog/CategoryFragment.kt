//Fragment for Category in main page

package com.example.bookcatalog

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class CategoryFragment : Fragment() {

    companion object{
        const val EXTRA_SELECTED_CATEGORY = "selected_category"
        private const val CAT_FANTASY = "Fantasy"
        private const val CAT_ROMANCE = "Romance"
        private const val CAT_MYSTERY = "Mystery"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_category, container,false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnFantasy =view.findViewById<Button>(R.id.btnFantasy)
        val btnRomance =view.findViewById<Button>(R.id.btnRomance)
        val btnMystery = view.findViewById<Button>(R.id.btnMystery)

        btnFantasy.setOnClickListener { openBookActivity(CAT_FANTASY) }
        btnRomance.setOnClickListener { openBookActivity(CAT_ROMANCE) }
        btnMystery.setOnClickListener { openBookActivity(CAT_MYSTERY) }

    }
    private fun openBookActivity(category: String){
        val intent = Intent(requireContext(), BooksActivity::class.java).apply {
            putExtra(EXTRA_SELECTED_CATEGORY, category)

        }
        startActivity(intent)
    }


}