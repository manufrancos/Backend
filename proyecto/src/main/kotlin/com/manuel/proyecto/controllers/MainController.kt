package com.manuel.proyecto.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {

    @GetMapping("")
    fun main() : String{
        return "hola mundo soy Manuel"
    }

}