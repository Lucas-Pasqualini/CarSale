package com.example.CarSale.Concessionary;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Concessionary {

    @Id
    private String id;
    private String name;
}
