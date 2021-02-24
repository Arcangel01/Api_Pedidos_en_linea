package com.pedidos.core.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedidos.core.main.interfaces.IPedido;
import com.pedidos.core.main.models.Pedido;
import com.pedidos.core.main.repository.PedidoRepository;

@Service
public class PedidoService implements IPedido {
	
	@Autowired
	PedidoRepository pedidoRepo;

	@Override
	public List<Pedido> getPedidos() {
		return (List<Pedido>) pedidoRepo.findAll();
	}

}
