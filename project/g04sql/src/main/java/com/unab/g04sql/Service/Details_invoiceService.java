package com.unab.g04sql.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.g04sql.Entity.Details_invoice;
import com.unab.g04sql.IRepository.IDetails_invoiceRepository;
import com.unab.g04sql.IService.IDetails_invoiceService;


@Service
public class Details_invoiceService implements IDetails_invoiceService{
	
	@Autowired
	private IDetails_invoiceRepository repository;
	
		@Override
	public List<Details_invoice> all() {
		return repository.findAll();
	}
	
	@Override
	public Optional<Details_invoice> findById(Integer id) {
		return repository.findById(id);
	}
	
	@Override
	public Details_invoice save(Details_invoice details_invoice) {
		return repository.save(details_invoice);
	}
	
	@Override
	public void delete(Integer id) {
		repository.deleteById(id);		
	}
		
}
