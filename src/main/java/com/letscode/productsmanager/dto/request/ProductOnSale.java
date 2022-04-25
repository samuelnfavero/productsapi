package com.letscode.productsmanager.dto.request;

import com.letscode.productsmanager.model.Product;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
public class ProductOnSale implements Serializable {

    private Long productId;

    private Product product;
    private int quantity;
}
