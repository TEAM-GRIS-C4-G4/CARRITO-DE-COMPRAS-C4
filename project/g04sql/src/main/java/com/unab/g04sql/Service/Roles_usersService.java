package com.unab.g04sql.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.g04sql.Entity.Roles_users;
import com.unab.g04sql.IRepository.IRoles_usersRepository;
import com.unab.g04sql.IService.IRoles_usersService;


@Service
public class Roles_usersService implements IRoles_usersService{
	
	@Autowired
	private IRoles_usersRepository repository;
	
		@Override
	public List<Roles_users> all() {
		return repository.findAll();
	}
	
	@Override
	public Optional<Roles_users> findById(Integer id) {
		return repository.findById(id);
	}
	
	@Override
	public Roles_users save(Roles_users roles_users) {
		return repository.save(roles_users);
	}
	
	@Override
	public void delete(Integer id) {
		repository.deleteById(id);		
	}
		
}
