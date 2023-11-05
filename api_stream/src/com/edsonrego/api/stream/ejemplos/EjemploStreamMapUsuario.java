package com.edsonrego.api.stream.ejemplos;

import com.edsonrego.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMapUsuario {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Pato Guzman","Paco Gonzalez","Pepa Gutierrez","Pepe Mena")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(System.out::println)
                .map(usuario -> {
                 String nombre = usuario.getNombre().toLowerCase();
                 usuario.setNombre(nombre);
                 return usuario;
                });
        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);




    }
}
