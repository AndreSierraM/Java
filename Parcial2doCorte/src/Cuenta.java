public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual = 0;
    protected float comisionMensual = 0;

    // getters and setters
    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConsignaciones() {
        return this.numeroConsignaciones;
    }

    public void setNumeroConsignaciones(int numeroConsignaciones) {
        this.numeroConsignaciones = numeroConsignaciones;
    }

    public int getNumeroRetiros() {
        return this.numeroRetiros;
    }

    public void setNumeroRetiros(int numeroRetiros) {
        this.numeroRetiros = numeroRetiros;
    }

    public float getTasaAnual() {
        return this.tasaAnual;
    }

    public void setTasaAnual(float tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public float getComisionMensual() {
        return this.comisionMensual;
    }

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;

    }

    public void consignar(float cantidad) {
        this.saldo += cantidad;
        this.numeroConsignaciones++;
    }

    public void retirar(float cantidad) {
        if (cantidad <= 0 || cantidad > this.saldo) {

        } else {
            this.saldo -= cantidad;
            this.numeroRetiros++;

        }
    }

    public void calcularInteres() {
        float interes = this.saldo * this.tasaAnual;
        this.saldo += interes;

    }

    public void extractoMensual() {
        this.calcularInteres();
        this.comisionMensual = 0f;

    }

    public void imprimir() {
        System.out.println("Saldo = " + this.saldo);
        System.out.println("Comision mensual = " + this.comisionMensual);
        int numeroTransacciones = this.numeroConsignaciones + this.numeroRetiros;
        System.out.println("Numero de transacciones = " + numeroTransacciones);
    }
}
