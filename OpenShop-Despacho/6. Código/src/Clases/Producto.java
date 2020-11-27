package Clases;

public class Producto {
    private int id;
    private String nombre;
    private String marca;
    private String descripcion;
    private float precio;
    private int cantidad;
    
    public Producto(int id, String nombre, String marca, String descripcion, float precio, int cantidad){
        this.id = id;
        this.nombre = nombre;
        this.marca = marca; 
        this.descripcion = descripcion;
        this.precio = precio; 
        this.cantidad= cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
