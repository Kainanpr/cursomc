package com.kainanpr.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kainanpr.cursomc.domain.Pedido;
import com.kainanpr.cursomc.services.PedidoService;

@RestController
@RequestMapping(value="/Pedidos") //EndPoint
public class PedidoResource {
	
	@Autowired
	private PedidoService service;

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable Integer id) {
		
		Pedido obj = service.buscar(id);
		
		return ResponseEntity.ok().body(obj);
		
	}
	
}//Fim da classe
