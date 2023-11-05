package com.edsonrego.optional.ejemplo.Repositorio;

import com.edsonrego.optional.ejemplo.models.Computador;
import com.edsonrego.optional.ejemplo.models.Fabricante;
import com.edsonrego.optional.ejemplo.models.Processador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepositorio implements Repositorio<Computador> {

    private List<Computador> datasource;

    public ComputadorRepositorio() {
        datasource = new ArrayList<>();

        Processador proc = new Processador("I9-9880h",new Fabricante("Intel"));
        Computador asus = new Computador("Asus Rog","Strix G512");
        asus.setProcessador(proc);
        datasource.add(asus);
        datasource.add(new Computador("MacBook Pro", "MVVK2CI"));
    }

    @Override
    public Optional<Computador> filtrar(String nombre) {

        return datasource.stream()
                .filter( c -> c.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .findAny();

//        for(Computador c: datasource){
//            if(c.getNombre().equalsIgnoreCase(nombre)){
//                    return Optional.of(c);
//            }
//        }
//        return Optional.empty();
    }
}
