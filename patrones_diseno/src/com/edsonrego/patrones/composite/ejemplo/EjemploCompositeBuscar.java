package com.edsonrego.patrones.composite.ejemplo;

import com.edsonrego.patrones.composite.Archivo;
import com.edsonrego.patrones.composite.Directorio;

public class EjemploCompositeBuscar {
    public static void main(String[] args) {

        Directorio doc = new Directorio("Documentos");
        Directorio java = new Directorio("Java");

        java.addComponente(new Archivo("patron-composite.docx"));

        Directorio stream = new Directorio("App Stream");
        stream.addComponente(new Archivo("stream-map.docx"));

        java.addComponente(stream);

        doc.addComponente(java);
        doc.addComponente(new Archivo("cv.docx"));
        doc.addComponente(new Archivo("log.jpeg"));

        boolean encontrado = doc.buscar("patron-composite.docx");
        System.out.println("Encontrado \"patron-composite.docx\": " + encontrado);

        encontrado = doc.buscar("App Stream");
        System.out.println("Encontrado \"App Stream\": " + encontrado);

        encontrado = doc.buscar("App Strem");
        System.out.println("Encontrado \"App Stream\": " + encontrado);
//        System.out.println(doc.mostrar(0));

    }
}
