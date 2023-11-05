package com.edsonrego.estructura;

public class Empleado extends Persona{
    private double remuneracion;
    private int empleadoOld;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empleadoOld) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoOld = empleadoOld;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoOld() {
        return empleadoOld;
    }

    public void setEmpleadoOld(int empleadoOld) {
        this.empleadoOld = empleadoOld;
    }

    public double aumentarRemuneracion(int porcentaje){
        return remuneracion += remuneracion * porcentaje/100;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nremuneración= " + remuneracion +
                "\nempleadoOld= " + empleadoOld + super.toString();
    }
}
