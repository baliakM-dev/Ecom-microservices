package com.app.ecom.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductRequest {
    private String title;
    private String description;
    private BigDecimal price;
    private Integer stockQuantity;
    private String category;
    private String imageUrl;
}
