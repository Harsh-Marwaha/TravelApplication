package com.example.travelapplication.Models

data class HotelServiceModel(var autoSuggestInstance: Any, var misspellingfallback: Boolean,
                             var moresuggestions: Int,
                             var suggestionHotels: List<SuggestionHotelModel>, var term: String,
                             var trackingID: String)
