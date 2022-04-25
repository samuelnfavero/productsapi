package com.letscode.productsmanager.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.letscode.productsmanager.dto.request.ProductRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "products")
@NoArgsConstructor
@Getter
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private double price;
    @Column
    private int stockQuantity;

    public Product(ProductRequest productRequest){
        this.name = productRequest.getName();
        this.price = productRequest.getPrice();
        this.stockQuantity = productRequest.getStockQuantity();
    }
}
