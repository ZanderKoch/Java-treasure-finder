/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.treasurefinder;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Elev
 */
public class DriverTest{
    
    public DriverTest(){
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception{
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception{
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception{
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception{
    }
    

    /**
     * Test of main method, of class Driver.
     */
    @org.junit.jupiter.api.Test
    public void testMain(){
        System.out.println("main");
        String[] args = null;
        Driver.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of task1 method, of class Driver.
     */
    @org.junit.jupiter.api.Test
    public void testTask1(){
        System.out.println("task1");
        ArrayList<Integer> frequencyChanges = 
               new ArrayList<>(Arrays.asList(1, 1, -2));
        int expResult = 0;
        int result = Driver.task1(frequencyChanges);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of task2 method, of class Driver.
     */
    @org.junit.jupiter.api.Test
    public void testTask2(){
        System.out.println("task2");
        ArrayList<Integer> frequencyChanges = 
               new ArrayList<>(Arrays.asList(3, 3, 4, -2, -4));
        int expResult = 10;
        int result = Driver.task2(frequencyChanges);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
