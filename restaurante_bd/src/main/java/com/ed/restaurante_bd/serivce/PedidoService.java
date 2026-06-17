package com.ed.restaurante_bd.serivce;

import com.ed.restaurante_bd.model.Pedido;
import com.ed.restaurante_bd.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> lerPedidos(){
        return pedidoRepository.findAll();
    }

    public Pedido inserirPedido(Pedido pedido){
        return pedidoRepository.save(pedido);
    }


}
