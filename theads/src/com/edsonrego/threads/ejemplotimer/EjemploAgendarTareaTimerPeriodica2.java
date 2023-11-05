package com.edsonrego.threads.ejemplotimer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploAgendarTareaTimerPeriodica2 {
    public static void main(String[] args) {

        AtomicInteger contadorAtomic = new AtomicInteger(3);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                int aux = contadorAtomic.getAndDecrement();
                if (aux > 0) {
                    System.out.println("Tarea " + aux +
                            " periódica en " + new Date() + "nombre del Thread: "
                            + Thread.currentThread().getName());
                }else {
                    System.out.println("Finaliza al tiempo");
                    timer.cancel();
                }
            }
        },5000, 1000);

        System.out.println("Agendamos una tarea para 5 segundos más ...");

    }
}
