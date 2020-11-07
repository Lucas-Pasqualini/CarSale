package com.example.CarSale.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path="/car")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping
    public Iterable<Car> getCar(){
        return carRepository.findAll();
    }

    @GetMapping("/{carId}")
    public Optional<Car> getCar(@PathVariable("carId") int carId){
        return carRepository.findById(carId);
    }
}
