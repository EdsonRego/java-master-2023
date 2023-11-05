package com.edsonrego.ejemplo.list;

import com.edsonrego.ejemplo.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class EjemploLinkedList {
    public static void main(String[] args) {

        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + " ,size = " + enlazada.size());
        System.out.println("está vacia = " + enlazada.isEmpty());

        enlazada.add(new Alumno("Pato",5));
        enlazada.add(new Alumno("Cata",6));
        enlazada.add(new Alumno("Luci",4));
        enlazada.add(new Alumno("Jano",7));
        enlazada.add(new Alumno("Andres",3));
        System.out.println(enlazada + " ,size " + enlazada.size());

        enlazada.addFirst(new Alumno("Zeus",5));
        enlazada.addLast(new Alumno("Atenea",6));
        System.out.println(enlazada + " ,size " + enlazada.size());

        System.out.println("Primero: " + enlazada.getFirst());
        System.out.println("Ultimp: " + enlazada.getLast());

        System.out.println("Primero - não lança exceção se não existir -: " + enlazada.peekFirst());
        System.out.println("Ultimp: - não lança exceção se não existir -" + enlazada.peekLast());

        System.out.println("Indice: " + enlazada.get(2));

        Alumno zeus = enlazada.removeFirst();
        enlazada.removeLast();
        System.out.println(enlazada + " ,size " + enlazada.size());
        System.out.println("Exibe o elemento removido zeus = " + zeus);

        // elimina sem lançar exceção se não existir
//        enlazada.pop();
//        enlazada.pollFirst();
//        enlazada.pollLast();

        enlazada.remove(new Alumno("Jano",7));
        System.out.println(enlazada + " ,size " + enlazada.size());

        Alumno a = new Alumno("Lucas", 5);
        enlazada.addLast(a);
        System.out.println("Indice de lucas: " + enlazada.indexOf(a));

        enlazada.remove(2);
        System.out.println(enlazada + " ,size " + enlazada.size());
        System.out.println("Indice de lucas: " + enlazada.indexOf(a));

        enlazada.set(3,new Alumno("Lalo",7));
        System.out.println(enlazada + " ,size " + enlazada.size());

        ListIterator<Alumno> li = enlazada.listIterator();

        System.out.println("==========");
        while (li.hasNext()){
            Alumno alumno = li.next();
            System.out.println(alumno);
        }
        System.out.println("==========");
        while (li.hasPrevious()){
            Alumno alumno = li.previous();
            System.out.println(alumno);
        }
    }
}
