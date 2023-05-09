package com.br.geolocation.adapters.`in`.rest.models.dto

import io.micronaut.serde.annotation.Serdeable

@Serdeable
data class LocationDto(
    val coordinates: String
)
