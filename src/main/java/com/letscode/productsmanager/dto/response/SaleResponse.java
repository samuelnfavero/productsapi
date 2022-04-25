package com.letscode.productsmanager.dto.response;

import com.letscode.productsmanager.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Getter  @NoArgsConstructor
public class SaleResponse implements Serializable {

    private List<SaleProductResponse> products;

    private double value;
}
