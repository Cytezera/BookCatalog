package com.example.bookcatalog

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import android.widget.ImageView


class BookAdapter(
    private val books : List<Book>,
    private val context : Context
): RecyclerView.Adapter<BookAdapter.BookViewHolder>(){
    class BookViewHolder(view:View) : RecyclerView.ViewHolder(view){
        val textTitle : TextView = view.findViewById(R.id.textTitle)
        val bookImage : ImageView = view.findViewById(R.id.bookImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_short_book, parent, false)
        return BookViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = books[position]
        holder.textTitle.text = book.title
        holder.bookImage.setImageResource(book.imageId)
    }

    override fun getItemCount(): Int = books.size
}