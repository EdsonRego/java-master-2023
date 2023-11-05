package com.edsonrego.threads.ejemploexecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class EjemploScheduleExecutorServicePeriodico {
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        System.out.println("Alguna tarea en el main ...");

        executor.scheduleAtFixedRate(() -> {
            System.out.println("Hola mundo tarea ....");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        },1000, 2000, TimeUnit.MILLISECONDS);

        TimeUnit.SECONDS.sleep(10);
        System.out.println("Alguna tarea en el main ...");
        executor.shutdown();
    }
}
