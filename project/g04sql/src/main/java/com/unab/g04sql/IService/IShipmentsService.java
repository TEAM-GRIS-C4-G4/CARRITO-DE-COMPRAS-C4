package com.unab.g04sql.IService;

import java.util.List;

import java.util.Optional;

import com.unab.g04sql.Entity.Shipments;

public interface IShipmentsService {

	public List<Shipments> all();
	
	public Optional<Shipments> findById(Integer id);
	
	public Shipments save (Shipments shipments);
	
	public void delete (Integer id);
}
