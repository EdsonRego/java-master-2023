package com.edsonrego.archivos.ejemplos.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ArchivoService6 {

    public String leerArchivo(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try {
            Scanner sc = new Scanner(archivo);
            sc.useDelimiter("\n");
            while (sc.hasNext()){
                sb.append(sc.next()).append("\n");
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
