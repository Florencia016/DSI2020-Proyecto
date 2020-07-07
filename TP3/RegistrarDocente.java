package tp3;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistrarDocente {
    public static ArrayList<Docente> docentes = new ArrayList();
    
    public static void nuevoDocente(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nApellido y Nombre: ");
        String nombreApellido = input.nextLine();
        System.out.print("\nLegajo: ");
        int legajo = input.nextInt();
        System.out.print("\nEspecidalidad: ");
        String especialidad = input.nextLine();
        System.out.print("\nTelefono: ");
        int telefono = input.nextInt();
        System.out.print("\nMail: ");
        String mail = input.nextLine();
        
        
        Docente docente = new Docente(nombreApellido, legajo, especialidad, telefono, mail);
    }
    
    public static int buscarDocente(int legajo){
        int pos = -1;
        int i = 0;
        
        for(Docente docente : docentes){
            if(legajo == docente.getLegajo()){
                pos = i;
            }
            i++;
        }
        return pos;
    }
    
    public static void asignarDocente(Curso curso){
        Scanner input = new Scanner(System.in);
        int opcion;
        
        System.out.print("Ingrese el legajo del docente: ");
        
        do{
            int legajo = input.nextInt();
            opcion = buscarDocente(legajo);
            
            if(opcion != -1){
                Docente docente = docentes.get(opcion);
                curso.setDocente(docente);
                System.out.print("EL DOCENTE FUE REGISTRADO AL CURSO");
            }
            else{
                System.out.print("NO SE ENCUENTRA DOCENTE CON ESE LEGAJO");
            }
        }while(opcion == -1);
    }
}
