package com.edsonrego.datetime.ejemplos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjemploLocalDate {
    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now();
        System.out.println("fechaActual = " + fechaActual);
        System.out.println("dia: " + fechaActual.getDayOfMonth());
        Month mes = fechaActual.getMonth();
        System.out.println("mês: " + mes);
        System.out.println("Número del mês: " + mes.getValue());
        System.out.println("Mes español: " + mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));

        DayOfWeek diaSemana = fechaActual.getDayOfWeek();
        System.out.println("Número del dia: " + diaSemana.getValue());
        System.out.println("Número del dia: " + diaSemana.getDisplayName(TextStyle.FULL,new Locale("es","ES")));

        System.out.println("año: " + fechaActual.getYear());
        System.out.println("era: " + fechaActual.getEra());
        System.out.println("dia del año: " + fechaActual.getDayOfYear());

        fechaActual = LocalDate.of(2020,1,25);
        System.out.println("fechaActual = " + fechaActual);

        fechaActual = LocalDate.of(2020, Month.NOVEMBER,11);
        System.out.println("fechaActual = " + fechaActual);

        fechaActual = LocalDate.parse("2020-02-01");
        System.out.println("fechaActual = " + fechaActual);

        LocalDate diaDeManana = LocalDate.now().plusDays(1);
        System.out.println("diaDeManana = " + diaDeManana);

        LocalDate mesAnteior = LocalDate.now().minusMonths(1);
        System.out.println("mesAnteior = " + mesAnteior);

        LocalDate mesAnteior2 = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("mesAnteior2 = " + mesAnteior2);

        DayOfWeek miercules = LocalDate.parse("2020-11-11").getDayOfWeek();
        System.out.println("miercules = " + miercules);

        int once = LocalDate.of(2020,10,11).getDayOfMonth();
        System.out.println("once = " + once);

        boolean esBisiesto = LocalDate.now().isLeapYear();
        System.out.println("esBicesto = " + esBisiesto);

        boolean esAntes = LocalDate.of(2023,10,5).isBefore(LocalDate.parse("2020-10-10"));
        System.out.println("esAntes = " + esAntes);

        boolean esDespues = LocalDate.of(2023,10,5).isAfter(LocalDate.parse("2020-10-10"));
        System.out.println("esDespues = " + esDespues);

        esDespues = LocalDate.now().isAfter(LocalDate.now().minusDays(1));
        System.out.println("esDespues = " + esDespues);
    }
}
