package com.example.CarSale.Brand;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="brand")
public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
