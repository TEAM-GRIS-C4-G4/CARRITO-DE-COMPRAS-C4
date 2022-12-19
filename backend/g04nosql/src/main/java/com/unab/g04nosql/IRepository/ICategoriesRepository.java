package com.unab.g04nosql.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unab.g04nosql.Collection.Categories;

public interface ICategoriesRepository extends JpaRepository<Categories, Integer> {

}
