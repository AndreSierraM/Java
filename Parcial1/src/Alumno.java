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

public void Imprimir_Grado() {
	System.out.println("Nombre: " + this.nombre);
	System.out.println("Apellido: " + this.apellido);
	System.out.println("Edad: " + this.edad);
	System.out.println("Identificacion: " + this.identificacion);
	System.out.println("Barrio: " + this.barrio);
	System.out.println("Grado: " + this.grado);
	System.out.println("Especialidad: " + this.especialidad);
}







}
