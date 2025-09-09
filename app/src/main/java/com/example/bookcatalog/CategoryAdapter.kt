//Adapter for recyclerview for books  at main page

package com.example.bookcatalog

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class CategoryAdapter(
    private var categories : List<String>,
    private val context : Context
): RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>(){
    class CategoryViewHolder(view:View) : RecyclerView.ViewHolder(view){
        val btnText : Button = view.findViewById(R.id.btnText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_category_button, parent, false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = categories[position]

        holder.btnText.text = category

        holder.btnText.setOnClickListener{
            var bundle = Bundle()
            bundle.putStringArrayList("author", arrayListOf(category))
            val intent = Intent(context, BooksActivity::class.java)
            intent.putExtras(bundle)
            context.startActivity(intent)
        }
    }
    override fun getItemCount(): Int = categories.size
}