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
public class FrameeTest {
    
    public FrameeTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
//    @BeforeEach
//    public void setUp() {
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }

    /**
     * Test of check_login method, of class Framee.
     */
    @org.junit.jupiter.api.Test
    public void testCheck_login() {
        System.out.println("check_login");
        String username = "roro";
        String pass = "1234";
        Framee instance = new Framee();
        boolean expResult = true; // ecpected result
        boolean result = instance.check_login(username, pass);// actual result
        assertEquals(expResult, result);//compair 
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

        public void testCheck_login1() {
        System.out.println("check_login");
        String username = ",";
        String pass = "";
        Framee instance = new Framee();
        boolean expResult = false; // ecpected result
        boolean result = instance.check_login(username, pass);// actual result
        assertEquals(expResult, result);//compair 
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of main method, of class Framee.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Framee.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of check_regestration method, of class Framee.
     */
    @Test
    public void testCheck_regestration() {
        System.out.println("check_regestration");
        String fulln = "";
        String email = "";
        String phone = "";
        String address = "";
        String username = "";
        String pass = "";
        String confirmpass = "";
        String book = "";
        String gender = "";
        Framee instance = new Framee();
        boolean expResult = false;
        boolean result = instance.check_regestration(fulln, email, phone, address, username, pass, confirmpass, book, gender);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @Test
    public void testCheck_regestration1() {
        System.out.println("check_regestration");
        String fulln = "";
        String email = "";
        String phone = "";
        String address = "";
        String username = "";
        String pass = "";
        String confirmpass = "";
        String book = "";
        String gender = "";
        Framee instance = new Framee();
        boolean expResult = false;
        boolean result = instance.check_regestration(fulln, email, phone, address, username, pass, confirmpass, book, gender);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
