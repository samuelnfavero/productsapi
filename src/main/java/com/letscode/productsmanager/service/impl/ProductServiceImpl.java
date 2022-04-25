package com.letscode.productsmanager.service.impl;

import com.letscode.productsmanager.client.SaleService;
import com.letscode.productsmanager.dto.request.ProductRequest;
import com.letscode.productsmanager.dto.request.SaleRequest;
import com.letscode.productsmanager.dto.response.ProductResponse;
import com.letscode.productsmanager.dto.response.SaleResponse;
import com.letscode.productsmanager.model.Product;
import com.letscode.productsmanager.repository.ProductRepository;
import com.letscode.productsmanager.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;
    @Autowired
    SaleService saleService;

    @Override
    public ProductResponse create(ProductRequest productRequest) {

        Product product = new Product(productRequest);
        Product savedProduct = productRepository.save(product);
        return new ProductResponse(savedProduct);
    }

    @Override
    public SaleResponse makeASale(SaleRequest saleRequest) {


        saleRequest.getProducts().forEach(
                product -> product.setProduct(productRepository.getById(product.getProductId())));
        return saleService.connectToSaleMicroservice(saleRequest);

    }
}
