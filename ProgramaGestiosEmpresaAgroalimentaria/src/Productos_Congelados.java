public class Productos_Congelados extends Producto {
    private String Fecha_Envasado;
    private String Pais_Origen;
    private String Temperatura_Recomendada;
    private String metodo_Congelacion;
    

    public Productos_Congelados(String fecha_Caducidad, int numero_Lote, String fecha_Envasado, String pais_Origen,
            String temperatura_Recomendada, String metodo_Congelacion) {
        super(fecha_Caducidad, numero_Lote);
        Fecha_Envasado = fecha_Envasado;
        Pais_Origen = pais_Origen;
        Temperatura_Recomendada = temperatura_Recomendada;
        metodo_Congelacion = metodo_Congelacion;
    }

    public String getFecha_Envasado() {
        return Fecha_Envasado;
    }

    public void setFecha_Envasado(String fecha_Envasado) {
        Fecha_Envasado = fecha_Envasado;
    }

    public String getPais_Origen() {
        return Pais_Origen;
    }

    public void setPais_Origen(String pais_Origen) {
        Pais_Origen = pais_Origen;
    }

    public String getTemperatura_Recomendada() {
        return Temperatura_Recomendada;
    }

    public void setTemperatura_Recomendada(String temperatura_Recomendada) {
        Temperatura_Recomendada = temperatura_Recomendada;
    }

    public String getMetodo_Congelacion() {
        return metodo_Congelacion;
    }

    public void setMetodo_Congelacion(String metodo_Congelacion) {
        metodo_Congelacion = metodo_Congelacion;
    }
   

    public void Met_Congelacion() {
     if (metodo_Congelacion == "Aire") {
        /* por aire deben llevar la informacion de la composicion del aire con que fue congelado ( % de nitrogeno) */
        
     } else if (metodo_Congelacion == "Agua") {
         System.out.println("El producto se ha congelado por agua");
     } else if (metodo_Congelacion == "Nitrogeno") {
         System.out.println("El producto se ha congelado por nitrogeno");
     }     

    }
        
       

}
