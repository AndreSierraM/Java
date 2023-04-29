public class DepartamentoLlenoException extends Exception {
    public DepartamentoLlenoException() {
        super("\u001B[31mEl departamento está lleno, no se puede agregar más empleados\u001B[0m");
    }
}
