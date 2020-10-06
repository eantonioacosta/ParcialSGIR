
package SGIR.Domain;


import java.util.ArrayList;
import java.util.List;


public class VentaHuespedes {
    List<Producto> productos;
    List<HistorialSalidaProductos> historial;
    
    public VentaHuespedes(List<Producto> productos) {
        this.productos = productos;
        
    }

    public VentaHuespedes() {
        productos = new ArrayList<>();
        historial = new ArrayList<>();
    }
    
    public String entradaProducto(ArrayList<Producto> lista){
        if(sizeProductos()<=0){
            return "No hay productos, debe ingresar por los menos 1 producto";
        }
        lista.forEach((producto) -> { entradaProducto1(producto);});
        return "Prodcutos registrados, total = "+sizeProductos();
    }
    private void entradaProducto1(Producto producto){
        for (Producto producto1 : productos) {
            if(producto.getCodigo().equals(producto1.getCodigo())){
                producto1.entradaStock(producto.getStockProducto());
            }
            productos.add(producto);   
        }
    }
    
    public String SalidaProductos(ArrayList<Producto> lista){
        String mensaje ="Detalles Salida => ";
        if(lista.size()<=0){
            return "No hay productos, debe ingresar por los menos 1 producto";
        }
        lista.forEach((producto) -> { 
            mensaje.concat(SalidaProductos1(producto));
        });    
        
        return mensaje+" /Final.";
        
    }
    private String SalidaProductos1(Producto producto){
        if (producto instanceof ProductoSimple) {
            for (Producto producto1 : productos) {
                if (producto.getCodigo().equals(producto1.getCodigo())) {
                    registarSalida(producto);
                    return producto1.salidaStock(producto.getStockProducto());
                }
            }
        }else{
            ProductoCompuesto compuesto = (ProductoCompuesto) producto;
            for (ProductoSimple ingrediente : compuesto.getIngredientes()) {
                for (Producto producto1 : productos) {
                    if(producto1.getCodigo().equals(ingrediente.getCodigo())){
                        registarSalida(producto);//Historial
                        return producto1.salidaStock(producto.getStockProducto());
                    }
                }
            }
        }
        return "";
    }
    private void registarSalida(Producto producto){
        HistorialSalidaProductos salida = new HistorialSalidaProductos(producto.getCodigo(), producto.getPrecio(), producto.getCosto());
        historial.add(salida);
    }
    public int sizeProductos(){
        return productos.size();
    }
}
