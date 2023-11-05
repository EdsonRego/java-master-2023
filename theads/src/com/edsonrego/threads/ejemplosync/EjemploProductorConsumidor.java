package com.edsonrego.threads.ejemplosync;

import com.edsonrego.threads.ejemplosync.runnable.Consumidor;
import com.edsonrego.threads.ejemplosync.runnable.Panadero;

public class EjemploProductorConsumidor {
    public static void main(String[] args) {

        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();
    }
}
