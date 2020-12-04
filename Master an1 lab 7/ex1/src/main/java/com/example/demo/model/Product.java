package com.example.demo.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Product {

    @NotNull(message = "Product name cannot be null!!!!")
    private String name;

    @NotNull(message = "Product price cannot be null!!!!")
    @Min(1)
    private Double price;

    @NotNull(message = "Product category cannot be null!!!!")
    private String category;

    public Product(String name, Double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
