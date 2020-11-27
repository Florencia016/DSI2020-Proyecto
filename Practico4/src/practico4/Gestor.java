package practico4;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Gestor {

    public static void main(String[] ar) {
        GestorAlumno gestorAlumno = new GestorAlumno();
        gestorAlumno = cargarDatosAlumnos();

        GestorDocente gestorDocente = new GestorDocente();
        gestorDocente = cargarDatosDocentes();

        GestorCurso gestorCurso = new GestorCurso();
        gestorCurso = cargarDatosCursos();

        Scanner input = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\tMENÚ:");
            System.out.println("1- Cargar nuevo curso.");
            System.out.println("2- Asignar/remover docente de curso.");
            System.out.println("3- Planificar dictado de curso.");
            System.out.println("4- Registrar inscripción.");
            System.out.println("5- Verificar cupo de inscriptos a curso.");
            System.out.println("6- Conformar/cancelar cursos.");
            System.out.println("7- Salir.");
            System.out.print("Opción: ");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    gestorCurso.agregarCurso(gestorDocente);
                    break;
                case 2:
                    asignarRemoverDocente(gestorCurso, gestorDocente);
                    break;
                case 3:
                    planificarCurso(gestorCurso, gestorDocente);
                    break;
                case 4:
                    registrarSolicitud(gestorAlumno, gestorCurso);
                    break;
                case 5:
                    verificarCupoDeCurso(gestorCurso);
                    break;
                case 6:
                    confirmarCancelarCurso(gestorCurso);
                    break;
            }
            System.out.println();
        } while (opcion != 7);

        guardarDatosAlumnos(gestorAlumno);
        guardarDatosCursos(gestorCurso);
        guardarDatosDocentes(gestorDocente);
    }

    public static GestorAlumno cargarDatosAlumnos() {
        GestorAlumno alumno = null;

        ObjectInputStream lectorDeObjetos;
        try {
            lectorDeObjetos = new ObjectInputStream(new FileInputStream("Cursantes.json"));
            alumno = (GestorAlumno) lectorDeObjetos.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return alumno;
    }

    public static void guardarDatosAlumnos(GestorAlumno gestorAlumno) {
        try {
            ObjectOutputStream escritorDeObjetos = new ObjectOutputStream(new FileOutputStream("Cursantes.json"));
            escritorDeObjetos.writeObject(gestorAlumno);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static GestorCurso cargarDatosCursos() {
        GestorCurso cursos = null;

        ObjectInputStream lectorDeObjetos;
        try {
            lectorDeObjetos = new ObjectInputStream(new FileInputStream("Cursos.json"));
            cursos = (GestorCurso) lectorDeObjetos.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return cursos;
    }

    public static void guardarDatosCursos(GestorCurso gestorCursos) {
        try {
            ObjectOutputStream escritorDeObjetos = new ObjectOutputStream(new FileOutputStream("Cursos.json"));
            escritorDeObjetos.writeObject(gestorCursos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static GestorDocente cargarDatosDocentes() {
        GestorDocente docentes = null;

        ObjectInputStream lectorDeObjetos;
        try {
            lectorDeObjetos = new ObjectInputStream(new FileInputStream("Docentes.json"));
            docentes = (GestorDocente) lectorDeObjetos.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return docentes;
    }

    public static void guardarDatosDocentes(GestorDocente gestorDocente) {
        try {
            ObjectOutputStream escritorDeObjetos = new ObjectOutputStream(new FileOutputStream("Docentes.json"));
            escritorDeObjetos.writeObject(gestorDocente);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void asignarRemoverDocente(GestorCurso gestorCurso, GestorDocente gestorDocente) {
        Scanner input = new Scanner(System.in);
        System.out.println("CURSOS:");
        gestorCurso.mostrarCursos();
        System.out.print("Opción: ");
        int opcionCurso = input.nextInt();
        Curso curso = gestorCurso.cursos.get(opcionCurso - 1);
        System.out.print("1- Asignar docente.\n2- Remover docente.\nOpción: ");
        int opcion = input.nextInt();
        if (opcion == 1) {
            Docente docente = gestorDocente.retornarDocente();
            curso.agregarDocente(docente);
        } else {
            curso.mostrarDocentes();
            System.out.print("Número de docente: ");
            int opcionDocente = input.nextInt();
            curso.removerDocente(opcionDocente - 1);
        }
    }

    public static void planificarCurso(GestorCurso gestorCurso, GestorDocente gestorDocente) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Planificar curso:");
        gestorCurso.mostrarCursos();
        System.out.print("Opción: ");
        int opcionCurso = input.nextInt();
        Curso curso = gestorCurso.cursos.get(opcionCurso - 1);
        System.out.println("CURSO: " + curso.getNombre());
        if (curso.cantidadDocentes() == 0) {
            Docente docente = gestorDocente.retornarDocente();
            curso.agregarDocente(docente);
        } else {
            System.out.println("- Docente/s: ");
            curso.mostrarDocentes();
        }
        System.out.print("- Fechas de dictado: ");
        input.nextLine();
        String fechas = input.nextLine();
        curso.setFechaInicio(fechas);
        System.out.print("- Horario de dictado: ");
        String horario = input.nextLine();
        curso.setHorario(horario);
        System.out.print("- Aula: ");
        String aula = input.nextLine();
        curso.setAula(aula);
        System.out.print("- Cupo mínimo: ");
        int cupoMinimo = input.nextInt();
        curso.setCupoMin(cupoMinimo);
        System.out.print("- Cupo máximo: ");
        int cupoMaximo = input.nextInt();
        curso.setCupoMax(cupoMaximo);
        Calendar fechaLimiteInscripcion = ingresarFecha();
        curso.setFechaLimite(fechaLimiteInscripcion);
        curso.setCursoPlanificado(true);
    }

    public static Calendar ingresarFecha() {
        Scanner input = new Scanner(System.in);
        Calendar fecha = new GregorianCalendar();
        String fechaS;
        int control;
        do {
            System.out.print("Ingresar fecha límite de inscripción [dd/mm/aaaa]: ");
            fechaS = input.next();
            if (fechaS.length() == 10) {
                control = 1;
            } else {
                System.out.println("Ingrese correctamente la fecha.");
                control = 0;
            }
        } while (control != 1);

        int dia = Integer.parseInt(fechaS.substring(0, 2));
        int mes = Integer.parseInt(fechaS.substring(3, 5)) - 1;
        int año = Integer.parseInt(fechaS.substring(6, 10));

        fecha.set(Calendar.DATE, dia);
        fecha.set(Calendar.MONTH, mes);
        fecha.set(Calendar.YEAR, año);

        return fecha;
    }

    public static void registrarSolicitud(GestorAlumno gestorAlumno, GestorCurso gestorCurso) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cursos:");
        gestorCurso.mostrarCursos();
        System.out.print("Opción: ");
        int opcionCurso = input.nextInt();
        Curso curso = gestorCurso.cursos.get(opcionCurso - 1);
        if (curso.getCursoPlanificado() == false) {
            System.out.println("El curso todavía no fue planificado.");
        } else {
            if (curso.verificarCapacidad()) {
                System.out.print("¿La persona está registrada?[S/N]: ");
                char opcionPersonaRegistrada = input.next().charAt(0);
                int dni;
                if (opcionPersonaRegistrada == 'S') {
                    System.out.print("DNI de la persona: ");
                    dni = input.nextInt();
                } else {
                    dni = gestorAlumno.registrarCursante();
                }
                int posCursante = gestorAlumno.buscarCursante(dni);
                Alumno alumno = gestorAlumno.alumnos.get(posCursante);
                curso.agregarCursante(alumno);
                System.out.println("La persona " + alumno.getNombre() + " fue añadida al curso \"" + curso.getNombre() + "\" exitosamente.");
            } else {
                System.out.println("El curso ya no tiene cupos vacantes.");
            }
        }
    }

    public static void verificarCupoDeCurso(GestorCurso gestorCurso) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cursos:");
        gestorCurso.mostrarCursos();
        System.out.print("Opción: ");
        int opcionCurso = input.nextInt();
        Curso curso = gestorCurso.cursos.get(opcionCurso - 1);
        if (curso.getCursoPlanificado() == false) {
            System.out.println("El curso todavía no fue planificado.");
        } else {
            if (curso.verificarCupo()) {
                System.out.println("El curso ya alcanzó el cupo mínimo.");
            } else {
                System.out.println("El curso todavía no alcanzó el cupo mínimo.");
            }
        }
    }

    public static void confirmarCancelarCurso(GestorCurso gestorCurso) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cursos:");
        gestorCurso.mostrarCursos();
        System.out.print("Opción: ");
        int opcionCurso = input.nextInt();
        Curso curso = gestorCurso.cursos.get(opcionCurso - 1);
        if (curso.getCursoPlanificado() == false) {
            System.out.println("El curso todavía no fue planificado.");
        } else {
            System.out.println("1- Confirmar curso.");
            System.out.println("2- Cancelar curso.");
            System.out.print("Opción: ");
            int opcionConfirmarCancelar = input.nextInt();
            boolean opcion;
            if (opcionConfirmarCancelar == 1) {
                opcion = true;
                System.out.println("El curso " + curso.getNombre() + " fue confirmado con éxito.");
            } else {
                opcion = false;
                System.out.println("El curso " + curso.getNombre() + " fue cancelado con éxito.");
            }
            curso.confirmarCancelarCurso(opcion);
        }
    }
}
