package com.pedidos.core.main.dto;

import java.util.Date;
import java.util.List;

public class PedidoDto {

	private Long id;

	private Long numeroPedido;

	private Long idCliente;

	private List<Long> idProducto;

	private Integer status;

	private Date fechaCreacion;

	private List<Long> productosNuevos;

	private List<Long> productosEliminar;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(Long numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public List<Long> getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(List<Long> idProducto) {
		this.idProducto = idProducto;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public List<Long> getProductosNuevos() {
		return productosNuevos;
	}

	public void setProductosNuevos(List<Long> productosNuevos) {
		this.productosNuevos = productosNuevos;
	}

	public List<Long> getProductosEliminar() {
		return productosEliminar;
	}

	public void setProductosEliminar(List<Long> productosEliminar) {
		this.productosEliminar = productosEliminar;
	}

}
