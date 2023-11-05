package com.edsonrego.ejemplo;

import com.edsonrego.pooherencia.*;

public class EjemploHerenciaConstructores {
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
        System.out.println("Imprimiendo los datos em común del tipo Persona:");
        System.out.println("nombre: " + persona.getNombre()
                + "\napellido: " + persona.getApellido()
                + "\nedad:  " + persona.getEdad()
                + "\nemail:  " + persona.getEmail());
        if(persona instanceof Alumno){
            System.out.println("Imprimiendo los datos del tipo Alumno:");
            System.out.println("Institución: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota matemáticas: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota história: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota castellano: " + ((Alumno) persona).getNotaCastellano());

            if(persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo los datos del tipo Alumno Internacional:");
                System.out.println("País: " + ((AlumnoInternacional) persona).getPais());
                System.out.println("Nota idioma: " + ((AlumnoInternacional) persona).getNotaIdiomas());

            }
            System.out.println("================= sobre escritura calcularPromedio() ===============");
            System.out.println("Promedio: " + ((Alumno) persona).calcularPromedio());
            System.out.println("================= ================================== ===============");
        }
        if(persona instanceof Profesor){
            System.out.println("Imprimiendo los datos del tipo Profesor:");
            System.out.println("Asignatura " + ((Profesor) persona).getAsignatura());
        }
        System.out.println("================= sobre escritura saludar() ===============");
        System.out.println(persona.saludar());


        System.out.println("===========================================================");
        System.out.println();
    }
}
