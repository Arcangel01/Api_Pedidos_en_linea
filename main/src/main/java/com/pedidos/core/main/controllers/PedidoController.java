package com.pedidos.core.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedidos.core.main.interfaces.IPedido;
import com.pedidos.core.main.models.Pedido;

@RestController
@RequestMapping(value="v1/api")
public class PedidoController {
	
	@Autowired
	IPedido pedidoService;
	
	@GetMapping(value="pedido")
	public List<Pedido> getPedidos() {
		return pedidoService.getPedidos();
	}

}
