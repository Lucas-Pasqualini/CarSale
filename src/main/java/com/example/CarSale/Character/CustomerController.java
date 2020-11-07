package com.example.CarSale.Character;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path="/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    public Iterable<Customer> getCustomer(){
        return customerRepository.findAll();
    }

    @GetMapping("/{customerId}")
    public Optional<Customer> getCustomer(@PathVariable("customerId") int customerId){
        return customerRepository.findById(customerId);
    }
}
