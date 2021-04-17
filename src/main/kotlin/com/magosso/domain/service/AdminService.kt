package com.magosso.domain.service

import com.magosso.domain.repository.AdminRepository
import com.magosso.domain.service.implementation.IAdminService
import com.magosso.ecommerce.model.Admin
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AdminService(@Autowired repository: AdminRepository) : IAdminService {

    override fun findAllAdmins(): List<Admin?>? {
        //TODO("Not yet implemented")
        return null
    }

    override fun findByEmail(email: String?): Admin? {
        //TODO("Not yet implemented")
        return null
    }

    override fun saveAdmin(admin: Admin?): Admin? {
        //TODO("Not yet implemented")
        return null
    }

    override fun deleteById(id: Int?) {
        //TODO("Not yet implemented")
    }

}