package com.unab.g04sql.IService;

import java.util.List;

import java.util.Optional;

import com.unab.g04sql.Entity.Units_measured;

public interface IUnits_measuredService {

	public List<Units_measured> all();
	
	public Optional<Units_measured> findById(Integer id);
	
	public Units_measured save (Units_measured units_measured);
	
	public void delete (Integer id);
}
