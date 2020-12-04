package com.example.demo.controller;

import com.example.demo.model.Library;
import com.example.demo.service.MainService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library")
public class MainController {

    @Autowired
    private MainService mainService;

    @GetMapping("/get")
    public List<Library> getLibraryList() {
        return mainService.getLibraryList();
    }

    @PostMapping("/add")
    public List<Library> addNewLibrary(@RequestBody Library library){
        return mainService.addNewLibrary(library);
    }

    @DeleteMapping("/delete")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Unul din parametrii requestului nu este corect!!!")
    })
    public List<Library> deleteLibraryByName(@RequestParam String name) {
        return mainService.deleteLibraryByName(name);
    }

    @GetMapping("/getByName")
    public Library findLibraryByName(@RequestParam String name) {
        return mainService.findLibraryByName(name);
    }
}
