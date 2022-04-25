package com.letscode.productsmanager.controller;

import com.letscode.productsmanager.dto.request.ProductRequest;
import com.letscode.productsmanager.dto.request.SaleRequest;
import com.letscode.productsmanager.dto.response.ProductResponse;
import com.letscode.productsmanager.dto.response.SaleResponse;
import com.letscode.productsmanager.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    public ProductResponse create(@RequestBody ProductRequest productRequest){
        return productService.create(productRequest);
    }

    @GetMapping("/makeasale")
    public SaleResponse makeASale(@RequestBody SaleRequest saleRequest){
        return productService.makeASale(saleRequest);
    }

}
