package com.unab.g04nosql.Collection;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document("Shipments")
public class Shipments {
	
	@Id
    private String id;
	
	@Field("codigoEnvio")
    private String codigoEnvio;
	
	@Field("valorEnvio")
    private Float valorEnvio;
	
	@Field("descripcion")
    private String descripcion;
	
	@Field("urlSeguimiento")
    private String urlSeguimiento;
	
	@Field("numeroGuia")
    private String numeroGuia;
	
	@Field("fechaEnviado")
    private Date fechaEnviado;
	
	@Field("fechaEntrega")
    private Date fechaEntrega;
	
	@Field("estadoEntrega")
    private String estadoEntrega;
	
	@DBRef
	private Invoices facturaId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCodigoEnvio() {
		return codigoEnvio;
	}

	public void setCodigoEnvio(String codigoEnvio) {
		this.codigoEnvio = codigoEnvio;
	}

	public Float getValorEnvio() {
		return valorEnvio;
	}

	public void setValorEnvio(Float valorEnvio) {
		this.valorEnvio = valorEnvio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUrlSeguimiento() {
		return urlSeguimiento;
	}

	public void setUrlSeguimiento(String urlSeguimiento) {
		this.urlSeguimiento = urlSeguimiento;
	}

	public String getNumeroGuia() {
		return numeroGuia;
	}

	public void setNumeroGuia(String numeroGuia) {
		this.numeroGuia = numeroGuia;
	}

	public Date getFechaEnviado() {
		return fechaEnviado;
	}

	public void setFechaEnviado(Date fechaEnviado) {
		this.fechaEnviado = fechaEnviado;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getEstadoEntrega() {
		return estadoEntrega;
	}

	public void setEstadoEntrega(String estadoEntrega) {
		this.estadoEntrega = estadoEntrega;
	}

	public Invoices getFacturaId() {
		return facturaId;
	}

	public void setFacturaId(Invoices facturaId) {
		this.facturaId = facturaId;
	}
}
