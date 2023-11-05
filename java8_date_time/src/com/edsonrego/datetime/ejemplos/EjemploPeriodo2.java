package com.edsonrego.datetime.ejemplos;

import java.time.LocalDate;
import java.time.Period;

public class EjemploPeriodo2 {
    public static void main(String[] args) {

        LocalDate fecha1 = LocalDate.of(1972,06,20);
        LocalDate fecha2 = LocalDate.of(2023,10,5);
        LocalDate fecha3 = fecha2.withMonth(12);
        fecha3 = fecha3.withDayOfMonth(28);

        Period periodo = Period.between(fecha3,fecha1);
        System.out.println("periodo = " + periodo);

        System.out.printf("Periodo entre %s y %s hay %d años, %d meses y %d días ",
                fecha3, fecha1, periodo.getYears(), periodo.getMonths(), periodo.getDays());


    }
}
