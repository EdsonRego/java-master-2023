package com.edsonrego.archivos.ejemplos;

import com.edsonrego.archivos.ejemplos.service.ArchivoService5;
import com.edsonrego.archivos.ejemplos.service.ArchivoService6;

public class EjemploLeerArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "c:\\Cursos\\Java\\archivo\\javaTeste.txt";
//        ArchivoService5 service = new ArchivoService5();
//        System.out.println(service.leerArchivo(nombreArchivo));

        ArchivoService6 service2 = new ArchivoService6();
        System.out.println(service2.leerArchivo(nombreArchivo));
    }
}
