package com.edsonrego.datetime.ejemplos;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDateTime {
    public static void main(String[] args) {

        LocalDateTime fechaTiempo = LocalDateTime.now();
        System.out.println("fechaTiempo = " + fechaTiempo);

        fechaTiempo = LocalDateTime.of(2020, Month.DECEMBER, 24, 20,45,59);
        System.out.println("fechaTiempo = " + fechaTiempo);

        fechaTiempo = LocalDateTime.parse("2020-12-24T20:45:59");
        System.out.println("fechaTiempo = " + fechaTiempo);

        LocalDateTime fechaTiempo2 = fechaTiempo.plusDays(1).plusHours(3);
        System.out.println("fechaTiempo = " + fechaTiempo);
        System.out.println("fechaTiempo2 = " + fechaTiempo2);
        System.out.println("fechaTiempo3 = " + fechaTiempo2.minusHours(5));

        Month mes = fechaTiempo.getMonth();
        System.out.println("mes = " + mes);

        int dia = fechaTiempo.getDayOfMonth();
        System.out.println("dia = " + dia);

        int ano = fechaTiempo.getYear();
        System.out.println("ano = " + ano);

        String formato1 = fechaTiempo.format(DateTimeFormatter.ISO_DATE);
        System.out.println("formato1 = " + formato1);

        String formato2 = fechaTiempo.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("formato2 = " + formato2);

        String formato3 = fechaTiempo.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        System.out.println("formato3 = " + formato3);

        String formato4 = fechaTiempo.format(DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a"));
        System.out.println("formato4 = " + formato4);
        
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a");
        String formato5 = fechaTiempo.format(dft);
        System.out.println("formato5 = " + formato5);

        String formato6 = dft.format(fechaTiempo);
        System.out.println("formato6 = " + formato6);

    }
}
