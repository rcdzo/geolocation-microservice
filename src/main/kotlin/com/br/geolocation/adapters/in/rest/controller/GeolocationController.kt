package com.br.geolocation.adapters.`in`.rest.controller

import com.br.geolocation.adapters.`in`.rest.mapper.mapToRestaurant
import com.br.geolocation.adapters.`in`.rest.models.request.RestaurantRequest
import com.br.geolocation.application.entities.Restaurant
import com.br.geolocation.ports.`in`.RestaurantUseCase
import io.micronaut.http.annotation.*

@Controller("/geolocations")
class GeolocationController(
    private val geoUseCase: RestaurantUseCase,
) {
    @Get("/{id}")
    fun getById(id: String): Restaurant? {
        return geoUseCase.getRestaurant(id = id)
    }

    @Get
    fun getAll(@QueryValue latitude: String, @QueryValue longitude: String): List<Restaurant> {
       return geoUseCase.findRestaurants(latitude = latitude, longitude = longitude)
    }

    @Post
    fun create(@Body request: RestaurantRequest): Restaurant {
        return  geoUseCase.createRestaurant(restaurant = request.mapToRestaurant())
    }
}