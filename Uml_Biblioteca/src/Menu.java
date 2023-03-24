
public class Menu {
    public static void main(String[] args) throws Exception {

        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry", 1);
        Libro libro2 = new Libro("El señor de los anillos", "J.R.R. Tolkien", 2);

        biblioteca.agregar_libro(libro1);
        biblioteca.agregar_libro(libro2);

        Usuario usuario1 = new Usuario("Juan", "1234");
        Usuario usuario2 = new Usuario("Pedro", "1234");

        usuario1.users_registrados.add(usuario1);
        usuario1.users_registrados.add(usuario2);

        System.out.println(usuario1.verificar("Juan", "1234"));
        System.out.println(usuario2.verificar("Juan", "1234"));

    }
}
