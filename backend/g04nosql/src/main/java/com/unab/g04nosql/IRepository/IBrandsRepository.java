package com.unab.g04nosql.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unab.g04nosql.Collection.Brands;

public interface IBrandsRepository extends JpaRepository<Brands, Integer> {

}
