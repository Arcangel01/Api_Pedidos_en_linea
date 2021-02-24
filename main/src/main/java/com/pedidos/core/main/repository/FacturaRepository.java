package com.pedidos.core.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedidos.core.main.models.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Long> {

}
