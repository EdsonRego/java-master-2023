package com.edsonrego.ejemplo.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class EjemploTreeMap2 {
    public static void main(String[] args) {

//        Map<String,Object> persona = new TreeMap<>((a,b) -> b.compareTo(a));
//        Map<String,Object> persona = new TreeMap<>(Comparator.reverseOrder());
        Map<String,Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed());

        persona.put("nombre","John");
        persona.put("apellido","Doe");
        persona.put("apellidoPaterno","doe");
        persona.put("email","john.doe@gmail.com");
        persona.put("edad",30);

        Map<String,String> direccion = new TreeMap<>();
        direccion.put("pais","USA");
        direccion.put("estado","California");
        direccion.put("ciudad","Santa Bárbara");
        direccion.put("calle","One Street");
        direccion.put("numero","120");

        persona.put("direccion", direccion);

        System.out.println("persona = " + persona);


    }
}
