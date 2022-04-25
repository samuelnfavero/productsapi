package com.letscode.productsmanager.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;



@Getter
@NoArgsConstructor

public class SaleProductResponse {

    private String id;
    private String name;
    private double price;
    private int quantity;
}
