package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.MainService;
import com.example.demo.utils.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/products")
public class MainController {

    @Autowired
    private MainService mainService;

    @GetMapping("/all")
    public List<Product> getProductList() {
        return mainService.getProductList();
    }

    @GetMapping("/byName")
    public ResponseEntity<?> getProductByName(@RequestParam String name) {
//        try {
           return ResponseEntity.ok().body(mainService.getProductByName(name));
//        } catch (ObjectNotFoundException exception) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
//        }
    }

    @GetMapping("/byCategory")
    public ResponseEntity<?> getProductByCategory(@RequestParam String category) {
//        try {
            return ResponseEntity.ok().body(mainService.getProductByCategory(category));
//        } catch (ObjectNotFoundException exception) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
//        }
    }

    @GetMapping("/byPrice")
    public ResponseEntity<?> getProductByPrice(@RequestParam Double price) {
//        try {
            return ResponseEntity.ok().body(mainService.getProductByPrice(price));
//        } catch (ObjectNotFoundException exception) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
//        }
    }

    @PostMapping("/add")
    public Product addNewProduct(@RequestBody @Valid Product product) {
            return mainService.addProduct(product);
    }

//    @GetMapping("/byCategory")
//    public List<Product> getProductByCategory(@RequestParam String category) {
//        return mainService.getProductByCategory(category);
//    }

}
