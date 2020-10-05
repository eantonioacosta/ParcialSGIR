
package SGIR.Domain;

import java.util.ArrayList;
import java.util.List;


public class ProductoCompuesto extends Producto{
    private List<ProductoSimple> Ingredientes;

    public ProductoCompuesto() {
        this.Ingredientes = new ArrayList<>();
    }

    public ProductoCompuesto(List<ProductoSimple> Ingredientes) {
        this.Ingredientes = Ingredientes;
    }
    public void addProducto(ProductoSimple producto){
        Ingredientes.add(producto);
    }
    public void deleteProducto(ProductoSimple producto){
        addProducto(producto);
    }

    
    
    
    
    public List<ProductoSimple> getIngredientes() {
        return Ingredientes;
    }

    public void setIngredientes(List<ProductoSimple> Ingredientes) {
        this.Ingredientes = Ingredientes;
    }
    
    @Override
    public double getCosto(){
        double valorCosto=0;
        for (ProductoSimple Ingrediente : Ingredientes) {
            valorCosto+=Ingrediente.getCosto();
        }
        return valorCosto;
    }

    @Override
    public double getUtilidad() {
        return getPrecio()-getCosto();
    }
    
    public int stock(){
        return Ingredientes.size();
    }
}
