package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    @Autowired
    private  MainRepository mainRepository;

    /**
     * Sa va amintiti: good practice
     */
//    public MainService(MainRepository mainRepository){
//        this.mainRepository = mainRepository;
//    }

    public Employee addNewEmployee(Employee employee) {
        return mainRepository.addNewEmployee(employee);
    }

    public void deleteEmployee() {
       mainRepository.deleteEmployee();
    }

}
