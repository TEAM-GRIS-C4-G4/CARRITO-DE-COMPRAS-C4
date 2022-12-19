package com.unab.g04nosql.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.g04nosql.Collection.Shipments;
import com.unab.g04nosql.IRepository.IShipmentsRepository;
import com.unab.g04nosql.IService.IShipmentsService;


@Service
public class ShipmentsService implements IShipmentsService{
	
	@Autowired
	private IShipmentsRepository repository;
	
		@Override
	public List<Shipments> all() {
		return repository.findAll();
	}
	
	@Override
	public Optional<Shipments> findById(Integer id) {
		return repository.findById(id);
	}
	
	@Override
	public Shipments save(Shipments shipments) {
		return repository.save(shipments);
	}
	
	@Override
	public void delete(Integer id) {
		repository.deleteById(id);		
	}
		
}
