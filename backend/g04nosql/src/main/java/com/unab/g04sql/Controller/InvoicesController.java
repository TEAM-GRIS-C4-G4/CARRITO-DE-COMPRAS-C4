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

import com.unab.g04sql.Entity.Invoices;
import com.unab.g04sql.IService.IInvoicesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/invoices")
public class InvoicesController {

	@Autowired
	private IInvoicesService service;
	
	@GetMapping
	public List<Invoices> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Invoices> show(@PathVariable Integer id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Invoices save(@RequestBody Invoices invoice) {
		return service.save(invoice);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Invoices update(@PathVariable Integer id, @RequestBody Invoices invoices) {
		Optional<Invoices> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Invoices invoicesUpdate = op.get();
			invoicesUpdate.setCodigoFactura(invoices.getCodigoFactura());
			invoicesUpdate.setFecha(invoices.getFecha());
			invoicesUpdate.setValorBruto(invoices.getValorBruto());
			invoicesUpdate.setValorDescuento(invoices.getValorDescuento());
			invoicesUpdate.setValorIva(invoices.getValorIva());
			invoicesUpdate.setValorNeto(invoices.getValorNeto());
			invoicesUpdate.setUsuarioId(invoices.getUsuarioId());
			return service.save(invoicesUpdate);
		}
		
		return invoices;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
}