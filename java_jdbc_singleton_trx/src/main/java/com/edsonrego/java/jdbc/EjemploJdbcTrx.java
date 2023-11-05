package com.edsonrego.java.jdbc;

import com.edsonrego.java.jdbc.modelo.Categoria;
import com.edsonrego.java.jdbc.modelo.Producto;
import com.edsonrego.java.jdbc.repositorio.ProductoRepositorioImpl;
import com.edsonrego.java.jdbc.repositorio.Repositorio;
import com.edsonrego.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJdbcTrx {
    public static void main(String[] args) throws SQLException {
        try(Connection conn = ConexionBaseDatos.getInstance()) {
            if(conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }
            try {
                Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
                System.out.println("=============== LISTAR ===============");
                repositorio.listar().forEach(System.out::println);

                System.out.println("=============== OBTENER POR ID ===============");
                System.out.println(repositorio.porId(2L));

                System.out.println("=============== INSERTAR NUEVO PRODUCTO ===============");
                Producto producto = new Producto();
                producto.setNombre("Teclado IBM Mecânico");
                producto.setPrecio(1550);
                Categoria categoria = new Categoria();
                categoria.setId(3L);
                producto.setCategoria(categoria);
                producto.setFechaRegistro(new Date());
                producto.setSku("abcde12348");
                repositorio.guardar(producto);
                System.out.println("Producto guardado con éxito");
                repositorio.listar().forEach(System.out::println);

                System.out.println("=============== MODIFICAR PRODUCTO ===============");
                producto = new Producto();
                producto.setId(5L);
                producto.setNombre("Teclado Corsair k95 Mecânico");
                producto.setPrecio(1000);
                categoria = new Categoria();
                categoria.setId(2L);
                producto.setCategoria(categoria);
                producto.setSku("abcde12345");
                repositorio.guardar(producto);
                System.out.println("Producto modificado con éxito");

                repositorio.listar().forEach(System.out::println);
                conn.commit();
            }catch (SQLException exception ){
                conn.rollback();
                exception.printStackTrace();
            }
        }
    }
}
