package com.edsonrego.models;

import java.util.Arrays;
import java.util.stream.Stream;

public class Desafio31ModificarFlujo {
    public static void main(String[] args) {

        int[] num = new int[100];
        for(int i = 0; i < num.length; i++){
            num[i] = i + 1;
        }

        double total = Arrays.stream(num)
                .filter(numero -> numero % 10 != 0)
                .mapToDouble(numero -> (double) numero / 2)
                .reduce(0, (acum, numero) -> acum + numero);

        System.out.println(total); // 2250.0
    }
}
