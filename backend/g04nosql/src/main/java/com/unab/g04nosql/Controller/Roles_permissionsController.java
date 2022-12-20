package com.unab.g04nosql.Controller;

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

import com.unab.g04nosql.Collection.Roles_permissions;
import com.unab.g04nosql.IService.IRoles_permissionsService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/roles_permissions")
public class Roles_permissionsController {

	@Autowired
	private IRoles_permissionsService service;
	
	@GetMapping
	public List<Roles_permissions> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Roles_permissions> show(@PathVariable String id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Roles_permissions save(@RequestBody Roles_permissions rol_permission) {
		return service.save(rol_permission);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Roles_permissions update(@PathVariable String id, @RequestBody Roles_permissions roles_permissions) {
		Optional<Roles_permissions> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Roles_permissions roles_permissionsUpdate = op.get();
			roles_permissionsUpdate.setRolId(roles_permissions.getRolId());
			roles_permissionsUpdate.setPermisoId(roles_permissions.getPermisoId());
			return service.save(roles_permissionsUpdate);
		}
		
		return roles_permissions;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
	
}