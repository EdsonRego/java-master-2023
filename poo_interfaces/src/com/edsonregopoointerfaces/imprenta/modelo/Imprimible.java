package com.edsonregopoointerfaces.imprenta.modelo;

public interface Imprimible {
    //String imprimir();

    final static String TEXTO_DEFECTO = "Imprimiendo un valor por defecto";

    default String imprimir(){
        return TEXTO_DEFECTO;
    }

    static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
