public class Pizza {
  
    private String[] ingredientes;
    private String tamaño;
    private String nombre;
    private boolean estalista;

    public Pizza(String[] ingredientes, String tamaño, String nombre, boolean estalista) {
        this.ingredientes = ingredientes;
        this.tamaño = tamaño;
        this.nombre = nombre;
        this.estalista = estalista;
    }


    public String[] añadirIngredientes() {

        return ingredientes;
    }

    

}
