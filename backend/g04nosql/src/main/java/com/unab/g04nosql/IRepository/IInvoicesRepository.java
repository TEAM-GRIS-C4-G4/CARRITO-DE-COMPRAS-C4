package com.unab.g04nosql.IRepository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.g04nosql.Collection.Invoices;

public interface IInvoicesRepository extends MongoRepository<Invoices, String> {

}
