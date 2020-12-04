package com.example.demo.service;

import com.example.demo.model.Library;
import com.example.demo.repository.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    @Autowired
    private MainRepository mainRepository;

    public List<Library> getLibraryList() {
        return mainRepository.getLibraryList();
    }

    public List<Library> addNewLibrary(Library library){
        return mainRepository.addNewLibrary(library);
    }

    public List<Library> deleteLibraryByName(String name) {
        return mainRepository.deleteLibraryByName(name);
    }

    public Library findLibraryByName(String name) {
        return mainRepository.findLibraryByName(name);
    }
}
