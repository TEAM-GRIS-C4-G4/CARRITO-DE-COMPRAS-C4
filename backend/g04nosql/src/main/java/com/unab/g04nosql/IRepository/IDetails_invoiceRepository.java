package com.unab.g04nosql.IRepository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.g04nosql.Collection.Details_invoice;

public interface IDetails_invoiceRepository extends MongoRepository<Details_invoice, String> {

}
