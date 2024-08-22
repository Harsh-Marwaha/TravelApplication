package com.example.travelapplication.Adapters

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.travelapplication.Models.DestinationModel
import com.example.travelapplication.R


class RecViewAdapter : RecyclerView.Adapter<RecViewAdapter.ViewHolder> {

        private var arrDestinationlist : ArrayList<DestinationModel> = ArrayList()
        private var context : Context? = null

        private lateinit var mListener : onItemClickListener


        constructor(context: Context, arrDestinationList : ArrayList<DestinationModel>)
        {
            this.context=context
            this.arrDestinationlist=arrDestinationList
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.row_destination,parent,false),mListener)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.ivdestination.setImageResource(arrDestinationlist.get(position).img)
        var count = 1
        holder.ivLike.setOnClickListener(){
            if (count == 1){
                holder.ivLike.setColorFilter(Color.argb(255,255,255,255))
                holder.ivLike.setBackgroundResource(R.drawable.heart_like)
                Toast.makeText(context,"Saved ${arrDestinationlist.get(position).strDestination}",Toast.LENGTH_SHORT).show()
                count = 0
            }
            else{
                holder.ivLike.setColorFilter(Color.argb(255,0,0,0))
                holder.ivLike.setBackgroundResource(R.drawable.heart_bg)
                Toast.makeText(context,"Removed ${arrDestinationlist.get(position).strDestination}",Toast.LENGTH_SHORT).show()
                count=1
            }
//            holder.ivLike.setBackgroundColor(0x79f81832)
        }
        holder.tvdestination.setText(arrDestinationlist.get(position).strDestination)
    }

    override fun getItemCount(): Int {
        return arrDestinationlist.size
    }

    class ViewHolder(itemView: View , listener: onItemClickListener) : RecyclerView.ViewHolder(itemView)
    {

        init {
            itemView.setOnClickListener{
                listener.onItemClick(adapterPosition)
            }
        }

        var tvdestination : TextView = itemView.findViewById(R.id.tvDestination)
        var ivdestination : ImageView = itemView.findViewById(R.id.ivDestination)
        var ivLike : ImageButton = itemView.findViewById(R.id.ivLike)
    }

    interface onItemClickListener{

        fun onItemClick(position: Int)

    }

    fun onItemClickListener(listener: onItemClickListener)
    {
        mListener = listener
    }

}