package com.edsonrego.ejemplo;

import com.edsonrego.pooherencia.Alumno;
import com.edsonrego.pooherencia.AlumnoInternacional;
import com.edsonrego.pooherencia.Persona;
import com.edsonrego.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {

        System.out.println("===============Creando la instancia de la Clase Alumno================");
        Alumno alumno = new Alumno("Edson","Rego",51,"Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(5.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("edsonxrego@gmail.com");

        System.out.println("===============Creando la instancia de la Clase AlumnoInternacional========");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter","Gosling","Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("peterxgosling@gmail.com");

        System.out.println("===============Creando la instancia de la Clase Profesor============");
        Profesor profesor = new Profesor("Mauro","Alckim","Matemática");
        profesor.setEdad(70);
        profesor.setEmail("mauroxalckimin@gmail.com");

        System.out.println("===============================");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);
}

    public static void imprimir(Persona persona){
        System.out.println("===============================");
        System.out.println(persona);
    }
}
