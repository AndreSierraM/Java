import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void mostrarMenuPrincipal(ArrayList<Alumno> listaAlumnos) {
        Alumno alumno1 = new Alumno("Juan", 15, 123456, "Bosa", 1, "");
        Alumno alumno2 = new Alumno("Pedro", 16, 123457, "Bosa", 2, "");
        Alumno alumno3 = new Alumno("Maria", 17, 123458, "Bosa", 1, "");
        Alumno alumno4 = new Alumno("Ana", 18, 123459, "Bosa", 10, "I");

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Inscribir Alumno");
            System.out.println("2. Mostrar Datos de los alumnos de un Grado");
            System.out.println("3. Pagar Matrícula");
            System.out.println("4. Salir");

            System.out.print("\nIngrese su opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Alumno.inscribirAlumno(listaAlumnos, scanner);
                    break;

                case 2:
                    System.out.print("\nIngrese el grado que desea buscar: ");
                    int gradoBuscado = scanner.nextInt();
                    scanner.nextLine();
                    Alumno.buscarPorGrado(listaAlumnos, gradoBuscado);
                    break;

                case 3:
                    System.out.println("\nCalcular Pago");
                    Alumno.calcularPago(listaAlumnos);
                    break;

                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida, por favor intente de nuevo.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
        Scanner scanner = new Scanner(System.in);
        mostrarMenuPrincipal(listaAlumnos);
        Alumno.inscribirAlumno(listaAlumnos, scanner);
    }

}
