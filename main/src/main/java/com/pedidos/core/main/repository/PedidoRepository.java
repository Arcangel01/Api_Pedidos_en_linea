package com.pedidos.core.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedidos.core.main.models.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
