package com.example.CarSale.Car;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Brand {

    @Id
    private int id;
    private String name;

    @OneToMany
    @JoinColumn(name = "brand_id")
    private Set<Car> carList = new HashSet<>();
}
