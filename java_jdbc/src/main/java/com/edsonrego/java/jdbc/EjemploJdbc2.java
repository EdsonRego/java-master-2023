package com.edsonrego.java.jdbc;

import java.sql.*;

public class EjemploJdbc2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java_curso?serverTimezone=America/Sao_Paulo";
        String username = "root";
        String password = "sasa";
        Connection conn = null;
        Statement stmt = null;
        ResultSet resultado =null;

        try {
            conn = DriverManager.getConnection(url,username,password);
            stmt = conn.createStatement();
            resultado = stmt.executeQuery("SELECT * FROM productos");

            while (resultado.next()){
                System.out.println(resultado.getString("nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultado.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
