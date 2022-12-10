package com.unab.g04sql.IService;

import java.util.List;

import java.util.Optional;

import com.unab.g04sql.Entity.Invoices;

public interface IInvoiceService {

	public List<Invoices> all();
	
	public Optional<Invoices> findById(Integer id);
	
	public Invoices save (Invoices invoices);
	
	public void delete (Integer id);
}
