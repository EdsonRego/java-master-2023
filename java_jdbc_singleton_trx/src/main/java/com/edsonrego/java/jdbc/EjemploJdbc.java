package com.edsonrego.java.jdbc;

import com.edsonrego.java.jdbc.modelo.Categoria;
import com.edsonrego.java.jdbc.modelo.Producto;
import com.edsonrego.java.jdbc.repositorio.ProductoRepositorioImpl;
import com.edsonrego.java.jdbc.repositorio.Repositorio;
import com.edsonrego.java.jdbc.util.ConexionBaseDatos;

import java.sql.*;
import java.util.Date;

public class EjemploJdbc {
    public static void main(String[] args) {
        try(Connection conn = ConexionBaseDatos.getInstance()) {

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("=============== LISTAR ===============");
            repositorio.listar().forEach(System.out::println);

            System.out.println("=============== OBTENER POR ID ===============");
            System.out.println(repositorio.porId(2L));

            System.out.println("=============== INSERTAR NUEVO PRODUCTO ===============");
            Producto producto = new Producto();
            producto.setNombre("Teclado Razer Dragon Mecânico");
            producto.setPrecio(550);
            Categoria categoria = new Categoria();
            categoria.setId(3L);
            producto.setCategoria(categoria);
            producto.setFechaRegistro(new Date());
            repositorio.guardar(producto);
            System.out.println("Producto guardado con éxito");
            repositorio.listar().forEach(System.out::println);


            System.out.println("=============== INSERTAR NUEVO PRODUCTO ===============");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
