package com.edsonrego.anotaciones.ejemplo;

import com.edsonrego.anotaciones.ejemplo.models.Producto;
import com.edsonrego.anotaciones.ejemplo.procesador.JsonSerializador;

import java.time.LocalDate;

public class EjemploAnotacion {
    public static void main(String[] args) {

        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre("mesa de Centro ROBLE");
        p.setPrecio(1000L);

        System.out.println("json = " + JsonSerializador.convirtirJson(p));

    }
}
