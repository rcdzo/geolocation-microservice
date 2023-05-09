package com.br.geolocation.adapters.`in`.rest.mapper

import com.br.geolocation.adapters.`in`.rest.models.dto.LocationDto
import com.br.geolocation.adapters.`in`.rest.models.dto.MenuDto
import com.br.geolocation.adapters.`in`.rest.models.request.RestaurantRequest
import com.br.geolocation.application.entities.Location
import com.br.geolocation.application.entities.Restaurant
import com.br.geolocation.application.valueObject.RestaurantItem

fun RestaurantRequest.mapToRestaurant() = Restaurant(
    id = id,
    name = name,
    location = location.mapToLocation(),
    menu = itens.mapToRestaurantItem()

)

fun LocationDto.mapToLocation() = Location(
    latitude = coordinates.split(",")[0].trim(),
    longitude = coordinates.split(",")[1].trim()
)

fun List<MenuDto>.mapToRestaurantItem(): List<RestaurantItem> =
    map {
        dto ->
        RestaurantItem(
            id = dto.id,
            name = dto.name,
            description = dto.description,
            price = dto.price
        )
    }