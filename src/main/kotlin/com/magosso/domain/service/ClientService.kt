package com.magosso.domain.service

import com.magosso.domain.repository.ClientRepository
import com.magosso.domain.service.implementation.IClientService
import com.magosso.ecommerce.model.Client
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ClientService(@Autowired val repository: ClientRepository) : IClientService {
    override fun findAllClients(): List<Client?>? {
        //TODO("Not yet implemented")
        return null
    }

    override fun findClientByEmail(email: String?): Client? {
        //TODO("Not yet implemented")
        return null
    }

    override fun persistClient(client: Client?): Client? {

        return null
    }

    override fun deleteClientById(id: Int?) {
        //TODO("Not yet implemented")
    }
}