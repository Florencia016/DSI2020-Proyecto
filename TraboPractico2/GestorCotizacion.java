package trabajopractico2;
import java.util.Scanner;
import java.util.ArrayList;

public class GestorCotizacion {
   
    public static ArrayList<Cotizar> cotizaciones = new ArrayList();
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(true){
            int opcion;
            System.out.print("Seleccionar opción: ");
            System.out.print("\n1. Registrar cliente \n2.Solicitar cotización \n3.Salir");
            opcion = input.nextInt();
            //Validar opcion
            while(opcion < 1 || opcion > 3){
                System.out.print("\nOPCIÓN INCORRECTA. \nVuelva a seleccionar una opción: ");
                System.out.print("\n1. Registrar cliente \n2.Solicitar cotización \n3.Salir");
                opcion = input.nextInt();
            }
            
            if (opcion == 1) {
                System.out.print("\n\tREGISTRAR NUEVO CLIENTE\n");
                RegistroCliente();
            } else {

                if (opcion == 2) {
                    System.out.print("\n\tSOLICITAR COTIZACION");
                    SolicitarCotizacion();
                } else {
                    if (opcion == 3) {
                        break;
                    }
                }
            }
        }

    }
    
    public static void RegistroCliente(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Apellido: ");
        String apellido = input.nextLine();
        System.out.print("Nombre: ");
        String nombre = input.nextLine();
        System.out.print("Empresa: ");
        String empresa = input.nextLine();
        System.out.print("Domicilio de la obra: ");
        String domObra = input.nextLine();
        System.out.print("Mail: ");
        String mail = input.nextLine();
        System.out.print("Telefono: ");
        String tel = input.nextLine();
        
        Cliente cliente = new Cliente(apellido, nombre, empresa, domObra, mail, tel);
        RegistrarCliente.clientes.add(cliente);
        
    }
    
    public static void SolicitarCotizacion(){
        Scanner input = new Scanner(System.in);
        //Elegir cliente
        int clienteExistente;
        int opcCliente;
        RegistrarCliente registrarCliente = new RegistrarCliente();
        registrarCliente.MostrarCliente();
        System.out.print("\n¿El cliente esta registrado? 1.Si 2.No");
        clienteExistente = input.nextInt();
        if(clienteExistente == 2){
            System.out.print("\n\tREGISTRAR CLIENTE ");
            RegistroCliente();
            System.out.print("Seleccionar Cliente: ");
            opcCliente = input.nextInt();
            Cliente cliente = registrarCliente.clientes.get(opcCliente - 1);
        }
        else{
            System.out.print("Seleccionar Cliente: ");
            opcCliente = input.nextInt();
            Cliente cliente = registrarCliente.clientes.get(opcCliente - 1);
        }
        
        //Elegir material 
        RegistrarMateriales registrarMateriales = new RegistrarMateriales();
        registrarMateriales.MostrarMateriales();
        System.out.print("\nSeleccionar material: ");
        int opcMaterial = input.nextInt();
        Materiales materiales = registrarMateriales.materiales.get(opcMaterial - 1);
        
        //Ingresar metros cuadrados 
        System.out.print("\nIngresar metros cuadrados: ");
        double m2 = input.nextDouble();
        
        //Elegir espesor 
        RegistraEspesor registrarEspesor = new RegistraEspesor();
        registrarEspesor.MostrarEspesor();
        System.out.print("\nSeleccionar espesor: ");
        int opcEspesor = input.nextInt();
        Espesor espesores = registrarEspesor.espesor.get(opcEspesor - 1);
        
        //Realizar cotizacion
        Cotizar cotizar = new Cotizar();
        cotizar.setCliente(cliente);
        cotizar.setMateriales(materiales);
        cotizar.setMetros(m2);
        cotizar.setEspesor(espesores);
        cotizar.ObtenerCotizacion();
        cotizar.MostrarCotizacion();
        cotizaciones.add(cotizar);
        
    }
}
