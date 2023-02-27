package com.example.interviewassignment.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.interviewassignment.R

class ItemAdapter(val context: Context,
                  val name : String,
                  val region : String,
                  val code : String,
                  val capital : String
                  ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder( private val view : View) : RecyclerView.ViewHolder(view){
        val textViewName = view.findViewById<TextView>(R.id.textView_name)
        val textViewCode = view.findViewById<TextView>(R.id.textView_code)
        val textViewCapital = view.findViewById<TextView>(R.id.textView_capital)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        TODO("Not yet implemented")
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        TODO("Not yet implemented")

        val name = name[position]
        val code = code[position]
        val capital = capital[position]

        holder.textViewName = name
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}