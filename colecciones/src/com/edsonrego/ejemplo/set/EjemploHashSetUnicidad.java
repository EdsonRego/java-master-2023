package com.edsonrego.ejemplo.set;

import com.edsonrego.ejemplo.modelo.Alumno;

import java.util.*;


public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        Set<Alumno> sa = new HashSet<>();
        //List<Alumno> sa = new LinkedList<>();
        sa.add(new Alumno("Edson",10));
        sa.add(new Alumno("Pato",5));
        sa.add(new Alumno("Cata",6));
        sa.add(new Alumno("Luci",4));
        sa.add(new Alumno("Jano",7));
        sa.add(new Alumno("Andrés",3));
        sa.add(new Alumno("Zeus2",2));
        sa.add(new Alumno("Zeus",2));
        sa.add(new Alumno("Lucas",2));
        sa.add(new Alumno("Lucas",3));
        System.out.println("sa = " + sa);

        /*System.out.println("Utilizando un For Clásico para iterar Lista");
        for(int i = 0; i < sa.size(); i++){
                Alumno a = sa.get(i);
            System.out.println(a.getNombre());
        }*/

        System.out.println("Iterando usando foreach");
        for(Alumno a: sa){
            System.out.println("a = " + a.getNombre());
        }

        System.out.println("Iterando usando While y iterator");
        Iterator<Alumno> it = sa.iterator();
        while (it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando usando Stream forEach");
        sa.forEach(a -> System.out.println(a.getNombre()));
        // ou
        System.out.println();
        sa.forEach(System.out::println);
    }
}
