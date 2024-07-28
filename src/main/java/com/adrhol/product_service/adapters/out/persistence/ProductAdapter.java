package com.adrhol.product_service.adapters.out.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductAdapter {

    private final ProductRepository productRepository;

    @Autowired
    public ProductAdapter(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
