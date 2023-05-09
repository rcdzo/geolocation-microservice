package com.br.geolocation.ports.`in`

import com.br.geolocation.application.entities.Restaurant

interface RestaurantUseCase {
    fun createRestaurant(restaurant: Restaurant): Restaurant
    fun getRestaurant(id: String): Restaurant?
    fun findRestaurants(latitude: String, longitude: String): List<Restaurant>
}