public class carro {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;

    public carro() {
        ruedas = 4;
        largo = 20;
        ancho = 10;
        motor = 1600;
        peso = 1000;
    }


public string damedatoscarro(){
    return "El carro tiene " + ruedas + " ruedas " + "el carro mide " + largo + " Cm " + "tiene un ancho de " + ancho + " metros de ancho " + "el carro tiene un motor de " + motor + " cc " + "el carro pesa " + peso + " kg";
}
}