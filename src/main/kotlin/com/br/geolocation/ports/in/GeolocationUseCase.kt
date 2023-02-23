package com.br.geolocation.ports.`in`

import com.br.geolocation.application.entities.Restaurant

interface GeolocationUseCase {
    fun createRestaurant(restaurant: Restaurant): Restaurant
    fun findRestaurant(id: String): Restaurant?
    fun findRestaurants(latitue: String, longitude: String): List<Restaurant>
}