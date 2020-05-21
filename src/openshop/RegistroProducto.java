package openshop;
import java.util.ArrayList;

public class RegistroProducto {
    public static ArrayList<Producto> productos = new ArrayList();
    
    public void RegistrarProductos(){
        productos.add(new Producto("Celular", 15600, 15, 0));
        productos.add(new Producto("Monitor", 7550, 4, 0));
        productos.add(new Producto("Impresora", 4650.30, 26, 0));
    }
    
    public static void imprimirProductos(){
        System.out.print("Productos : \n");
        for(Producto producto: productos){
            System.out.print("-" + producto.getNombre() + " $ " + producto.getPrecio() + "," + producto.getCantidad() + "\n");
        }
    }
    
}
