package com.br.geolocation.ports.`in`

import com.br.geolocation.application.entities.Restaurant

interface RestaurantUseCase {
    fun createRestaurant(restaurant: Restaurant): Restaurant
    fun findRestaurant(id: String): Restaurant
    fun findRestaurants(Latitue: String, Logitude: String): List<Restaurant>
}