package com.edsonrego.java8.lambda;

import com.edsonrego.java8.lambda.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {

        Predicate<Integer> teste1 = numero -> numero > 10;
        boolean resultado = teste1.test(7);
        System.out.println("resultado = " + resultado);

        Predicate<String> teste2 = role -> role.equals("ROLE_ADMIN");
        System.out.println(teste2.test("ROLE_USER"));

        BiPredicate<String,String> teste3 = (a,b) -> a.equals(b);
        System.out.println(teste3.test("Edson","Eva"));

        BiPredicate<String,String> teste4 = String::equals;
        System.out.println(teste4.test("Edson","Eva"));

        BiPredicate<Integer,Integer> teste5 =(i,j) -> j > i;
        boolean resultado2 = teste5.test(10,6);
        System.out.println("resultado2 = " + resultado2);

        Usuario a = new Usuario();
        Usuario b = new Usuario();
        a.setNombre("Eva");
        b.setNombre("Eva");
        BiPredicate<Usuario,Usuario> usuario = (usuarioA, usuarioB) -> usuarioA.getNombre().equals(usuarioB.getNombre());
        System.out.println(usuario.test(a,b));

    }
}
