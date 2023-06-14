package com.br.geolocation.application.entities

import com.br.geolocation.application.valueobjects.Menu

data class Restaurant(
    val id: String,
    val name: String,
    val menu: List<Menu>
)