package com.ia.algoritmo;

import java.util.ArrayList;

import com.ia.cromosomas.Cromosoma;
import com.ia.data.Curso;
import com.ia.data.Docente;
import com.ia.data.Salon;
import com.ia.data.asignacionCurso;

public class Genetico {
    
    private ArrayList<Cromosoma> Cromosomas = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();
    private ArrayList<Docente> docentes = new ArrayList<>();
    private ArrayList<Salon> salones = new ArrayList<>();
    private ArrayList<asignacionCurso> asignacion = new ArrayList<>();
    private int CANTIDAD_POBLACION = 20;
    
    public Genetico(ArrayList<Curso> cursos, ArrayList<Docente> docentes, ArrayList<Salon> salones,
            ArrayList<asignacionCurso> asignacion) {
        this.cursos = cursos;
        this.docentes = docentes;
        this.salones = salones;
        this.asignacion = asignacion;
    }

    public void Iniciar(){
        GenerarPoblacionInicial();
        boolean continuar = false;
        while (continuar) {
            Seleccion();
            Cruzamiento();
            Mutacion();
            Finalizacion();
        }
    }

    public void GenerarPoblacionInicial(){
        for (int i = 0; i < CANTIDAD_POBLACION; i++) {
            Cromosoma tmp = new Cromosoma();
            System.out.println("SOLUCION #" + i);
            tmp.GenerarSoluciones(cursos, docentes, salones, asignacion);
            Cromosomas.add(tmp);
        }
    }


    public void Seleccion(){

    }

    public void Cruzamiento(){

    }

    public void Mutacion(){

    }

    public void Finalizacion(){

    }

    public void CargarDatos(){
        
    }
}
