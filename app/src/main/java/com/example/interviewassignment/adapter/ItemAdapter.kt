package com.example.interviewassignment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.interviewassignment.models.CountryModel
import com.example.interviewassignment.R

class ItemAdapter(
    private val dataList: Array<CountryModel>
                  ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder( view : View) : RecyclerView.ViewHolder(view){

        val textViewName = view.findViewById<TextView>(R.id.textView_name)
        val textViewRegion = view.findViewById<TextView>(R.id.textView_region)
        val textViewCode = view.findViewById<TextView>(R.id.textView_code)
        val textViewCapital = view.findViewById<TextView>(R.id.textView_capital)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val data = dataList[position]

        holder.textViewName.text = data.name + ","
        holder.textViewRegion.text = data.region
        holder.textViewCode.text = "    " + data.code
        holder.textViewCapital.text = data.capital
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}