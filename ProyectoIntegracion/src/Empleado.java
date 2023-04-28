public abstract class Empleado {

    private String nombre;
    private int salario;

    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public abstract void calcularGastos();

    public abstract void calcularSalario();

}
