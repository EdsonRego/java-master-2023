package com.edsonrego.ejemplo.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMapAninhado {
    public static void main(String[] args) {

        Map<String,Object> persona = new HashMap<>();
        System.out.println("contiene elementos = " + !persona.isEmpty());
        System.out.println();

        persona.put(null,"1234");
        persona.put("nombre","John");
        persona.put("apellido","Doe");
        persona.put("apellidoPaterno","doe");
        persona.put("email","john.doe@gmail.com");
        persona.put("edad",30);

        Map<String,String> direccion = new HashMap<>();
        direccion.put("pais","USA");
        direccion.put("estado","California");
        direccion.put("ciudad","Santa Bárbara");
        direccion.put("calle","One Street");
        direccion.put("numero","120");

        //Adicionando o valor de dirección a persona (aninhando maps)
        persona.put("direccion", direccion);

        System.out.println("persona = " + persona);

        String nombre = (String) persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = (String) persona.get("apellido");
        System.out.println("apellido = " + apellido);

        Map<String,String> direccionPersona = (Map<String, String>) persona.get("direccion");
        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad");
        String barrio = direccionPersona.getOrDefault("barrio","La playa");

        System.out.println("El pais de " + nombre + " és: " + pais);
        System.out.println("La ciudad de " + nombre + " és: " + ciudad);
        System.out.println("El barrio de " + nombre + " és: " + barrio);



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
        Collection<Object> valores = persona.values();
        for (Object v: valores){
            System.out.println("v = " + v);
        }

        System.out.println();
        System.out.println("============================= keySet");
        Set<String> llaves = persona.keySet();
        for (String k: llaves){
            System.out.println("k = " + k);
        }

        System.out.println();

        /*System.out.println("============================= entrySet");
        for (Map.Entry<String, Object> par: persona.entrySet()){
            Object valor = par.getValue();
            if(valor instanceof Map){
                String nom = (String) persona.get("nombre");
                Map<String, String> direccionMap = (Map<String, String>) valor;
                System.out.println("El pais de " + persona.get(nom) + ": " + direccionMap.get("pais"));
                System.out.println("El estado de " + persona.get(nom) + ": " + direccionMap.get("estado"));
                System.out.println("La ciudad de " + persona.get(nom) + ": " + direccionMap.get("ciudad"));
            }else {
                System.out.println(par.getKey() + " => " + valor);
            }
        }*/

        System.out.println("============================= entrySet");
        for (Map.Entry<String, Object> par: persona.entrySet()){
            Object valor = par.getValue();
            if(valor instanceof Map){
                String nom = (String) persona.get("nombre");
                Map<String, String> direccionMap = (Map<String, String>) valor;
                for(Map.Entry<String,String> parDir: direccionMap.entrySet()){
                    System.out.println(parDir.getKey() + " => " + parDir.getValue());
                }
            }else {
                System.out.println(par.getKey() + " => " + valor);
            }
        }

        System.out.println();
        System.out.println("============================= keySet");
        for(String llave: persona.keySet()){
            Object valor = persona.get(llave);
            if(valor instanceof Map){
                String nom = (String) persona.get("nombre");
                Map<String, String> direccionMap = (Map<String, String>) valor;
                System.out.println("El pais de " + persona.get(nom) + ": " + direccionMap.get("pais"));
                System.out.println("El estado de " + persona.get(nom) + ": " + direccionMap.get("estado"));
                System.out.println("La ciudad de " + persona.get(nom) + ": " + direccionMap.get("ciudad"));
            }else {
                System.out.println(llave + " => " + valor);
            }

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
