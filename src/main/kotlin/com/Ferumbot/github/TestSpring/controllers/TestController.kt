package com.Ferumbot.github.TestSpring.controllers

import com.Ferumbot.github.TestSpring.models.Greeting
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class TestController {

    private val counter = AtomicLong(0)


    @GetMapping("/greeting")
    fun greeting(
        @RequestParam(value = "name", defaultValue = "World")
        name: String
    ): Greeting {
        return Greeting(
            id = counter.incrementAndGet(),
            content = "Hello, $name!"
        )
    }

}