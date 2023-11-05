package com.edsonrego.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        String numerador = JOptionPane.showInputDialog("Ingrese un entero numerador: ");
        String denominador = JOptionPane.showInputDialog("Ingrese un entero denominador: ");

        try {
            double division2 = calc.dividir(numerador, denominador);
            System.out.println(division2);
        } catch (FormatoNumeroException fne){
            System.out.println("Se detecto una excepción! Ingrese un valor válido" + fne.getMessage());
            fne.printStackTrace(System.out);
            main(args);
        } catch (DivisionPorZeroException ae){
            System.out.println("Capturamos la excepción en tiempo de ejecución:" + ae.getMessage());
            main(args);
        }finally {
            System.out.println("Finally Es opcional, pero si ejecuta siempre con excepción o sin");
        }
        System.out.println("Continuamos con el flujo de nuestra aplicación");

    }
}
