import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    public static void mostrarMenuPrincipal(ArrayList<Alumno> listaAlumnos, Scanner scanner) {
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Inscribir Alumno");
            System.out.println("2. Mostrar Datos de los alumnos de un Grado");
            System.out.println("3. Pagar Matrícula");
            System.out.println("4. Salir");

            System.out.print("\nIngrese su opción: ");
            
            // Validar entrada del usuario
            if (!scanner.hasNextInt()) {
                System.out.println("Opción inválida, por favor intente de nuevo.");
                scanner.nextLine();
                continue;
            }
            
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                Alumno.inscribirAlumno(listaAlumnos, scanner);
                System.out.println("Alumno inscrito con éxito.");
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
                    System.out.println("Pago de matrícula realizado con éxito.");
                    break;

                case 4:
                    salir = true;
                    break;
                case 5:
                    Alumno.mostrarAlumnos(listaAlumnos);
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
        mostrarMenuPrincipal(listaAlumnos, scanner);
    }

}
