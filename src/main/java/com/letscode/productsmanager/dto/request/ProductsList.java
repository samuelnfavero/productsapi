package com.letscode.productsmanager.dto.request;

import com.letscode.productsmanager.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor @Getter
public class ProductsList {

    private List<Product> products;
}
