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

import com.unab.g04sql.Entity.Units_measured;
import com.unab.g04sql.IService.IUnits_measuredService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/shipments")
public class Units_measuredController {

	@Autowired
	private IUnits_measuredService service;
	
	@GetMapping
	public List<Units_measured> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Units_measured> show(@PathVariable Integer id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Units_measured save(@RequestBody Units_measured units_measured) {
		return service.save(units_measured);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Units_measured update(@PathVariable Integer id, @RequestBody Units_measured shipments) {
		Optional<Units_measured> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Units_measured units_measuredUpdate = op.get();
			units_measuredUpdate.setId(units_measuredUpdate.getId());			
			units_measuredUpdate.setDescripcion(units_measuredUpdate.getDescripcion());
			units_measuredUpdate.setCodigo(units_measuredUpdate.getCodigo());
			units_measuredUpdate.setEstado(units_measuredUpdate.getEstado());
			units_measuredUpdate.setNombre(units_measuredUpdate.getNombre());
			

			
			
			return service.save(units_measuredUpdate);
		}
		
		return shipments;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
}
