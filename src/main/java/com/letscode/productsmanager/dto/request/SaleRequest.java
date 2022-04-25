package com.letscode.productsmanager.dto.request;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor @Getter @Setter @NoArgsConstructor
public class SaleRequest implements Serializable {

    List<ProductOnSale> products;
}
