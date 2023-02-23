package com.br.geolocation.services

import com.br.geolocation.application.entities.Restaurant
import com.br.geolocation.ports.`in`.GeolocationUseCase
import com.br.geolocation.ports.out.GeolocationRepository
import jakarta.inject.Singleton

@Singleton
class GeolocationService(
    private val geoRepository: GeolocationRepository,
) : GeolocationUseCase {
    override fun createRestaurant(restaurant: Restaurant): Restaurant {
        return geoRepository.save(restaurant)
    }

    override fun findRestaurant(id: String): Restaurant? {
        return geoRepository.findByid(id = id)
    }

    override fun findRestaurants(latitue: String, longitude: String): List<Restaurant> {
        return geoRepository.findAllByLocation(latitude = latitue, longitude = longitude)
    }
}