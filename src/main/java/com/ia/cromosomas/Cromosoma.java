package com.ia.cromosomas;

import java.util.ArrayList;
import java.util.Random;

import com.ia.data.Curso;
import com.ia.data.Docente;
import com.ia.data.Salon;
import com.ia.data.asignacionCurso;

public class Cromosoma {
    private ArrayList<Gen> Genes = new ArrayList<>();
    private int Puntuacion = 0;

    public void GenerarSoluciones(ArrayList<Curso> cursos,
            ArrayList<Docente> docentes,
            ArrayList<Salon> salones,
            ArrayList<asignacionCurso> asignacion) {
        Random n = new Random();
        for (int i = 0; i < cursos.size(); i++) {
            int curso = n.nextInt(cursos.size());
            int salon = n.nextInt(salones.size());
            int horario = n.nextInt(9) + 1;
            int docente = n.nextInt(docentes.size());
            Gen tmp = new Gen(curso, salon, horario, docente);
            Genes.add(tmp);
            System.out.println("Curso: " + cursos.get(curso).getNombre());
            System.out.println("Docente: " + docentes.get(docente).getNombre());
            System.out.println("HORARIO: " + getHorario(horario));
            System.out.println("SALON: " + salones.get(salon).getNombre());
        }
        

    }

    public ArrayList<Gen> getCromosoma() {
        return Genes;
    }

    public void setCromosoma(ArrayList<Gen> cromosoma) {
        Genes = cromosoma;
    }

    public int getPuntuacion() {
        return Puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        Puntuacion = puntuacion;
    }

    public String getHorario(int i){
        switch (i) {
            case 1:
                return "1:40-2:30";
            case 2:
                return "2:40-3:30";
            case 3:
                return "3:40-4:30";
            case 4:
                return "4:40-5:30";
            case 5:
                return "5:40-6:30";
            case 6:
                return "6:40-7:30";
            case 7:
                return "7:40-8:30";
            case 8:
                return "8:20-9:10";
            default:
                return "";
        }
    }
}
