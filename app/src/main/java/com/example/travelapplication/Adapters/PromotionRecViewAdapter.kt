package com.example.travelapplication.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.travelapplication.Models.PromotionModel
import com.example.travelapplication.R


class PromotionRecViewAdapter : RecyclerView.Adapter<PromotionRecViewAdapter.ViewHolder> {

    private var arrPromotionlist : ArrayList<PromotionModel> = ArrayList()
    private var context : Context? = null

    private lateinit var mListener : onItemClickListener


    constructor(context: Context, arrPromotionList : ArrayList<PromotionModel>)
    {
        this.context=context
        this.arrPromotionlist=arrPromotionList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.row_promotions,parent,false),mListener)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.ivPromotions.setImageResource(arrPromotionlist.get(position).img)
    }

    override fun getItemCount(): Int {
        return arrPromotionlist.size
    }

    class ViewHolder(itemView : View, listener: onItemClickListener) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener{
                listener.onItemClick(adapterPosition)
            }
        }

        var ivPromotions : ImageView = itemView.findViewById(R.id.ivPromotions)

    }


    interface onItemClickListener{

        fun onItemClick(position: Int)

    }

    fun onItemClickListener(listener: onItemClickListener)
    {
        mListener = listener
    }
}