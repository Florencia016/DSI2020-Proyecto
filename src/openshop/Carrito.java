package openshop;
import java.util.ArrayList;
import java.util.Scanner;



public class Carrito {
    private Usuario usuario;
    private ArrayList<Producto>productos;
    
    public Carrito(Usuario usuario){
       this.usuario = usuario;
       productos = new ArrayList<Producto>();
    }
    
    public void AgregarCarrito(Producto producto){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresar unidades deseadas: ");
        int cant = 0;
        do {
            cant = input.nextInt();
            if(cant == 0){
                System.out.print("Error al ingresar cantidad.");
            }
            if(cant > producto.getCantidad()){
                System.out.print("No hay stock. Vuelva a ingresar cantidad.");
            }
        }while(cant < 1 || cant > producto.getCantidad());
        
        int b = 0;
        for(Producto prod: productos){
            if(prod.equals(producto)){
                int totalCant = prod.getCantidad() + cant;
                prod.setCantidad(totalCant);
                int cantDisponible =  prod.getCantDisponible() - cant;
                b = 1;
            }
        }
     
        if(b == 0){
            productos.add(producto);
            Producto produc = productos.get(productos.size() - 1);
            produc.setCantidad(cant);
            int nuevaCantDisp = produc.getCantDisponible() - cant;
            produc.setCantDisponible(nuevaCantDisp);
        }
    }
    
    public void imprimirCarro(){
        double total = 0;
        System.out.print("Detalles del carrito: \n");
        for(Producto producto: productos){
            total += producto.getPrecio() * producto.getCantidad();
            System.out.print("-" + producto.getCantidad() + " " + producto.getNombre() + " $" + producto.getPrecio() + "\n");
        }
       
        System.out.print(" Precio total: $" + total);
        medioPago(total);
    }
    
    public void medioPago(double precio){
        Scanner input= new Scanner(System.in);
        int medio = 0;
        int cuotas = 0;
        do{
            System.out.print("\nSeleccionar medio de pago (1. Efectivo - 2. Tarjeta): ");
            medio = input.nextInt();
            if(medio < 1 || medio > 2) System.out.print("Opción incorrecta");
        }while(medio < 1 || medio > 2);
        
        if (medio == 1 ){
            System.out.print("Total a pagar: $" + precio);
        }
        else {
            do{
                System.out.print("Ingresar cantidad de coutas (3 - 6 - 12): ");
                cuotas = input.nextInt();
                if(cuotas < 3 || cuotas > 12) System.out.print("Error. Vuelve a ingresar");
            }while(cuotas < 3 || cuotas > 12);
            System.out.print("Total a pagar: " + cuotas + " cuotas de $" + precio/cuotas + " cada una.");
        }
    }
}
