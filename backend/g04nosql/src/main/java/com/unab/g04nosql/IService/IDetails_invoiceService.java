package com.unab.g04nosql.IService;

import java.util.List;

import java.util.Optional;

import com.unab.g04nosql.Collection.Details_invoice;

public interface IDetails_invoiceService {

	public List<Details_invoice> all();
	
	public Optional<Details_invoice> findById(String id);
	
	public Details_invoice save (Details_invoice details_invoice);
	
	public void delete (String id);
}
