public class Productos_Frescos extends Producto{
    private String fecha_Envasado;
    private String pais_Origen;

    public Productos_Frescos(String fecha_Caducidad, int numero_Lote, String fecha_Envasado, String pais_Origen) {
        super(fecha_Caducidad, numero_Lote);
        this.fecha_Envasado = fecha_Envasado;
        this.pais_Origen = pais_Origen;
    }

    public String getFecha_Envasado() {
        return fecha_Envasado;
    }

    public void setFecha_Envasado(String fecha_Envasado) {
        this.fecha_Envasado = fecha_Envasado;
    }

    public String getPais_Origen() {
        return pais_Origen;
    }

    public void setPais_Origen(String pais_Origen) {
        this.pais_Origen = pais_Origen;
    }
    



    
}
