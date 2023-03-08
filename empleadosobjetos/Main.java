
package empleadosobjetos;

/**
 * Crear la clase que represente a un empleado. 
 * Definir como atributos su nombre y su sueldo. 
 * Confeccionar los métodos para la carga, otro para imprimir sus datos 
 * y por último uno que imprima un mensaje si debe pagar impuestos (si el sueldo supera a 3000)
 */
import java.util.Scanner;
public class Main {
    

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.cargar();
        empleado1.imprimir();
        empleado1.pagaImpuestos();
        

    }
    
}
