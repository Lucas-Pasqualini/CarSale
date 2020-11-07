package com.example.CarSale.Adress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/adress")
public class AdressController {

    @Autowired
    private AdressRepository adressRepository;

    @GetMapping
    public Iterable<Adress> getAdress(){
        return adressRepository.findAll();
    }

    @GetMapping("/{adressId}")
    public Optional<Adress> getAdress(@PathVariable("adressId") int adressId){
        return adressRepository.findById(adressId);
    }
}
