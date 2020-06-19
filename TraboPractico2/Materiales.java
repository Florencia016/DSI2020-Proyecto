package trabajopractico2;

public class Materiales {
    private String descripcion;
    private double precioBolsa; 
    
    public Materiales(String descripcion, double precioBolsa){
        this.descripcion = descripcion;
        this.precioBolsa = precioBolsa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBolsa() {
        return precioBolsa;
    }

    public void setPrecioBolsa(double precioBolsa) {
        this.precioBolsa = precioBolsa;
    }
}
