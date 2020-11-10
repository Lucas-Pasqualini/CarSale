package com.example.CarSale.Adress;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="adress")
public interface AdressRepository extends JpaRepository<Adress, Integer> {
}
