package com.edsonrego.java.jdbc;

import com.edsonrego.java.jdbc.modelo.Categoria;
import com.edsonrego.java.jdbc.modelo.Producto;
import com.edsonrego.java.jdbc.repositorio.ProductoRepositorioImpl;
import com.edsonrego.java.jdbc.repositorio.Repositorio;

import java.util.Date;

public class EjemploJdbc {
    public static void main(String[] args) {

        Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
        System.out.println("=============== LISTAR ===============");
        repositorio.listar().forEach(System.out::println);

        System.out.println("=============== OBTENER POR ID ===============");
        System.out.println(repositorio.porId(2L));

        System.out.println("=============== INSERTAR NUEVO PRODUCTO ===============");
        Producto producto = new Producto();
        producto.setNombre("Notebook Omen HP");
        producto.setPrecio(2900);
        Categoria categoria = new Categoria();
        categoria.setId(3L);
        producto.setCategoria(categoria);
        producto.setFechaRegistro(new Date());
        repositorio.guardar(producto);
        System.out.println("Producto guardado con éxito");
        repositorio.listar().forEach(System.out::println);

    }
}
