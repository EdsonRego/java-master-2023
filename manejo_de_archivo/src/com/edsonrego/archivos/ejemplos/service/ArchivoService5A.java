package com.edsonrego.archivos.ejemplos.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ArchivoService5A {

    public String leerArchivo(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try(BufferedReader reader = new BufferedReader(new FileReader(archivo))) {

            String linea;
            while ((linea = reader.readLine()) != null){
                sb.append(linea).append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
