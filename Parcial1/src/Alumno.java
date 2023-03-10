import java.util.Scanner;
import java.util.ArrayList;

public class Alumno {

    public static ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>(); 

    private String nombre;
    private int edad;
    private int identificacion;
    private String barrio;
    private int grado;
    private String especialidad;

    public static void inscribirAlumno(ArrayList<Alumno> listaAlumnos, Scanner scanner) {
        // Verificamos que no se hayan inscrito más de 4 alumnos
        if (listaAlumnos.size() >= 4) {
            System.out.println("No se pueden inscribir más alumnos. Ya se han inscrito 4.");
            return;
        } else {
            System.out.println("Se pueden inscribir " + (4 - listaAlumnos.size()) + " alumnos más.");
        }
    
        System.out.print("Ingrese el nombre del alumno:");
        String nombre = scanner.nextLine();
    
        System.out.println("Ingrese la edad del alumno:");
        int edad = scanner.nextInt();
        scanner.nextLine();
    
        System.out.print("Ingrese el número de identificación del alumno:");
        int identificacion = scanner.nextInt();
        scanner.nextLine();
    
        if (identificacion < 0) {
            System.out.println("El número de identificación no puede ser negativo.");
            return;
        }
    
        System.out.print("Ingrese el barrio del alumno:");
        String barrio = scanner.nextLine();
    
        System.out.print("Ingrese el grado del alumno (1-11):");
        int grado = scanner.nextInt();
        scanner.nextLine();
    
        if (grado < 1 || grado > 11) {
            System.out.println("El grado ingresado es inválido. Debe ser un número entre 1 y 11.");
            return;
        }
    
        String especialidad = "";
        if (grado >= 6 && grado <= 11) {
            System.out.print("Ingrese la especialidad del alumno (I, E, S, P):");
            especialidad = scanner.nextLine();
            especialidad = especialidad.toUpperCase();
        }
    
        // Creamos el objeto Alumno donde se almacenará la información del alumno
        Alumno alumno;
        if (especialidad.equals("")) {
            alumno = new Alumno(nombre, edad, identificacion, barrio, grado);
        } else {
            alumno = new Alumno(nombre, edad, identificacion, barrio, grado, especialidad);
        }
    
        // Agregamos el objeto Alumno a la lista de alumnos
        listaAlumnos.add(alumno);
    
        System.out.println("El alumno ha sido inscrito exitosamente.");
    }
    

    public Alumno(String nombre, int edad, int identificacion, String barrio, int grado, String especialidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
        this.barrio = barrio;
        this.grado = grado;
        this.especialidad = especialidad;
    }

    public Alumno(String nombre, int edad, int identificacion, String barrio, int grado) {
        this(nombre, edad, identificacion, barrio, grado, "");
    }

    // Getters y setters para los atributos de la clase Alumno

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

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
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

    public void imprimirAlumno() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Identificación: " + identificacion);
        System.out.println("Barrio: " + barrio);
        System.out.println("Grado: " + grado);
        if (grado >= 6 && grado <= 11) {
            System.out.println("Especialidad: " + especialidad);
        }

    }

    public static void calcularPago(ArrayList<Alumno> listaAlumnos) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de identificación del alumno:");
        int identificacion = scanner.nextInt();
        scanner.nextLine();

        // Buscar el alumno en la lista de alumnos
        Alumno alumnoEncontrado = null;
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getIdentificacion() == identificacion) {
                alumnoEncontrado = alumno;
                break;
            }
        }

        // Si el alumno no se encuentra en la lista, se muestra un mensaje de error
        if (alumnoEncontrado == null) {
            System.out.println("El alumno no se encuentra inscrito.");
            return;
        }

        // Si el alumno se encuentra en la lista, se calcula el valor de la matrícula

        if (alumnoEncontrado != null) {
            double valorMatricula = 0;
            double valorEspecialidad = 0;
            double valorDerechosGrado = 0;
            int grado = alumnoEncontrado.getGrado();
            String especialidad = alumnoEncontrado.getEspecialidad();

            // Calcular valor de matrícula
            if (grado >= 1 && grado <= 5) {
                valorMatricula = 650000;
            } else if (grado >= 6 && grado <= 8) {
                valorMatricula = 700000;
            } else if (grado >= 9 && grado <= 10) {
                valorMatricula = 720000;
            } else if (grado == 11) {
                valorMatricula = 800000;
            }

            // Calcular valor de especialidad
            switch (especialidad) {
                case "I":
                    valorEspecialidad = 500000;
                    break;
                case "E":
                    valorEspecialidad = 350000;
                    break;
                case "S":
                    valorEspecialidad = 520000;
                    break;
                case "P":
                    valorEspecialidad = 400000;
                    break;
                default:
                    System.out.println("Este alumno no tiene especialida");
                    break;
            }

            // Calcular valor de derechos de grado
            if (grado == 11) {
                valorDerechosGrado = 580000;
            }

            // Imprimir resultados

            System.out.println("El Estudiante: " + alumnoEncontrado.getNombre() + " con identificación: "
                    + alumnoEncontrado.getIdentificacion() + " debe pagar: ");
            if (grado >= 1 && grado <= 5) {
                System.out.println("Valor de matrícula: " + valorMatricula);
            } else if (grado >= 6 && grado <= 10) {
                System.out.println("Valor de matrícula: " + valorMatricula);
                System.out.println("Valor de especialidad: " + valorEspecialidad);
            } else if (grado == 11) {
                System.out.println("Valor de matrícula: " + valorMatricula);
                System.out.println("Valor de especialidad: " + valorEspecialidad);
                System.out.println("Valor de derechos de grado: " + valorDerechosGrado);
            }
        }
    }

    public static void buscarPorGrado(ArrayList<Alumno> listaAlumnos, int gradoBuscado) {
        // Buscar los alumnos en la lista de alumnos
        ArrayList<Alumno> alumnosEncontrados = new ArrayList<>(); // Lista de alumnos encontrados
        for (Alumno alumno : listaAlumnos) { // Recorrer la lista de alumnos
            if (alumno.getGrado() == gradoBuscado) { // Si el grado del alumno es igual al grado buscado
                alumnosEncontrados.add(alumno); // Se agrega el alumno a la lista de alumnos encontrados
            }
        }

        // Si no se encuentran alumnos, se muestra un mensaje de error
        if (alumnosEncontrados.size() == 0) { // Si la lista de alumnos encontrados está vacía
            System.out.println("No se encontraron alumnos en el grado " + gradoBuscado); // Se muestra un mensaje de
                                                                                         // error
            return;
        }

        // Si se encuentran alumnos, se muestran los datos de los alumnos
        for (Alumno alumno : alumnosEncontrados) {
            System.out.println("\n Datos del alumno:");
            System.out.println("\n------------------------\n");
            alumno.imprimirAlumno();
            System.out.println("\n------------------------\n");
        }

    }


    public static void mostrarAlumnos(ArrayList<Alumno> listaAlumnos2) {
    }

}