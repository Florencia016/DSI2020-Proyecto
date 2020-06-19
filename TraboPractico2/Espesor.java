package trabajopractico2;

public class Espesor {
    private String descripcion;
    private double precioMCuadrados;
    private double rendimientoBolsa;
    
    public Espesor(String descripcion, double precioMCuadrados, double rendimientoBolsa){
        this.descripcion = descripcion;
        this.precioMCuadrados = precioMCuadrados;
        this.rendimientoBolsa = rendimientoBolsa; 
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioMCuadrados() {
        return precioMCuadrados;
    }

    public void setPrecioMCuadrados(double precioMCuadrados) {
        this.precioMCuadrados = precioMCuadrados;
    }

    public double getRendimientoBolsa() {
        return rendimientoBolsa;
    }

    public void setRendimientoBolsa(double rendimientoBolsa) {
        this.rendimientoBolsa = rendimientoBolsa;
    }
    
    
}
