package com.magosso.domain.service.`interface`

import com.magosso.ecommerce.model.Admin
import org.springframework.stereotype.Repository

@Repository
interface IAdminService {
    fun findAll(): List<Admin?>?
    fun findByEmail(email: String?): Admin?
    fun save(admin: Admin?): Admin?
    fun deleteById(id: Int?)
}