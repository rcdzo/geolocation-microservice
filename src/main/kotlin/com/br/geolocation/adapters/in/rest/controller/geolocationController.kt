package com.br.geolocation.adapters.`in`.rest.controller

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

@Controller("/geolocations")
class geolocationController {

    @Get("/{id}")
    fun getById(id: String): String {
        return "get by id"
    }

    @Get
    fun getAll(): String {
        return "get all"
    }
    
    @Post
    fun create(@Body request: Any): String {
        return "post"
    }
}