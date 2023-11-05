package com.edsonrego.pooherencia;

public class Alumno extends Persona{
    private String institucion;
    private double notaMatematica;
    private double notaCastellano;
    private double notaHistoria;

   public Alumno(){
        System.out.println("Alumno: Inicializando constructor..");
    }

    public Alumno(String nombre, String apellido){
       super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad){
       super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion){
        super(nombre, apellido, edad);
        this.institucion = institucion;
    }

    public Alumno(String nombre,
                  String apellido,
                  int edad,
                  String institucion,
                  double notaCastellano,
                  double notaHistoria,
                  double notaMatematica){
       this(nombre, apellido, edad, institucion);
       this.notaCastellano = notaCastellano;
       this.notaHistoria = notaHistoria;
       this.notaMatematica = notaMatematica;
    }

   public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    @Override
    public String saludar(){
       String saludar = super.saludar();
       return saludar + "Soy un alumno y mi nombre es " + getNombre();
    }

    public double calcularPromedio(){
       //System.out.println("Calcular promedio " + Alumno.class.getCanonicalName());
       return (notaMatematica + notaHistoria + notaCastellano)/3;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\ninstitucion= " + institucion + '\'' +
                "\nnotaMatematica= " + notaMatematica +
                "\nnotaCastellano= " + notaCastellano +
                "\nnotaHistoria= " + notaHistoria +
                "\npromedio= " + this.calcularPromedio();
    }
}
