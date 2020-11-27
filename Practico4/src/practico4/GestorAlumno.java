package practico4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorAlumno implements Serializable {

    public ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

    public int buscarCursante(int dni) {
        int pos = -1;
        int i = 0;
        for (Alumno alumno : alumnos) {
            if (dni == alumno.getDni()) {
                pos = i;
            }
            i++;
        }
        return pos;
    }

    public int registrarCursante() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = input.nextLine();
        System.out.print("DNI: ");
        int dni = input.nextInt();
        System.out.print("Email: ");
        input.nextLine();
        String email = input.nextLine();
        System.out.print("Telefono: ");
        String telefono = input.nextLine();
        Alumno alumno = new Alumno(nombre, dni, email, telefono);
        alumnos.add(alumno);
        return dni;
    }
}
