package com.br.geolocation.ports.out

import com.br.geolocation.application.entities.Restaurant

interface GeolocationRepository {
    fun save(restaurant: Restaurant): Restaurant
    fun findByid(id: String): Restaurant?
    fun findAllByLocation(latitude: String, longitude: String): List<Restaurant>
}