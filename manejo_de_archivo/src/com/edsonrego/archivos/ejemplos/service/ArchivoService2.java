package com.edsonrego.archivos.ejemplos.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoService2 {

    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try {
            FileWriter escritor = new FileWriter(archivo, true);
            BufferedWriter buffer = new BufferedWriter(escritor);
            buffer.append("Hola que tal amigos\n")
                    .append("Todo bien? Yo acá escribiendo un archivo...\n")
                    .append("Hasta Luego Edson\n");

            buffer.close();
            System.out.println("El archivo se há creado con éxito!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
