package com.letscode.productsmanager.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ProductRequest {

    private String name;
    private double price;
    private int stockQuantity;
}
