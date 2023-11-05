package com.edsonrego.archivos.ejemplos.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoService3 {

    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true))){

            buffer.append("Hola que tal amigos\n")
                    .append("Todo bien? Yo acá escribiendo un archivo...\n")
                    .append("Hasta Luego Edson\n");
            System.out.println("El archivo se há creado con éxito!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
