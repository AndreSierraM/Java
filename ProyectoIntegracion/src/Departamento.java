public abstract class Departamento {
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

    private String nombre;
    private int numeroEmpleados;
    private int numeroMaximoEmpleados;
    private int gastos;
    private Empleado[] empleados;

    public Departamento(String nombre, int numeroMaximoEmpleados, int gastos, Empleado[] empleados) {
        this.nombre = nombre;
        this.numeroMaximoEmpleados = numeroMaximoEmpleados;
        this.gastos = gastos;
        this.empleados = empleados;

    }

    public abstract void calcularGastos();

    public abstract void calcularSalario();

}
