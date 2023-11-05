package com.edsonrego.pooclasesabastractas.form.validador;

public class RequiridoValidador extends Validador{

    protected String mensaje = "el campo %s es requirido";

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
        return (valor != null && valor.length() > 0);
    }
}
