package tp3;

public class Docente {
    private String nombreApellido;
    private int legajo;
    private String especialidad;
    private int telefono;
    private String mail;
    
    public Docente(String nombreApellido, int legajo, String especialidad, int telefono, String mail){
        this.nombreApellido = nombreApellido; 
        this.legajo = legajo;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.mail = mail;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
}
