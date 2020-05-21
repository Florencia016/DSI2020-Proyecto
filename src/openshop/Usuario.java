package openshop;
public class Usuario {
    private String nombre;
    private String mail; 
    private String clave; 
    
    public Usuario(String nombre, String mail, String clave){
        this.nombre = nombre;
        this.mail = mail;
        this.clave = clave; 
    }
    
    public String getNombre(){
        return nombre; 
    }
    
    public String getMail(){
        return mail;
    }
    
    public String getClave(){
        return clave;
    }
}
