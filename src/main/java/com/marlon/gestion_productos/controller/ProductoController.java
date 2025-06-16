package com.marlon.gestion_productos.controller;


import com.marlon.gestion_productos.dto.ProductoDTO;
import com.marlon.gestion_productos.entity.Producto;
import com.marlon.gestion_productos.repository.ProductoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

@Autowired
 private ProductoRepository productoRepository;


//mostramops los productos
@GetMapping
public List<Producto >listarProductos(){
    return productoRepository.findAll();
}


//agregamos un producto
    @PostMapping
    public Producto crearProducto (
            @RequestBody @Valid ProductoDTO productoDTO
            ){

        Producto producto = new Producto();
        producto.setNombre( productoDTO.getNombre());
        producto.setDescripcion( productoDTO.getDescripcion());
        producto.setPrecio(productoDTO.getPrecio());
        producto.setStock(productoDTO.getStock());
        producto.setFecha_creacion(LocalDateTime.now());
        return productoRepository.save( producto );

    }

    //actualizamos un producto
    @PutMapping("/{id}")
    public Producto actualizarProducto (
      @PathVariable int id,
      @RequestBody
      @Valid ProductoDTO dto

    ){
    Producto producto = productoRepository.findById( id  )
            .orElseThrow( ()->new RuntimeException("Producto no encontrado")  );


    producto.setNombre( dto.getNombre() );
    producto.setDescripcion( dto.getDescripcion() );
    producto.setPrecio(dto.getPrecio());
    producto.setStock(dto.getStock());

    return productoRepository.save( producto );
    }


    //eliminamos un producto
    @DeleteMapping("/{id}")
    public void eliminarProducto( @PathVariable int id ){
    productoRepository.deleteById( id );
    }




}
