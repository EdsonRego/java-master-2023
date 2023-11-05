package com.edsonrego.api.stream.ejemplos;

import com.edsonrego.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamListToStream {
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

        lista.stream().map(u -> u.getNombre().toUpperCase()
                        .concat(" ")
                        .concat(u.getApellido().toUpperCase()))
                .flatMap(nombre -> {
                    if (nombre.contains("john".toUpperCase())) {
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }
}
