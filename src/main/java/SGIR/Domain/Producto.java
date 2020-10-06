
package SGIR.Domain;


public abstract class Producto {
    private String codigo;
    private String nombre;
    private double costo;
    private double precio;
    private int stockProducto;
    
    public Producto() {
        stockProducto = 1;
    }

    public Producto(String codigo, String nombre, double costo, double precio, int stockProducto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.costo = costo;
        this.precio = precio;
        this.stockProducto = stockProducto;
    }



    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    public void entradaStock(int stock){

        setStockProducto(getStockProducto()+stock);
    }
    public String salidaStock(int stock){
        if(stock>this.stockProducto){
            return "/No hay suficiente stock";
        }
        setStockProducto(getStockProducto()-stock);
        return "";
    }
    
    public abstract double getUtilidad();

    public int getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }
}
