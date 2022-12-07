package com.unab.g04sql.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="details_invoice")
public class Details_invoice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "valor_bruto", nullable = false, unique = false, scale=4)
    private Float valorBruto;
	
	@Column(name = "valor_descuento", nullable = false, unique = false, scale=4)
    private Float valorDescuento;
	
	@Column(name = "valor_iva", nullable = false, unique = false, scale=4)
    private Float valorIva;
	
	@Column(name = "valor_neto", nullable = false, unique = false, scale=4)
    private Float valorNeto;
	
	@Column(name = "cantidad_producto", nullable = false, unique = false)
    private Integer cantidadProducto;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "producto_id", nullable = false)
	private Products productoId;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "factura_id", nullable = false)
	private Invoices facturaId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
