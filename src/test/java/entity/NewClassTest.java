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

    @Test
    public void testGetSomeText()
    {
        System.out.println("getSomeText");
        
        NewClass nc = new NewClass("SomeText");
        assertEquals("SomeText", nc.getSomeText());
    }

    @Test
    public void testDoubleUp()
    {
        System.out.println("doubleUp");
        
        NewClass nc = new NewClass("SomeText"); 
        assertEquals("SomeTextSomeText", nc.doubleUp());
    }
}
