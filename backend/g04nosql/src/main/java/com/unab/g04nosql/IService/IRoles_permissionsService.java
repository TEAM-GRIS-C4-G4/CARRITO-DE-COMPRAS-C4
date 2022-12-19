package com.unab.g04nosql.IService;

import java.util.List;

import java.util.Optional;

import com.unab.g04nosql.Collection.Roles_permissions;

public interface IRoles_permissionsService {

	public List<Roles_permissions> all();
	
	public Optional<Roles_permissions> findById(Integer id);
	
	public Roles_permissions save (Roles_permissions roles_permissions);
	
	public void delete (Integer id);
}
