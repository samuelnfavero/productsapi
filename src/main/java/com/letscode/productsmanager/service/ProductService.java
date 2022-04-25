package com.letscode.productsmanager.service;

import com.letscode.productsmanager.dto.request.ProductRequest;
import com.letscode.productsmanager.dto.request.SaleRequest;
import com.letscode.productsmanager.dto.response.ProductResponse;
import com.letscode.productsmanager.dto.response.SaleResponse;

public interface ProductService {
    ProductResponse create(ProductRequest productRequest);

    SaleResponse makeASale(SaleRequest saleRequest);
}
