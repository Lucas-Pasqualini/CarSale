package com.example.CarSale.Concessionary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/concessionary")
public class ConcessionaryController {

    @Autowired
    private ConcessionaryRepository concessionaryRepository;

    @GetMapping
    public Iterable<Concessionary> getConcessionary(){
        return concessionaryRepository.findAll();
    }

    @GetMapping("/{concessionaryId}")
    public Optional<Concessionary> getConcessionary(@PathVariable("concessionaryId") int concessionaryId){
        return concessionaryRepository.findById(concessionaryId);
    }
}
