/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Laptop2
 */
public class AnswerTest {
    
    public AnswerTest() {
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
     * Test of getValue method, of class Answer.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Answer instance = new Answer();
        int expResult = 0;
        int result = instance.getValue();
        assertEquals(expResult, result);

    }

    /**
     * Test of setValue method, of class Answer.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        int value = 0;
        Answer instance = new Answer();
        instance.setValue(value);
      
    }

 
    
}
