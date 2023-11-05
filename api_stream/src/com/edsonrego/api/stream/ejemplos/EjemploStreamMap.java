package com.edsonrego.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {

        Stream<String> nombres1 = Stream
                .of("Pato1","Paco","Pepa","Pepe")
                .map(nombre ->{
                    return nombre.toUpperCase();
                });
        nombres1.forEach(e -> System.out.println(e));

        Stream.of("Pato2","Paco","Pepa","Pepe")
                .map(nombre ->{
                    return nombre.toUpperCase();
                }).forEach(e -> System.out.println(e));

        Stream<String> nombres3 = Stream
                .of("Pato3","Paco","Pepa","Pepe")
                .peek(e -> System.out.println(e))
                .map(nombre ->{
                    return nombre.toUpperCase();
                });
        nombres3.forEach(e -> System.out.println(e));

        Stream<String> nombres4 = Stream
                .of("Pato4","Paco","Pepa","Pepe")
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase);
        nombres4.forEach(System.out::println);

        Stream<String> nombres5 = Stream
                .of("Pato5","Paco","Pepa","Pepe")
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase);
        List<String> lista = nombres5.collect(Collectors.toList());
        lista.forEach(System.out::println);




    }
}
