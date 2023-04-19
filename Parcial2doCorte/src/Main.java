import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese saldo inicial = $ ");
        float saldo = sc.nextFloat();
        System.out.print("Ingrese tasa interes = ");
        float tasaAnual = sc.nextFloat();

        CuentaAhorros cuentaAhorros = new CuentaAhorros(saldo, tasaAnual);

        System.out.print("Ingrese cantidad a consignar: ");
        float cantidad = sc.nextFloat();
        cuentaAhorros.consignar(cantidad);

        System.out.print("Ingrese cantidad a retirar: ");
        cantidad = sc.nextFloat();
        cuentaAhorros.retirar(cantidad);
       
        cuentaAhorros.imprimir();

    }
}
