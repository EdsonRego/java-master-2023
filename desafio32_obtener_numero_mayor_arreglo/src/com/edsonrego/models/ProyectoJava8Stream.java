package com.edsonrego.models;

import java.util.Arrays;
import java.util.function.Function;

public class ProyectoJava8Stream {
    public static void main(String[] args) {
        // la función lambda que obtiene el numero mayor del arreglo usando
        // api stream en su implementación
        Function<Integer[], Integer> max = array -> Arrays.stream(array)
                .reduce(0, (aux, elemento) -> aux > elemento ? aux : elemento);

        int resultado = max.apply(new Integer[]{1, 78, -1700, 2500, 0, 2000, 54, 2});
        System.out.println(resultado);
    }
}