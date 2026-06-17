package com.ed.restaurante_bd.repository;

import com.ed.restaurante_bd.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {


}
