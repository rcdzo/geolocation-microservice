package com.br.geolocation.application.entities

import com.br.geolocation.application.valueObject.RestaurantItem
import io.micronaut.serde.annotation.Serdeable

@Serdeable
data class Restaurant(
    val id:String,
    val name: String,
    val location: Location,
    val menu: List<RestaurantItem>,
)