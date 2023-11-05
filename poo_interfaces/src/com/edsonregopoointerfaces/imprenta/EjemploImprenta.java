package com.edsonregopoointerfaces.imprenta;
import static com.edsonregopoointerfaces.imprenta.modelo.Genero.*;
import static com.edsonregopoointerfaces.imprenta.modelo.Imprimible.*;


import com.edsonregopoointerfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo(new Persona("Edson"," Rego"),
                "Engenheiro",
                "Resumen laboral...");
        cv.addExperiencias("Java")
        .addExperiencias("Oracle DBA")
        .addExperiencias("Spring Framework")
        .addExperiencias("Desarrollador FullStack")
        .addExperiencias("Angular");

        Libro libro = new Libro(new Persona("Erich","Gamma"),
                "Patrones de diseño: Elementos Reusables POO ",
                PROGRAMACIO);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));

        Informe informe = new Informe(new Persona("Rego", "Edson"),
                new Persona("Andréz"," Gusman"),
                "Estudio sobre microservicios");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        System.out.println(TEXTO_DEFECTO);

        // clase anonima, implementación 1
        imprimir(new Imprimible() {
        });

        // clase anonima, implementación 2
        Imprimible imprObj = new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto genérico de una clase anónima";
            }
        };
        imprimir(imprObj);

        // clase anonima, implementación 3
        imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto genérico de una clase anónima, de otra manera";
            }
        });
    }
}
