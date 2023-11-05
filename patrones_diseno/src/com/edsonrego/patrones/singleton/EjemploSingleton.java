package com.edsonrego.patrones.singleton;

// Patrones Creacionales
// Singleton - permite crear solamente una instância de la clase, una sola referência

public class EjemploSingleton {
    public static void main(String[] args) {

        ConexionBDSingleton conn = null;
        
        for (int i = 0; i < 10; i++){
             conn = ConexionBDSingleton.getInstancia();
            System.out.println("conn = " + conn);
        }

        ConexionBDSingleton conn2 = ConexionBDSingleton.getInstancia();
        ConexionBDSingleton conn3 = ConexionBDSingleton.getInstancia();

        boolean b1 = ((conn == conn2) && (conn2 == conn3) && (conn == conn3));
        System.out.println("b1 = " + b1);
    }
}
