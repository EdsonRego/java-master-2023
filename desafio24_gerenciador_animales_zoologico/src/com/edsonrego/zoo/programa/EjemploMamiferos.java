package com.edsonrego.zoo.programa;

import com.edsonrego.zoo.entidades.*;

public class EjemploMamiferos {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[5];

        Mamifero tigre = new Tigre("Asia",105f,200f,200.0f,15f,80,"Sumatra");
        Mamifero leon = new Leon("Africa",110f,190f,10.0f,20f,90,5,5f);
        Mamifero guepardo = new Guepardo("América",90f,100f,10.0f,15f,10);
        Mamifero lobo = new Lobo("Europa",30f,5.0f,90f,"Lobo Selvagem","Negro",5f,2,"Alemão");
        Mamifero perro = new Perro("Austrália",25f,5.0f,45f,"Vira-lata","Blanco",3f,10);

        mamiferos[0] = tigre;
        mamiferos[1] = leon;
        mamiferos[2] = guepardo;
        mamiferos[3] = lobo;
        mamiferos[4] = perro;

        for (Mamifero animal : mamiferos) {

            System.out.println();
            System.out.println(" =============== " + animal.getClass().getSimpleName() + " =============== ");
            System.out.println("Habitat:" + animal.getHabitat());
            System.out.println("Altura:" + animal.getAltura());
            System.out.println("Largo:" + animal.getLargo());
            System.out.println("Peso:" + animal.getPeso());

            if (animal instanceof Canino) {
                System.out.println("Clomillos:" + ((Canino) animal).getTamanoColmillos());
                System.out.println("Color:" + ((Canino) animal).getColor());

                if (animal instanceof Lobo) {
                    System.out.println("Especie Lobo:" + ((Lobo) animal).getEspecieLobo());
                    System.out.println("Número Integrantes:" + ((Lobo) animal).getNumCamadas());
                }
                if (animal instanceof Perro) {
                    System.out.println("Fuerza mordida kg:" + ((Perro) animal).getFuerzaMordida());
                }
            }

            if (animal instanceof Felino) {
                System.out.println("Tamaño Garras:" + ((Felino) animal).getTamanoGarras());
                System.out.println("Velocidad:" + ((Felino) animal).getVelocidad());

                if (animal instanceof Leon) {
                    System.out.println("Potencia Rugido:" + ((Leon) animal).getPotenciaRugidoDecibel());
                    System.out.println("Número Integrantes:" + ((Leon) animal).getNumMamadas());
                }
                if (animal instanceof Tigre) {
                    System.out.println("especie Tigre:" + ((Tigre) animal).getEspecieTigre());
                }
            }

            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comunicarse());
        }
    }
}
