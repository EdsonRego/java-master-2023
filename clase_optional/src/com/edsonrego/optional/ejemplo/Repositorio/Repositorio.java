package com.edsonrego.optional.ejemplo.Repositorio;

import com.edsonrego.optional.ejemplo.models.Computador;

import java.util.Optional;

public interface Repositorio<T> {

    Optional<Computador> filtrar(String nombre);

}
