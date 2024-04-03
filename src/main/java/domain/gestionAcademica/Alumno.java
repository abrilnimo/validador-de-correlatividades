package domain.gestionAcademica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private Integer legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(int legajo){
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<>();
    }

    public void establecerMateriasAprobadas(Materia ... materias){
        Collections.addAll(this.materiasAprobadas, materias);
    }
    public boolean aprobada(Materia materia) {
        return materiasAprobadas.contains(materia);
    }
}
