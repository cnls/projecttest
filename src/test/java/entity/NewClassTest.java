/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class NewClassTest
{
    
    public NewClassTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    @Test
    public void testGetSomeText()
    {
        System.out.println("getSomeText");
        NewClass instance = null;
        String expResult = "";
        String result = instance.getSomeText();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetSomeText()
    {
        System.out.println("setSomeText");
        String someText = "";
        NewClass instance = null;
        instance.setSomeText(someText);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDoubleUp()
    {
        System.out.println("doubleUp");
        NewClass instance = null;
        String expResult = "";
        String result = instance.doubleUp();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
