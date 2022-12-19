package com.unab.g04nosql.Collection;


import java.util.Calendar;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("Invoices")
public class Invoices {
	
	@Id
    private String id;
	
	@Field("codigoFactura")
    private String codigoFactura;
	
	@Field("fecha")
    private Calendar fecha; 
	
	@Field("valorBruto")
    private Float valorBruto;
	
	@Field("valorDescuento")
    private Float valorDescuento;
	
	@Field("valorIva")
    private Float valorIva;
	
	@Field("valorNeto")
    private Float valorNeto;
	
	@DBRef
	private Users usuarioId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCodigoFactura() {
		return codigoFactura;
	}

	public void setCodigoFactura(String codigoFactura) {
		this.codigoFactura = codigoFactura;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public Float getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(Float valorBruto) {
		this.valorBruto = valorBruto;
	}

	public Float getValorDescuento() {
		return valorDescuento;
	}

	public void setValorDescuento(Float valorDescuento) {
		this.valorDescuento = valorDescuento;
	}

	public Float getValorIva() {
		return valorIva;
	}

	public void setValorIva(Float valorIva) {
		this.valorIva = valorIva;
	}

	public Float getValorNeto() {
		return valorNeto;
	}

	public void setValorNeto(Float valorNeto) {
		this.valorNeto = valorNeto;
	}

	public Users getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Users usuarioId) {
		this.usuarioId = usuarioId;
	}

}
