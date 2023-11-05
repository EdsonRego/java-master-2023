package com.edsonrego.optional.ejemplo;

import com.edsonrego.optional.ejemplo.Repositorio.ComputadorRepositorio;
import com.edsonrego.optional.ejemplo.Repositorio.Repositorio;
import com.edsonrego.optional.ejemplo.models.Computador;

public class EjemploRepositorioMetodosOrElse {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

//        Computador pcDefault = new Computador("HP","LA 0001");
//        Computador pc = repositorio.filtrar("rog2").orElse(pcDefault);
//        System.out.println("pc = " + pc);

//        pc = repositorio.filtrar("MacBook").orElseGet(()->{
//            return pcDefault;
//        });

        Computador pc = repositorio.filtrar("rog").orElse(valorDefault());
        System.out.println("pc = " + pc);

//        pc = repositorio.filtrar("MacBook Pro2").orElseGet(()->new Computador("HP","LA 0001"));
//        System.out.println("pc = " + pc);
//
//        pc = repositorio.filtrar("MacBook Pro2").orElseGet(()->valorDefault());
//        System.out.println("pc = " + pc);

        pc = repositorio.filtrar("MacBook Pro").orElseGet(EjemploRepositorioMetodosOrElse::valorDefault);
        System.out.println("pc = " + pc);

    }

    public static Computador valorDefault(){
        System.out.println("Obteniendo el valor por defecto!!");
        return new Computador("HP","LA 0001");
    }
}
