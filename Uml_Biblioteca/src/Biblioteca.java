import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;

    public void agregar_libro(Libro libro) {
        libros.add(libro);
    }

    public Libro buscar_libro(int codigo) {
        for (Libro libro : libros) {
            if (libro.getCodigo() == codigo) {
                return libro;
            }
        }
        return null;
    }

    public void prestar_libro(int codigo) {
        Libro libro = buscar_libro(codigo);
        if (libro != null) {
            libros.remove(libro);
        }
    }

    public void modificar_libro(int codigo, String titulo, String autor) {
        Libro libro = buscar_libro(codigo);
        if (libro != null) {
            libro.setTitulo(titulo);
            libro.setAutor(autor);
        }
    }

}
