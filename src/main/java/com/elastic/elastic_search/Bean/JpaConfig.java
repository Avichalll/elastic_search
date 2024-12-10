package com.elastic.elastic_search.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.elastic.elastic_search.Controller.ProdcutRepo;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class JpaConfig {

    private final ProdcutRepo prodcutRepo;

    @Bean(name = "productJpaRepository")
    public ProdcutRepo productJpaRepository() {
        return new ProdcutRepo();
    }
}