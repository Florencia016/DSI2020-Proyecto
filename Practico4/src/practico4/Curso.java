package practico4;

import java.util.ArrayList;
import java.util.Calendar;

public class Curso {

    private String nombre;
    private String descripcion;
    private ArrayList<Docente> docentes;
    private String fechaInicio;
    private String fechaFin;
    private Calendar fechaLimite;
    private String horario;
    private String aula;
    private int cupoMax;
    private int cupoMin;
    private ArrayList<Alumno> alumnos;
    private boolean cursoPlanificado;
    private boolean cursoConfirmado;

    public Curso(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        docentes = new ArrayList<Docente>();
        fechaInicio = "";
        fechaFin = "";
        horario = "";
        aula = "";
        cupoMax = 0;
        cupoMin = 0;
        alumnos = new ArrayList<Alumno>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(ArrayList<Docente> docentes) {
        this.docentes = docentes;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Calendar getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Calendar fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public int getCupoMax() {
        return cupoMax;
    }

    public void setCupoMax(int cupoMax) {
        this.cupoMax = cupoMax;
    }

    public int getCupoMin() {
        return cupoMin;
    }

    public void setCupoMin(int cupoMin) {
        this.cupoMin = cupoMin;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public boolean getCursoPlanificado() {
        return cursoPlanificado;
    }

    public void setCursoPlanificado(boolean cursoPlanificado) {
        this.cursoPlanificado = cursoPlanificado;
    }

    public boolean getCursoConfirmado() {
        return cursoConfirmado;
    }

    public void setCursoConfirmado(boolean cursoConfirmado) {
        this.cursoConfirmado = cursoConfirmado;
    }

    public boolean verificarCapacidad() {
        if (alumnos.size() == cupoMax) {
            return false;
        } else {
            return true;
        }
    }

    public boolean verificarCupo() {
        if (alumnos.size() >= cupoMin) {
            return true;
        } else {
            return false;
        }
    }

    public void agregarDocente(Docente docente) {
        docentes.add(docente);
        System.out.println(docente.getNombre() + " fue asignado con éxito al curso " + nombre + ".");
    }

    public void removerDocente(int pos) {
        Docente docente = docentes.get(pos);
        docentes.remove(pos);
        System.out.println(docente.getNombre() + " fue removido con éxito del curso " + nombre + ".");
    }

    public void mostrarDocentes() {
        int i = 1;
        for (Docente docente : docentes) {
            System.out.println(i++ + "- " + docente.getNombre() + ".");
        }
    }

    public int cantidadDocentes() {
        return docentes.size();
    }

    public void agregarCursante(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void confirmarCancelarCurso(boolean cursoConformado) {
        this.cursoConfirmado = cursoConfirmado;
        if (!cursoConfirmado) {
            cursoPlanificado = false;
        }
    }
}
