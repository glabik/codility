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
    	
    	int[] input;
    	int[] output;
    	int[] result;
    	
    	input = new int[] {1, 2, 3, 4};
    	output = new int[] {1, 2, 3, 4};
    	result = cr.solution(input, 4);
        assertTrue(Arrays.equals(output, result));
        
    	input = new int[] {3, 8, 9, 7, 6};
    	output = new int[] {9, 7, 6, 3, 8};
    	result = cr.solution(input, 3);
    	assertTrue(Arrays.equals(output, result));
        
        input = new int[] {0, 0, 0};
    	output = new int[] {0, 0, 0};
    	result = cr.solution(input, 1);
        assertTrue(Arrays.equals(output, result));
        
        
//      System.out.println(Integer.toBinaryString(2_147_483_648));
    }
    
}
