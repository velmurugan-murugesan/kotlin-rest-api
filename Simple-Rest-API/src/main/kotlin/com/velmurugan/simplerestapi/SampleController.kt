package com.velmurugan.simplerestapi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/sampleapi")
class SampleController {

    @GetMapping("/home")
    fun getHome() : String {
        return "Hello world!"
    }
}