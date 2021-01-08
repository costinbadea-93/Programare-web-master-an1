package com.example.demo.service;

import com.example.demo.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class MainServiceIT {

    @Autowired
    private MainService mainService;

    @BeforeEach
    public void tearDown(){
        mainService.deleteEmployee();
    }

    @Test
    public void addEmployeeHappyFlow(){
        Employee employee = new Employee("John", "Doe");

        Employee result = mainService.addNewEmployee(employee);

        assertNotNull(result.getId());
        assertEquals(employee.getLastName(), result.getLastName());
        assertEquals(employee.getFirstName(), result.getFirstName());
    }
}
