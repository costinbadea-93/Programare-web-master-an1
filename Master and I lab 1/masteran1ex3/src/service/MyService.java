package service;

import model.Persoana;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    @Qualifier("Gigel")
    Persoana persoana;

    public void printPersoana() {
        System.out.println(persoana);
    }
}
