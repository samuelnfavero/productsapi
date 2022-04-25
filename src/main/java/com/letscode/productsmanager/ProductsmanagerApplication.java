package com.letscode.productsmanager;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Sample api", version = "1.0", description = "Sample Api"))
public class ProductsmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsmanagerApplication.class, args);
	}

}
