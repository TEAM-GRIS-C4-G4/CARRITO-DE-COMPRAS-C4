package com.unab.g04nosql.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.g04nosql.Collection.Invoices;
import com.unab.g04nosql.IRepository.IInvoicesRepository;
import com.unab.g04nosql.IService.IInvoicesService;


@Service
public class InvoicesService implements IInvoicesService{
	
	@Autowired
	private IInvoicesRepository repository;
	
		@Override
	public List<Invoices> all() {
		return repository.findAll();
	}
	
	@Override
	public Optional<Invoices> findById(String id) {
		return repository.findById(id);
	}
	
	@Override
	public Invoices save(Invoices invoices) {
		return repository.save(invoices);
	}
	
	@Override
	public void delete(String id) {
		repository.deleteById(id);		
	}
		
}
