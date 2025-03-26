package com.ia.data;

public class Curso {
    private String nombre;
    private String codigo;
    private String carrera;
    private int semestre;
    private boolean tipo;

    

    public Curso(String nombre, String codigo, String carrera, int semestre, boolean tipo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.carrera = carrera;
        this.semestre = semestre;
        this.tipo = tipo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public boolean isTipo() {
        return tipo;
    }
    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    

}
