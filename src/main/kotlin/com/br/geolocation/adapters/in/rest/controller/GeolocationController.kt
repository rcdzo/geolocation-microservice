package com.br.geolocation.adapters.`in`.rest.controller

import com.br.geolocation.application.entities.Restaurant
import com.br.geolocation.ports.`in`.GeolocationUseCase
import io.micronaut.http.annotation.*

@Controller("/geolocations")
class GeolocationController(
    private val geoUseCase: GeolocationUseCase,
) {
    @Get("/{id}")
    fun getById(id: String): Restaurant? {
        return geoUseCase.findRestaurant(id = id)
    }

    @Get
    fun getAll(@QueryValue latitude: String, @QueryValue longitude: String): List<Restaurant> {
       return geoUseCase.findRestaurants(latitue = latitude, longitude = longitude)
    }

    @Post
    fun create(@Body request: Restaurant): Restaurant {
        return  geoUseCase.createRestaurant(restaurant = request)
    }
}