package com.edsonrego.optional.ejemplo;

import com.edsonrego.optional.ejemplo.Repositorio.ComputadorRepositorio;
import com.edsonrego.optional.ejemplo.Repositorio.Repositorio;
import com.edsonrego.optional.ejemplo.models.Computador;

import java.util.Optional;

public class EjemploRepositorioMetodosOrElseThrow {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        Computador pc = repositorio.filtrar("rog").orElseThrow(IllegalArgumentException::new);
        System.out.println("pc = " + pc);

        String archivo = "documento.pdf";
        String extension = Optional.ofNullable(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".") + 1))
                .orElseThrow();
        System.out.println("extension = " + extension);


    }
}
