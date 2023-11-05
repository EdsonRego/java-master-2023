package com.edsonrego.threads.ejemploexecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> tarea = () -> {
            System.out.println("Iniciando tarea 1...");
            try {
                System.out.println("Nombre del Thread: " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            System.out.println("Finaliza la tarea...");
            return "Algún resultado importante de la tarea";
        };

        Callable<Integer>  tarea2 = () ->{
            System.out.println("Iniciando tarea 2...");
            TimeUnit.SECONDS.sleep(3);
            return 10;
        };

        Future<String> resultado = executor.submit(tarea);
        Future<String> resultado2 = executor.submit(tarea);
        Future<Integer> resultado3 = executor.submit(tarea2);


        executor.shutdown();

        System.out.println("Continuando con la ejecución del main");

       while (!(resultado.isDone() && resultado2.isDone() && resultado3.isDone())){
            System.out.println(String.format("resultado1: %s - resultado2: %s - resultado3: %s",
                    resultado.isDone()? "finalizó": "en processo",
                    resultado2.isDone()? "finalizó": "en processo",
                    resultado3.isDone()? "finalizó": "en processo"));
            TimeUnit.MILLISECONDS.sleep(1000);
        }
        System.out.println("Obtenemos resultado de la tarea: "+ resultado.get());
        System.out.println("Finaliza la tarea: " + resultado.isDone());
    }
}
