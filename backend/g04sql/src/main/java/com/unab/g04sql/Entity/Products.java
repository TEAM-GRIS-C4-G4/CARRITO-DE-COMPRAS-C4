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
@Table(name="products")
public class Products {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "codigo", nullable = false, unique = true, length = 20)
    private String codigo;
	
	@Column(name = "nombre", nullable = false, unique = false, length = 50)
    private String nombre;
	
	@Column(name = "descripcion", nullable = false, unique = false, length = 200)
    private String descripcion;
	
	@Column(name = "imagen", nullable = false, unique = false, length = 100)
    private String imagen;
	
	@Column(name = "cantidad_maxima", nullable = false, unique = false)
    private Integer cantidadMaxima;
	
	@Column(name = "cantidad_minima", nullable = false, unique = false)
    private Integer cantidadMinima;
	
	@Column(name = "stock", nullable = false, unique = false)
    private Integer stock;
	
	@Column(name = "precio_unitario_compra", nullable = false, unique = false, scale = 4)
    private Float precioUnitarioCompra;
	
	@Column(name = "precio_unitario_venta", nullable = false, unique = false, scale = 4)
    private Float precioUnitarioVenta;
	
	@Column(name = "iva", nullable = false, unique = false, scale = 4)
    private Float iva;
	
	@Column(name = "descuento", nullable = false, unique = false, scale = 4)
    private Float descuento;
	
	@Column(name = "estado", nullable = false)
    private Boolean estado;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "categoria_id", nullable = false)
	private Categories categoriaId;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "marca_id", nullable = false)
	private Brands marcaId;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "unidad_medida_id", nullable = false)
	private Units_measured unidadMedidaId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
