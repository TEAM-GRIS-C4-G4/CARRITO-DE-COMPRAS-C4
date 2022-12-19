package com.unab.g04sql.Entity;

import java.util.Calendar;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="invoices")
public class Invoices {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "codigo_factura", nullable = false, unique = true, length = 20)
    private String codigoFactura;
	
	@Column(name = "fecha", updatable = false, nullable = false)
	@Temporal(TemporalType.DATE)
    private Calendar fecha;
	//AQUI SE ESTABLECIO QUE EL NUMERO DE NUMEROS DECIMALES QUE SE LES VA A ENVIAR VANA SER 4
	//VER SI ESTÁ BIEN O HAY QUE CAMBIARLO
	@Column(name = "valor_bruto", nullable = false, unique = false, scale=4)
    private Float valorBruto;
	
	@Column(name = "valor_descuento", nullable = false, unique = false, scale=4)
    private Float valorDescuento;
	
	@Column(name = "valor_iva", nullable = false, unique = false, scale=4)
    private Float valorIva;
	
	@Column(name = "valor_neto", nullable = false, unique = false, scale=4)
    private Float valorNeto;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "usuario_id", nullable = false)
	private Users usuarioId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
