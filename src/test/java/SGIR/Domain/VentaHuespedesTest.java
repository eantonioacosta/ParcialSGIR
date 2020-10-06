/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
     * 1. La cantidad de la entrada de debe ser mayor a 0 Dado	Tengo una lista
     * de productos vacía Cuando	Registre una entrada con esta lista Entonces	El
     * sistema presentará el mensaje. “No hay productos, debe ingresar por los
     * menos 1 producto”
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
    
    @Test
    public void testEntradaProducto() {
        System.out.println("entradaProducto");
        ArrayList<Producto> lista = null;
        VentaHuespedes instance = new VentaHuespedes();
        String expResult = "";
        String result = instance.entradaProducto(lista);
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
