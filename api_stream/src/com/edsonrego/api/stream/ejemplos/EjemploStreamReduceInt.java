package com.edsonrego.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduceInt {
    public static void main(String[] args) {

        Stream<Integer> nombre = Stream.of(5,10,15,20);

        //int resultado = nombre.reduce(0,(a,b)-> a + b);
        //int resultado = nombre.reduce(0,(a,b)-> Integer.sum(a,b));
        int resultado = nombre.reduce(0, Integer::sum);
        System.out.println(resultado);

    }
}
