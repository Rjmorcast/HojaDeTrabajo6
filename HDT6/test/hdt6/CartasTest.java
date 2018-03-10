/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt6;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rodrigo
 */
public class CartasTest {
    
    public CartasTest() {
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
     * Test of getCards method, of class Cartas.
     */
   

    /**
     * Test of addCarta method, of class Cartas.
     */
    @Test
    public void testAddCarta() {
        System.out.println("addCarta");
        String key = "Hola";
        String value = "Monstruo";
        Cartas instance = new Cartas("3");
        instance.addCarta(key, value);
        // TODO review the generated test code and remove the default call to fail.
        String result = instance.getTipo(key);
        String expresult  = "Monstruo";
        assertEquals(expresult, result);
        
    }

    /**
     * Test of getTipo method, of class Cartas.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        String key = "Hola";
        String value = "Monstruo";
        Cartas instance = new Cartas("3");
        instance.addCarta(key, value);
        // TODO review the generated test code and remove the default call to fail.
        String result = instance.getTipo(key);
        String expresult  = "Monstruo";
        assertEquals(expresult, result);
    }

    /**
     * Test of getAllCards_Nombre_Tipo_Cantidad method, of class Cartas.
     */
    @Test
    public void testGetAllCards_Nombre_Tipo_Cantidad() {
        System.out.println("getAllCards_Nombre_Tipo_Cantidad");
        String key = "Hola";
        String value = "Monstruo";
        Cartas instance = new Cartas("3");
        instance.addCarta(key, value);
        // TODO review the generated test code and remove the default call to fail.
        ArrayList<String> prueba  = instance.getAllCards_Nombre_Tipo_Cantidad();
        String result = prueba.get(0);
        String expresult  = "Nombre: Hola Tipo: Monstruo Cantidad: 1";
        assertEquals(expresult, result);
    }

    /**
     * Test of getAllCards_Nombre_Tipo method, of class Cartas.
     */
    @Test
    public void testGetAllCards_Nombre_Tipo() {
        System.out.println("getAllCards_Nombre_Tipo");
         String key = "Hola";
        String value = "Monstruo";
        Cartas instance = new Cartas("3");
        instance.addCarta(key, value);
        // TODO review the generated test code and remove the default call to fail.
        ArrayList<String> prueba  = instance.getAllCards_Nombre_Tipo();
        String result = prueba.get(0);
        String expresult  = "Nombre: Hola Tipo: Monstruo";
        assertEquals(expresult, result);
    }

    
}
