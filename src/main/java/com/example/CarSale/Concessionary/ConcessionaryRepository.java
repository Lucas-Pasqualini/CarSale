package com.example.CarSale.Concessionary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="concessionary")
public interface ConcessionaryRepository extends JpaRepository<Concessionary,Integer> {
}
