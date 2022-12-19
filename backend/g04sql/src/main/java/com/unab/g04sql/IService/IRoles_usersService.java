package com.unab.g04sql.IService;

import java.util.List;

import java.util.Optional;

import com.unab.g04sql.Entity.Roles_users;

public interface IRoles_usersService {

	public List<Roles_users> all();
	
	public Optional<Roles_users> findById(Integer id);
	
	public Roles_users save (Roles_users roles_users);
	
	public void delete (Integer id);
}
