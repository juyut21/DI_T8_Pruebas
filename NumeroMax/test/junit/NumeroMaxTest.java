package junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class NumeroMaxTest
{
    
    public NumeroMaxTest()
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

    @Test
    public void testMax()
    {
        System.out.println("Pruebas JUnit NumeroMax");
        assertEquals(9, NumeroMax.max(new int [] {3, 5, 9}));
        assertEquals(5, NumeroMax.max(new int [] {4, 3, 5}));
        assertEquals(5, NumeroMax.max(new int [] {5, 4, 3}));
        assertEquals(-3, NumeroMax.max(new int [] {-9, -4, -3}));
        assertEquals(1, NumeroMax.max(new int [] {1}));
        assertEquals(0, NumeroMax.max(new int [] {}));
        assertEquals(0, NumeroMax.max(null));
        
    }
    
    @Test(timeout=1000)
    public void testMaxTiempo()
    {
        System.out.println("Pruebas JUnit NumeroMax Tiempo");
        assertEquals(9, NumeroMax.max(new int [] {3, 5, 2, 7, 5, 8, 3, 7 ,8 ,9}));
    }
    
}
