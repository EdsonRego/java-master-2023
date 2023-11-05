package com.edsonrego.java.jdbc;

import com.edsonrego.java.jdbc.modelo.Producto;
import com.edsonrego.java.jdbc.repositorio.ProductoRepositorioImpl;
import com.edsonrego.java.jdbc.repositorio.Repositorio;
import com.edsonrego.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;

public class EjemploJdbcDelete {
    public static void main(String[] args) {

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("=============== LISTAR ===============");
            repositorio.listar().forEach(System.out::println);

            System.out.println("=============== OBTENER POR ID ===============");
            System.out.println(repositorio.porId(2L));

            System.out.println("=============== ELIMINAR PRODUCTO ===============");
            repositorio.eliminar(4L);
            System.out.println("Producto modificado con éxito");
            repositorio.listar().forEach(System.out::println);

    }
}
