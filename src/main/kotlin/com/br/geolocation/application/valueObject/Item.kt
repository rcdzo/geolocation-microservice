package com.br.geolocation.application.valueObject

import io.micronaut.serde.annotation.Serdeable

@Serdeable
data class Item(
        val id:String,
        val name:String,
        val description:String,
        val price:Double,
)