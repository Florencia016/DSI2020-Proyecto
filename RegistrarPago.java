package openshop;
import java.util.ArrayList;

public class RegistrarPago {
    public static ArrayList<Pago> pagos = new ArrayList();
    
    public static void imprimirPago(){
        int x = 1;
        System.out.print("Pago: ");
        for(Pago item: pagos){
            System.out.print(x++ + "Método de Pago:" + item.getTipoPago() + "Coutas:" + item.getCoutas());
        }
    }
}
