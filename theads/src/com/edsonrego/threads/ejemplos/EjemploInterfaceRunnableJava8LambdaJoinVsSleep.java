package com.edsonrego.threads.ejemplos;

public class EjemploInterfaceRunnableJava8LambdaJoinVsSleep {
    public static void main(String[] args) throws InterruptedException {

        Thread main =Thread.currentThread();

        Runnable viaje = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " - " + Thread.currentThread().getName());
                try {
                    Thread.sleep((long) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Finalmente me voy de viaje a " + Thread.currentThread().getName());
            System.out.println(main.getState());
        };

        //Usando Sleep -> método estático
        /*new Thread(viaje, "Isla de Pascua").start();
        new Thread(viaje, "Robinson Crusoe").start();
        new Thread(viaje, "Juan Fernandez").start();
        new Thread(viaje, "Isla de Chiloe").start();*/

        //Thread.sleep(10000);
        //System.out.println("Continuando com la ejecución del método main");

        //Usando join -> método que se ejecuta en la Estancia
        Thread v1 = new Thread(viaje, "Isla de Pascua");
        Thread v2 = new Thread(viaje, "Robinson Crusoe");
        Thread v3 = new Thread(viaje, "Juan Fernandez");
        Thread v4 = new Thread(viaje, "Isla de Chiloe");

        v1.start();
        v2.start();
        v3.start();
        v4.start();
        v1.join();
        v2.join();
        v3.join();
        v4.join();

        System.out.println("Continuando com la ejecución del método main" + main.getName());


    }
}
