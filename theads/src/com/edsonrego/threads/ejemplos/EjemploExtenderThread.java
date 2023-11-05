package com.edsonrego.threads.ejemplos;

import com.edsonrego.threads.ejemplos.threads.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new NombreThread("John Deere");
        hilo.start();
        //Thread.sleep(2);

        Thread hilo2 = new NombreThread("Maria Joaquina");
        hilo2.start();

        NombreThread hilo3 = new NombreThread("Pepe Guzman");
        hilo3.start();
        System.out.println(hilo.getState());

    }
}
