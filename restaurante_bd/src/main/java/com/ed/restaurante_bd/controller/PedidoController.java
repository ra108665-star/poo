package com.ed.restaurante_bd.controller;

import com.ed.restaurante_bd.model.Pedido;
import com.ed.restaurante_bd.serivce.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<Pedido> lerPedidos(){
        return pedidoService.lerPedidos();
    }

    @PostMapping
    public Pedido inserirPedido(@RequestBody Pedido pedido){
        return pedidoService.inserirPedido(pedido);
    }
}
