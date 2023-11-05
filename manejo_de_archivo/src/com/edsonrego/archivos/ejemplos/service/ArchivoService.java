package com.edsonrego.archivos.ejemplos.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoService {

    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try {
            FileWriter escritor = new FileWriter(archivo, true);
            escritor.append("Hola que tal amigos\n")
                    .append("Todo bien? Yo acá escribiendo un archivo...\n")
                    .append("Hasta Luego Edson\n");

            escritor.close();
            System.out.println("El archivo se há creado con éxito!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
