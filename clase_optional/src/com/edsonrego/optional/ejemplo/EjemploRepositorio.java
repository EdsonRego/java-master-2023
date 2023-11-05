package com.edsonrego.optional.ejemplo;

import com.edsonrego.optional.ejemplo.Repositorio.ComputadorRepositorio;
import com.edsonrego.optional.ejemplo.Repositorio.Repositorio;
import com.edsonrego.optional.ejemplo.models.Computador;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        repositorio.filtrar("asus rog").ifPresentOrElse(System.out::println,
                ()-> System.out.println("No se encontró!"));

//       Optional<Computador> pc =  repositorio.filtrar("asus rog");
//
//        if(pc.isPresent()) {
//            System.out.println(pc.get());
//        }else {
//            System.out.println("No se encontró!");
//        }
    }
}
