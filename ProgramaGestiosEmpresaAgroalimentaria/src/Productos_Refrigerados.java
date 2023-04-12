public class Productos_Refrigerados extends Producto {
    private int codigo_De_Organismo_SA;
    private String Fecha_Envasado;
    private String Pais_Origen;
    private String Temperatura_Recomendada;

    public Productos_Refrigerados(String fecha_Caducidad, int numero_Lote, int codigo_De_Organismo_SA,
            String fecha_Envasado, String pais_Origen, String temperatura_Recomendada) {
        super(fecha_Caducidad, numero_Lote);
        this.codigo_De_Organismo_SA = codigo_De_Organismo_SA;
        Fecha_Envasado = fecha_Envasado;
        Pais_Origen = pais_Origen;
        Temperatura_Recomendada = temperatura_Recomendada;
    }

    public int getCodigo_De_Organismo_SA() {
        return codigo_De_Organismo_SA;
    }
    
    public void setCodigo_De_Organismo_SA(int codigo_De_Organismo_SA) {
        this.codigo_De_Organismo_SA = codigo_De_Organismo_SA;
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



    



    
}
