package Clases;

import java.time.LocalDate;
import java.util.ArrayList;

public class Envio {

    private LocalDate fecha;
    private Cliente cliente;
    private ArrayList<Producto> productosDespachados;

    public Envio(LocalDate fecha, Cliente cliente, ArrayList<Producto> productosDespachados) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.productosDespachados = productosDespachados;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getProductosDespachados() {
        return productosDespachados;
    }

    public void setProductosDespachados(ArrayList<Producto> productosDespachados) {
        this.productosDespachados = productosDespachados;
    }
}
