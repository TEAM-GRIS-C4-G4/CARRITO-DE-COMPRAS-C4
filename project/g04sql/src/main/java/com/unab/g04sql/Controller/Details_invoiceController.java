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

import com.unab.g04sql.Entity.Details_invoice;
import com.unab.g04sql.IService.IDetails_invoiceService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/details_invoice")
public class Details_invoiceController {

	@Autowired
	private IDetails_invoiceService service;
	
	@GetMapping
	public List<Details_invoice> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Details_invoice> show(@PathVariable Integer id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Details_invoice save(@RequestBody Details_invoice detail_invoice) {
		return service.save(detail_invoice);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Details_invoice update(@PathVariable Integer id, @RequestBody Details_invoice details_invoice) {
		Optional<Details_invoice> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Details_invoice details_invoiceUpdate = op.get();
			details_invoiceUpdate.setValorBruto(details_invoice.getValorBruto());
			details_invoiceUpdate.setValorDescuento(details_invoice.getValorDescuento());
			details_invoiceUpdate.setValorIva(details_invoice.getValorIva());
			details_invoiceUpdate.setValorNeto(details_invoice.getValorNeto());
			details_invoiceUpdate.setCantidadProducto(details_invoice.getCantidadProducto());
			details_invoiceUpdate.setProductoId(details_invoice.getProductoId());
			details_invoiceUpdate.setFacturaId(details_invoice.getFacturaId());
			return service.save(details_invoiceUpdate);
		}
		
		return details_invoice;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
}
