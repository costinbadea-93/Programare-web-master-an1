package com.example.demo.service;

import com.example.demo.repository.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MainService {
    @Autowired
    private MainRepository mainRepository;

    @Transactional
    public void add10Employees() {
        mainRepository.add10Employees();
    }
}
