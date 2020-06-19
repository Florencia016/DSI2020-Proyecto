package trabajopractico2;

public class Cliente {
    private String apellido;
    private String nombre;
    private String empresa;
    private String domObra;
    private String mail;
    private String tel;
    
    public Cliente(String apellido, String nombre, String empresa, String domObra, String mail, String tel){
        this.apellido = apellido;
        this.nombre = nombre;
        this.empresa = empresa;
        this.domObra = domObra;
        this.mail = mail;
        this.tel = tel;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDomObra() {
        return domObra;
    }

    public void setDomObra(String domObra) {
        this.domObra = domObra;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    
    
}

