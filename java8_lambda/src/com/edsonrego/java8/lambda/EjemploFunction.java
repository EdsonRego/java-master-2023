package com.edsonrego.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {

        Function<String,String> function0 = parametro -> {
            return "Hola que tal! " + parametro;
        };
        String resultado0 = function0.apply("Edson");
        System.out.println(resultado0);

        Function<String,String> function1 = parametro -> "Hola que tal! " + parametro;
        String resultado1 = function1.apply("Edson");
        System.out.println(resultado1);

        Function<String,String> function3 = parametro -> parametro.toUpperCase();
        System.out.println(function3.apply("Edson"));

        Function<String,String> function4 = String::toUpperCase;
        System.out.println(function4.apply("Edson Rego"));

        BiFunction<String,String,String> function5 = (a,b)-> a.toUpperCase().concat(b.toUpperCase());
        String resuldado2 = function5.apply("edson","gomes");
        System.out.println(resuldado2);

        BiFunction<String,String,Integer> function6 = (a,b) -> a.compareTo(b);
        System.out.println(function6.apply("Edson","Edson"));

        BiFunction<String,String,Integer> function7 = String::compareTo;
        System.out.println(function7.apply("Edson","Edson"));

        BiFunction<String,String,String> function8 = String::concat;
        System.out.println(function8.apply("Edson","Edson"));


    }
}
