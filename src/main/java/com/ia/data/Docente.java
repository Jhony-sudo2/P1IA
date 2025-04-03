package com.ia.data;

import java.time.LocalTime;

public class Docente {
    private String nombre;
    private Long registroPersonal;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;

    

    
    public Docente(String nombre, Long registroPersonal, LocalTime horaEntrada, LocalTime horaSalida) {
        this.nombre = nombre;
        this.registroPersonal = registroPersonal;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Long getRegistroPersonal() {
        return registroPersonal;
    }
    public void setRegistroPersonal(Long registroPersonal) {
        this.registroPersonal = registroPersonal;
    }
    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }
    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    public LocalTime getHoraSalida() {
        return horaSalida;
    }
    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }
    

    

}
