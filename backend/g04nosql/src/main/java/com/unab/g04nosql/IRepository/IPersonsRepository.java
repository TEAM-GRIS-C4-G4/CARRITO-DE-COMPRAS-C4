package com.unab.g04nosql.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unab.g04nosql.Collection.Persons;

public interface IPersonsRepository extends JpaRepository<Persons, Integer> {

}
