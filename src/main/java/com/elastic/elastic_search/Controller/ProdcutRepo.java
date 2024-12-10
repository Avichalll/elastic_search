package com.elastic.elastic_search.Controller;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elastic.elastic_search.Model.Product;

public interface ProdcutRepo extends JpaRepository<Product, UUID> {

}
