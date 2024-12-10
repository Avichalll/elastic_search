package com.elastic.elastic_search.ElasticController;

import java.util.UUID;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.elastic.elastic_search.Model.Product;

public interface ElasticProductRepo extends ElasticsearchRepository<Product, UUID> {

}
