package trabajopractico2;
import java.util.ArrayList;

public class RegistraEspesor {
    
    public static ArrayList<Espesor> espesor = new ArrayList();
    
    public void RegistroEspesor() {
        espesor.add(new Espesor("Aplicado pared 50 mm ", 53.60, 2.25));
        espesor.add(new Espesor("Aplicado pared 70 mm", 87.00, 3.15));
        espesor.add(new Espesor("Aplicado pared 100 mm", 117.49, 4.5));
        espesor.add(new Espesor("Aplicado pared 120 mm", 128.48, 5.4));
        espesor.add(new Espesor("Aplicado pared 160 mm", 143.05, 7.2));
        espesor.add(new Espesor("Aplicado pared 200 mm", 180.79, 9.00));
    }
    
    public void MostrarEspesor(){
        for(Espesor espesores: espesor){
            System.out.print( "- " + espesores.getDescripcion() + "\nPrecio por M2: " + espesores.getPrecioMCuadrados() + "\nRendimiendo bolsa: " + espesores.getRendimientoBolsa());
        }
    }
}
