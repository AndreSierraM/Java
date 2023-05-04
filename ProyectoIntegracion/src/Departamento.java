import java.util.ArrayList;

public class Departamento {
    private String nombre;
    private int capacidad;
    private ArrayList<Empleado> empleados;

    public Departamento(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.empleados = new ArrayList<Empleado>();
    }
    public Departamento(String nombre) {
        this.nombre = nombre;
        this.capacidad = 10; 
        this.empleados = new ArrayList<Empleado>();
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void agregarEmpleado(Empleado empleado) throws DepartamentoLlenoException {
        if (empleados.size() >= capacidad) {
            throw new DepartamentoLlenoException();
        }

        empleados.add(empleado);
    }

    public double calcularGastos() {
        double gastos = 0.0;

        for (Empleado empleado : empleados) {
            gastos += empleado.calcularSalario();
        }

        return gastos;
    }
}
