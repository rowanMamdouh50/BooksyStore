/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.advsoftware;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */
public class bookTest {
    
    public bookTest() {
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
     * Test of main method, of class book.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        book.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of check_addedbook method, of class book.
     */
    @Test
    public void testCheck_addedbook() {
        System.out.println("check_addedbook");
        String bookname = "Opal";
        book instance = null;
        boolean expResult = false;
        boolean result = instance.check_addedbook(bookname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
      public void testCheck_addedbook1() {
        System.out.println("check_addedbook");
        String bookname = "";
        book instance = null;
        boolean expResult = true;
        boolean result = instance.check_addedbook(bookname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
