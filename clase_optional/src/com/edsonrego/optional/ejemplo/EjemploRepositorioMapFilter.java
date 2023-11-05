package com.edsonrego.optional.ejemplo;

import com.edsonrego.optional.ejemplo.Repositorio.ComputadorRepositorio;
import com.edsonrego.optional.ejemplo.Repositorio.Repositorio;
import com.edsonrego.optional.ejemplo.models.Computador;
import com.edsonrego.optional.ejemplo.models.Fabricante;
import com.edsonrego.optional.ejemplo.models.Processador;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        String f = repositorio.filtrar("rog")
                .flatMap(Computador::getProcessador)
                .flatMap(Processador::getFabricante)
                .filter( fab -> "Intel".equalsIgnoreCase(fab.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");
        System.out.println("Fabricante = " + f);

    }
}
