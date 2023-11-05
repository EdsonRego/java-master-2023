package com.edsonrego.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {

        Stream<String> nombres1 = Stream.of("Pato1","Paco","Pepa","Pepe");
        nombres1.forEach(e -> System.out.println(e));

        Stream<String> nombres2 = Stream.of("Pato2","Paco","Pepa","Pepe");
        nombres2.forEach(System.out::println);

        String[] arreglo = {"Pato3","Paco","Pepa","Pepe"};
        Stream<String> nombres3 = Arrays.stream(arreglo);
        nombres3.forEach(System.out::println);

        Stream<String> nombres4 = Stream.<String>builder()
                .add("Pato4")
                .add("Paco")
                .add("Pepa")
                .add("Pepe")
                .build();
        nombres4.forEach(System.out::println);

        List<String> lista = new ArrayList<>();
        lista.add("Pato5");
        lista.add("Paco");
        lista.add("Pepa");
        lista.add("Pepe");

//        Stream<String> nombres5 = lista.stream();
//        nombres5.forEach(System.out::println);

        lista.stream().forEach(System.out::println);


    }
}
