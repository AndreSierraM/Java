
public class Estudiante extends Persona { // Herencia de la clase Persona (extends)
    private int codigoEstudiante; // Atributo propio de la clase Estudiante
    private float notaFinal; // Atributo propio de la clase Estudiante

    // Constructor de la clase Estudiante
    Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
        super(nombre, apellido, edad); // Llamada al constructor de la clase padre
        this.codigoEstudiante = codigoEstudiante; // Inicializacion de atributos propios de la clase Estudiante
        this.notaFinal = notaFinal; // Inicializacion de atributos propios de la clase Estudiante
    }

    // Metodo propio de la clase Estudiante
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Codigo de estudiante: " + codigoEstudiante);
        System.out.println("Nota final: " + notaFinal);
    }

}
