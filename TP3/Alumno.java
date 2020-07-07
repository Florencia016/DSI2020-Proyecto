package tp3;

public class Alumno {
    private String nombreApellido; 
    private int dni;
    private String mail;
    private int telefono; 
    
    public Alumno(String nombreApellido, int dni, String mail, int telefono){
        this.nombreApellido = nombreApellido;
        this.dni = dni;
        this.mail = mail;
        this.telefono = telefono;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
}
