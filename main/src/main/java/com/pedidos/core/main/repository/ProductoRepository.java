package com.pedidos.core.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedidos.core.main.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
