package pl.com.glabik.codility.lesson2;

import java.util.Arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class CyclicRotationTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CyclicRotationTest( String testName ){
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite(){
        return new TestSuite( CyclicRotationTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testForValues(){
    	CyclicRotation cr = new CyclicRotation();
    	
    	int[] input = new int[] {3, 8, 9, 7, 6};
    	int[] output = new int[] {9, 7, 6, 3, 8};
    	int[] result = cr.solution(input, 3);
        assertTrue(Arrays.equals(output, result));
        
        
//      System.out.println(Integer.toBinaryString(2_147_483_648));
    }
    
}
