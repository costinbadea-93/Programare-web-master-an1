package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MainService {

    @Autowired
    private MainRepository mainRepository;

    public Product addProduct(Product product) {
        return mainRepository.addProduct(product);
    }

    public Product addProductByCategory(Product product) {
        if(product.getCategory().equals("Dulciuri")) {
            return mainRepository.addProduct(product);
        } else {
            throw new RuntimeException("Product is not allowed for the given category");
        }
    }

    public List<Product> getAllProducts() {
        return mainRepository.getAllProducts();
    }

    public List<Product> getProductByCategory(String category) {
        return mainRepository.getAllProducts()
                .stream()
                .filter(product -> product.getCategory().equals(category))
                .collect(Collectors.toList());
    }

    public List<Product> deleteProductByCategory(String category) {
        return mainRepository.getAllProducts()
                .stream()
                .filter(product -> !product.getCategory().equals(category))
                .collect(Collectors.toList());
    }

}
