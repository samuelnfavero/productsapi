package com.letscode.productsmanager.dto.response;

import com.letscode.productsmanager.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@AllArgsConstructor
@Getter
public class ProductResponse {

    private Long id;
    private String name;
    private double price;
    private int stockQuantity;

    public ProductResponse(Product product){
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.stockQuantity = product.getStockQuantity();
    }
}
