import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Usuario> users_registrados = new ArrayList<Usuario>();
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);

        Usuario usuario1 = new Usuario("admin", "admin");
        Usuario usuario2 = new Usuario("user2", "contraseña2");
        users_registrados.add(usuario1);
        users_registrados.add(usuario2);
        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry", 1);
        Libro libro2 = new Libro("El señor de los anillos", "J.R.R. Tolkien", 2);
        biblioteca.agregar_libro(libro1);
        biblioteca.agregar_libro(libro2);


        while (true) {
            menu(sc, users_registrados, biblioteca, usuario2);
        }
    }

    public static void menu(Scanner sc, ArrayList<Usuario> users_registrados, Biblioteca biblioteca, Usuario usuario) {
        System.out.println("1. Ingresar al sistema");
        System.out.println("2. Crear usuario");
        System.out.println("0. Salir");
        System.out.print("Ingrese una opción: ");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("Ingrese su usuario: ");
                String user = sc.next();
                System.out.println("Ingrese su contraseña: ");
                String contraseña = sc.next();

                boolean usuarioEncontrado = false;
                for (Usuario u : users_registrados) {
                    if (u.getUser().equals(user) && u.getContraseña().equals(contraseña)) {
                        usuarioEncontrado = true;
                        System.out.println("Bienvenido");
                        System.out.println("1. Agregar libro");
                        System.out.println("2. Buscar libro");
                        System.out.println("3. Prestar libro");
                        System.out.println("4. Modificar libro");
                        System.out.println("5. Salir");
                        System.out.println("Ingrese una opción: ");
                        int op2 = sc.nextInt();
                        switch (op2) {
                            case 1:
                                System.out.println("Ingrese el titulo del libro: ");
                                String titulo = sc.next();
                                System.out.println("Ingrese el autor del libro: ");
                                String autor = sc.next();
                                System.out.println("Ingrese el codigo del libro: ");
                                int codigo = sc.nextInt();
                                Libro libro = new Libro(titulo, autor, codigo);
                                biblioteca.agregar_libro(libro);
                                break;
                            case 2:
                                System.out.println("Ingrese el codigo del libro: ");
                                int codigo2 = sc.nextInt();
                                Libro libro2 = biblioteca.buscar_libro(codigo2);
                                if (libro2 != null) {
                                    System.out.println("El libro se encuentra en la biblioteca");
                                } else {
                                    System.out.println("El libro no se encuentra en la biblioteca");
                                }
                                break;
                            case 3:
                                System.out.println("Ingrese el codigo del libro: ");
                                int codigo3 = sc.nextInt();
                                biblioteca.prestar_libro(codigo3);
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo del libro: ");
                                int codigo4 = sc.nextInt();
                                System.out.println("Ingrese el nuevo titulo del libro: ");
                                String titulo2 = sc.next();
                                System.out.println("Ingrese el nuevo autor del libro: ");
                                String autor2 = sc.next();
                                biblioteca.modificar_libro(codigo4, titulo2, autor2);
                                break;
                            case 5:
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Opción no válida");
                                break;
                        }
                        break;
                    }
                }
                if (!usuarioEncontrado) {
                    System.out.println("Usuario no encontrado");
                }
                break;
            case 2:
                System.out.println("Ingrese su usuario: ");
                String nuevoUsuario = sc.next();
                System.out.println("Ingrese su contraseña: ");
                String nuevaContraseña = sc.next();
                Usuario usuarioNuevo = new Usuario(nuevoUsuario, nuevaContraseña);
                System.out.println("Usuario registrado con éxito");
                break;
            case 3:

                System.exit(0);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}
