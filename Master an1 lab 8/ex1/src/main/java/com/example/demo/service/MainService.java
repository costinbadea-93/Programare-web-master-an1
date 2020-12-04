package com.example.demo.service;

import com.example.demo.model.Persoana;
import com.example.demo.repository.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    @Autowired
    private MainRepository mainRepository;


    public List<Persoana> getPersoane() {
        return mainRepository.getPersoane();
    }

    public List<Persoana> adaugaPersoana(Persoana p) {
        return mainRepository.adaugaPersoana(p);
    }

    public List<Persoana> deletePeroanaById(int id) {
        return mainRepository.deletePeroanaById(id);
    }
}
