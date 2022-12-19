package com.unab.g04nosql.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unab.g04nosql.Collection.Cities;

public interface ICitiesRepository extends JpaRepository<Cities, Integer> {

}
