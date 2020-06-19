package trabajopractico2;

public class Cotizar {
    private double metros;
    private double precioCotizacion;
    private Materiales materiales;
    private Cliente cliente;
    private Espesor espesor;

    public Cotizar(double metros, double precioCotizacion, Materiales materiales, Cliente cliente, Espesor espesor) {
        this.metros = metros;
        this.precioCotizacion = precioCotizacion;
        this.materiales = materiales;
        this.cliente = cliente;
        this.espesor = espesor;
    }

    Cotizar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public double getPrecioCotizacion() {
        return precioCotizacion;
    }

    public void setPrecioCotizacion(double precioCotizacion) {
        this.precioCotizacion = precioCotizacion;
    }

    public Materiales getMateriales() {
        return materiales;
    }

    public void setMateriales(Materiales materiales) {
        this.materiales = materiales;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Espesor getEspesor() {
        return espesor;
    }

    public void setEspesor(Espesor espesor) {
        this.espesor = espesor;
    }
    
    public void ObtenerCotizacion(){
        double cantBolsas = this.metros/espesor.getRendimientoBolsa();
        double precio = this.metros*espesor.getPrecioMCuadrados();
        double precioMaterial = (Math.ceil(cantBolsas))*this.materiales.getPrecioBolsa();
        precioCotizacion = precioMaterial + precio;
    }
    
    public void MostrarCotizacion(){
        System.out.print("Cotizacion para el cliente: " + cliente.getApellido() + " " + cliente.getNombre());
        System.out.print("\nMaterial: " + materiales.getDescripcion() + " $ " + materiales.getPrecioBolsa() + " por bolsa.");
        System.out.print("\nEspesor: " + espesor.getDescripcion() + " $ " + espesor.getPrecioMCuadrados() + " por metro cuadrado");
        System.out.print("\nPRECIO FINAL: $" + precioCotizacion);
    }
}
