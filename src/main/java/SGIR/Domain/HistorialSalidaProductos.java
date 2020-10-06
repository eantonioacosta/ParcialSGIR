
package SGIR.Domain;


public class HistorialSalidaProductos {
    private String detalles;
    private double precio;
    private double costo;

    public HistorialSalidaProductos() {
    }

    public HistorialSalidaProductos(String detalles, double precio, double costo) {
        this.detalles = detalles;
        this.precio = precio;
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
