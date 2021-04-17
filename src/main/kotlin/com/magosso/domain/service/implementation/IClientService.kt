package com.magosso.domain.service.implementation

import com.magosso.ecommerce.model.Client
import org.springframework.stereotype.Service

@Service
interface IClientService {
    fun findAllClients(): List<Client?>?
    fun findClientByEmail(email: String?): Client?
    fun persistClient(client: Client?): Client?
    fun deleteClientById(id: Int?)
}