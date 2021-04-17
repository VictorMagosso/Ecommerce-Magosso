package com.magosso.ecommerce.controller

import com.magosso.domain.service.implementation.IAdminService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Async
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("admin")
class AdminController(@Autowired val adminService: IAdminService) {
    @GetMapping("/login")
    @Async
    fun login(): String {
        return "login"
    }

    @GetMapping("/index")
    @ResponseStatus()
    @Async
    fun index(userName: String, password: String): String {
        if (userName.isNullOrEmpty() || password.isNullOrEmpty()) {
            ("Preencha todos os campos")
        }

        return try {
            "index"

        } catch (e: Exception) {
            ("Erro ao fazer login")
        }
    }
}