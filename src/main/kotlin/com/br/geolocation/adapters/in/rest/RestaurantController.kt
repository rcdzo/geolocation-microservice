package com.br.geolocation.adapters.`in`.rest

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/restaurants")
class RestaurantController {
    @Get()
    fun getByLocation(){
        
    }
}