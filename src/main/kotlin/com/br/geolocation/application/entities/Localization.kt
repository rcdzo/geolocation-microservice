package com.br.geolocation.application.entities

import io.micronaut.serde.annotation.Serdeable

@Serdeable
data class Localization(
    val id:String,
    val latitude:String,
    val longitude:String,
)
