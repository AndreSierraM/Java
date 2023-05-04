public class EmpleadoAsalariado extends Empleado {
    public EmpleadoAsalariado(String nombre, double salario) {
        super(nombre, salario);
    }

    public EmpleadoAsalariado(String nombre) {
        super(nombre, 1800000.0);
    }

    @Override
    public double calcularSalario() {
        return getSalario();
    }
}
