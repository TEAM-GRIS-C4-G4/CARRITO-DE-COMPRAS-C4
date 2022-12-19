package com.unab.g04nosql.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unab.g04nosql.Collection.Products;

public interface IProductsRepository extends JpaRepository<Products, Integer> {

}
