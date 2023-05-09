package com.br.geolocation.adapters.`in`.rest.models.request

import com.br.geolocation.adapters.`in`.rest.models.dto.LocationDto
import com.br.geolocation.adapters.`in`.rest.models.dto.MenuDto
import io.micronaut.serde.annotation.Serdeable

@Serdeable
data class RestaurantRequest(
    val id: String,
    val name: String,
    val location: LocationDto,
    val itens: List<MenuDto>
)