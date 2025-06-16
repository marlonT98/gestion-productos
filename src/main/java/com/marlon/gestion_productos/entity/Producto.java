package com.marlon.gestion_productos.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table( name = "Productos")
@Getter
@Setter
public class Producto {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id_Producto ;

private String nombre;
private String descripcion;
private double precio;
private int stock;

private LocalDateTime fecha_creacion;


}
