package com.edsonrego.threads.ejemploexecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable tarea = () -> {
            System.out.println("Inicio de la tarea....");
            try {
                System.out.println("Nombre del Thread: " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            System.out.println("Finaliza la tarea...");
        };
        Future<?> resultado = executor.submit(tarea);
        executor.shutdown();

        System.out.println("Continuando con la ejecución del main");

        //System.out.println("Resultado futuro 1 " + resultado.isDone());
        //System.out.println(resultado.get());
        while (!resultado.isDone()){
            System.out.println("ejecutando tarea...");
            TimeUnit.MILLISECONDS.sleep(1500);
        }
        System.out.println("Obtenemos resultado de la tarea: "+ resultado.get(5,TimeUnit.SECONDS));
        System.out.println("Finaliza la tarea: " + resultado.isDone());


    }
}
