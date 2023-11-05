package com.edsonrego.poointerfaces.repositorio;

import com.edsonrego.poointerfaces.modelo.BaseEntity;
import com.edsonrego.poointerfaces.repositorio.excepciones.*;

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
    public T porId(Integer id) throws LecturaAccesoDatoException{
        if(id == null || id <= 0) {
            throw new LecturaAccesoDatoException("Id inválido debe ser > que 0");
        }
        T resultado = null;
        for(T cli: datasource) {
            if(cli.getId() != null && cli.getId().equals(id)){
                resultado = cli;
                break;
            }
        }
        if (resultado == null){
            throw new LecturaAccesoDatoException("No existe el registro com el id: " + id);
        }
        return resultado;
    }

    @Override
    public void crear(T t) throws EscrituraAccesoDatoException{
        if (t == null){
            throw new EscrituraAccesoDatoException("Error al insertar un objeto null");
        }
        if(this.datasource.contains(t)){
            throw new RegistroDuplicadoAccesoDatoException("Error com el id " + t.getId() + " ya existe en el repositório");
        }
            this.datasource.add(t);
    }

    @Override
    public void eliminar(Integer id) throws LecturaAccesoDatoException{
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
