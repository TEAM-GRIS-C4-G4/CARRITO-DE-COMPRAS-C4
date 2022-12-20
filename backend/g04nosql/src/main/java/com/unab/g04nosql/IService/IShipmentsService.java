package com.unab.g04nosql.IService;

import java.util.List;

import java.util.Optional;

import com.unab.g04nosql.Collection.Shipments;

public interface IShipmentsService {

	public List<Shipments> all();
	
	public Optional<Shipments> findById(String id);
	
	public Shipments save (Shipments shipments);
	
	public void delete (String id);
}
