/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.portfolio.SabriR.Entity;

import static org.testng.Assert.*;

/**
 *
 * @author Usuario
 */
public class PersonaNGTest {
    
    public PersonaNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getId method, of class Persona.
     */
    @org.testng.annotations.Test
    public void testGetId() {
        System.out.println("getId");
        Persona instance = new Persona();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Persona.
     */
    @org.testng.annotations.Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApellido method, of class Persona.
     */
    @org.testng.annotations.Test
    public void testGetApellido() {
        System.out.println("getApellido");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.getApellido();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImg method, of class Persona.
     */
    @org.testng.annotations.Test
    public void testGetImg() {
        System.out.println("getImg");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.getImg();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Persona.
     */
    @org.testng.annotations.Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Persona instance = new Persona();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Persona.
     */
    @org.testng.annotations.Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Persona instance = new Persona();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApellido method, of class Persona.
     */
    @org.testng.annotations.Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String apellido = "";
        Persona instance = new Persona();
        instance.setApellido(apellido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImg method, of class Persona.
     */
    @org.testng.annotations.Test
    public void testSetImg() {
        System.out.println("setImg");
        String img = "";
        Persona instance = new Persona();
        instance.setImg(img);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
