package com.edsonrego.api.stream.ejemplos;

import com.edsonrego.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterAnyCount {
    public static void main(String[] args) {

        long cantidad = Stream
                .of("Pato Guzman","Paco Gonzalez","Pepa Gutierrez","Pepe Mena","Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(System.out::println)
                .count();
        
        System.out.println(cantidad);




    }
}
