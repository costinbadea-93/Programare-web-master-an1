package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.MainService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = MainController.class)
public class MainControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MainService mainService;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void addNewEmployee() throws Exception{
        //arrange
        Employee employee = new Employee("John", "Doe");
        when(mainService.addNewEmployee(any())).thenReturn(employee);

        //act + assert
        mockMvc.perform(
                post("/employee/add")
                .contentType("application/json")
                .content(objectMapper.writeValueAsString(employee))
        ).andExpect(status().isCreated())
         .andExpect(jsonPath("$.lastName").value(employee.getLastName()));
    }
}
