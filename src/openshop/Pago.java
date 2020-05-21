package openshop;

public class Pago {
    private String tipoPago;
    private int coutas; 
    
    public Pago(String tipoPago, int coutas){
        this.tipoPago = tipoPago;
        this.coutas = coutas;
        
    }
    
    public String toString(){
        return tipoPago + "," + coutas;
    }
    
    public String getTipoPago(){
        return tipoPago;
    }
    
    public int getCoutas(){
        return coutas;
    }
}
