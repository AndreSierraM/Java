import java.util.Scanner;
public class Alumno {
    //  creamo los atributos de la clase alumno
    public String nombre;
    public String apellido;
    public int edad;
    public String identificacion;
    public String barrio;
    public String grado;


    // creamos los metodos get y set de la clase alumno
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

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

  // creamos el constructor de la clase alumno cuando el alumno tiene una especialidad
    public Alumno(String nombre, String apellido, int edad, String identificacion, String barrio, String grado, String especialidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.identificacion = identificacion;
        this.barrio = barrio;
        this.grado = grado;
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String especialidad;

    // creamos el constructor de la clase alumno cuando el alumno no tiene una especialidad
    public Alumno(String nombre, String apellido, int edad, String identificacion, String barrio, String grado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.identificacion = identificacion;
        this.barrio = barrio;
        this.grado = grado;
    }




// creamos el metodo imprimir para imprimir los datos del estudiante

    public void Imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Identificacion: " + identificacion);
        System.out.println("Barrio: " + barrio);
        System.out.println("Grado: " + grado);
        System.out.println("Especialidad: " + especialidad);
    }

    // creamos el metodo imprimir_grado para imprimir los datos de los estudiantes de un grado
    public static void Imprimir_Grado() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el grado que desea consultar");
        String grado = sc.next();
        if (grado.equals("1") || grado.equals("2") || grado.equals("3") || grado.equals("4") || grado.equals("5")) {
            System.out.println("Los estudiantes del grado " + grado + " son: ");
            for (int i = 0; i < Main.alumnos.size(); i++) {
                if (Main.alumnos.get(i).getGrado().equals(grado)) {
                    Main.alumnos.get(i).Imprimir();
                }
            }
        } else {
            System.out.println("El grado ingresado no es valido");
        }
    }








}
