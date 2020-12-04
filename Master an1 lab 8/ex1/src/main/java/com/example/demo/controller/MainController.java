package com.example.demo.controller;

import com.example.demo.model.Persoana;
import com.example.demo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persoane")
public class MainController {
    @Autowired
    private MainService mainService;

    @GetMapping("/get")
    public List<Persoana> getPersoane() {
        return mainService.getPersoane();
    }

    @PostMapping("/add")
    public List<Persoana> adaugaPersoana(@RequestBody Persoana p) {
        return mainService.adaugaPersoana(p);
    }

    @DeleteMapping("/delete")
    public List<Persoana> deletePeroanaById(@RequestParam int id) {
        return mainService.deletePeroanaById(id);
    }
}
