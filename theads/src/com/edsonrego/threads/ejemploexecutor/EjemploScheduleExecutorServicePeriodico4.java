package com.edsonrego.threads.ejemploexecutor;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploScheduleExecutorServicePeriodico4 {
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        System.out.println("Alguna tarea en el main ...");

        AtomicInteger contador = new AtomicInteger(5);

        Future<?> future = executor.scheduleAtFixedRate(() -> {
            System.out.println("Hola mundo tarea ....");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                contador.getAndDecrement();
                } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },1000, 2000, TimeUnit.MILLISECONDS);

       while (contador.get() >=0){
            if(contador.get() == 0){
                future.cancel(true);
                contador.getAndDecrement();
            }
       }
        System.out.println("Alguna tarea en el main ...");
        executor.shutdown();
    }
}
