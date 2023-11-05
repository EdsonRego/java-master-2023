package com.edsonrego.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamDistinct {
    public static void main(String[] args) {

        Stream.of("Pato Guzman",
                        "Paco Gonzalez",
                        "Pepa Gutierrez",
                        "Pepe Mena",
                        "Pepe Garcia",
                        "Paco Gonzalez",
                        "Paco Gonzalez",
                        "Paco Gonzalez")
                .distinct()
                .forEach(System.out::println);

    }
}
