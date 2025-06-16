package com.marlon.gestion_productos.repository;

import com.marlon.gestion_productos.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository
extends JpaRepository<Producto , Integer> {
}
