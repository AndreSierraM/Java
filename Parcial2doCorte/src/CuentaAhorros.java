public class CuentaAhorros extends Cuenta {
    private boolean isCuentaAhorros;

    public boolean isCuentaAhorros() {
        return this.isCuentaAhorros;
    }

    public void setCuentaAhorros(boolean isCuentaAhorros) {
        this.isCuentaAhorros = isCuentaAhorros;
    }

    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        if (saldo < 10000) {
            this.isCuentaAhorros = false;
        } else {
            this.isCuentaAhorros = true;
        }
    }

    public void consignar(float cantidad) {
        if (this.isCuentaAhorros == true) {
            super.consignar(cantidad);
        } else {
            System.out.println("No se puede consignar a una cuenta no activa");
        }
    }

    public void extractoMensual() {
        super.extractoMensual();
        if (this.numeroConsignaciones > 4) {
            this.comisionMensual = 0f;
        } else {
            this.comisionMensual = 5000f;
        }
      
    }

    public void imprimir() {
        System.out.println("");
        System.out.println("Cuenta de ahorros");
        super.imprimir();
    }



}

