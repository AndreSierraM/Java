public class Vaca extends Animal { // Se hereda de la clase Animal

    @Override // Se sobreescribe el método comer
    public void comer() { // Se implementa el método comer
        System.out.println("Estoy comiendo pasto"); // Se imprime el mensaje
    }
    
}
