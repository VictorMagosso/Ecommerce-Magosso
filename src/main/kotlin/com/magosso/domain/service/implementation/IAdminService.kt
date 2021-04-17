package com.magosso.domain.service.implementation

import com.magosso.ecommerce.model.Admin
import org.springframework.stereotype.Service

@Service
interface IAdminService {
    fun findAllAdmins(): List<Admin?>?
    fun findByEmail(email: String?): Admin?
    fun saveAdmin(admin: Admin?): Admin?
    fun deleteById(id: Int?)
}