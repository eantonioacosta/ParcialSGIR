
package SGIR.Domain;


public class ProductoSimple extends Producto{
    private int tipoVenta; // Directa o en Combo

    public ProductoSimple() {
    }

    public ProductoSimple(int tipoVenta, String codigo, String nombre, double costo, double precio) {
        super(codigo, nombre, costo, precio);
        this.tipoVenta = tipoVenta;
    }



    public int getTipoVenta() {
        return tipoVenta;
    }

    public void setTipoVenta(int tipoVenta) {
        this.tipoVenta = tipoVenta;
    }

    @Override
    public double getUtilidad() {
        return getPrecio()-getCosto();
    }
    
}
