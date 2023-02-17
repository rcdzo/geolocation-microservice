package com.br.geolocation.application.entities

import com.br.geolocation.application.valueObject.Item

data class Restaurant(
        val id:String,
        val name: String,
        val localization: Localization,
        val Menu: List<Item>,
)