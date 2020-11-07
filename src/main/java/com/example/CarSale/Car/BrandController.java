package com.example.CarSale.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path="/brand")
public class BrandController {

    @Autowired
    private BrandRepository brandRepository;

    @GetMapping
    public Iterable<Brand> getBrand(){
        return brandRepository.findAll();
    }

    @GetMapping("/{brandId}")
    public Optional<Brand> getCar(@PathVariable("brandId") int brandId){
        return brandRepository.findById(brandId);
    }
}
