package com.magosso.domain.service.implementation

import com.magosso.ecommerce.model.Product
import org.springframework.stereotype.Service
import java.util.*

@Service
interface IProductService {
    fun getProductList(): List<Product>
    fun getProductById(id: Long): Optional<Product>
    fun persistProduct(product: Product): Product
}