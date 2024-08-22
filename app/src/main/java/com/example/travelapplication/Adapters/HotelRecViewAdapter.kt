package com.example.travelapplication.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.travelapplication.Interfaces.SuggestionHotel
import com.example.travelapplication.Interfaces.ExampleHotel
import com.example.travelapplication.Models.SuggestionHotelModel
//import com.example.travelapplication.Interfaces.SuggestionHotel
import com.example.travelapplication.R

class HotelRecViewAdapter : RecyclerView.Adapter<HotelRecViewAdapter.ViewHolder> {

    private var context : Context? = null
    private var arrHotels : List<SuggestionHotelModel>? = null

    private lateinit var mListener : onItemClickListener


    constructor(context: Context, arrHotels: List<SuggestionHotelModel>)
    {
        this.context=context
        this.arrHotels=arrHotels
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HotelRecViewAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(context!!).inflate(R.layout.row_hotels,parent,false),mListener)
    }

    override fun onBindViewHolder(holder: HotelRecViewAdapter.ViewHolder, position: Int) {
        holder.tvName.text = arrHotels?.get(position)?.entities?.get(position)?.name
        holder.tvCaption.text = arrHotels?.get(position)?.entities?.get(position)?.caption
        holder.tvType.text = arrHotels?.get(position)?.entities?.get(position)?.type
    }

    override fun getItemCount(): Int {
        return arrHotels!!.size
    }

    class ViewHolder(itemView : View, listener: onItemClickListener) : RecyclerView.ViewHolder(itemView) {

        init {
            itemView.setOnClickListener{
                listener.onItemClick(adapterPosition)
            }
        }

        var tvName = itemView.findViewById<TextView>(R.id.tvName)
        var tvCaption = itemView.findViewById<TextView>(R.id.tvCaption)
        var tvType = itemView.findViewById<TextView>(R.id.tvType)

    }

    interface onItemClickListener{

        fun onItemClick(position: Int)

    }

    fun onItemClickListener(listener: onItemClickListener)
    {
        mListener = listener
    }

}