package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/employee")
public class MainController {

    @Autowired
    private MainService mainService;

//    public MainController(MainService mainService) {
//        this.mainService = mainService;
//    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        Employee emp = mainService.addNewEmployee(employee);
        return ResponseEntity.created(URI.create("/employee/" + employee.getFirstName())).body(emp);
    }
}
