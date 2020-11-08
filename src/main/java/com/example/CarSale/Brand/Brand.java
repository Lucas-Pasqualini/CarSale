package com.example.CarSale.Brand;

import com.example.CarSale.Car.Car;
import com.example.CarSale.Concessionary.Concessionary;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Brand {

    @Id
    private int id;
    private String name;

    @OneToMany
    @JoinColumn(name = "brand_id")
    private Set<Car> brandList = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "BrandInConcessionary",
            joinColumns = @JoinColumn(name= "brand_id"),
            inverseJoinColumns = @JoinColumn(name = "concessionary_id")
    )
    private Set<Concessionary> concessionaryList = new HashSet<>();
}
