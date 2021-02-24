package com.pedidos.core.main.dto;

import java.util.Date;
import java.util.List;

public class FacturaDto {

	private Long id;

	private Long idPedido;

	private Long iva;

	private Long domicilio;

	private Double total;

	private Integer status;

	private Date fechaCreacion;

	private List<ProductoDto> productoDtos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public Long getIva() {
		return iva;
	}

	public void setIva(Long iva) {
		this.iva = iva;
	}

	public Long getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Long domicilio) {
		this.domicilio = domicilio;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
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

	public List<ProductoDto> getProductoDtos() {
		return productoDtos;
	}

	public void setProductoDtos(List<ProductoDto> productoDtos) {
		this.productoDtos = productoDtos;
	}

}
