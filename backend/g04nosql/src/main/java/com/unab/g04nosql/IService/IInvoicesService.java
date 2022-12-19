package com.unab.g04nosql.IService;

import java.util.List;

import java.util.Optional;

import com.unab.g04nosql.Collection.Invoices;

public interface IInvoicesService {

	public List<Invoices> all();
	
	public Optional<Invoices> findById(Integer id);
	
	public Invoices save (Invoices invoices);
	
	public void delete (Integer id);
}
