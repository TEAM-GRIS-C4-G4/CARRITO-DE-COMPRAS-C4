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

import com.unab.g04sql.Entity.Shipments;
import com.unab.g04sql.IService.IShipmentsService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/shipments")
public class ShipmentsController {

	@Autowired
	private IShipmentsService service;
	
	@GetMapping
	public List<Shipments> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Shipments> show(@PathVariable Integer id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Shipments save(@RequestBody Shipments roles) {
		return service.save(roles);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Shipments update(@PathVariable Integer id, @RequestBody Shipments shipments) {
		Optional<Shipments> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Shipments rolesUpdate = op.get();
			rolesUpdate.setCodigoEnvio(shipments.getCodigoEnvio());
			rolesUpdate.setDescripcion(shipments.getDescripcion());
			rolesUpdate.setEstadoEntrega(shipments.getEstadoEntrega());
			rolesUpdate.setFacturaId(shipments.getFacturaId());
			rolesUpdate.setFechaEntrega(shipments.getFechaEntrega());
			rolesUpdate.setFechaEnviado(shipments.getFechaEnviado());
			rolesUpdate.setId(shipments.getId());
			rolesUpdate.setNumeroGuia(shipments.getNumeroGuia());
			rolesUpdate.setUrlSeguimiento(shipments.getUrlSeguimiento());
			rolesUpdate.setValorEnvio(shipments.getValorEnvio());
			
			
			return service.save(rolesUpdate);
		}
		
		return shipments;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
}
