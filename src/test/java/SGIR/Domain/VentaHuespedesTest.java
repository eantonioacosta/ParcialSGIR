/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGIR.Domain;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ENOR ACOSTA
 */
public class VentaHuespedesTest {
    
    public VentaHuespedesTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of entradaProducto method, of class VentaHuespedes.
     */
    @Test
    public void testEntradaProducto() {
        System.out.println("entradaProducto");
        ArrayList<Producto> lista = null;
        VentaHuespedes instance = new VentaHuespedes();
        String expResult = "";
        String result = instance.entradaProducto(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SalidaProductos method, of class VentaHuespedes.
     */
    @Test
    public void testSalidaProductos() {
        System.out.println("SalidaProductos");
        ArrayList<Producto> lista = null;
        VentaHuespedes instance = new VentaHuespedes();
        String expResult = "";
        String result = instance.SalidaProductos(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sizeProductos method, of class VentaHuespedes.
     */
    @Test
    public void testSizeProductos() {
        System.out.println("sizeProductos");
        VentaHuespedes instance = new VentaHuespedes();
        int expResult = 0;
        int result = instance.sizeProductos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
