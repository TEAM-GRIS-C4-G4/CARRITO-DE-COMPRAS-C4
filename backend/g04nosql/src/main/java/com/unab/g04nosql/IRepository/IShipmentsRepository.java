package com.unab.g04nosql.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unab.g04nosql.Collection.Shipments;

public interface IShipmentsRepository extends JpaRepository<Shipments, Integer> {

}
