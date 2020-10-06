
package SGIR.Domain;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ENOR ACOSTA
 */
public class VentaHuespedesTest {
    
    public VentaHuespedesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * HU1. Como usuario quiero registrar una entrada Criterios de aceptación:
     * 1. La cantidad de la entrada de debe ser mayor a 0 
     * Dado	Tengo una lista de productos vacía 
     * Cuando	Registre una entrada con esta lista 
     * Entonces	El sistema presentará el mensaje. “No hay productos, debe ingresar por los menos 1 producto”
     *
     */
    @Test
    public void entradaNoPuedeSerMenorCero() {
        
        ArrayList<Producto> lista = new ArrayList<>();
        VentaHuespedes instance = new VentaHuespedes();
        String expResult = "No hay productos, debe ingresar por los menos 1 producto";
        String result = instance.entradaProducto(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }

    /*
HU1. Como usuario quiero registrar una entrada con una lista de productos cargada, y aumentara la cantidad de productos existentes
Criterios de aceptación:
2. La cantidad de la entrada se le aumentará a la cantidad existente del producto
Dado	Se tiene con 2 productos
Cuando	Se registra una entrada con 3 productos diferentes a los registrados
Entonces	El sistema presentará el mensaje. "Productos registrados, total = 5"
     */
    @Test
    public void testEntradaProducto() {
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
        instance.entradaProducto(listaEntrada);
        String expResult = "Productos registrados, total = 6";
        listaEntrada = new ArrayList<>();
        listaEntrada.add(producto5);
         listaEntrada.add(producto6);
        String result = instance.entradaProducto(listaEntrada);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * HU1. Como usuario quiero registrar una salida sin productos. 
     * Criterios de aceptación: 
     * 1. La cantidad de la salida de debe ser mayor a 0 
     * Dado	Tengo una lista de productos vacía 
     * Cuando	Registre una salida con esta lista
     * Entonces	El sistema presentará el mensaje. “No hay productos, debe
     * ingresar por los menos 1 producto”
     */
    @Test
    public void testSalidaProductosMenorACero() {
        ArrayList<Producto> lista = new ArrayList<>();
        VentaHuespedes instance = new VentaHuespedes();
        String expResult = "No hay productos, debe ingresar por los menos 1 producto";
        String result = instance.SalidaProductos(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }
    /**
     * Escenario: HU1. SALIDA DE PRODUCTO COMO USUARIO QUIERO REGISTRAR LA
     * SALIDA PRODUCTOS Criterios de aceptación: 2. En caso de un producto
     * sencillo la cantidad de la salida se le disminuirá a la cantidad
     * existente del producto.      *
     * Dado	Esta registrado en el inventario una gaseosa con el código “011” con
     * 2 stock Cuando	Registre una salida de una gaseosa con el mismo código y
     * stock 1 Entonces	El sistema presentará el mensaje. “No hay productos,
     * debe ingresar por los menos 1 producto”
     *
     */
    @Test
    public void testSalidaProductos() {
       ArrayList<Producto> listaEntrada = new ArrayList<>();

        Producto producto = new ProductoSimple(1, "011", "Gaseosa", 1000, 0, 2);

        listaEntrada.add(producto); 

        VentaHuespedes instance = new VentaHuespedes();
        instance.entradaProducto(listaEntrada);
        
        String expResult = "Detalles Salida => 011 Stock = 1 /Final.";
        listaEntrada = new ArrayList<>();
        producto = new ProductoSimple(1, "011", "Gaseosa", 1000, 0, 1);
        listaEntrada.add(producto);
        
        String result = instance.SalidaProductos(listaEntrada);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }

    }
       /**
     * Test of SalidaProductos method, of class VentaHuespedes.
     */
//    @Test
//    public void testSalidaProductos() {
//        System.out.println("SalidaProductos");
//        ArrayList<Producto> lista = null;
//        VentaHuespedes instance = new VentaHuespedes();
//        String expResult = "";
//        String result = instance.SalidaProductos(lista);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        if (!result.equals(expResult)) {
//            fail("The test case is a prototype.");
//        }
//    }
    
}
