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
    private boolean matriculaPagada;

    public static void inscribirAlumno(ArrayList<Alumno> listaAlumnos) {
        Scanner scanner = new Scanner(System.in);
    
        if (listaAlumnos.size() >= 4) {
            System.out.println("No se pueden inscribir más alumnos. Ya se han inscrito 4.");
            return;
        }
    
        System.out.println("Ingrese el nombre del alumno:");
        String nombre = scanner.nextLine();
    
        System.out.println("Ingrese la edad del alumno:");
        int edad = scanner.nextInt();
        scanner.nextLine();
    
        System.out.println("Ingrese el número de identificación del alumno:");
        int identificacion = scanner.nextInt();
        scanner.nextLine();
    
        System.out.println("Ingrese el barrio del alumno:");
        String barrio = scanner.nextLine();
    
        System.out.println("Ingrese el grado del alumno (1-11):");
        int grado = scanner.nextInt();
        scanner.nextLine();
    
        String especialidad = "";
        if (grado >= 6 && grado <= 11) {
            System.out.println("Ingrese la especialidad del alumno (I, E, S, P):");
            especialidad = scanner.nextLine();
        }
    
        Alumno alumno;
        if (grado >= 1 && grado <= 5) {
            alumno = new Alumno(nombre, edad, identificacion, barrio, grado, "", false);
        } else if (grado >= 6 && grado <= 11) {
            alumno = new Alumno(nombre, edad, identificacion, barrio, grado, especialidad, false);
        } else {
            System.out.println("Grado inválido");
            return;
        }
    
        // Agregamos el nuevo alumno a la lista global de alumnos
        listaAlumnos.add(alumno);
    
        System.out.println("El alumno ha sido inscrito exitosamente.");
    }
    

    // Se agregan los atributos que faltan en el constructor
    public Alumno(String nombre, int edad, int identificacion, String barrio, int grado, String especialidad,
            boolean matriculaPagada) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
        this.barrio = barrio;
        this.grado = grado;
        this.especialidad = especialidad;
        this.matriculaPagada = matriculaPagada;
    }

    // Se agregan los atributos que faltan en el constructor
    public Alumno(String nombre, int edad, int identificacion, String barrio, int grado, boolean matriculaPagada) {
        this(nombre, edad, identificacion, barrio, grado, "", matriculaPagada);
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

    public boolean isMatriculaPagada() {
        return matriculaPagada;
    }

    public void setMatriculaPagada(boolean matriculaPagada) {
        this.matriculaPagada = matriculaPagada;
    }

    // imprimirAlumno
    public void imprimirAlumno() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Identificación: " + identificacion);
        System.out.println("Barrio: " + barrio);
        System.out.println("Grado: " + grado);
        if (grado >= 6 && grado <= 11) {
            System.out.println("Especialidad: " + especialidad);
        }
        System.out.println("Matricula Pagada: " + matriculaPagada);

    }

    public int calcularPago() {
        int valorMatricula = 0;
        int valorEspecialidad = 0;
        int valorDerechosGrado = 0;
        
        if (grado >= 1 && grado <= 5) {
            valorMatricula = 650000;
        } else if (grado >= 6 && grado <= 8) {
            valorMatricula = 700000;
            valorEspecialidad = calcularValorEspecialidad();
        } else if (grado >= 9 && grado <= 10) {
            valorMatricula = 720000;
            valorEspecialidad = calcularValorEspecialidad();
        } else if (grado == 11) {
            valorMatricula = 800000;
            valorEspecialidad = calcularValorEspecialidad();
            valorDerechosGrado = 580000;
        } else {
            System.out.println("Grado inválido");
            return;
        }
        
        System.out.println("Valor de la matrícula: " + valorMatricula);
        if (valorEspecialidad > 0) {
            System.out.println("Valor de la especialidad: " + valorEspecialidad);
        }
        if (valorDerechosGrado > 0) {
            System.out.println("Valor de los derechos de grado: " + valorDerechosGrado);
        }
        valorMatricula += valorEspecialidad + valorDerechosGrado;
        System.out.println("Valor total a pagar: " + valorMatricula);
    }
    
    private int calcularValorEspecialidad() {
        int valorEspecialidad = 0;
        
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
                System.out.println("Especialidad inválida");
                break;
        }
        
        return valorEspecialidad;
    }
    public static void buscarPorGrado(ArrayList<Alumno> listaAlumnos, int gradoBuscado) {
        
        boolean encontrado = false;
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getGrado() == gradoBuscado) {
                System.out.println("\nEstudiantes en el grado " + gradoBuscado + ":");

                alumno.imprimirAlumno();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron estudiantes en el grado " + gradoBuscado);
        }
    }

    public static Alumno buscarPorIdentificacion(ArrayList<Alumno> listaAlumnos, int identificacionBuscada) {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getIdentificacion() == identificacionBuscada) {
                System.out.println("\nEstudiante encontrado:");
                alumno.imprimirAlumno();
                return alumno;
            }
        }
        System.out.println("No se encontró ningún estudiante con la identificación " + identificacionBuscada);
        return null;
    }
    


    
    
}
