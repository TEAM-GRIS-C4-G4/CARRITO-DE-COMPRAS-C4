package com.unab.g04nosql.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.g04nosql.Collection.Shipments;

public interface IShipmentsRepository extends MongoRepository<Shipments, String> {

}
