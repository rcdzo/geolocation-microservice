package com.br.geolocation.application.entities

import com.br.geolocation.application.valueobjects.Location
import com.br.geolocation.application.valueobjects.Menu

data class Restaurant(
    val id: String,
    val location: Location,
    val name: String,
    val menu: List<Menu>
)