package com.example.travelapplication.Models

import java.io.Serializable

data class EntityHotelModel(var caption: String , var destinationId : String, var geoId : String,
                            var landmarkCityDestinationId: Any, var latitude: Double,
                            var longitude: Double, var name: String,
                            var redirectPage: String, var type: String) : Serializable
