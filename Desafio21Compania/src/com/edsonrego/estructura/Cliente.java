package com.edsonrego.estructura;

public class Cliente extends Persona{

    private int clienteId;

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion, int clienteId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = clienteId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nclienteId= " + clienteId + ", " + super.toString();
    }
}
