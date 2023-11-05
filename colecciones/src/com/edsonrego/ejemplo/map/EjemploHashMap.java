package com.edsonrego.ejemplo.map;

import java.util.*;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<String,String> persona = new HashMap<>();
        System.out.println("contiene elementos = " + !persona.isEmpty());
        System.out.println();

        persona.put(null,"1234");
        persona.put("nombre","John");
        persona.put("apellido","Doe");
        persona.put("apellidoPaterno","doe");
        persona.put("email","john.doe@gmail.com");
        persona.put("edad","30");

        System.out.println("persona = " + persona);

        String nombre = persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = persona.get("apellido");
        System.out.println("apellido = " + apellido);

        /*String valorApellido = persona.remove("apellidoPaterno");
        System.out.println("eliminado = " + valorApellido);
        System.out.println("persona = " + persona);*/

        boolean b = persona.remove("apellido","doe");
        System.out.println("eliminado = " + b);
        System.out.println("persona = " + persona);

        boolean b2 = persona.containsKey("apellido");
        System.out.println("b2 = " + b2);

        b2 = persona.containsValue("john.doe@gmail.com");
        System.out.println("b2 = " + b2);

        System.out.println();
        System.out.println("============================= values");
        Collection<String> valores = persona.values();
        for (String v: valores){
            System.out.println("v = " + v);
        }

        System.out.println();
        System.out.println("============================= keySet");
        Set<String> llaves = persona.keySet();
        for (String k: llaves){
            System.out.println("k = " + k);
        }

        System.out.println();
        System.out.println("============================= entrySet");
        for (Map.Entry<String,String> par: persona.entrySet()){
            System.out.println(par.getKey() + " => " + par.getValue());
        }

        System.out.println();
        System.out.println("============================= keySet");
        for(String llave: persona.keySet()){
                String valor = persona.get(llave);
            System.out.println(llave + " => " + valor);
        }

        System.out.println();
        System.out.println("============================= java 8 forEach");
        persona.forEach((llave,valor) -> {
            System.out.println(llave + " => " + valor);
        });

        System.out.println("total = " + persona.size());
        System.out.println("contiene elementos = " + !persona.isEmpty());
        persona.replace("nombre","Andrés");
        System.out.println("persona = " + persona);


    }
}
