public class App {
  public static void main(String[] args) throws Exception {
    /*
     * Sistema de gestión de empleados: Se pueden crear clases abstractas como
     * "Empleado" y "Departamento" con métodos abstractos como "calcularSalario()" y
     * "calcularGastos()". Las subclases como "EmpleadoHora" y "EmpleadoAsalariado"
     * pueden implementar estos métodos abstractos de manera diferente. El
     * polimorfismo se puede utilizar para llamar a los métodos de "Empleado" y
     * "Departamento" utilizando una lista de objetos de empleados y departamentos.
     * El try-catch se puede utilizar para manejar excepciones, por ejemplo, si se
     * intenta agregar un empleado a un departamento que ya está lleno
     */

    try {
      int[] myNumbers = { 1, 2, 3 };
      System.out.println(myNumbers[2]);
    } catch (Exception e) {
      System.out.println("Cuidado, ha ocurrido un error.");
    } finally {
      System.out.println("El bloque try-catch ha finalizado.");
    }
  }
}
