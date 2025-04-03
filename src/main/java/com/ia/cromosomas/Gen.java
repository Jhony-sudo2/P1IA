package com.ia.cromosomas;

public class Gen {
    private int Curso;
    private int Salon;
    private int horaInicio;
    private int Docente;
    public Gen(int curso, int salon, int horaInicio, int docente) {
        Curso = curso;
        Salon = salon;
        this.horaInicio = horaInicio;
        Docente = docente;
    }
    public int getCurso() {
        return Curso;
    }
    public void setCurso(int curso) {
        Curso = curso;
    }
    public int getSalon() {
        return Salon;
    }
    public void setSalon(int salon) {
        Salon = salon;
    }
    public int getHoraInicio() {
        return horaInicio;
    }
    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }
    public int getDocente() {
        return Docente;
    }
    public void setDocente(int docente) {
        Docente = docente;
    }

    
    
}
