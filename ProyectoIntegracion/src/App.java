/*
    * Una empresa quiere calcular los salarios de sus empleados y los gastos de
    * cada uno de sus departamentos. El sistema de la empresa cuenta con una clase
    * Empleado que tiene dos subclases: EmpleadoAsalariado y EmpleadoHora. La clase
    * Departamento tiene una lista de empleados y un método para calcular el gasto
    * total del departamento.
    *
    * El problema es que el departamento tiene un límite de cantidad de empleados
    * que puede tener. Si se intenta agregar más empleados de lo permitido, se debe
    * lanzar una excepción DepartamentoLlenoException. Además, el salario de los
    * empleados puede cambiar con el tiempo, por lo que se deben actualizar los
    * cálculos correspondientes cuando esto sucede.
    */

import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    Departamento departamento = new Departamento("Departamento de TI", 5);
    int op = 9;

    while (op != 0) {
      System.out.println("Recursos humanos EL COMPAS");
      System.out.println("1. Agregar empleado");
      System.out.println("2. Calcular gastos del departamento");
      System.out.println("3. Mostrar información de los empleados");
      System.out.println("0. Salir");
      System.out.print("Ingrese el número de la opción que desea: ");
      op = sc.nextInt();
      sc.nextLine();

      switch (op) {
        case 1:
          agregarEmpleado(departamento);
          break;
        case 2:
          calcularGastos(departamento);
          break;
        case 3:
          mostrarEmpleados(departamento);
          break;
        case 0:
          System.out.println("Cerrando programa...");
          break;
        default:
          System.out.println("Opción herrada");
      }

    }

  }

  private static void agregarEmpleado(Departamento departamento) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el nombre del empleado: ");
    String nombre = sc.nextLine();
    System.out.println("Ingrese el salario del empleado: ");
    double salario = sc.nextDouble();
    System.out.println("Ingrese el tipo de empleado: ");
    System.out.println("1. Empleado asalariado");
    System.out.println("2. Empleado por hora");
    int tipo = sc.nextInt();
    sc.nextLine();

    if (tipo == 1) {
      EmpleadoAsalariado empleado = new EmpleadoAsalariado(nombre, salario);
      try {
        departamento.agregarEmpleado(empleado);
      } catch (DepartamentoLlenoException e) {
        System.out.println(e.getMessage());
      }
    } else if (tipo == 2) {
      System.out.println("Ingrese las horas trabajadas:");
      int horasTrabajadas = sc.nextInt();
      sc.nextLine();
      EmpleadoHora empleado = new EmpleadoHora(nombre, salario, horasTrabajadas);
      try {
        departamento.agregarEmpleado(empleado);
      } catch (DepartamentoLlenoException e) {
        System.out.println(e.getMessage());
      }
    } else {
      System.out.println("Tipo de empleado inválido");
    }

  }

  private static void calcularGastos(Departamento departamento) {
    System.out.println("Los gastos del departamento son: " + departamento.calcularGastos());
  }

  private static void mostrarEmpleados(Departamento departamento) {
    System.out.println("Los empleados del departamento" + departamento.getNombre() + " son:");
    if (departamento.getEmpleados().size() == 0) {
      System.out.println("No hay empleados en el departamento");
    } else {
      for (Empleado empleado : departamento.getEmpleados()) {
        System.out.println(
            "Nombre: " + empleado.getNombre() + "Tipo Contrato: " + " | Salario: $" + empleado.calcularSalario());
      }
    }

  }
}
