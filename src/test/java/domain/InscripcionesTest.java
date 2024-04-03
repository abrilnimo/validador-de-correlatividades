package domain;

import domain.gestionAcademica.Alumno;
import domain.gestionAcademica.Materia;
import domain.gestionAcademica.Inscripcion;
import org.junit.Assert;
import org.junit.Test;

public class InscripcionesTest {
    private Materia algoritmos = new Materia();
    private Materia paradigmas = new Materia(algoritmos);
    private Materia arquitectura = new Materia();

    private Materia analisis = new Materia(algoritmos);
    private Materia sistemasOp = new Materia(paradigmas,arquitectura);

    @Test
    public void incripcionEsAprobada(){
        Alumno unAlumno = new Alumno(2939382);
        unAlumno.establecerMateriasAprobadas(algoritmos , paradigmas, arquitectura);

        Inscripcion unaInscripcion = new Inscripcion(unAlumno, analisis, sistemasOp);

        Assert.assertTrue(unaInscripcion.aprobada());

    }
    @Test
    public void incripcionEsRechazada(){
        Alumno unAlumno = new Alumno(2939382);
        unAlumno.establecerMateriasAprobadas(algoritmos , arquitectura);

        Inscripcion unaInscripcion = new Inscripcion(unAlumno, analisis, sistemasOp);

        Assert.assertFalse(unaInscripcion.aprobada());

    }




}

