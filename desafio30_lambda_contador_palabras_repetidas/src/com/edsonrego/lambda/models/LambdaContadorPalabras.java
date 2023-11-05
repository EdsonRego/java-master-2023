package com.edsonrego.lambda.models;

import java.util.function.Function;

public class LambdaContadorPalabras {
    public static void main(String[] args) {

        Function<String,String> contPalabras = parametro -> {
            String[] palabra = parametro.split("\\s+");
            return String.valueOf(palabra.length);
        };

        String resultado = contPalabras.apply("Curso Avanzado de Java Udemy");
        System.out.println("resultado = " + resultado);
    }
}
