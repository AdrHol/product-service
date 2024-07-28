package com.adrhol.product_service.application.ports.in.useCases;

import com.adrhol.product_service.application.domain.entity.Product;

import java.util.List;

public interface ProductHandlingUseCase {
    List<Product> getAllProducts();
    List<Product> getAllProductsByShop(String shopId);
    List<Product> getProductsByCriteria();
    List<Product> getRecentlyViewed();
    Product getProduct(String productId);
}
