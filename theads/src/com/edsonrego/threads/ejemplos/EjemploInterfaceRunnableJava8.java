package com.edsonrego.threads.ejemplos;

import com.edsonrego.threads.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnableJava8 {
    public static void main(String[] args) {

        Runnable viaje = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10 ; i++){
                    System.out.println(i + " - "+Thread.currentThread().getName());
                    try {
                        Thread.sleep((long) (Math.random() * 1000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Finalmente me voy de viaje a " + Thread.currentThread().getName());
            }
        };


        new Thread(viaje,"Isla de Pascua").start();
        new Thread(viaje,"Robinson Crusoe").start();
        new Thread(viaje,"Juan Fernandez").start();
        new Thread(viaje,"Isla de Chiloe").start();


    }
}
