package com.magosso.ecommerce.controller

import com.magosso.domain.service.implementation.IClientService
import com.magosso.ecommerce.model.Client
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.scheduling.annotation.Async
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/cliente")
class ClientController(@Autowired val clientService: IClientService) {

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    @Async
    fun persistClient(@RequestBody client: Client): HttpStatus {
        return try {
            clientService.persistClient(client)
            HttpStatus.CREATED
        } catch (e: Exception) {
            HttpStatus.INTERNAL_SERVER_ERROR
        }
    }
}