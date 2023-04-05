package com.br.geolocation.application.entities

import io.micronaut.serde.annotation.Serdeable

@Serdeable
data class Location(
    val id:String,
    val latitude:String,
    val longitude:String,
)
