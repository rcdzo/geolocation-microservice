package com.br.geolocation.services

import com.br.geolocation.application.entities.Restaurant
import com.br.geolocation.ports.`in`.RestaurantUseCase
import com.br.geolocation.ports.out.RestaurantRepository
import jakarta.inject.Singleton

@Singleton
class RestaurantService(
    private val geoRepository: RestaurantRepository,
) : RestaurantUseCase {
    override fun createRestaurant(restaurant: Restaurant): Restaurant {
        return geoRepository.save(restaurant)
    }

    override fun getRestaurant(id: String): Restaurant? {
        return geoRepository.findByid(id = id)
    }

    override fun findRestaurants(latitude: String, longitude: String): List<Restaurant> {
        return geoRepository.findAllByLocation(latitude = latitude, longitude = longitude)
    }
}