package openshop;
import java.util.Scanner;

public class Gestor {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        RegistroProducto registroProducto = new RegistroProducto();
        Usuario usuario = new Usuario("Florencia", "florencia@gmail.com", "****");
        Pago pago1 = new Pago("Tarjeta Crédito", 3);
        Carrito ca1 = new Carrito(usuario);   
        
        registroProducto.RegistrarProductos();
        registroProducto.imprimirProductos();
        
        
        int num;
        do{
            System.out.print("\nNúmero del producto: ");
            num = input.nextInt();
            if(num < 1 || num > RegistroProducto.productos.size()){
                System.out.print("Error");
            }
        }while(num < 1 || num > RegistroProducto.productos.size());
            
        Producto producto = RegistroProducto.productos.get(num - 1);
        ca1.AgregarCarrito(producto);
            
        ca1.imprimirCarro();    
        }
        
    }
    
}
