public class cuentaCorriente extends Cuenta {
    public float sobregiro;

    public cuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        this.sobregiro = 0f;
    }

    public void retirar(float cantidad) {
        if (cantidad > this.saldo) {
            super.retirar(cantidad);
            this.sobregiro = cantidad - this.saldo;
        } else {
            this.saldo -= cantidad;
            this.numeroRetiros++;
        }

    }

    public void consigar(float cantidad) {
        if (sobregiro > 0) {
            cantidad -= sobregiro;
            sobregiro = 0f;
        }
        super.consignar(cantidad);

    }

    public void extractoMensual() {
        super.extractoMensual();
      
    }

    public void imprimir() {
        System.out.print("Cuenta corriente");
        super.imprimir();
        System.out.print("Sobregiro = " + this.sobregiro);
    }
}
