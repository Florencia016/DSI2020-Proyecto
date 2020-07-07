package tp3;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistrarAlumno {
    public static ArrayList<Alumno> alumnos = new ArrayList();
    
    public static void nuevoAlumno(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Apellido y Nombre: ");
        String nombreApellido = input.nextLine();
        System.out.print("DNI: ");
        int dni = input.nextInt();
        System.out.print("Mail: ");
        String mail = input.nextLine();
        System.out.print("Telefono: ");
        int telefono = input.nextInt();
        
        Alumno alumno = new Alumno(nombreApellido, dni, mail, telefono);
    }
    
    public static void mostrarAlumnos(){
        int i = 1;
        for(Alumno alumno : alumnos){
            System.out.print("Alumno: " + alumno.getNombreApellido() + "\nDNI: " + alumno.getDni());
            i++;
        }
    }
}
