package com.elastic.elastic_search.Controller;

import org.springframework.stereotype.Service;

import com.elastic.elastic_search.ElasticController.ElasticProductRepo;
import com.elastic.elastic_search.Model.Product;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProdcutRepo prodcutRepo;
    private final ProductMapper productMapper;
    private final ElasticProductRepo elasticPoductRepo;

    public String saveProduct(ProductRequest productRequest) {

        Product product = productMapper.toProduct(productRequest);
        prodcutRepo.save(product);
        elasticPoductRepo.save(product);
        return "product saved";

    }

}
