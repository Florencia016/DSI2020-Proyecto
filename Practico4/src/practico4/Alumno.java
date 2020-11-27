package practico4;

public class Alumno {
    private String nombre;
    private int dni;
    private String mail;
    private String telefono; 
    
    public Alumno(String nombre, int dni, String mail, String telefono){
        this.nombre = nombre;
        this.dni = dni; 
        this.mail = mail;
        this.telefono = telefono; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
