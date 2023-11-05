package com.edsonrego.lambda.models;

import java.util.function.Function;

public class LambdaEliminarEspaciosVacios {
    public static void main(String[] args) {

        Function<String,String> function = parametro -> parametro.toUpperCase().replaceAll("\\s","");
        System.out.println(function.apply("Curso de Java"));
    }
}
