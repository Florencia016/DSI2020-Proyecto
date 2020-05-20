package openshop;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    private int cantDisponible;
    
    public Producto(String nombre, double precio, int cantidad, int cantDisponible){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.cantDisponible = cantDisponible;
    }
    
    public String toString(){
        return nombre + "," + precio + "," + cantidad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public int getCantDisponible(){
        return cantDisponible;
    }
    
    public void setCantDisponible(int cantDisponible){
        this.cantDisponible = cantDisponible;
    }
}
