package com.edsonrego.patrones.observer.ejemplos;

import com.edsonrego.patrones.observer.Corporacion;

public class EjemploObserver {
    public static void main(String[] args) {
        Corporacion google = new Corporacion("Google",1000);
        google.addObserver((observable,obj) -> {
            System.out.println("John Deere: " + observable);
        });

        google.addObserver((observable,obj) -> {
            System.out.println("Edson Rego: " + observable);
        });

        google.addObserver((observable,obj) -> {
            System.out.println("Andrés Guzman: " + observable);
        });

        google.modificaPrecio(2000);
    }
}
