# ProgramacionObjetos
# POO (modularidad, encapsulamiento, subclase, super clase)
Modularidad:  Dividir un problema en partes mas pequeñas.
Subclase : Clase que hereda de otra clase.
Super clase : Clase que hereda a otras clases.

# Encapsulamiento (public, private, protected)
Public  : Acceso desde cualquier clase.
Protected: Class, package, sub-classes.   
Private  : Class, package. 

# clase 
# objeto 
# atributos
# metodos y metodos que reciben atributo 
# metodos getter y setter 
Getter: obtener 
public string nombrearbitro(){
return nombrearbitro;
}
Setter: modificar
public void nombremetodo(){
    atributo = valordelatributo;
}

# this
# diagrama de clases 
# herencia








# Programa para hacer los diagramas  
https://app.diagrams.net/?src=about



+----------------+           +---------------+
|    <<class>>   |           |   <<class>>  |
|     Alumno     |           |     Scanner   |
+----------------+           +---------------+
| - nombre: String|           |               |
| - edad: int     |           |               |
| - identificacion: int|      +---------------+
| - barrio: String|           |    <<field>> |
| - grado: int    |           |listaAlumnos: ArrayList<Alumno>|
| - especialidad: String|    |               |
+----------------+           +---------------+
| + Alumno(nombre: String,   | + inscribirAlumno(listaAlumnos: ArrayList<Alumno>, scanner: Scanner): void|
| edad: int, identificacion: int, barrio: String, grado: int, especialidad: String)|
| + Alumno(nombre: String,   | + calcularPago(listaAlumnos: ArrayList<Alumno>): void|
| edad: int, identificacion: int, barrio: String, grado: int)|
| + getNombre(): String     | + getNombre(): String|
| + setNombre(nombre: String): void | + setNombre(nombre: String): void|
| + getEdad(): int          | + getEdad(): int|
| + setEdad(edad: int): void| + setEdad(edad: int): void|
| + getIdentificacion(): int| + getIdentificacion(): int|
| + setIdentificacion(identificacion: int): void| + setIdentificacion(identificacion: int): void|
| + getBarrio(): String     | + getBarrio(): String|
| + setBarrio(barrio: String): void| + setBarrio(barrio: String): void|
| + getGrado(): int         | + getGrado(): int|
| + setGrado(grado: int): void| + setGrado(grado: int): void|
| + getEspecialidad(): String|+ getEspecialidad(): String|
| + setEspecialidad(especialidad: String): void|+ setEspecialidad(especialidad: String): void|
| + imprimirAlumno(): void  |               |
+----------------+           +---------------+



