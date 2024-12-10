package com.elastic.elastic_search.Controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ProductRequest {

    private String productName;
    private int price;
    private String description;
}
