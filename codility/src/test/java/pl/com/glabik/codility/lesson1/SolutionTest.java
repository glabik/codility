package pl.com.glabik.codility.lesson1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SolutionTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SolutionTest( String testName ){
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite(){
        return new TestSuite( SolutionTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testForValues(){
    	Solution solution = new Solution();
    	
        assertEquals(2, solution.solution(9));
        
        assertEquals(4, solution.solution(529));
        
        assertEquals(1, solution.solution(20));
        
        assertEquals(0, solution.solution(15));
        
        assertEquals(0, solution.solution(32));
        
        assertEquals(0, solution.solution(1024));
        
        assertEquals(1, solution.solution(-33));
        
//      System.out.println(Integer.toBinaryString(2_147_483_648));
    }
    
}
