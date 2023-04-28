public class App {
    public static void main(String[] args) throws Exception {
       
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[2]); 
          } catch (Exception e) {
            System.out.println("Cuidado, ha ocurrido un error.");
          } finally {
            System.out.println("El bloque try-catch ha finalizado.");
          }
    }
}
