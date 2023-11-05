package com.edsonrego.ejemplo;

import com.edsonrego.estructura.Empleado;
import com.edsonrego.estructura.Gerente;

public class CompaniaEjemplo {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Edson", "Rego", "97260", "Avenida Pasteur", 1000.0, 100, 1000);

        System.out.println("Nombre: " + gerente.getNombre());
        System.out.println("Apellido: " + gerente.getApellido());
        System.out.println("Numero fiscal: " + gerente.getNumeroFiscal());
        System.out.println("Dirección: " + gerente.getDireccion());
        System.out.println("Remuneración: " + gerente.getRemuneracion());
        System.out.println("Empleado old: " + gerente.getEmpleadoOld());
        System.out.println("Presupuesto: " + gerente.getPresupuesto());

        System.out.println();

        System.out.println(gerente.toString());


        System.out.println();
        System.out.println("Nuevo soldo "+  (gerente.aumentarRemuneracion(10)));

    }
}
