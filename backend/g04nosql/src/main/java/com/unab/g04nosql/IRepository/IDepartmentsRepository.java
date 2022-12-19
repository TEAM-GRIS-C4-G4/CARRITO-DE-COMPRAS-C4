package com.unab.g04nosql.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unab.g04nosql.Collection.Departments;

public interface IDepartmentsRepository extends JpaRepository<Departments, Integer> {

}
