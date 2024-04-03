package domain.gestionAcademica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion{
    private List<Materia> materiasAInscribirse;
    private Alumno alumno;

    public Inscripcion(Alumno alumno, Materia ... materias){
        this.alumno = alumno;
        this.materiasAInscribirse = new ArrayList<>();
        Collections.addAll(this.materiasAInscribirse, materias);

    }

    public boolean aprobada(){
            return materiasAInscribirse.stream().allMatch(m -> m.cumpleCorrelativas(alumno));
    }
        }