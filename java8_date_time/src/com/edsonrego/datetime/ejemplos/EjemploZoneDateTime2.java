package com.edsonrego.datetime.ejemplos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class EjemploZoneDateTime2 {
    public static void main(String[] args) {

        //LocalDateTime fechaLocal = LocalDateTime.parse("2021-09-23T12:45");
        LocalDateTime fechaLocal = LocalDateTime.parse("2021/09/23 12:45"
                ,DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
        //ZoneId newYork = ZoneId.of("America/New_York");
        //ZonedDateTime zonaNy = ZonedDateTime.of(fechaLocal, ZoneOffset.of("-04:00"));
        ZonedDateTime zonaNy = fechaLocal.atZone(ZoneOffset.of("-04:00"));
        System.out.println("Hora de parida em Nova York = " + zonaNy);

        //ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zonaMadrid = zonaNy.withZoneSameInstant(ZoneOffset.of("+02:00")).plusHours(8);
        System.out.println("Hora de llegada en Madrid = " + zonaMadrid);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HM:mm, dd MMM yyyy");
        System.out.println("Detalles de viaje a españa");
        System.out.println("Partida NY " + dtf.format(zonaNy));
        System.out.println("Llegada Madrid " + dtf.format(zonaMadrid));

        ZoneId.getAvailableZoneIds().forEach(System.out::println);


        

    }
}
