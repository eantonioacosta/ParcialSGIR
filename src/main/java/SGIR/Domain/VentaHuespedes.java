
package SGIR.Domain;

import java.util.ArrayList;
import java.util.List;


public class VentaHuespedes {
    List<Producto> productos;

    public VentaHuespedes(List<Producto> productos) {
        this.productos = productos;
    }

    public VentaHuespedes() {
    }
    
    public String entradaProducto(ArrayList<Producto> lista){
        if(sizeProductos()<=0){
            return "No hay productos, debe ingresar por los menos 1 producto";
        }
        lista.forEach((producto) -> { productos.add(producto);});
        return "Prodcutos registrados, total = "+sizeProductos();
    }
    public String SalidaProductos(ArrayList<Producto> lista){
        if(lista.size()<=0)
            return ""
    }
    public int sizeProductos(){
        return productos.size();
    }
}
