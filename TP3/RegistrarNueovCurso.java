package tp3;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistrarNueovCurso {
    public static ArrayList<Curso> cursos = new ArrayList();
    
    public static void registrarCursos(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nombre del curso: ");
        String nombre = input.nextLine();
        System.out.print("Descripción: ");
        String descripcion = input.nextLine();
        System.out.print("Fecha del inicio: ");
        String fechaInicio = input.nextLine();
        System.out.print("Fecha de finalización: ");
        String fechaFin = input.nextLine();
        System.out.print("Aula: ");
        String aula = input.nextLine();
        System.out.print("Horario: ");
        String horario = input.nextLine();
        System.out.print("Cupo Máximo: ");
        int cupoMax = input.nextInt();
        System.out.print("Cupo Mínimo: ");
        int cupoMin = input.nextInt();
        
        Curso curso = new Curso(nombre, descripcion, horario, fechaInicio, fechaFin, aula, horario, cupoMax, cupoMin);
        System.out.print("Seleccionar docente: ");
        RegistrarDocente.asignarDocente(curso);
    }
    
    public static void mostrarCursos(){
        int i = 1;
        for(Curso curso : cursos){
            System.out.print("Nombre: " + curso.getNombre() + "\nDescripción: " + curso.getDescripcion());
            i++;
        }
    }
}
