package com.edsonrego.archivos.ejemplos.service;

import java.io.*;

public class ArchivoService4 {

    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo, true))){

            buffer.println("Hola que tal amigos");
            buffer.println("Todo bien? Yo acá escribiendo un archivo...");
            buffer.printf("Hasta Luego %s!","Lucas");
            System.out.println("El archivo se há creado con éxito!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
