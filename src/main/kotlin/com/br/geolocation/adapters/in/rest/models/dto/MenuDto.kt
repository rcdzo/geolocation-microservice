package com.br.geolocation.adapters.`in`.rest.models.dto

import io.micronaut.serde.annotation.Serdeable

@Serdeable
data class MenuDto(
    val id: String,
    val name: String,
    val description: String,
    val price:Double
)
