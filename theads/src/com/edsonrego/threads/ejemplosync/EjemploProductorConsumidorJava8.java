package com.edsonrego.threads.ejemplosync;

import com.edsonrego.threads.ejemplosync.runnable.Consumidor;
import com.edsonrego.threads.ejemplosync.runnable.Panadero;

import java.util.concurrent.ThreadLocalRandom;

public class EjemploProductorConsumidorJava8 {
    public static void main(String[] args) {

        Panaderia p = new Panaderia();
        new Thread(() -> {
            for (int i = 0; i < 10; i++){
                p.hornear("Pan No. " + i);
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500,2000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }).start();
        new Thread(() -> {
            for(int i = 0; i < 10; i++){
                p.consumir();
            }
        }).start();
    }
}