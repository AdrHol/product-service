package com.adrhol.product_service.application.domain.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@Document(collection = "products")
public class Product {

    @Id
    private String id;
    @Field
    private String shopId;
    @Field
    private String url;
    @Field
    private String itemName;
    @Field
    private String itemDescription;
    @Field
    private int price;
    @Field
    private int stock;
    @Field
    private String ingredients;
    @Field
    private ProductCategory category;
    protected Product() {
    }

}
