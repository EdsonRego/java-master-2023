package com.edsonrego.patrones.observer.ejemplos;

import com.edsonrego.patrones.observer.UsuarioRepositorio;

public class EjemploObserver2 {
    public static void main(String[] args) {
        UsuarioRepositorio repo = new UsuarioRepositorio();
        repo.addObserver((o, u) -> System.out.println("Enviaro un e-mail al usuario " + u));
        repo.addObserver((o, u) -> System.out.println("Enviaro un e-mail al administrador"));
        repo.addObserver((o, u) -> System.out.println("Guardar info del usuario " + u + " en el logs"));
        repo.crearUsuario("Edson");
    }
}
