package com.br.geolocation.ports.`in`

import com.br.geolocation.application.entities.Restaurant

interface RestaurantUseCase {
    fun getRestaurant(restaurant: Restaurant): Restaurant
    fun findRestaurant(id: String): Restaurant?
    fun findRestaurants(latitude: String, longitude: String): List<Restaurant>
}