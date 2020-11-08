package com.example.CarSale.Concessionary;

import com.example.CarSale.Brand.Brand;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Concessionary {

    @Id
    private String id;
    private String name;

    @ManyToMany(mappedBy = "concessionaryList")
    private Set<Brand> BrandList = new HashSet<>();
}
