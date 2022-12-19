package com.unab.g04nosql.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("Details_invoice")
public class Details_invoice {
	
	@Id
    private String id;
	
	@Field("valorBruto")
    private Float valorBruto;
	
	@Field("valorDescuento")
    private Float valorDescuento;
	
	@Field("valorIva")
    private Float valorIva;
	
	@Field("valorNeto")
    private Float valorNeto;
	
	@Field("cantidadProducto")
    private Integer cantidadProducto;
	
	@DBRef
	private Products productoId;
	
	@DBRef
	private Invoices facturaId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Integer getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(Integer cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public Products getProductoId() {
		return productoId;
	}

	public void setProductoId(Products productoId) {
		this.productoId = productoId;
	}

	public Invoices getFacturaId() {
		return facturaId;
	}

	public void setFacturaId(Invoices facturaId) {
		this.facturaId = facturaId;
	}

}
