package com.unab.g04nosql.IService;

import java.util.List;

import java.util.Optional;

import com.unab.g04nosql.Collection.Units_measured;

public interface IUnits_measuredService {

	public List<Units_measured> all();
	
	public Optional<Units_measured> findById(String id);
	
	public Units_measured save (Units_measured units_measured);
	
	public void delete (String id);
}
