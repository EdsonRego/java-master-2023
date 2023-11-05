package com.edsonrego.app.hogar;

import com.edsonrego.app.jardim.Perro;
import static com.edsonrego.app.hogar.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Perro perro = new Perro();
        String saludo = Persona.saludar();
        System.out.println("saludo = " + saludo);
    }
}
