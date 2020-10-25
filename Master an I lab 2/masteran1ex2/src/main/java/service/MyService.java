package service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class MyService {
    public void printMessage() {
        System.out.println("Hello from my service!!!");
    }

    @PostConstruct
    public void onInit() {
        System.out.println("Instantiating MyService!!!");
    }

    @PreDestroy
    public void closing(){
        System.out.println("Bean has finished its job!!!");
    }
}
