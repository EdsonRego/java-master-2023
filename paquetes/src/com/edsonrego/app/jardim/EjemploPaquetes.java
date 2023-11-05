package com.edsonrego.app.jardim;

import com.edsonrego.app.hogar.ColorPelo;
import com.edsonrego.app.hogar.Persona;
import static com.edsonrego.app.hogar.Persona.saludar;
import static com.edsonrego.app.hogar.Persona.GENERO_FEMININO;
import static com.edsonrego.app.hogar.Persona.GENERO_MASCULINO;

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Edson");
        persona.setApellido("Rego");
        System.out.println("p.nombre = " + persona.getNombre());
        persona.setColorPelo(ColorPelo.CAFE);
        System.out.println("persona.getColorPelo() = " + persona.getColorPelo());

        Perro perro = new Perro();
        perro.nombre = "tobby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(persona);
        System.out.println("jugando = " + jugando);
        String saludo = saludar();
        System.out.println("saludo = " + saludo);

        String generoMujer = GENERO_FEMININO;
        System.out.println("generoMujer = " + generoMujer);
        String generoHombre = GENERO_MASCULINO;
        System.out.println("generoMujer = " + generoHombre);

    }
}
