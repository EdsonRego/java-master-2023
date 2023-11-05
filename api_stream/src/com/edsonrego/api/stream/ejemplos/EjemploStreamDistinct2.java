package com.edsonrego.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamDistinct2 {
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

        nombre.forEach(System.out::println);

    }
}
