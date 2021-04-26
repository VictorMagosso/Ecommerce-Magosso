package com.magosso.domain.service

import com.magosso.domain.repository.ProductRepository
import com.magosso.domain.service.implementation.IProductService
import com.magosso.ecommerce.model.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductService(@Autowired val repository: ProductRepository) : IProductService{
    override fun getProductList(): List<Product> {
        return repository.findAll()
    }

    override fun getProductById(id: Long): Optional<Product> {
        return repository.findById(id)
    }

    override fun persistProduct(product: Product): Product {
        return repository.save(product)
    }
}