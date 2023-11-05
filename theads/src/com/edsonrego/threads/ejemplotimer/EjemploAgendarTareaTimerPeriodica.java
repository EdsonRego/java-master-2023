package com.edsonrego.threads.ejemplotimer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class EjemploAgendarTareaTimerPeriodica {
    public static void main(String[] args) {

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            private int contador = 3;

            @Override
            public void run() {
                if (contador > 0) {
                    System.out.println("Tarea " + contador +
                            " periódica en " + new Date() + "nombre del Thread: "
                            + Thread.currentThread().getName());
                    contador--;
                }else {
                    System.out.println("Finaliza al tiempo");
                    timer.cancel();
                }
            }
        },5000, 1000);

        System.out.println("Agendamos una tarea para 5 segundos más ...");

    }
}
