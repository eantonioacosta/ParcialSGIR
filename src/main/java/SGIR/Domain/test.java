/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGIR.Domain;

import java.util.ArrayList;

/**
 *
 * @author ENOR ACOSTA
 */
public class test {
    
    public static void main(String[] args) {
        ArrayList<Producto> listaEntrada = new ArrayList<>();
        ArrayList<ProductoSimple> listaProductoCompuesto = new ArrayList<>();

        Producto producto2 = new ProductoSimple(1, "0112", "pan para perros", 1000, 0, 20);
        Producto producto3 = new ProductoSimple(1, "0113", "salchicha", 1000, 0, 20);
        Producto producto4 = new ProductoSimple(1, "0114", "lámina de queso", 1000, 0, 20);
        Producto producto5 = new ProductoSimple(1, "0115", "pan de perro extragrande", 2000, 0, 20);
        Producto producto6 = new ProductoSimple(1, "0116", "salchicha ranchera", 2000, 0, 20);
        
        listaProductoCompuesto.add((ProductoSimple)producto2); 
        listaProductoCompuesto.add((ProductoSimple)producto3); 
        listaProductoCompuesto.add((ProductoSimple)producto4);
        
        Producto producto1 = new ProductoCompuesto(listaProductoCompuesto,"0111", "un perro sencillo", 5000, 20);
        
        listaEntrada.add(producto1);
        listaEntrada.add(producto2);
        listaEntrada.add(producto3);
        listaEntrada.add(producto4);
        
        
        VentaHuespedes instance = new VentaHuespedes();

        String mensaje = instance.entradaProducto(listaEntrada);
        System.out.println(mensaje);
//       
    }
           
}
