package com.edsonrego.pooclasesabastractas.form.validador;

public class NonNuloValidador extends Validador{

    protected String mensaje = "el campo %s no puede ser nulo";

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return (valor != null );
    }
}
