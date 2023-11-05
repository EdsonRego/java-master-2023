package com.edsonrego.ejemplo;

import com.edsonrego.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("===============Creando la instancia de la Clase Alumno================");
        Alumno alumno = new Alumno();
        alumno.setNombre("Edson");
        alumno.setApellido("Rego");
        alumno.setInstitucion("Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(5.3);
        alumno.setNotaMatematica(4.9);

        System.out.println("===============Creando la instancia de la Clase AlumnoInternacional========");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);

        System.out.println("===============Creando la instancia de la Clase Profesor============");
        Profesor profesor = new Profesor();
        profesor.setNombre("Mauro");
        profesor.setApellido("Alckim");
        profesor.setAsignatura("Matemática");

        System.out.println(alumno.getNombre()
                + " " + alumno.getApellido()
                + " " + alumno.getInstitucion());

        System.out.println("===============================");
        System.out.println(alumnoInt.getNombre()
                + " " + alumnoInt.getApellido()
                + " " + alumnoInt.getApellido()
                + " " + alumnoInt.getInstitucion()
                + " " + alumnoInt.getPais());

        System.out.println("Professon: " + profesor.getAsignatura()
                + ": " + profesor.getNombre()
                + " " + profesor.getApellido());

        Class clase = alumnoInt.getClass();
        while (clase.getSuperclass() != null){
                String hija = clase.getName();
                String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una Clase Hija de la Clase Padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}
