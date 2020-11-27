package practico4;

public class Docente {
        private String nombre;
        private String apellido; 
        private int legajo;
        private int dni;
        private int telefono;
        private String mail;
        private String direccion;
        private String titulo; 
        
        public Docente(String nombre, String apellido, int legajo, int dni, 
                int telefono, String mail, String direccion, String titulo){
            this.nombre = nombre;
            this.apellido = apellido; 
            this.legajo = legajo; 
            this.dni = dni;
            this.telefono = telefono; 
            this.mail = mail; 
            this.direccion= direccion; 
            this.titulo = titulo;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
        
        
}
