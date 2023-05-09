package com.br.geolocation.application.entities

import io.micronaut.serde.annotation.Serdeable

@Serdeable
data class Location(
    val latitude:String,
    val longitude:String,
)
