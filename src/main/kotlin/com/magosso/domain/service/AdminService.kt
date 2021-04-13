package com.magosso.domain.service

import com.magosso.domain.`interface`.IAdminService
import com.magosso.ecommerce.model.Admin
import org.springframework.stereotype.Repository

@Repository
class AdminService : IAdminService {
    override fun findAll(): List<Admin?>? {
        //TODO("Not yet implemented")
        return null
    }

    override fun findByEmail(email: String?): Admin? {
        //TODO("Not yet implemented")
        return null
    }

    override fun save(admin: Admin?): Admin? {
        //TODO("Not yet implemented")
        return null
    }

    override fun deleteById(id: Int?) {
        //TODO("Not yet implemented")
    }

}