public class Persona {
    protected String nombre; // protected: permite que la variable sea accesible desde las clases hijas
    private String apellido; // private: permite que la variable sea accesible solo desde la clase
    private int edad; // private: permite que la variable sea accesible solo desde la clase

    // Constructor de la clase Persona (clase padre)
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
