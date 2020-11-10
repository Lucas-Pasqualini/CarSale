package com.example.CarSale.Concessionary;

import com.example.CarSale.Brand.Brand;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@Data
public class Concessionary {

    @Id
    private int id;
    private String name;

    @ManyToMany
    @JoinTable(
            name = "brand_concessionary",
            joinColumns = @JoinColumn(name= "concessionary_id"),
            inverseJoinColumns = @JoinColumn(name = "brand_id")
    )
    private Set<Brand> brandList = new HashSet<>();
}
