package com.br.geolocation.services

import com.br.geolocation.application.entities.Restaurant
import com.br.geolocation.ports.`in`.RestaurantUseCase
import com.br.geolocation.ports.out.RestaurantRepository
import jakarta.inject.Singleton

@Singleton
class RestaurantService(
    private val geoRepository: RestaurantRepository,
) : RestaurantUseCase {
    override fun getRestaurant(restaurant: Restaurant): Restaurant {
        return geoRepository.save(restaurant)
    }

    override fun findRestaurant(id: String): Restaurant? {
        return geoRepository.findByid(id = id)
    }

    override fun findRestaurants(latitue: String, longitude: String): List<Restaurant> {
        return geoRepository.findAllByLocation(latitude = latitue, longitude = longitude)
    }
}