package Clases;

import java.util.*;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

public class Venta {
    private int id;
    private ArrayList<Producto> productos = new ArrayList<>();
    private Cliente cliente;
    private Transporte transporte;
    private float totalAPagar;
    private boolean pagoConfirmado;
    
    public Venta(int id, ArrayList<Producto> productos, Cliente cliente, Transporte transporte, float totalAPagar, boolean pagoConfirmado){
        this.id = id;
        this.productos = productos;
        this.cliente = cliente;
        this.transporte = transporte;
        this.totalAPagar = totalAPagar; 
        this.pagoConfirmado = pagoConfirmado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public float getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(float totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public boolean isPagoConfirmado() {
        return pagoConfirmado;
    }
    
    @JsonIgnore
    @JsonProperty("getPagoConfirmado")
    public boolean getPagoConfirmado() {
        return this.pagoConfirmado;
    }

    @JsonIgnore
    @JsonProperty("setPagoConfirmado")
    public void setPagoConfirmado(boolean pagoConfirmado) {
        this.pagoConfirmado = pagoConfirmado;
    }
}
