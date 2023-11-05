package com.edsonrego.archivos.ejemplos;

import com.edsonrego.archivos.ejemplos.service.ArchivoService;
import com.edsonrego.archivos.ejemplos.service.ArchivoService2;
import com.edsonrego.archivos.ejemplos.service.ArchivoService3;
import com.edsonrego.archivos.ejemplos.service.ArchivoService4;

public class EjemploCrearArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "c:\\Cursos\\Java\\archivo\\javaTeste.txt";

        ArchivoService4 service = new ArchivoService4();
        service.crearArchivo(nombreArchivo);

    }
}
