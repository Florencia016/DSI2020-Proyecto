package tp3;
import java.util.Scanner;

public class Gestor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int opcion;
        
        System.out.print("¿Que desea hacer?\n");
            System.out.print("1. Agregar un nuevo curso. \n2. Registrar persona. \n 3. Asignar docente a curso. \n 4. Inscribir alumno a curso. \n 5. Salir.");
            opcion = input.nextInt();
            
            while(opcion<1 || opcion>5){
                System.out.print("1. Agregar un nuevo curso. \n2. Registrar persona. \n 3. Asignar docente a curso. \n 4. Inscribir alumno a curso. \n 5. Salir.");
            }
            
            if(opcion ==1){
                System.out.print("\n\tAGREGAR UN NUEVO CURSO");
                RegistrarNueovCurso.registrarCursos();
            }
            if(opcion==2){
                int opcionRegistro;
                System.out.print("1. Registrar Alumno \n 2. Registrar Docente");
                opcionRegistro = input.nextInt();
                while(opcionRegistro<1 || opcionRegistro>2){
                    System.out.print("1. Registrar Alumno \n 2. Registrar Docente");
                }
                
                if(opcionRegistro ==1){
                    System.out.print("\n\tREGISTRAR ALUMNO");
                    RegistrarAlumno.nuevoAlumno();
                }
                else{
                    System.out.print("\n\tREGISTRAR DOCENTE");
                    RegistrarDocente.nuevoDocente();
                }
            }
            if(opcion==3){
                System.out.print("\n\tASIGNAR DOCENTE A UN CURSO");                
                RegistrarDocente.asignarDocente(curso);
            }
            if(opcion==4){
                System.out.print("\n\tINSCRIBIR ALUMNO A UN CURSO");
                
                System.out.print("Selecccionar alumno: ");
                RegistrarAlumno.mostrarAlumnos();
                int opcAlum = input.nextInt();
                System.out.print("Seleccionar curso: ");
                RegistrarNueovCurso.mostrarCursos();
                int opcCurs = input.nextInt();
                
                Curso curso = RegistrarNueovCurso.cursos.get(opcCurs-1);
                
            }
            if(opcion==5){
                break;
            }
    }
