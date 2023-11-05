package com.edsonrego.java8.lambda;

import com.edsonrego.java8.lambda.aritmetica.Aritmetica;
import com.edsonrego.java8.lambda.aritmetica.Calculadora;

public class EjemploInterfaceFunctional {
    public static void main(String[] args) {

//        Aritmetica soma = (a,b) -> a + b;
        Aritmetica soma = Double::sum;
        Aritmetica resta = (a,b) -> a - b;

        Calculadora calc = new Calculadora();

        System.out.println(calc.computar(10,5, soma));
        System.out.println(calc.computar(10,5, resta));
        System.out.println(calc.computar(10,5,(a,b) -> a * b));
        System.out.println(calc.computar(10,5,(a,b) -> a / b));

//        System.out.println(calc.computarConBiFunction(10,5,(a,b) -> a + b));
        System.out.println(calc.computarConBiFunction(10,5, Double::sum));


    }
}
