package com.unab.g04nosql.IRepository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.g04nosql.Collection.Units_measured;

public interface IUnits_measuredRepository extends MongoRepository<Units_measured, String> {

}
