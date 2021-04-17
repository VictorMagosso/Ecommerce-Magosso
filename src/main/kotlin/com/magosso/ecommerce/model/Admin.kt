package com.magosso.ecommerce.model

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "admin")
data class Admin(
        @Id
        val cIdAdmin: String = "",

        @Column(nullable = false, length = 100)
        val cName: String = "",

        @Column(unique = true, nullable = false, length = 50)
        val cEmail: String = "",

        @Column(nullable = false, length = 255)
        val cPassword: String = "",

        @JsonFormat(pattern = "dd/MM/yyyy")
        val dCreated: LocalDate? = null,

        @JsonFormat(pattern = "dd/MM/yyyy")
        val dUpdate: LocalDate? = null
)