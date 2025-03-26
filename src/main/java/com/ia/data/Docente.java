package com.ia.data;

import java.util.Date;

public class Docente {
    private String nombre;
    private Long registroPersonal;
    private Date horaEntrada;
    private Date horaSalida;

    

    public Docente(String nombre, Long registroPersonal, Date horaEntrada, Date horaSalida) {
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
    public Date getHoraEntrada() {
        return horaEntrada;
    }
    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    public Date getHoraSalida() {
        return horaSalida;
    }
    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    

}
