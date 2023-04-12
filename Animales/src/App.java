public class App {
    public static void main(String[] args) throws Exception { 
        Animal[] animales = new Animal[4]; // Array de 3 posiciones
        animales[0] = new Persona(); // Se crea un objeto de tipo Persona
        animales[1] = new Perro(); // Se crea un objeto de tipo Perro
        animales[2] = new Vaca(); // Se crea un objeto de tipo Vaca
        animales[3] = new Animal(); // Se crea un objeto de tipo Animal
        for (Animal animal : animales) { // Se recorre el array
            animal.comer(); // Se llama al método comer
        }

    }
}
