import java.util.Scanner;

public class Alumno {
    private String nombre;
    private int edad;
    private String identificacion;
    private String barrio;
    private int grado;
    private String especialidad;

    public Alumno(String nombre, int edad, String identificacion, String barrio, int grado) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
        this.barrio = barrio;
        this.grado = grado;
    }

    public Alumno(String nombre, int edad, String identificacion, String barrio, int grado, String especialidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
        this.barrio = barrio;
        this.grado = grado;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        Alumno[] alumnos = new Alumno[4];
        int cantidadAlumnos = 0;

        do {
            System.out.println("MENU");
            System.out.println("1. Inscribir Alumno");
            System.out.println("2. Mostrar Datos de los alumnos de un Grado");
            System.out.println("3. Pagar Matrícula");
            System.out.println("4. Salir");

            opcion = scanner.nextInt();

            switch(opcion) {
                case 1:
                    if (cantidadAlumnos == 4) {
                        System.out.println("No se pueden inscribir más alumnos");
                        break;
                    }

                    System.out.println("Ingrese el nombre del alumno:");

