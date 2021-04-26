package com.magosso.ecommerce.controller

import com.magosso.domain.service.implementation.IProductService
import com.magosso.ecommerce.model.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin(origins = ["*"])
@RequestMapping("api/products")
class ProductController(@Autowired val productService: IProductService) {

    @GetMapping("/all")
    fun getAllProducts(): List<Product> {
        return productService.getProductList()
    }

    @PostMapping("/save")
    fun persistProduct(@RequestBody product: Product) {
        productService.persistProduct(product)
    }
}