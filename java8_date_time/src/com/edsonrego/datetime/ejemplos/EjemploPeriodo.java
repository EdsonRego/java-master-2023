package com.edsonrego.datetime.ejemplos;

import java.time.LocalDate;
import java.time.Period;

public class EjemploPeriodo {
    public static void main(String[] args) {

        LocalDate fecha1 = LocalDate.of(1972,06,20);
        LocalDate fecha2 = LocalDate.of(2023,10,5);

        Period periodo = Period.between(fecha2,fecha1);
        System.out.println("periodo = " + periodo);

        System.out.printf("Periodo entre %s y %s hay %d años, %d meses y %d días ",
                fecha2, fecha1, periodo.getYears(), periodo.getMonths(), periodo.getDays());


    }
}
