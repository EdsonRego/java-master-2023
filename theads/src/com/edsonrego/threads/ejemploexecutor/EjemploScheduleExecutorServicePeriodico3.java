package com.edsonrego.threads.ejemploexecutor;

import java.util.concurrent.*;

public class EjemploScheduleExecutorServicePeriodico3 {
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        System.out.println("Alguna tarea en el main ...");

        CountDownLatch lock = new CountDownLatch(5);
        Future<?> future = executor.scheduleAtFixedRate(() -> {
            System.out.println("Hola mundo tarea ....");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                lock.countDown();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        },1000, 2000, TimeUnit.MILLISECONDS);

        lock.await();
        future.cancel(true);
        System.out.println("Alguna tarea en el main ...");
        executor.shutdown();
    }
}
