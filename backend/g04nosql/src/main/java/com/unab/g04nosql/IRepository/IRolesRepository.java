package com.unab.g04nosql.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unab.g04nosql.Collection.Roles;

public interface IRolesRepository extends JpaRepository<Roles, Integer> {

}
