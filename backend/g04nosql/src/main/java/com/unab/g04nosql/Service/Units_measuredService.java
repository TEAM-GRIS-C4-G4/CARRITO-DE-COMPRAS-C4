package com.unab.g04nosql.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.g04nosql.Collection.Units_measured;
import com.unab.g04nosql.IRepository.IUnits_measuredRepository;
import com.unab.g04nosql.IService.IUnits_measuredService;


@Service
public class Units_measuredService implements IUnits_measuredService{
	
	@Autowired
	private IUnits_measuredRepository repository;
	
		@Override
	public List<Units_measured> all() {
		return repository.findAll();
	}
	
	@Override
	public Optional<Units_measured> findById(Integer id) {
		return repository.findById(id);
	}
	
	@Override
	public Units_measured save(Units_measured units_measured) {
		return repository.save(units_measured);
	}
	
	@Override
	public void delete(Integer id) {
		repository.deleteById(id);		
	}
		
}
