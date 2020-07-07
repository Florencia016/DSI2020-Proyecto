package tp3;

public class Curso {
    private String nombre;
    private String descripcion;
    private String fechaInicio;
    private String fechaFin;
    private Docente docente;
    private String aula;
    private String horario;
    private int cupoMax;
    private int cupoMin;
    
    public Curso(String nombre, String descripcion, String fechaInicio, String fechaFin, String aula, String horario, int cupoMax, int cupoMin){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.aula = aula;
        this.horario = horario;
        this.cupoMax = cupoMax;
        this.cupoMin = cupoMin;
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

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
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
    
    
}
