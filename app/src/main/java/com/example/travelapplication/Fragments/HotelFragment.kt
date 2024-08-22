package com.example.travelapplication.Fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.travelapplication.Adapters.HotelRecViewAdapter
import com.example.travelapplication.Interfaces.Hotel_Service
//import com.example.travelapplication.Interfaces.HotelServiceModel
import com.example.travelapplication.Models.HotelServiceModel
import com.example.travelapplication.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class HotelFragment : Fragment() {

    var hotelRecViewAdapter : HotelRecViewAdapter? = null
    var recViewHotels : RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hotel, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recViewHotels = view.findViewById(R.id.recViewHotels)
        getHotels()

    }

    private fun getHotels() {
        val hotel : Call<HotelServiceModel> = Hotel_Service.HotelInstance.getHotels()
        hotel.enqueue(object : Callback<HotelServiceModel> {
            override fun onResponse(p0: Call<HotelServiceModel>, p1: Response<HotelServiceModel>) {

                val hotels = p1.body()

                if (hotels!=null) {

                    Log.d("APP_HOTELS", hotel.toString())
                    hotelRecViewAdapter = HotelRecViewAdapter(context!!, hotels.suggestionHotels)
                    recViewHotels?.adapter = hotelRecViewAdapter
                    recViewHotels?.layoutManager = LinearLayoutManager(context!!)


                }
            }

            override fun onFailure(p0: Call<HotelServiceModel>, p1: Throwable) {
                Log.d("APP_HOTELS", "Error in Fetching ${p1.localizedMessage}")
            }

        })
    }

}