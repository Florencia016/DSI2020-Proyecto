package trabajopractico2;
import java.util.ArrayList;

public class RegistrarMateriales {
    
    public static ArrayList<Materiales> materiales = new ArrayList();
    
    public void RegistroMaterial(){
        materiales.add(new Materiales("Material 1", 150));
        materiales.add(new Materiales("Material 2", 250));
    }
    
    public void MostrarMateriales(){
        for(Materiales material: materiales){
            System.out.print("Material: " + material.getDescripcion() + "\nPrecio por bolsa: " + material.getPrecioBolsa());
        }
    }
}
