package com.edsonrego.api.stream.ejemplos;

import com.edsonrego.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class EjemploStreamListParallel {
    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Andrés", "Guzmán"));
        lista.add(new Usuario("Luci", "Martinez"));
        lista.add(new Usuario("Pepe", "Fernandez"));
        lista.add(new Usuario("Cata", "Perez"));
        lista.add(new Usuario("Lato", "Mena"));
        lista.add(new Usuario("Ezequiel", "Doe"));
        lista.add(new Usuario("John", "Deere"));
        lista.add(new Usuario("John", "Deere"));

        long t1 = System.currentTimeMillis();
        String resultado = lista.stream()
                .parallel()//para testar, comentar parallel()
                .map(u -> u.toString().toUpperCase())
                //.peek(System.out::println)
                .peek(n -> {
                    System.out.println("Nombre thread: " + Thread.currentThread().getName() + " - " + n);
                })
                .flatMap(nombre -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (nombre.contains("john".toUpperCase())) {
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .findAny().orElse("");

        long t2 = System.currentTimeMillis();
        System.out.println("Tiempo total " + t2 + " menos " + t1 + " = " + (t2 - t1));
        System.out.println(resultado);
    }
}
