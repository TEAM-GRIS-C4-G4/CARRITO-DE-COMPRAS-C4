package com.unab.g04nosql.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("Products")
public class Products {
	
	@Id
    private String id;
	
	@Field("codigo")
    private String codigo;
	
	@Field("nombre")
    private String nombre;
	
	@Field("descripcion")
    private String descripcion;
	
	@Field("imagen")
    private String imagen;
	
	@Field("cantidadMaxima")
    private Integer cantidadMaxima;
	
	@Field("cantidadMinima")
    private Integer cantidadMinima;
	
	@Field("stock")
    private Integer stock;
	
	@Field("precioUnitarioCompra")
    private Float precioUnitarioCompra;
	
	@Field("precioUnitarioVenta")
    private Float precioUnitarioVenta;
	
	@Field("iva")
    private Float iva;
	
	@Field("descuento")
    private Float descuento;
	
	@Field("estado")
    private Boolean estado;
	
	@DBRef
	private Categories categoriaId;
	
	@DBRef
	private Brands marcaId;
	
	@DBRef
	private Units_measured unidadMedidaId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Integer getCantidadMaxima() {
		return cantidadMaxima;
	}

	public void setCantidadMaxima(Integer cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
	}

	public Integer getCantidadMinima() {
		return cantidadMinima;
	}

	public void setCantidadMinima(Integer cantidadMinima) {
		this.cantidadMinima = cantidadMinima;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Float getPrecioUnitarioCompra() {
		return precioUnitarioCompra;
	}

	public void setPrecioUnitarioCompra(Float precioUnitarioCompra) {
		this.precioUnitarioCompra = precioUnitarioCompra;
	}

	public Float getPrecioUnitarioVenta() {
		return precioUnitarioVenta;
	}

	public void setPrecioUnitarioVenta(Float precioUnitarioVenta) {
		this.precioUnitarioVenta = precioUnitarioVenta;
	}

	public Float getIva() {
		return iva;
	}

	public void setIva(Float iva) {
		this.iva = iva;
	}

	public Float getDescuento() {
		return descuento;
	}

	public void setDescuento(Float descuento) {
		this.descuento = descuento;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Categories getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(Categories categoriaId) {
		this.categoriaId = categoriaId;
	}

	public Brands getMarcaId() {
		return marcaId;
	}

	public void setMarcaId(Brands marcaId) {
		this.marcaId = marcaId;
	}

	public Units_measured getUnidadMedidaId() {
		return unidadMedidaId;
	}

	public void setUnidadMedidaId(Units_measured unidadMedidaId) {
		this.unidadMedidaId = unidadMedidaId;
	}
}
