package com.edsonrego.threads.ejemploexecutor;

import com.edsonrego.threads.ejemplosync.Panaderia;
import com.edsonrego.threads.ejemplosync.runnable.Consumidor;
import com.edsonrego.threads.ejemplosync.runnable.Panadero;

import java.util.concurrent.*;

public class EjemploExecutorFuture5Consumidor {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        System.out.println("Tamaño del poll: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());

        Panaderia p = new Panaderia();//recurso monitor
        Runnable productor = new Panadero(p);
        Runnable consumidor = new Consumidor(p);
        Future<?> future1 = executor.submit(productor);
        Future<?> future2 = executor.submit(consumidor);

        System.out.println("Tamaño del poll: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());

        executor.shutdown();

        System.out.println("Continuando con la ejecución del main");

    }
}
