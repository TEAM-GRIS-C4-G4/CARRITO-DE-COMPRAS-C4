package com.unab.g04sql.IService;

import java.util.List;

import java.util.Optional;

import com.unab.g04sql.Entity.Details_invoice;

public interface IDetails_invoiceService {

	public List<Details_invoice> all();
	
	public Optional<Details_invoice> findById(Integer id);
	
	public Details_invoice save (Details_invoice details_invoice);
	
	public void delete (Integer id);
}
