package domain.gestionAcademica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private List<Materia> correlativas;

    public Materia(Materia ... materias){
        this.correlativas = new ArrayList<>();
        Collections.addAll(this.correlativas, materias);
    }
    public boolean cumpleCorrelativas(Alumno alumno) {
        return correlativas
                .stream()
                .allMatch(c->alumno.aprobada(c));
    }
}
