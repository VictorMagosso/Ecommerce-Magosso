package com.magosso.ecommerce.model

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "client")
data class Client(
        @Id
        val cIdUser: String = "",
        val cName: String = "",
        val cAddress: String = "",
        @Column(unique = true)
        val cEmail: String = "",
        val cPassword: String = "",
        val dCreated: Date = Calendar.getInstance().time,
        val dUpdate: Date = Calendar.getInstance().time
)