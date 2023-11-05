package com.edsonrego.models;

import java.util.Arrays;
import java.util.List;

public class CalcularImporte2 {
    public static void main(String[] args) {

        List<Producto> facturas = Arrays.asList(new Producto(9.99, 1),
                new Producto(19.99, 1.5),
                new Producto(4.99, 2));

        double sum = facturas.stream()
                .mapToDouble(x -> x.getCantidad() * x.getPrecio())
                .sum();

        System.out.println(sum);
    }
}
