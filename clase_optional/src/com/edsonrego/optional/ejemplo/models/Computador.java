package com.edsonrego.optional.ejemplo.models;

import java.util.Optional;

public class Computador {

    private String nombre;
    private String modelo;
    private Processador processador;

    public Computador() {
    }

    public Computador(String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Optional<Processador> getProcessador() {
        return Optional.ofNullable(processador);
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    @Override
    public String toString() {
        return nombre + ", " + modelo;
    }
}
