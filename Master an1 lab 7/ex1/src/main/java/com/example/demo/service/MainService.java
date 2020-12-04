package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    @Autowired
    private MainRepository mainRepository;

    public List<Product> getProductList() {
        return mainRepository.getProductList();
    }

    public Product getProductByName(String name) {
        return mainRepository.getProductByName(name);
    }

    public Product getProductByCategory(String category) {
        return mainRepository.getProductByCategory(category);
    }

//    public List<Product> getProductByCategory(String category) {
//        return mainRepository.getProductByCategory(category);
//    }

    public Product getProductByPrice(Double price) {
        return mainRepository.getProductByPrice(price);
    }

    public Product addProduct(Product product) {
        return mainRepository.addProduct(product);
    }
}
