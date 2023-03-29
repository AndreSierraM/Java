import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Usuario usuario = null;

        Scanner scanner = new Scanner(System.in);

        boolean seguirEnMenu = true;
        while (seguirEnMenu) {
            if (usuario == null) { // si el usuario no ha ingresado aún
                System.out.println("----- Ingresar Usuario -----");
                System.out.println("1. Ingresar");
                System.out.println("2. Registrarse");
                int opcionIngreso = scanner.nextInt();
                scanner.nextLine();
                switch (opcionIngreso) {
                    case 1:
                        System.out.println("Ingrese el usuario:");
                        String user = scanner.nextLine();
                        System.out.println("Ingrese la contraseña:");
                        String contraseña = scanner.nextLine();
                        usuario = new Usuario("", ""); // se crea una instancia vacía de Usuario
                        usuario.verificar(user, contraseña); // se llama al método en la instancia creada
                        if (usuario != null) {
                            System.out.println("Ingreso exitoso.");
                        } else {
                            System.out.println("Usuario y/o contraseña incorrectos.");
                        }
                        break;
                    case 2:
                        System.out.println("Ingrese el usuario:");
                        String userRegistro = scanner.nextLine();
                        System.out.println("Ingrese la contraseña:");
                        String contraseñaRegistro = scanner.nextLine();
                        Usuario.ingresar_nuevo(userRegistro, contraseñaRegistro);
                        System.out.println("Usuario registrado exitosamente. Por favor ingrese con su nueva cuenta.");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor ingrese un número del 1 al 2.");
                        break;
                }
            } else { // si el usuario ya ha ingresado
                System.out.println("----- Menú Principal -----");
                System.out.println("1. Buscar libro");
                System.out.println("2. Añadir libro");
                System.out.println("3. Prestar libro");
                System.out.println("4. Modificar libro");
                System.out.println("5. Salir");

                int opcion = scanner.nextInt();
                scanner.nextLine(); // consumir el salto de línea después del número

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el código del libro a buscar:");
                        int codigo = scanner.nextInt();
                        scanner.nextLine(); // consumir el salto de línea después del número
                        Libro libroBuscado = biblioteca.buscar_libro(codigo);
                        if (libroBuscado != null) {
                            System.out.println("Libro encontrado: " + libroBuscado.getTitulo());
                        } else {
                            System.out.println("Libro no encontrado.");
                        }
                        break;

                    case 2:
                        System.out.println("Ingrese el título del libro:");
                        String titulo = scanner.nextLine();
                        System.out.println("Ingrese el autor del libro:");
                        String autor = scanner.nextLine();
                        System.out.println("Ingrese el código del libro:");
                        int codigoNuevo = scanner.nextInt();
                        scanner.nextLine();
                        Libro libroNuevo = new Libro(titulo, autor, codigoNuevo);
                        biblioteca.añadir_libro(libroNuevo);
                        System.out.println("Libro añadido exitosamente.");

                        break;

                    case 3:
                        System.out.println("Ingrese el código del libro a prestar:");
                        int codigoPrestar = scanner.nextInt();
                        scanner.nextLine();
                        Libro libroPrestar = biblioteca.buscar_libro(codigoPrestar);
                        // imprimir el libro si se encontró
                        if (libroPrestar != null) {
                            biblioteca.prestar_libro(libroPrestar); // se pasa el objeto libroPrestar como parámetro
                        } else {
                            System.out.println("Libro no encontrado.");
                        }
                        break;

                    case 4:
                        System.out.print("Ingrese el código del libro a modificar: ");
                        int codigoModificar = scanner.nextInt();
                        scanner.nextLine();
                        Libro libroModificar = biblioteca.buscar_libro(codigoModificar);
                        if (libroModificar != null) {
                            System.out.print("Ingrese el nuevo título: ");
                            String nuevoTitulo = scanner.nextLine();
                            System.out.print("Ingrese el nuevo autor: ");
                            String nuevoAutor = scanner.nextLine();
                            System.out.print("Ingrese el nuevo código: ");
                            int nuevoCodigo = scanner.nextInt();
                            scanner.nextLine(); // consumir el salto
                            biblioteca.modificar_libro(libroModificar, nuevoTitulo, nuevoAutor, nuevoCodigo);
                            System.out.println("Libro modificado exitosamente.");
                        } else {
                            System.out.println("Libro no encontrado.");
                        }
                        break;

                    case 5:
                        seguirEnMenu = false;
                        break;

                    default:
                        System.out.println("Opción inválida. Por favor ingrese un número del 1 al 5.");
                        break;
                }
            }
        }
    }
}
