package com.edsonrego.poointerfaces.repositorio;

import com.edsonrego.poointerfaces.modelo.BaseEntity;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractaListRepositorio<T extends BaseEntity> implements OrdenablePaginableCrudRepositorio<T>{

    protected List<T> datasource;

    public AbstractaListRepositorio() {
        this.datasource = new ArrayList<>();
    }

    @Override
    public List<T> listar() {
        return datasource;
    }

    @Override
    public T porId(Integer id) {
        T resultado = null;
        for(T cli: datasource){
            if(cli.getId() != null && cli.getId().equals(id)){
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crear(T t) {
            this.datasource.add(t);
    }

    @Override
    public void eliminar(Integer id) {
        this.datasource.remove(this.porId(id));
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return datasource.subList(desde,hasta);
    }

    @Override
    public int total() {
        return this.datasource.size();
    }
}
