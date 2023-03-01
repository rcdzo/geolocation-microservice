package com.br.geolocation.application.entities

import com.br.geolocation.application.valueObject.Item
import io.micronaut.serde.annotation.Serdeable

@Serdeable
data class Restaurant(
        val id:String,
        val name: String,
        val localization: Localization,
        val menu: List<Item>,
)