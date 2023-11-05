package com.edsonrego.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args) {

        Stream<String> nombre = Stream.of("Pato Guzman",
                        "Paco Gonzalez",
                        "Pepa Gutierrez",
                        "Pepe Mena",
                        "Pepe Garcia",
                        "Paco Gonzalez",
                        "Paco Gonzalez",
                        "Paco Gonzalez")
                .distinct();

        String resultado = nombre.reduce("resultado concatenación ",(a,b)-> a + ", "+b);
        System.out.println(resultado);

    }
}
