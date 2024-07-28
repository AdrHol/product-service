package com.adrhol.product_service.adapters.out.persistence;

import com.adrhol.product_service.application.domain.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

}
