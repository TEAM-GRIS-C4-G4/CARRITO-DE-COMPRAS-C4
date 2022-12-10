package com.unab.g04sql.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.g04sql.Entity.Roles_permissions;
import com.unab.g04sql.IRepository.IRoles_permissionsRepository;
import com.unab.g04sql.IService.IRoles_permissionsService;


@Service
public class Roles_permissionsService implements IRoles_permissionsService{
	
	@Autowired
	private IRoles_permissionsRepository repository;
	
		@Override
	public List<Roles_permissions> all() {
		return repository.findAll();
	}
	
	@Override
	public Optional<Roles_permissions> findById(Integer id) {
		return repository.findById(id);
	}
	
	@Override
	public Roles_permissions save(Roles_permissions roles_permissions) {
		return repository.save(roles_permissions);
	}
	
	@Override
	public void delete(Integer id) {
		repository.deleteById(id);		
	}
		
}
