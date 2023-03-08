package empleadosobjetos;
/**
 * Crear la clase que represente a un empleado. 
 * Definir como atributos su nombre y su sueldo. 
 * Confeccionar los métodos para la carga, otro para imprimir sus datos 
 * y por último uno que imprima un mensaje si debe pagar impuestos (si el sueldo supera a 3000)
 */

 import java.util.Scanner;
public class Empleado {
    private String nombre;
    private double sueldo;
    
    void cargar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        nombre = sc.next();
        System.out.print("Ingrese sueldo: ");
        sueldo = sc.nextDouble();
    }
    void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo: " + sueldo);
    }
    void pagaImpuestos (){
        if (sueldo > 3000){
            System.out.println("Debe pagar impuestos");
        }else{
            System.out.println("No debe pagar impuestos");
        }

    }


    
    
    
}
