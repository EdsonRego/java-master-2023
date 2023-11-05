package com.edsonrego.java.jdbc;

import com.edsonrego.java.jdbc.modelo.Categoria;
import com.edsonrego.java.jdbc.modelo.Producto;
import com.edsonrego.java.jdbc.repositorio.CategoriRepositorioImpl;
import com.edsonrego.java.jdbc.repositorio.ProductoRepositorioImpl;
import com.edsonrego.java.jdbc.repositorio.Repositorio;
import com.edsonrego.java.jdbc.servicio.CatalogoServicio;
import com.edsonrego.java.jdbc.servicio.Servicio;
import com.edsonrego.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJdbc {
    public static void main(String[] args) throws SQLException {

        Servicio servicio = new CatalogoServicio();
        System.out.println("=============== LISTAR ===============");
        servicio.listar().forEach(System.out::println);


        System.out.println("=============== INSERTAR NUEVA CATEGORIA ===============");
        Categoria categoria = new Categoria();
        categoria.setNombre("Iluminación");


        System.out.println("=============== INSERTAR NUEVO PRODUCTO ===============");
        Producto producto = new Producto();
        producto.setNombre("Lámpara led escritório");
        producto.setPrecio(90);
        producto.setFechaRegistro(new Date());
        producto.setSku("abcdefgh12");
        servicio.guardarProductoConCategoria(producto, categoria);

        System.out.println("Producto guardado con éxito " + producto.getId());
        servicio.listar().forEach(System.out::println);
    }
}
