package com.unab.g04nosql.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unab.g04nosql.Collection.Permissions;


public interface IPermissionsRepository extends JpaRepository<Permissions, Integer> {

}
