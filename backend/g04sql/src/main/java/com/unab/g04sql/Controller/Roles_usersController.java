package com.unab.g04sql.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.unab.g04sql.Entity.Roles_users;
import com.unab.g04sql.IService.IRoles_usersService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/roles_users")
public class Roles_usersController {

	@Autowired
	private IRoles_usersService service;
	
	@GetMapping
	public List<Roles_users> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Roles_users> show(@PathVariable Integer id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Roles_users save(@RequestBody Roles_users brand) {
		return service.save(brand);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Roles_users update(@PathVariable Integer id, @RequestBody Roles_users roles_users) {
		Optional<Roles_users> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Roles_users Roles_usersUpdate = op.get();
			Roles_usersUpdate.setRolId(roles_users.getRolId());
			Roles_usersUpdate.setId(roles_users.getId());
			Roles_usersUpdate.setUsuarioId(roles_users.getUsuarioId());
			return service.save(Roles_usersUpdate);
		}
		
		return roles_users;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
}
