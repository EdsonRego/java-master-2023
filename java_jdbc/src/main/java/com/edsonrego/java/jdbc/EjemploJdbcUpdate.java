package com.edsonrego.java.jdbc;

import com.edsonrego.java.jdbc.modelo.Categoria;
import com.edsonrego.java.jdbc.modelo.Producto;
import com.edsonrego.java.jdbc.repositorio.ProductoRepositorioImpl;
import com.edsonrego.java.jdbc.repositorio.Repositorio;
import com.edsonrego.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJdbcUpdate {
    public static void main(String[] args) {
        try(Connection conn = ConexionBaseDatos.getInstance()) {

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("=============== LISTAR ===============");
            repositorio.listar().forEach(System.out::println);

            System.out.println("=============== OBTENER POR ID ===============");
            System.out.println(repositorio.porId(2L));

            System.out.println("=============== MODIFICAR PRODUCTO ===============");
            Producto producto = new Producto();
            producto.setId(5L);
            producto.setNombre("Teclado Corsair k95 Mecânico");
            producto.setPrecio(700);
            Categoria categoria = new Categoria();
            categoria.setId(2L);
            producto.setCategoria(categoria);
            repositorio.guardar(producto);
            System.out.println("Producto modificado con éxito");
            repositorio.listar().forEach(System.out::println);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
