package com.magosso.ecommerce.model

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "product")
data class Product(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val nIdProduct: Long = 0,

        @Column(nullable = false, length = 50)
        val cProductName: String = "",

        @Column(nullable = false, length = 255)
        val cProductDescription: String = "",

        @Column(nullable = false)
        val nPrice: Double = 0.0,

        @JsonFormat(pattern = "dd/MM/yyyy")
        val dCreated: LocalDate? = null,

        @JsonFormat(pattern = "dd/MM/yyyy")
        val dUpdate: LocalDate? = null,

        val nTotalStock: Int = 0,
        val cUrlImg: String = "",
        val bIsOnSale: Boolean = false,
        val bIsOutOfStock: Boolean = false,
        val bHasLowStock: Boolean = false,
        val nTotalSold: Int = 0
)