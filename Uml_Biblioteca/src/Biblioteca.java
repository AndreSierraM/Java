import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void modificar_libro(Libro libro, String titulo, String autor, int codigo) {
        libro.setTitulo(titulo);
        libro.setAutor(autor);
        libro.setCodigo(codigo);
    }

    public Libro buscar_libro(int codigo) {
        // buscamos el libro con el código dado e indicamos que lo encontremos
        for (Libro libro : libros) {
            if (libro.getCodigo() == codigo) {
                return libro;
            }
        }

        return null;
    }

    public void añadir_libro(Libro libro) {
        libros.add(libro);

    }

    public void prestar_libro(Libro libroPrestar) {
        if (libros.contains(libroPrestar)) {
            System.out.println("Libro prestado: " + libroPrestar.getTitulo());
            libros.remove(libroPrestar);
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

}