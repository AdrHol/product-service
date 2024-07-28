package com.adrhol.product_service.application.ports.in.useCases;

import com.adrhol.product_service.application.domain.entity.Product;
import com.adrhol.product_service.application.ports.in.commands.CreateProductCommand;

public interface CreateProductUseCase {
    Product createProduct(CreateProductCommand command);

}
