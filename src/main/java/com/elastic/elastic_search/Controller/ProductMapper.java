package com.elastic.elastic_search.Controller;

import org.springframework.stereotype.Service;

import com.elastic.elastic_search.Model.Product;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductMapper {

    public Product toProduct(ProductRequest productRequest) {
        return Product.builder()
                .productName(productRequest.getProductName())
                .price(productRequest.getPrice())
                .description(productRequest.getDescription())
                .build();
    }

}
