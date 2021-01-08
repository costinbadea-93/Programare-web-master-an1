package com.example.demo.repository;

import com.example.demo.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MainRepository {
    private static final Logger LOGGER = LoggerFactory.getLogger(MainRepository.class);
    private List<Product> products = new ArrayList<>();

    public Product addProduct(Product product) {
        products.add(product);
        LOGGER.info("Adding product... {}", product);
        return product;
    }

    public Product addProductByCategory(Product product){
        LOGGER.info("Adding product... {}", product);
        return addProduct(product);
    }

    public List<Product> getAllProducts() {
        LOGGER.info("Retrieving products ... {}", products);
        return products;
    }
}
