package pl.com.glabik.codility.lesson4;

import java.util.Arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class MissingIntegerTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MissingIntegerTest( String testName ){
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite(){
        return new TestSuite( MissingIntegerTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testForValues(){
    	MissingInteger mi = new MissingInteger();
    	
    	int[] A;
    	
    	A = new int[]{1, 3, 6, 4, 1, 2};
        assertEquals(5, mi.solution(A));
        
        A = new int[]{1, 2, 3};
        assertEquals(4, mi.solution(A));
        
        A = new int[]{-1, -3};
        assertEquals(1, mi.solution(A));
        		
       
        A = new int[]{0, 0 ,0,0,0,0};
        assertEquals(1, mi.solution(A));
        
        A = new int[]{};
        assertEquals(1, mi.solution(A));
        
        A = new int[]{1,2,3,90,45};
        assertEquals(4, mi.solution(A));
        
        
        A = new int[]{90,45};
        assertEquals(1, mi.solution(A));
        
        A = new int[]{-10,10};
        assertEquals(1, mi.solution(A));
        
        A = new int[]{-10, 2, -5, 10, 1, 3};
        assertEquals(4, mi.solution(A));
    }
    
}
