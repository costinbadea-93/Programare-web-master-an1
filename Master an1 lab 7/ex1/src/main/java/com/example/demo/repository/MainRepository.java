package com.example.demo.repository;

import com.example.demo.model.Product;
import com.example.demo.service.MainService;
import com.example.demo.utils.ObjectNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class MainRepository {
    private static List<Product> productList = new ArrayList<>();


    public MainRepository(){
        productList.add(new Product("Ciocolata",5.0, "Dulciuri"));
        productList.add(new Product("Lapte",1.0, "Lactate"));
        productList.add(new Product("Bere",4.0, "Bauturi"));
    }


    public List<Product> getProductList() {
        return productList;
    }

    public Product getProductByName(String name) {
        return productList.stream()
                .filter(product -> product.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new ObjectNotFoundException("Product name does not exist!!!"));
    }

    public Product getProductByCategory(String category) {
        return productList.stream()
                .filter(product -> product.getCategory().equals(category))
                .findFirst()
                .orElseThrow(() -> new ObjectNotFoundException("Product category does not exist!!!"));
    }


//    public List<Product> getProductByCategory(String category) {
//        return productList.stream()
//                .filter(product -> product.getCategory().equals(category))
//                .collect(Collectors.toList());
//    }

    public Product getProductByPrice(Double price) {
        return productList.stream()
                .filter(product -> product.getPrice().equals(price))
                .findFirst()
                .orElseThrow(() -> new ObjectNotFoundException("Product price does not exist!!!"));
    }

    public Product addProduct(Product product) {
        productList.add(product);
        return product;
    }


}
