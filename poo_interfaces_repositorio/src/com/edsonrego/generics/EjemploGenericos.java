package com.edsonrego.generics;

import com.edsonrego.poointerfaces.modelo.Cliente;
import com.edsonrego.poointerfaces.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Benvindo","Gomes"));

        Cliente benvindo = clientes.get(0);

        Cliente[] clientesArreglo = {new Cliente("Izabel", "Maria"),
            new Cliente("Leonado","Alves")};

        Integer[] enterosArreglo = {1, 2, 3, 4};

        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Edson","Eva","Camilly","Leonardo","Vastir"},enterosArreglo);
        nombres.forEach(System.out::println);

        List<ClientePremium> clientePremiumList = fromArrayToList(
                new ClientePremium[]{new ClientePremium("Josue", "Rego")});

        imprimirClientes(clientes);
        imprimirClientes(clientesLista);
        imprimirClientes(clientePremiumList);

        System.out.println("Máximo de 1, 9 y 4 es:" + maximo(1,9,4));
        System.out.println("Máximo de 3.9, 11.6 y 7.78 es:" + maximo(3.9,11.6,7.78));
        System.out.println("Máximo de zanahoria, arándonos y manzana es: " + maximo("zanahoria","arándonos","manzanas"));
    }

    public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T extends Number> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T,G> List<T> fromArrayToList(T[] c, G[] x){
        for (G elemento: x){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public static void imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T maximo(T a, T b, T c){
        T max = a;
        if(b.compareTo(max) > 0){
            max = b;
        }
        if (c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }
}
