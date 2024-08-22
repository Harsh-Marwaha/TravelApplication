package com.example.travelapplication.Interfaces

import com.example.travelapplication.Models.HotelServiceModel
import com.google.gson.JsonObject
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

const val BASE_URL = "https://hotels-com-free.p.rapidapi.com/"


interface HotelService {
    @Headers(
        "Accept: application/json",
        "x-rapidapi-host: hotels-com-free.p.rapidapi.com",
        "x-rapidapi-key: 9acf3978abmsh75eab177bbb9bb2p1232bcjsn53cb2924f481"
    )
    @GET("suggest/v1.7/json?query=San%20Francisco&locale=en_US")
    fun getHotels() : Call<HotelServiceModel>


}

object Hotel_Service {

    var HotelInstance : HotelService
    init {
        var retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
            .build()
        HotelInstance = retrofit.create(HotelService::class.java)
    }

}