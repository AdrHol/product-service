package com.adrhol.product_service.adapters.in.web;

import com.adrhol.product_service.application.domain.entity.Product;
import com.adrhol.product_service.application.ports.in.commands.CreateProductCommand;
import com.adrhol.product_service.application.ports.in.useCases.CreateProductUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1")
@AllArgsConstructor
public class ProductServiceController {

    private CreateProductUseCase createProductUseCase;



    @PostMapping("/crate")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Product> createProduct(CreateProductCommand command){
        return ResponseEntity.ok(createProductUseCase.createProduct(command));
    }
}
