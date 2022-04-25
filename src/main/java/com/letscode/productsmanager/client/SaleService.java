package com.letscode.productsmanager.client;

import com.letscode.productsmanager.dto.request.SaleRequest;
import com.letscode.productsmanager.dto.response.SaleResponse;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SaleService {

    private static final String URL = "http://localhost:8081/sale";

    public SaleResponse connectToSaleMicroservice(SaleRequest saleRequest){

        try{
            RestTemplate restTemplate = new RestTemplate();
            HttpEntity<?> httpEntity = new HttpEntity<>(saleRequest);
            ResponseEntity<SaleResponse> response = restTemplate.exchange(URL,
                    HttpMethod.POST,
                    httpEntity,
                    SaleResponse.class);
            return response.getBody();
        } catch(RuntimeException e){
            throw new RuntimeException(e);
        }

    }
}
