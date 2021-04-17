package com.magosso.ecommerce.model

import javax.persistence.*

@Entity
@Table(name = "product")
data class Product(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val nIdProduct: Int = 0,
        val cProductName: String = "",
        val cProductDescription: String = "",
        val nPrice: Double = 0.0,
        val nTotalStock: Double = 0.0,
        val cUrlImg: String = "",
        val bIsOnSale: Boolean = false,
        val bIsOutOfStock: Boolean = false,
        val bHasLowStock: Boolean = false,
        val nTotalSold: Int = 0
)