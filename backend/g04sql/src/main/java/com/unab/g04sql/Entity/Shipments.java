package com.unab.g04sql.Entity;

import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="shipments")
public class Shipments {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "codigo_envio", nullable = false, unique = true, length = 20)
    private String codigoEnvio;
	
	@Column(name = "valor_envio", nullable = false, unique = false, scale = 4)
    private Float valorEnvio;
	
	@Column(name = "descripcion", nullable = false, unique = false, length = 300)
    private String descripcion;
	
	@Column(name = "url_seguimiento", nullable = false, unique = false, length = 200)
    private String urlSeguimiento;
	
	@Column(name = "numero_guia", nullable = false, unique = false, length = 100)
    private String numeroGuia;
	
	@Column(name = "fecha_enviado", updatable = false, nullable = false)
	@Temporal(TemporalType.DATE)
    private Calendar fechaEnviado;
	
	@Column(name = "fecha_entrega", updatable = false, nullable = false)
	@Temporal(TemporalType.DATE)
    private Calendar fechaEntrega;
	
	@Column(name = "estado_entrega", nullable = false, unique = false, length = 20)
    private String estadoEntrega;
	
	@OneToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "factura_id", nullable = false)
	private Invoices facturaId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Calendar getFechaEnviado() {
		return fechaEnviado;
	}

	public void setFechaEnviado(Calendar fechaEnviado) {
		this.fechaEnviado = fechaEnviado;
	}

	public Calendar getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Calendar fechaEntrega) {
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
