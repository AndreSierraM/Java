public class Producto {
    private String fecha_Caducidad;
    private int numero_Lote;

    public Producto(String fecha_Caducidad, int numero_Lote) {
        this.fecha_Caducidad = fecha_Caducidad;
        this.numero_Lote = numero_Lote;
    }

    public String getFecha_Caducidad() {
        return fecha_Caducidad;
    }

    public void setFecha_Caducidad(String fecha_Caducidad) {
        this.fecha_Caducidad = fecha_Caducidad;
    }

    public int getNumero_Lote() {
        return numero_Lote;
    }

    public void setNumero_Lote(int numero_Lote) {
        this.numero_Lote = numero_Lote;
    }

}
