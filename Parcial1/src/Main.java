import java.util.Scanner;
import java.util.ArrayList;



public class Main {
    public static void mostrarMenuPrincipal(ArrayList<Alumno> listaAlumnos) {
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
                    Alumno.inscribirAlumno(listaAlumnos);
                    break;
                case 2:
                    System.out.print("\nIngrese el grado que desea buscar: ");
                    int gradoBuscado = scanner.nextInt();
                    scanner.nextLine();
                    Alumno.buscarPorGrado(listaAlumnos, gradoBuscado);
                    break;
                case 3:
                System.out.println("\nCalcular Pago");
                System.out.print("\nIngrese la de identificación del alumno al que le desea calcular el pago: ");
                int identificacionBuscada = scanner.nextInt();
                scanner.nextLine();
             
                if (alumnoBuscado != null) {
                    System.out.println("El pago es de: " + alumnoBuscado.calcularPago());
                }
                



                    
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
        mostrarMenuPrincipal(listaAlumnos);

    }

}
       


