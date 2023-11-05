package com.edsonrego.java.jdbc;

import java.sql.*;

public class EjemploJdbc3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java_curso?serverTimezone=America/Sao_Paulo";
        String username = "root";
        String password = "sasa";

        try(    Connection  conn = DriverManager.getConnection(url,username,password);
                Statement stmt = conn.createStatement();
                ResultSet resultado = stmt.executeQuery("SELECT * FROM productos")) {

            while (resultado.next()){
                System.out.print(resultado.getInt("id"));
                System.out.print(" | ");
                System.out.print(resultado.getString("nombre"));
                System.out.print(" \t| ");
                System.out.print(resultado.getString("precio"));
                System.out.print(" | ");
                System.out.println(resultado.getDate("fecha_registro"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
