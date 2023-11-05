package com.edsonrego.api.stream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamRange {
    public static void main(String[] args) {

        IntStream numeros = IntStream.range(5,20)
                .peek(System.out::println);

        //int resultado = numeros.reduce(0, Integer::sum);
        //int resultado = numeros.sum();
        IntSummaryStatistics statics = numeros.summaryStatistics();
        System.out.println("max: " + statics.getMax());
        System.out.println("min: " + statics.getMin());
        System.out.println("sum: " + statics.getSum());
        System.out.println("total: " + statics.getCount());

    }
}
